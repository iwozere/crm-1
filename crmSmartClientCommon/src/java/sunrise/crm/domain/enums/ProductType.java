package sunrise.crm.domain.enums;

/**
 * Product types with their respective container site part name.
 * 
 * @author Goncalves
 *
 */
public enum ProductType {
    
    // ORDER BASED PRODUCTS
    MOBILE_POSTPAID("GSM Contract"),
    INSTALMENT("Instalments"),
    MOBILE_PREPAID("Mobile Prepaid"),
    MOBILE_COVERAGE("Mobile Coverage"),
    ADSL("ADSL Top Product"),
    ULL("ULL Contract"),
    CLI("CLI"),
    HARDWARE_CONTRACT("Hardware Contract"),
    WEBPHONE("VoIP"),
    VOIP_GATEWAY("1com connect-single"),
    MOBILE_PBX("Mobile PBX"),
    HOSTED_APPS("Sunrise Hosted Apps"),
    RESIDENTIAL_EMAIL("Sunrise Residential Email"),
    INBOX("sunrise inbox"),
    // NON-ORDER BASED SELECT PRODUCTS
    VOICE_PABX("PABX"),
    // HARDWARE
    EQUIPMENT("Equipment"),
    // BILLING ADDONS
    REFILL_PREP_RECUR("Recurring Prepaid Refill"),
    REFILL_PREP_RECUR_CC("Recurring Prepaid CC Refill"),
    REFILL_PREP_ONEOFF("One-off Prepaid Refill"),
    REFILL_PREP_ONEOFF_CC("One-off Prepaid CC Refill"),
    DISCOUNT_LIST("Discount List"),
    CHARGE_LIST("Charge List"),
    CREDIT_LIST("Credit List"),
    MYGROUP("mygroup"),
    EBPP("EBPP"),
    // BUSINESS NON-ORDER BASED PRODUCTS
    SOCC("sunrise 1com connect"),
    SBV("Sunrise Business Voice"),
    BUSINESS_DSL("Sunrise Business DSL"),
    IP_VPN("Sunrise IP VPN"),
    FIBRE_ACCESS("Sunrise Fibre Access"),
    SERVER_HOUSING("Sunrise Server Housing"),
    DEDICATED_HOSTING("Sunrise dedicated hosting"),
    MANAGED_GATEWAY("sunrise 1com managed"),
    INTERNET_DIRECT("Sunrise Internet Direct"),
    COMPANY_NUMBERS_058("sunrise 058 company numbers"),
    INBOUND_0800_FREECALL("Inbound 0800 freecall"),
    INBOUND_0800_IP_REMOTE("Inbound 0800 IP Remote"),
    INBOUND_0840_SURF("Inbound 0840 Surf"),
    INBOUND_0842_WEB("Inbound 0842 web"),
    INBOUND_0844_LOCAL("Inbound 0844 local"),
    INBOUND_0848_NATIONAL("Inbound 0848 national"),
    INBOUND_0900_MARKET("Inbound 0900 market"),
    INBOUND_0901_SHOP("Inbound 0901 shop"),
    INBOUND_0906_ADULT("Inbound 0906 adult"),
    SBS_FAMILY("family"),
    SBS_SUNRISE_FRIENDS("sunrise friends"),
    SBS_SELECT_60("select 60"),
    SBS_SELECT_LIBERTE("select liberte"),
    SBS_SELECT_PLUS("Select Plus"),
    SBS_SELECT_UNLIMITED("select unlimited"),
    SBS_SELECT_INTERNATIONAL("select international"),
    SBS_INTERNATIONAL_BUSINESS("internat. business"),
    SBS_INTERNATIONAL_PLUS("international plus"),
    SBS_SELECT_BUSINESS_90("select business 90"),
    SBS_SELECT_BUSINESS_120("select business 120"),
    SBS_SUNRISE_CALL("SBS Sunrise call"),
    SBS_SUNRISE_CALL_PLUS_ADSL("SBS Sunrise call plus ADSL"),
    SBS_FREESURF_200("freesurf 200"),
    SBS_FREESURF_20_PROMO("freesurf 200 promo"),
    SBS_INTERNATIONAL_BUDGET("international budget"),
    SBS_TRIO("trio"),
    SBS_UNLIMITED_LIGHT("unlimited light"),
    SBS_SELECT_PREMIUM_1STAR("select premium 1star"),
    SBS_SELECT_PREMIUM_2STAR("select premium 2star"),
    SBS_SELECT_PREMIUM_3STAR("select premium 3star"),
    SBS_SELECT_PREMIUM_4STAR("select premium 4star"),
    SBS_WINZERO_NO_CALL_SETUP("WIN without call setup"),
    SBS_WINZERO_FIX_NAT_SETUP("WIN Zero Fix Nat setup"),
    SBS_WINZERO_NAT_INT_SETUP("WIN Zero Nat/Int setup"),
    SBS_MOBILE_PRE_PAID("Mobile Pre-Paid"),
    SVOB("sunrise Voice over Broadband"),
    SVOB_ADMIN_INFO("svob admin info"),
    SVOB_BILLING_MEDIATION("Billing & Mediation"),
    SVOB_INTERMEDIATE_SERVER("Intermediate Server"),
    SVOB_RESELLER_EMAIL("Reseller email"),
    SLL("Sunrise Leased Line"),
    SBA_PROFILE("Sunrise Account Profile"),
    SBA("Sunrise Business Account"),
    // CABLECOM PRODUCTS
    CABLECOM_BASIC("cablecom basic"),
    CABLECOM_GROUP("cablecom group"),
    HOME_COMBI_BUNDLE("Home Combi Bundle"),    
    SAP_FULFILLMENT("SAP Fulfillment"),
    ADSL_ACCESS_ADDRESSING("ADSL Access & addressing ."), 
    DSL_ACCESS_ADDRESSING("DSL access & addressing (BBCS)"),
    DSL_ACCESS_ADDRESSING_ONE("DSL access & addressing (BBCS) 1"),
    SURFMAX("surfmax"),
    SUNRISE_INDOOR_BOX("Sunrise indoor Box"),
    BUSINESS_INDOOR_BOX("Business indoor box"),
    DIGITAL_SERVICE_CONTRACT("Digital Service Contract"),
    APPLE_CONTRACT("Apple Contract"),
    SUBSCRIPTION_CONTRACT("Subscription Contract"), 
    B2B_CONTRACT("B2B Contract"),
    RECURRING_PAYMENT("Recurring Payment"),
    MSP("MSP"),
    FINAL_BILL("Final Bill"),
    SITE_GLOBAL_CONTRACT("Site Global Contract"), MOBILE_PACK("Mobile Pack"), DAAS_CONTRACT("DaaS Contract"),
    OTT_SERVICES_CONTRACT("OTT Services Contract"),
	DEVICE_REPAIR("Device Repair"),
    F_SECURE_CONTRACT("F Secure Contract"),
    HOME_PROTECT_CONTRACT("Home Protect Contract"),
    FIRST_BILL("First Bill"),
    OTT_CONTRACT("OTT Contract");
    

    private String displayValue;
    
    private static final java.util.Map<String, ProductType> ENUM_CONSTANTS = new java.util.HashMap<String, ProductType>();
    
    static {
        for (ProductType enumValue: ProductType.values()) {
            ProductType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    };

    private ProductType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static ProductType fromDisplayValue(final String displayValue) {
        ProductType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid product container name: " + displayValue);
    }
}
