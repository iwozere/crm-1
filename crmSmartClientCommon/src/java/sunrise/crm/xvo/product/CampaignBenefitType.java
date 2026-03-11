package sunrise.crm.xvo.product;

public enum CampaignBenefitType {
	VOUCHER("Voucher"),
	GIFT("Gift"),
	MRC("MRC"),
	DP_SUBSIDY("DP Subsidy"),
    AP_SUBSIDY("AP Subsidy"),
    CASHBACK("Cashback"),
	ACTIVATION_FEE("Activation Fee");

    private String displayValue;
    
    private static final java.util.Map<String, CampaignBenefitType> ENUM_CONSTANTS = new java.util.HashMap<String, CampaignBenefitType>();
    
    static {
        for (CampaignBenefitType enumValue: CampaignBenefitType.values()) {
        	CampaignBenefitType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    };

    private CampaignBenefitType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static CampaignBenefitType fromDisplayValue(final String displayValue) {
    	CampaignBenefitType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid part type name: " + displayValue);
    }
    
    public static CampaignBenefitType fromDisplayValueWE(final String displayValue) {
    	CampaignBenefitType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        return null;
    }
}
