package sunrise.crm.util;

import com.google.gson.Gson;

public class JsonObjectConverter {
	
    private static final Gson gson = new Gson();

    public static <T> T convertViaJson(Object source, Class<T> targetClass) {
        String json = gson.toJson(source);             
        return gson.fromJson(json, targetClass);
    }
    
    public static String toString(Object obj) {
    	return gson.toJson(obj);
    }
}
