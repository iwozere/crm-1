package sunrise.crm.domain.enums;

/**
 * Customer Segment display name.
 * 
 * @author sakshi
 * @since R23.4 Aurum stream 1 , 29.08.2023
 * 
 */
public enum CustomerSegmentDisplayName {
    
	MEDIUM_BUSINESS("Medium Business"),
    ENTERPRISE("Enterprise"),
    SMALL_BUSINESS("Small Business");

    private String displayNameValue;
    
    private static final java.util.Map<String, CustomerSegmentDisplayName> ENUM_CONSTANTS = new java.util.HashMap<String, CustomerSegmentDisplayName>();
    
    static {
        for (CustomerSegmentDisplayName enumValue: CustomerSegmentDisplayName.values()) {
            CustomerSegmentDisplayName.ENUM_CONSTANTS.put(enumValue.displayNameValue, enumValue);
        }
    }

    private CustomerSegmentDisplayName(String displayValue) {
        this.displayNameValue = displayValue;
    }

    public String getDisplayNameValue() {
        return this.displayNameValue;
    }
    
    @Override
    public String toString() {
        return getDisplayNameValue();
    }
    
    public static CustomerSegmentDisplayName fromDisplayValue(final String displayValue) {
        CustomerSegmentDisplayName foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid customer segment: " + displayValue);
    }
}
