import json
import os

DOCS_DIR = 'docs'

def load_json(filename):
    path = os.path.join(DOCS_DIR, filename)
    with open(path, 'r') as f:
        return json.load(f)

def analyze_relationships():
    objects = load_json('ADP_OBJECT.json')
    relations = load_json('ADP_RELATION.json')
    
    # Map type_id to type_name
    id_to_name = {obj['type_id']: obj['type_name'] for obj in objects}
    name_to_id = {obj['type_name']: obj['type_id'] for obj in objects}
    
    # Analyze Contact (type_id 45)
    target_ids = [45, 86, 20] # Contact, Contract, User
    joins = load_json('ADP_JOIN.json')
    
    for tid in target_ids:
        tname = id_to_name.get(tid, f"Unknown({tid})")
        rels = [r for r in relations if r['type_id'] == tid]
        print(f"\n--- Relationships for '{tname}' (type_id: {tid}) ---")
        for r in rels:
            rt = r['rel_type']
            type_map = {1: "OTM", 2: "MTO", 5: "MTM", 3: "OTOP", 4: "OTOF", 10: "INV_CHILD"}
            ts = type_map.get(rt, f"Type {rt}")
            
            # Look for join info if MTM (Type 5)
            join_info = ""
            if rt == 5:
                # Match on source type_id and spec_rel_id
                rel_joins = [j for j in joins if j['view_type_id'] == tid and j['obj_spec_rel_id'] == r['spec_rel_id']]
                if rel_joins:
                    # The join record's obj_type_id is likely the join table
                    join_tables = [id_to_name.get(j['obj_type_id'], f"ID:{j['obj_type_id']}") for j in rel_joins]
                    join_info = f" [Joins: {', '.join(join_tables)}]"
            
            print(f"  {r['rel_name']:25} -> {r['target_name']:20} ({ts:10}){join_info} [Inv: {r['inv_rel_name']}]")

    print("\n--- Many-to-Many (Type 5) Samples ---")
    mtm_samples = [r for r in relations if r['rel_type'] == 5][:10]
    for r in mtm_samples:
        src = id_to_name.get(r['type_id'], f"Unknown({r['type_id']})")
        print(f"{src} --({r['rel_name']})--> {r['target_name']} [Inv: {r['inv_rel_name']}]")

if __name__ == "__main__":
    analyze_relationships()
