/**
 * 
 */
package sunrise.crm.util;

import java.util.Map;

/**
 * @author ansari
 *
 */
public final class CrmMapUtil {
	
    /**
     * Formats a given map into a comma-separated key-value string.
     *
     * @param map The map to be formatted.
     * @return A string containing comma-separated key-value pairs.
     */
	public static String formatMapToString(Map<String, String> map) {
        if (map == null) {
            return ""; // Return an empty string if the map is null
        }

        StringBuilder output = new StringBuilder();
        boolean firstEntry = true;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (!firstEntry) {
                output.append(", ");
            }

            output.append(key).append(" - ").append(value);
            firstEntry = false;
        }

        return output.toString();
    }
}
