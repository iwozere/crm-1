package sunrise.crm.domain.enums;

/**
 * Customer Segment.
 * 
 * @author Goncalves
 *
 */
public enum CustomerSegment {
    
    RESIDENTIAL("Residential"),
    MEDIUM_CORPORATE("Medium Corporate"),
    LARGE_CORPORATE("Large Corporate"),
    SOHO("SoHo"),
    EMPLOYEE("Employee"),
    INTERCONNECT("Interconnect"),
    CARRIER("Carrier"),
    PARTNER("Partner"),
    INTERNAL_SUNRISE("InternalSunrise");

    private String displayValue;
    
    private static final java.util.Map<String, CustomerSegment> ENUM_CONSTANTS = new java.util.HashMap<String, CustomerSegment>();
    
    static {
        for (CustomerSegment enumValue: CustomerSegment.values()) {
            CustomerSegment.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    private CustomerSegment(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static CustomerSegment fromDisplayValue(final String displayValue) {
        CustomerSegment foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid customer segment: " + displayValue);
    }
    
    public boolean isBusinessCustomer() {
    	return MEDIUM_CORPORATE.equals(this) || LARGE_CORPORATE.equals(this) || SOHO.equals(this);
    }
        
}
