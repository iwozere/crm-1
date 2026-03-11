package sunrise.crm.order.dto;

public enum OrbitOfferType {
    ATL("ATL"),
    NBO("NBO");

    private String displayValue;
    
    private static final java.util.Map<String, OrbitOfferType> ENUM_CONSTANTS = new java.util.HashMap<>();
    
    static {
        for (OrbitOfferType enumValue: OrbitOfferType.values()) {
        	OrbitOfferType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    private OrbitOfferType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static OrbitOfferType fromDisplayValue(final String displayValue) {
    	OrbitOfferType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid campaign type: " + displayValue);
    }

}
