package sunrise.crm.domain.enums;

/**
 * Part Type (table_part_num.part_type)
 * @author hudak
 *
 */
public enum PartType {
    
    NOT_SET("Please Specify"),
    BILLING_CODE("Billing Code"),
    POSTPAID_BILLING_SERVICE("Postpaid Billing Service"),
    BILLING_SERVICE("Billing Service"),
    DATA("Data"),
    DEPOSIT_PLAN("Deposit Plan"),
    MAIN_CONTRACT("Main Contract"),
    MAIN_PART("Main Part"),
    OPTION("Option"),
    COMMERCIAL_PRODUCT("Commercial Product"),
    RATE_PLAN("Rate Plan"),    
    VOICE_MAIL("Voicemail"),
    INSURANCE_OPTION("Insurance Option"),
////    <value>Voice Mail cablecom</value>
////    <value>Basic Voice Mail</value>
////    <value>sunrise mailbox pro</value>
////    <value>Prepaid Voice Mail</value>
//    SIM("SIM"),
////    <value>SIM</value>
////    <value>Datacard SIM</value>
//    BLACKBERRY("Blackberry"),
////    <value>sunrise webmail for BB</value>
////    <value>Business connect for BB</value>
////    <value>Business connect flex for BB</value>
    COST_MANAGER("cost manager"),
    PUBLIC_TPV("Public TPV"),
    DISCOUNT("Discount"),
    DOWNGRADE_FEE("Downgrade Fee"),
    ETF("ETF"),
    HARDWARE("Hardware"),
    INFO("Info"),
    NETWORK("Network"),
    NOT_APPLICABLE("Not Applicable"),
    OTHER("Other"),
    PROMOTION("Promotion"),
    ACCESS("Access"),
    ACCESS_OPTION("Access Option"),
    ACCESS_SUBOPTION("Access Suboption"),
    VOICE("Voice"),
    SETUP_FEE("Setup Fee"),
    TEASER("Teaser"),
    INSTALMENT("Instalment"),
    BUNDLE_BILLING_SERVICE("Bundle Billing Service"),
    LOYALTY("Loyalty"),
    ADDON("Add-on"), 
    PCRF_RP("PCRF RP"),
    CHARGES("Charges"),
    OTT_TV_SERVICE("OTT TV Service"),
    SERVICE("Service"),
    NET_PAYMENT_SERVICE("Net Payment Service"),
    MOBILE_PACK("Mobile Pack"),
    MOBILE_PACK_LINE_ITEM("Mobile Pack Line Item"),
    DAAS("DaaS"),
    DEVICE_LEASING_CONTRACT("Device Leasing Contract"),
    DAAS_CONTRACT_LINE_ITEM("DaaS Contract Line Item")
    ;

    private String displayValue;
    private static final java.util.Map<String, PartType> ENUM_CONSTANTS = new java.util.HashMap<String, PartType>();
    
    static {
        for (PartType enumValue: PartType.values()) {
            PartType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    };

    private PartType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static PartType fromDisplayValue(final String displayValue) {
        PartType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid part type name: " + displayValue);
    }
    
    public static PartType fromDisplayValueWE(final String displayValue) {
        PartType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        return null;
    }

}
