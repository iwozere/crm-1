import json
import os
import re
from collections import defaultdict

# Configuration
DATA_DIR = 'data'
ENTITY_OUTPUT_DIR = 'src/main/java/ch/sunrise/dal/entity'
REPO_OUTPUT_DIR = 'src/main/java/ch/sunrise/dal/repository'
ENTITY_PACKAGE = 'ch.sunrise.dal.entity'
REPO_PACKAGE = 'ch.sunrise.dal.repository'
BASE_ENTITY = 'ch.sunrise.dal.entity.base.BaseEntity'
BASE_REPO = 'ch.sunrise.dal.repository.base.BaseRepository'

def load_target_objects():
    path = 'scripts/target_objects.json'
    if not os.path.exists(path):
        return None
    with open(path, 'r', encoding='utf-8') as f:
        return set(json.load(f))

TARGET_TABLES = load_target_objects()

# Type mapping for ADP common types
CMN_TYPE_MAP = {
    512: 'Long',        # long integer
    516: 'String',      # char pointer
    609: 'java.time.LocalDateTime', # clk_ty_time
    766: 'java.math.BigDecimal',     # decimal
    513: 'Double',      # double precision
    523: 'Integer'      # short integer
}

def load_json(filename):
    path = os.path.join(DATA_DIR, filename)
    if not os.path.exists(path):
        print(f"Warning: {path} not found")
        return {} if 'STRUCTURE' in filename else []
    with open(path, 'r', encoding='utf-8') as f:
        return json.load(f)

class NameRegistry:
    def __init__(self):
        self.orig_to_final = {}
        self.used_low_names = {}

    def register(self, orig_name, preferred_camel):
        # All entities must be prefixed with Da per specification
        if not preferred_camel.startswith('Da'):
            preferred_camel = 'Da' + preferred_camel
            
        low = preferred_camel.lower()
        if low in self.used_low_names:
            if self.used_low_names[low] == preferred_camel:
                for k, v in self.orig_to_final.items():
                    if k == orig_name and v == preferred_camel:
                        return
            suffix = 2
            while True:
                candidate = f"{preferred_camel}{suffix}"
                cand_low = candidate.lower()
                if cand_low not in self.used_low_names:
                    self.used_low_names[cand_low] = candidate
                    self.orig_to_final[orig_name] = candidate
                    return
                suffix += 1
        else:
            self.used_low_names[low] = preferred_camel
            self.orig_to_final[orig_name] = preferred_camel

    def get_name(self, orig_name):
        if orig_name in self.orig_to_final:
            return self.orig_to_final[orig_name]
        
        camel = to_camel_case(orig_name)
        if camel.startswith('Table'): camel = camel[5:]
        return 'Da' + camel

REGISTRY = NameRegistry()

def to_camel_case(snake_str):
    if not snake_str: return ""
    if snake_str.lower() == 'data_set': return "Dataset"
    components = snake_str.split('_')
    return ''.join(x.title() for x in components)

def to_lower_camel_case(snake_str):
    if not snake_str: return ""
    camel = to_camel_case(snake_str)
    return camel[0].lower() + camel[1:]

JAVA_KEYWORDS = {
    'abstract', 'continue', 'for', 'new', 'switch', 'assert', 'default', 'if', 'package',
    'synchronized', 'boolean', 'do', 'goto', 'private', 'this', 'break', 'double',
    'implements', 'protected', 'throw', 'byte', 'else', 'import', 'public', 'throws',
    'case', 'enum', 'instanceof', 'return', 'transient', 'catch', 'extends', 'int',
    'short', 'try', 'char', 'final', 'interface', 'static', 'void', 'class', 'finally',
    'long', 'strictfp', 'volatile', 'const', 'float', 'native', 'super', 'while'
}

def escape_keyword(name):
    if name.lower() in JAVA_KEYWORDS:
        return 'x' + name.title()
    if name and name[0].isdigit():
        return 'x' + name
    return name

def clear_directory(directory):
    if not os.path.exists(directory):
        os.makedirs(directory)
        return
    print(f"Clearing {directory}...")
    for f in os.listdir(directory):
        path = os.path.join(directory, f)
        if os.path.isfile(path) and f.endswith('.java'):
            os.remove(path)

def generate():
    print("Starting generation process...")
    clear_directory(ENTITY_OUTPUT_DIR)
    clear_directory(REPO_OUTPUT_DIR)

    objects = load_json('ADP_OBJECT.json')
    fields_all = load_json('ADP_FIELD.json')
    relations_all = load_json('ADP_RELATION.json')
    mtm_structure = load_json('ADP_MTM_STRUCTURE.json')

    # Group fields by type_id
    fields_by_type = defaultdict(list)
    for f in fields_all:
        fields_by_type[f['type_id']].append(f)

    # Group relations by type_id
    rels_by_type = defaultdict(list)
    for r in relations_all:
        rels_by_type[r['type_id']].append(r)

    # Pre-register names
    for obj in objects:
        name = obj['type_name']
        if TARGET_TABLES is not None and name not in TARGET_TABLES:
            continue
        camel = to_camel_case(name)
        if camel.startswith('Table'): camel = camel[5:]
        REGISTRY.register(name, camel)

    # Map MTM columns to MTM table
    mtm_lookup = {}
    for table, cols in mtm_structure.items():
        if len(cols) >= 2:
            mtm_lookup[frozenset(cols[:2])] = table

    for obj in objects:
        table_name = obj['type_name']
        if TARGET_TABLES is not None and table_name not in TARGET_TABLES:
            continue
        type_id = obj['type_id']
        entity_name = REGISTRY.get_name(table_name)
        repo_name = f"{entity_name}Repository"
        
        fields = []
        referenced_entities = set()
        for f in fields_by_type[type_id]:
            name = f['field_name']
            if name == 'objid' or name == 'dev': continue
            
            java_type = CMN_TYPE_MAP.get(f['cmn_type'], 'String')
            fields.append({
                'name': name,
                'java_name': escape_keyword(to_lower_camel_case(name)),
                'type': java_type,
                'length': f['array_size'] if f['array_size'] > 0 else None
            })

        associations = []
        for r in rels_by_type[type_id]:
            rt = r['rel_type']
            target = r['target_name']
            
            if TARGET_TABLES is not None and target not in TARGET_TABLES:
                continue
                
            target_entity = REGISTRY.get_name(target)
            rel_name = r['rel_name']
            inv_name = r['inv_rel_name']
            java_name = escape_keyword(to_lower_camel_case(rel_name))
            
            # Explicitly import referenced entities to help IDEs in large packages
            # We skip importing ourselves
            if target_entity != entity_name:
                referenced_entities.add(target_entity)

            if rt == 2: # MTO
                associations.append({
                    'annotation': f'@ManyToOne(fetch = FetchType.LAZY)\n    @JoinColumn(name = "{rel_name}")',
                    'type': target_entity,
                    'name': java_name
                })
            elif rt == 1: # OTM
                associations.append({
                    'annotation': f'@OneToMany(mappedBy = "{escape_keyword(to_lower_camel_case(inv_name))}")',
                    'type': f'java.util.Set<{target_entity}>',
                    'name': java_name
                })
            elif rt == 5: # MTM
                mtm_key = frozenset([rel_name, inv_name])
                physical_mtm_table = mtm_lookup.get(mtm_key)
                
                if physical_mtm_table:
                    is_owner = table_name < target
                    if is_owner:
                        anno = (f'@ManyToMany\n    @JoinTable(name = "{physical_mtm_table}",\n'
                               f'        joinColumns = @JoinColumn(name = "{rel_name}"),\n'
                               f'        inverseJoinColumns = @JoinColumn(name = "{inv_name}"))')
                    else:
                        anno = f'@ManyToMany(mappedBy = "{escape_keyword(to_lower_camel_case(inv_name))}")'
                    
                    associations.append({
                        'annotation': anno,
                        'type': f'java.util.Set<{target_entity}>',
                        'name': java_name
                    })

        # Generate Entity
        entity_content = f"""package {ENTITY_PACKAGE};

import ch.sunrise.dal.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import jakarta.annotation.Generated;
 
@Entity
@Table(name = "{table_name}")
@Getter
@Setter
@BatchSize(size = 100)
@Generated("scripts/generate_entities_from_json.py")
public class {entity_name} extends BaseEntity {{
"""

        for f in fields:
            col_part = f'name = "{f["name"]}"'
            if f['length']: col_part += f', length = {f["length"]}'
            entity_content += f"\n    @Column({col_part})\n    private {f['type']} {f['java_name']};\n"

        for a in associations:
            entity_content += f"\n    {a['annotation']}\n    private {a['type']} {a['name']};\n"

        entity_content += "}\n"
        
        with open(os.path.join(ENTITY_OUTPUT_DIR, f"{entity_name}.java"), 'w', encoding='utf-8') as f:
            f.write(entity_content)

        # Generate Repository
        repo_content = f"""package {REPO_PACKAGE};
 
import {ENTITY_PACKAGE}.{entity_name};
import {BASE_REPO};
import org.springframework.stereotype.Repository;
import jakarta.annotation.Generated;
 
@Repository
@Generated("scripts/generate_entities_from_json.py")
public interface {repo_name} extends BaseRepository<{entity_name}, Long> {{
}}
"""
        with open(os.path.join(REPO_OUTPUT_DIR, f"{repo_name}.java"), 'w', encoding='utf-8') as f:
            f.write(repo_content)

    generated_count = len([f for f in os.listdir(ENTITY_OUTPUT_DIR) if f.endswith('.java')])
    print(f"Generation complete: {generated_count} entities and repositories created.")

if __name__ == "__main__":
    generate()
