import re
import json
import os

def extract_tables():
    input_file = 'docs/objects.md'
    output_file = 'scripts/target_objects.json'
    
    if not os.path.exists(input_file):
        print(f"Error: {input_file} not found")
        return

    tables = []
    # Regex to match the last parameter in quotes
    # Example: (..., "contract"),
    pattern = re.compile(r',\s*"([^"]+)"\s*\)?')

    with open(input_file, 'r', encoding='utf-8') as f:
        for line in f:
            match = pattern.search(line)
            if match:
                table_name = match.group(1)
                # Remove table_ prefix if it exists (per user request, though none seen so far)
                if table_name.startswith('table_'):
                    table_name = table_name[len('table_'):]
                tables.append(table_name)

    # Dedup just in case
    tables = sorted(list(set(tables)))

    with open(output_file, 'w', encoding='utf-8') as f:
        json.dump(tables, f, indent=4)
    
    print(f"Extracted {len(tables)} tables to {output_file}")

if __name__ == "__main__":
    extract_tables()
