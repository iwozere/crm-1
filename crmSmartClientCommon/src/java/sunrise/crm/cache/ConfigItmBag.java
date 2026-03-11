package sunrise.crm.cache;

import java.util.Map;

public class ConfigItmBag extends CacheItem {

	static{
		fieldNames.add("objid");
		fieldNames.add("name");
		fieldNames.add("str_value");
		fieldNames.add("x_environment");
	}
	
	public ConfigItmBag(Map<String, Object> map){
		for (String key : fieldNames){
			fields.put(key, map.get(key));
		}
	}
}
