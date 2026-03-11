import xml.etree.ElementTree as ET
import os
import re

# Configuration
XML_PATH = 'docs/Master_Schema.xml'
OUTPUT_DIR = 'src/main/java/ch/sunrise/dal/entity'
PACKAGE = 'ch.sunrise.dal.entity'
BASE_ENTITY = 'ch.sunrise.dal.entity.base.BaseEntity'

# Type mapping
TYPE_MAP = {
    'long integer': 'Long',
    'char pointer': 'String',
    'clk_ty_time': 'java.time.LocalDateTime',
    'decimal': 'java.math.BigDecimal',
    'double precision': 'Double',
    'short integer': 'Integer'
}

class NameRegistry:
    def __init__(self):
        self.orig_to_final = {}
        self.used_low_names = {} # low_name -> final_camel

    def register(self, orig_name, preferred_camel):
        low = preferred_camel.lower()
        if low in self.used_low_names:
            if self.used_low_names[low] == preferred_camel:
                # Check if it's the same original name (already registered)
                for k, v in self.orig_to_final.items():
                    if k == orig_name and v == preferred_camel:
                        return
                
            # Conflict! Different original name or same low name
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
        # Fallback to to_camel_case if not registered (e.g. for relations to unknown tables)
        return self.orig_to_final.get(orig_name, to_camel_case(orig_name))

REGISTRY = NameRegistry()

def to_camel_case(snake_str):
    if not snake_str: return ""
    components = snake_str.split('_')
    return ''.join(x.title() for x in components)

def to_lower_camel_case(snake_str):
    if not snake_str: return ""
    camel = to_camel_case(snake_str)
    return camel[0].lower() + camel[1:]

def parse_xml():
    print(f"Parsing {XML_PATH}...")
    tree = ET.parse(XML_PATH)
    root = tree.getroot()
    return root

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

def generate_table_entity(obj_node):
    table_name = obj_node.get('name')
    entity_name = REGISTRY.get_name(table_name)
    
    fields = []
    field_list = obj_node.find('field_list')
    if field_list is not None:
        for field in field_list.findall('field'):
            name = field.get('name')
            if name == 'objid' or name == 'dev': continue
            
            xml_type = field.get('common_data_type')
            java_type = TYPE_MAP.get(xml_type, 'String')
            
            fields.append({
                'name': name,
                'java_name': escape_keyword(to_lower_camel_case(name)),
                'type': java_type,
                'column': name,
                'length': field.get('array_size')
            })

    relations = []
    relation_list = obj_node.find('relation_list')
    if relation_list is not None:
        for rel in relation_list.findall('relation'):
            if rel.get('relation_type') == 'MTO':
                target = rel.get('target_table')
                target_entity = REGISTRY.get_name(target)
                
                name = rel.get('name')
                relations.append({
                    'name': name,
                    'java_name': escape_keyword(to_lower_camel_case(name)),
                    'target_type': target_entity
                })

    content = f"""package {PACKAGE};

import ch.sunrise.dal.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "{table_name}")
@Getter
@Setter
public class {entity_name} extends BaseEntity {{
"""
    for f in fields:
        col_part = f'name = "{f["column"]}"'
        if f['length']:
            col_part += f', length = {f["length"]}'
        
        content += f"\n    @Column({col_part})\n    private {f['type']} {f['java_name']};\n"

    for r in relations:
        content += f"\n    @ManyToOne(fetch = FetchType.LAZY)\n    @JoinColumn(name = \"{r['name']}\")\n    private {r['target_type']} {r['java_name']};\n"

    content += "}\n"
    
    file_path = os.path.join(OUTPUT_DIR, f"{entity_name}.java")
    if os.path.exists(file_path): os.remove(file_path) # Force case-sensitive overwrite on Windows
    with open(file_path, 'w') as f:
        f.write(content)

def generate_view_entity(sql_node):
    view_name = sql_node.get('name')
    if view_name.endswith('_sql_string'):
        view_name = view_name[:-11]
    
    entity_name = REGISTRY.get_name(view_name)
    
    sql_text = ""
    generic_sql = sql_node.find('generic_sql')
    if generic_sql is not None and generic_sql.text:
        sql_text = generic_sql.text
    
    fields = []
    seen_columns = set(['objid', 'dev'])
    
    select_match = re.search(r'select\s+(.*?)\s+from', sql_text, re.IGNORECASE | re.DOTALL)
    if select_match:
        select_clause = select_match.group(1)
        parts = []
        paren_depth = 0
        current_part = ""
        for char in select_clause:
            if char == '(': paren_depth += 1
            elif char == ')': paren_depth -= 1
            if char == ',' and paren_depth == 0:
                parts.append(current_part.strip())
                current_part = ""
            else:
                current_part += char
        parts.append(current_part.strip())

        for p in parts:
            if not p: continue
            alias_match = re.search(r'(?:\s+as\s+|\s+)(\w+)$', p, re.IGNORECASE)
            name = alias_match.group(1) if alias_match else p.split('.')[-1].strip()
            name = name.strip()
            if not name or not re.match(r'^\w+$', name): continue
            
            low_name = name.lower()
            if low_name in seen_columns: continue
            seen_columns.add(low_name)
            
            fields.append({
                'java_name': escape_keyword(to_lower_camel_case(name)),
                'column': name,
                'type': 'String'
            })

    final_fields = []
    final_seen = set()
    for f in fields:
        if f['java_name'] not in final_seen:
            final_fields.append(f)
            final_seen.add(f['java_name'])

    content = f"""package {PACKAGE};

import ch.sunrise.dal.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "{view_name}")
@Immutable
@Getter
public class {entity_name} extends BaseEntity {{
"""
    for f in final_fields:
        content += f"\n    @Column(name = \"{f['column']}\")\n    private {f['type']} {f['java_name']};\n"

    content += "}\n"
    
    file_path = os.path.join(OUTPUT_DIR, f"{entity_name}.java")
    if os.path.exists(file_path): os.remove(file_path)
    with open(file_path, 'w') as f:
        f.write(content)

def main():
    if not os.path.exists(OUTPUT_DIR):
        os.makedirs(OUTPUT_DIR)
        
    root = parse_xml()
    
    # Pre-register all objects to handle collisions
    for obj in root.findall('object'):
        name = obj.get('name')
        camel = to_camel_case(name)
        if camel.startswith('Table'): camel = camel[5:]
        REGISTRY.register(name, camel)
        
    for sql in root.findall('sql_string'):
        if sql.get('type') == 'sql_view':
            name = sql.get('name')
            if name.endswith('_sql_string'): name = name[:-11]
            camel = to_camel_case(name)
            if camel.startswith('Table'): camel = camel[5:]
            REGISTRY.register(name, camel)
    
    print("Generating entities for objects...")
    for obj in root.findall('object'):
        try:
            generate_table_entity(obj)
        except Exception as e:
            print(f"Error generating table {obj.get('name')}: {e}")

    print("Generating entities for views...")
    for sql in root.findall('sql_string'):
        if sql.get('type') == 'sql_view':
            try:
                generate_view_entity(sql)
            except Exception as e:
                print(f"Error generating view {sql.get('name')}: {e}")

    print("Done.")

if __name__ == "__main__":
    main()
