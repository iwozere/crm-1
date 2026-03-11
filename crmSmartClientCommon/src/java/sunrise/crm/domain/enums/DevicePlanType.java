package sunrise.crm.domain.enums;

public enum DevicePlanType {
	
	STANDARD("Standard"),
	SMART_UPGRADE("Smart Upgrade");
    
    private String displayValue;
    
    private static final java.util.Map<String, DevicePlanType> ENUM_CONSTANTS = new java.util.HashMap<String, DevicePlanType>();
    
    static {
        for (DevicePlanType enumValue: DevicePlanType.values()) {
        	DevicePlanType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    };

    private DevicePlanType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static DevicePlanType fromDisplayValue(final String displayValue) {
    	DevicePlanType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid device plan type: " + displayValue);
    }
    
    public static DevicePlanType fromDisplayValueWE(final String displayValue) {
    	DevicePlanType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        return null;
    }
}
