import json
import os
import re
from collections import defaultdict

# Configuration
DATA_DIR = 'data'
OUTPUT_DIR = 'src/main/java/ch/sunrise/dal/table'
PACKAGE = 'ch.sunrise.dal.table'

def load_target_objects():
    path = 'scripts/target_objects.json'
    if not os.path.exists(path):
        return None
    with open(path, 'r', encoding='utf-8') as f:
        return set(json.load(f))

TARGET_TABLES = load_target_objects()

def to_camel_case(snake_str):
    if not snake_str: return ""
    if snake_str.lower() == 'data_set': return "Dataset"
    components = snake_str.split('_')
    return ''.join(x.title() for x in components)

def to_upper_snake_case(name):
    if not name: return ""
    # Replace anything not alphanumeric with underscore
    name = re.sub(r'[^a-zA-Z0-9]', '_', name)
    # Convert to uppercase
    return name.upper()

def load_json(filename):
    path = os.path.join(DATA_DIR, filename)
    if not os.path.exists(path):
        print(f"Warning: {path} not found")
        return []
    with open(path, 'r', encoding='utf-8') as f:
        return json.load(f)

def clear_directory(directory):
    if not os.path.exists(directory):
        os.makedirs(directory)
        return
    print(f"Clearing {directory}...")
    for f in os.listdir(directory):
        path = os.path.join(directory, f)
        if os.path.isfile(path) and f.endswith('.java'):
            os.remove(path)

class NameRegistry:
    def __init__(self):
        self.used_low_names = {}
        self.orig_to_final = {}

    def get_name(self, orig_name):
        if orig_name in self.orig_to_final:
            return self.orig_to_final[orig_name]
        
        camel = to_camel_case(orig_name)
        if not camel.startswith('Table'):
            camel = f"Table{camel}"
            
        low = camel.lower()
        if low in self.used_low_names:
            if self.used_low_names[low] == camel:
                return camel
            suffix = 2
            while True:
                candidate = f"{camel}{suffix}"
                cand_low = candidate.lower()
                if cand_low not in self.used_low_names:
                    self.used_low_names[cand_low] = candidate
                    self.orig_to_final[orig_name] = candidate
                    return candidate
                suffix += 1
        else:
            self.used_low_names[low] = camel
            self.orig_to_final[orig_name] = camel
            return camel

REGISTRY = NameRegistry()

def generate():
    print("Starting table constants generation...")
    clear_directory(OUTPUT_DIR)

    objects = load_json('ADP_OBJECT.json')
    fields_all = load_json('ADP_FIELD.json')

    # Pre-register names to handle collisions
    for obj in objects:
        name = obj['type_name']
        if TARGET_TABLES is not None and name not in TARGET_TABLES:
            continue
        REGISTRY.get_name(name)

    # Group fields by type_id
    fields_by_type = defaultdict(list)
    for f in fields_all:
        fields_by_type[f['type_id']].append(f)

    for obj in objects:
        table_name = obj['type_name']
        if TARGET_TABLES is not None and table_name not in TARGET_TABLES:
            continue
        type_id = obj['type_id']
        
        # Determine class name via registry
        class_name = REGISTRY.get_name(table_name)

        # Gather fields
        fields = fields_by_type.get(type_id, [])
        # Filter out objid and dev case-insensitively
        filtered_fields = [f['field_name'] for f in fields if f['field_name'].lower() not in ('objid', 'dev')]
        
        if not filtered_fields and not table_name:
            continue

        # Generate constants
        constants = []
        all_cols_list = ["objid", "dev"]
        used_const_names = {"OBJID", "DEV", "TABLE", "ALL_COLUMNS"}
        
        constants.append(f'    public static final String OBJID = "objid";')
        constants.append(f'    public static final String DEV = "dev";')

        for field in filtered_fields:
            const_name = to_upper_snake_case(field)
            
            # Ensure uniqueness
            base_const_name = const_name
            suffix = 2
            while const_name in used_const_names:
                const_name = f"{base_const_name}{suffix}"
                suffix += 1
            used_const_names.add(const_name)
            
            constants.append(f'    public static final String {const_name} = "{field}";')
            all_cols_list.append(field)

        all_columns_str = ", ".join(all_cols_list)

        # Build class content
        content = f"""package {PACKAGE};

import jakarta.annotation.Generated;

@Generated("scripts/generate_table_constants.py")
public final class {class_name} {{

    public static final String TABLE = "{table_name}";

"""
        content += "\n".join(constants)
        content += "\n\n"
        content += f'    public static final String ALL_COLUMNS =\n            "{all_columns_str}";\n'
        content += f"""
    private {class_name}() {{}}
}}
"""
        
        # Write to file
        output_path = os.path.join(OUTPUT_DIR, f"{class_name}.java")
        with open(output_path, 'w', encoding='utf-8') as f:
            f.write(content)

    generated_count = len([f for f in os.listdir(OUTPUT_DIR) if f.endswith('.java')])
    print(f"Generation complete: {generated_count} table constant classes created.")

if __name__ == "__main__":
    generate()
