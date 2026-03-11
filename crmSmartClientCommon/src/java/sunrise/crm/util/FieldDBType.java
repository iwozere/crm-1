package sunrise.crm.util;

import java.util.HashMap;
import java.util.Map;

public enum FieldDBType {
	STRING("String"), LONG("Long"), DECIMAL("Decimal"), NUMBER("Number"), DATE("Date"), EMPTY("");
	
	public static final String WITHIN_LAST_HOURS_OPERATION_STRING = "within last(hours)";
	public static final String WITHIN_LAST_DAYS_OPERATION_STRING = "within last(days)";
	public static final String YESTERDAY_OPERATION_STRING = "yesterday";
	public static final String TODAY_OPERATION_STRING = "today";
	public static final String IS_NOT_IN_OPERATION_STRING = "is not in";
	public static final String IS_IN_OPERATION_STRING = "is in";
	public static final String DOES_NOT_END_WITH_OPERATION_STRING = "does not end with";
	public static final String DOES_NOT_START_WITH_OPERATION_STRING = "does not start with";
	public static final String CONTAINS_OPERATION_STRING = "contains";
	public static final String ENDS_WITH_OPERATION_STRING = "ends with";
	public static final String STARTS_WITH_OPERATION_STRING = "starts with";
	public static final String IS_NOT_EQUAL_TO_OPERATION_STRING = "is not equal to";
	public static final String IS_EQUAL_TO_OPERATION_STRING = "is equal to";
	public static final String LESS_THAN_OR_EQUAL_TO_OPERATION_STRING = "less than or equal to";
	public static final String LESS_THAN_OPERATION_STRING = "less than";
	public static final String GREATER_THAN_OR_EQUAL_TO_OPERATION_STRING = "greater than or equal to";
	public static final String GREATER_THAN_OPERATION_STRING = "greater than";
	public static final String PLEASE_SPECIFY_OPERATION_STRING = "Please Specify";
	
	public static final String DATE_DB_TYPE_STRING = "Date";
	public static final String NUMBER_DB_TYPE_STRING = "Number";
	public static final String LONG_DB_TYPE_STRING = "Long";
	public static final String STRING_DB_TYPE_STRING = "String";
	private static Map<String, FieldDBType> table = new HashMap<String, FieldDBType>();
	
	private String value;
	
	static {
		for (FieldDBType item : FieldDBType.values()) {
			table.put(item.getValue(), item);
        }
	}
	
	private FieldDBType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static FieldDBType getFromString(String value) {
		FieldDBType fieldType = table.get(value);
		/*if (fieldType == null) {
			throw new IllegalArgumentException("Unsupported enum value used!");
		}*/
		return fieldType;
	}
}
