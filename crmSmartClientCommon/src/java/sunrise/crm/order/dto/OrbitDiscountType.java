package sunrise.crm.order.dto;

public enum OrbitDiscountType {
    RATE_PLAN("Rate Plan"), // NBO Mobile Discount, NBO Fixnet Discount
    HARDWARE("Hardware"), // DP, AP, GSM Hardware, Fixnet Hardware discount
    CASHBACK("Cashback"), // Cashback
    ACTIVATION_FEE("Activation Fee"); // Activation Fees Discount

    private String displayValue;
    
    private static final java.util.Map<String, OrbitDiscountType> ENUM_CONSTANTS = new java.util.HashMap<>();
    
    static {
        for (OrbitDiscountType enumValue: OrbitDiscountType.values()) {
        	OrbitDiscountType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    private OrbitDiscountType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static OrbitDiscountType fromDisplayValue(final String displayValue) {
    	OrbitDiscountType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid campaign type: " + displayValue);
    }

}
