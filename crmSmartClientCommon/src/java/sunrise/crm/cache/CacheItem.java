package sunrise.crm.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CacheItem {

	protected static List<String> fieldNames = new ArrayList<String>();
	
	protected Map<String, Object> fields = new HashMap<String, Object>();
}
