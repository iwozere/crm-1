import os
import re

# Configuration
ENTITY_DIR = 'src/main/java/ch/sunrise/dal/entity'
REPO_OUTPUT_DIR = 'src/main/java/ch/sunrise/dal/repository'
ENTITY_PACKAGE = 'ch.sunrise.dal.entity'
REPO_PACKAGE = 'ch.sunrise.dal.repository'

def generate_repository(entity_name):
    content = f"""package {REPO_PACKAGE};

import {ENTITY_PACKAGE}.{entity_name};
import ch.sunrise.dal.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface {entity_name}Repository extends BaseRepository<{entity_name}, Long> {{
}}
"""
    file_path = os.path.join(REPO_OUTPUT_DIR, f"{entity_name}Repository.java")
    if os.path.exists(file_path): os.remove(file_path)
    with open(file_path, 'w') as f:
        f.write(content)

def main():
    if not os.path.exists(REPO_OUTPUT_DIR):
        os.makedirs(REPO_OUTPUT_DIR)
    
    print(f"Scanning entities in {ENTITY_DIR}...")
    entities = []
    for filename in os.listdir(ENTITY_DIR):
        if filename.endswith(".java") and filename != "BaseEntity.java":
            entity_name = filename[:-5] # Remove .java
            entities.append(entity_name)
    
    print(f"Found {len(entities)} entities. Generating repositories...")
    for entity in entities:
        generate_repository(entity)
    
    print("Done.")

if __name__ == "__main__":
    main()
