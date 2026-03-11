import os
import json
import datetime
import oracledb as oracle

def json_serial(obj):
    """JSON serializer for objects not serializable by default json code"""
    if isinstance(obj, (datetime.datetime, datetime.date)):
        return obj.isoformat()
    # Fallback for LOBs if they somehow bypass the type handler
    if hasattr(obj, 'read'):
        return obj.read()
    raise TypeError ("Type %s not serializable" % type(obj))

def output_type_handler(cursor, name, default_type, size, precision, scale):
    """
    Directly maps LOB types to LONG types to ensure they are fetched as 
    strings/bytes instead of LOB objects.
    """
    if default_type == oracle.CLOB:
        return cursor.var(oracle.LONG_STRING, arraysize=cursor.arraysize)
    if default_type == oracle.BLOB:
        return cursor.var(oracle.LONG_BINARY, arraysize=cursor.arraysize)

def export_adp_data():
    user = 'unittest'
    password = 'unittest'
    schema = 'SA'
    dsn = "t-orap-db-03.swi.srse.net:1901/TCRMX03_rw.swi.srse.net"
    
    target_tables = [
        "ADP_COMMENT", "ADP_CONFIG", "ADP_FIELD", "ADP_HEADER", 
        "ADP_INDEX", "ADP_JOIN", "ADP_LANGUAGE", "ADP_NATIVE_SQL", 
        "ADP_OBJECT", "ADP_RELATION"
    ]

    print(f"Connecting to {dsn} as {user}...")
    
    try:
        # Note: init_oracle_client is only needed for Thick mode. 
        # If your DB supports it, Thin mode (removing this line) is often easier for cross-platform.
        oracle.init_oracle_client(lib_dir=r"c:\oracle\product\19c\Client_x64\bin")
        
        conn = oracle.connect(user=user, password=password, dsn=dsn)
        conn.outputtypehandler = output_type_handler
        
        cursor = conn.cursor()
        output_dir = 'metadata_export'
        if not os.path.exists(output_dir):
            os.makedirs(output_dir)

        for table in target_tables:
            print(f"Exporting {table}...")
            try:
                cursor.execute(f"SELECT * FROM {schema}.{table}")
                columns = [col[0].lower() for col in cursor.description]
                rows = cursor.fetchall()
                data = [dict(zip(columns, row)) for row in rows]
                
                file_path = os.path.join(output_dir, f"{table}.json")
                with open(file_path, 'w', encoding='utf-8') as f:
                    json.dump(data, f, default=json_serial, indent=2)
            except oracle.DatabaseError as e:
                print(f"Skipping {table}: {e}")

        # NEW: Export MTM structure
        print("Discovering MTM tables...")
        try:
            cursor.execute(f"SELECT table_name FROM all_tables WHERE owner = '{schema}' AND table_name LIKE 'MTM_%'")
            mtm_tables = [row[0] for row in cursor.fetchall()]
            
            mtm_structure = {}
            for mtm_table in mtm_tables:
                print(f"Analyzing structure of {mtm_table}...")
                cursor.execute(f"SELECT column_name FROM all_tab_columns WHERE owner = '{schema}' AND table_name = '{mtm_table}' ORDER BY column_id")
                cols = [row[0].lower() for row in cursor.fetchall()]
                mtm_structure[mtm_table.lower()] = cols
            
            with open(os.path.join(output_dir, "ADP_MTM_STRUCTURE.json"), 'w', encoding='utf-8') as f:
                json.dump(mtm_structure, f, indent=2)
        except oracle.DatabaseError as e:
            print(f"Error exporting MTM structure: {e}")

        print(f"\nExport complete. Files saved in {output_dir}/")
        
        cursor.close()
        conn.close()
        
    except Exception as e:
        print(f"Oracle Connection Error: {e}")

if __name__ == "__main__":
    export_adp_data()