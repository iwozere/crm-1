package sunrise.crm.custom.step.product.dto;

/**
 * Class 'ProductCategory' - copied from 'ProductCategoryType'.
 * @author arthur
 *
 */
public enum ProductCategory {

    //------------------/
    //- Enum Constants -/
    //------------------/
    /**
     * Constant INDOORBOX
     */
    INDOORBOX("INDOORBOX"),
    /**
     * Constant 'POSTPAID'.
     */
    POSTPAID("POSTPAID"),
    /**
     * Constant 'PREPAID'.
     */
    PREPAID("PREPAID"),
    /**
     * Constant 'ADSL'.
     */
    ADSL("ADSL"),
    /**
     * Constant 'ADSL_TALK_MORE'.
     */
    ADSL_TALK_MORE("ADSL_TALK_MORE"),
    /**
     * Constant 'CLICK_CALL'.
     */
    CLICK_CALL("CLICK_CALL"),
    /**
     * Constant 'CLICK_CALL_BUSINESS'.
     */
    CLICK_CALL_BUSINESS("CLICK_CALL_BUSINESS"),
    /**
     * Constant 'CLICK_CALL_BUSINESS_ISDN'.
     */
    CLICK_CALL_BUSINESS_ISDN("CLICK_CALL_BUSINESS_ISDN"),
    /**
     * Constant 'ULL'.
     */
    ULL("ULL"),
    /**
     * Constant 'ULL_BUSINESS'.
     */
    ULL_BUSINESS("ULL_BUSINESS"),
    /**
     * Constant 'ULL_MULTI_CLI_BUSINESS'.
     */
    ULL_MULTI_CLI_BUSINESS("ULL_MULTI_CLI_BUSINESS"),
    /**
     * Constant 'ULL_XDSL_INTERNET'.
     */
    ULL_XDSL_INTERNET("ULL_XDSL_INTERNET"),
    /**
     * Constant 'ULL_MULTI_CLI'.
     */
    ULL_MULTI_CLI("ULL_MULTI_CLI"),
    /**
     * Constant 'TV_VDSL'.
     */
    TV_VDSL("TV_VDSL"),
    /**
     * Constant 'NIP'.
     */
    NIP("NIP"),
    /**
     * Constant 'NIP_BUSINESS'.
     */
    NIP_BUSINESS("NIP_BUSINESS"),
    /**
     * Constant 'BUSINESS_DSL'.
     */
    BUSINESS_DSL("BUSINESS_DSL"),
    /**
     * Constant 'SELECT_ANALOG'.
     */
    SELECT_ANALOG("SELECT_ANALOG"),
    /**
     * Constant 'SELECT_ISDN'.
     */
    SELECT_ISDN("SELECT_ISDN"),
    /**
     * Constant 'SBS'.
     */
    SBS("SBS"),
    /**
     * Constant 'CALL'.
     */
    CALL("CALL"),
    /**
     * Constant 'CALL_BUSINESS'.
     */
    CALL_BUSINESS("CALL_BUSINESS"),
    /**
     * Constant 'CALL_BUSINESS_ISDN'.
     */
    CALL_BUSINESS_ISDN("CALL_BUSINESS_ISDN"),
    /**
     * Constant 'WEBPHONE'.
     */
    WEBPHONE("WEBPHONE"),
    /**
     * Constant 'TALK_MORE'.
     */
    TALK_MORE("TALK_MORE"),
    /**
     * Constant 'SBA'.
     */
    SBA("SBA"),
    /**
     * Constant 'SBV'.
     */
    SBV("SBV"),
    /**
     * Constant 'INTERNET_DIRECT'.
     */
    INTERNET_DIRECT("INTERNET_DIRECT"),
    /**
     * Constant 'COMPANY_NUMBERS_058'.
     */
    COMPANY_NUMBERS_058("COMPANY_NUMBERS_058"),
    /**
     * Constant 'BUSINESS_NUMBERS_08XX'.
     */
    BUSINESS_NUMBERS_08XX("BUSINESS_NUMBERS_08XX"),
    /**
     * Constant 'BUSINESS_NUMBERS_09XX'.
     */
    BUSINESS_NUMBERS_09XX("BUSINESS_NUMBERS_09XX"),
    /**
     * Constant 'IP_VPN'.
     */
    IP_VPN("IP_VPN"),
    /**
     * Constant 'SERVER_HOUSING'.
     */
    SERVER_HOUSING("SERVER_HOUSING"),
    /**
     * Constant 'DEDICATED_HOSTING'.
     */
    DEDICATED_HOSTING("DEDICATED_HOSTING"),
    /**
     * Constant 'VOIPGW_1COM_MANAGED'.
     */
    VOIPGW_1COM_MANAGED("VOIPGW_1COM_MANAGED"),
    /**
     * Constant 'VOIPGW_1COM_CONNECT'.
     */
    VOIPGW_1COM_CONNECT("VOIPGW_1COM_CONNECT"),
    /**
     * Constant 'RESIDENTIAL_EMAIL'.
     */
    RESIDENTIAL_EMAIL("RESIDENTIAL_EMAIL"),
    /**
     * Constant 'BUSINESS_EMAIL'.
     */
    BUSINESS_EMAIL("BUSINESS_EMAIL"),
    /**
     * Constant 'HOME_COMBI'.
     */
    HOME_COMBI("HOME_COMBI"),
    /**
     * Constant 'HOME_COMBI'.
     */
    PROMO_HARDWARE("PROMO_HARDWARE"),
    
    DIGITAL_SERVICE("DIGITAL_SERVICE"),
    /**
     * Constant 'MSP' for Managed CPE and Managed LAAS 
     */
    MSP("MSP"),
    
    SUBSCRIPTION("SUBSCRIPTION"),
    /**
     * Constant 'MBB'.
     */
    MBB("MBB"),
    
    CONNECTIVITY("CONNECTIVITY"),
    
    BUSINESS2BUSINESS("BUSINESS2BUSINESS"),

    HOME_SECURITY("HOME_SECURITY"),
    
    OTT_SUBSCRIPTION("OTT_SUBSCRIPTION"),
    
    EMPTY("");
    

    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, 
    ProductCategory> enumConstants = new java.util.HashMap<java.lang.String, ProductCategory>();


    static {
        for (ProductCategory c : ProductCategory.values()) {
            ProductCategory.enumConstants.put(c.value, c);
        }

    };


    //----------------/
    //- Constructors -/
    //----------------/

    /**
     * Default constructor.
     * @param value - the input value
     */
    private ProductCategory(final java.lang.String value) {
        this.value = value;
    }


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value - the input value
     * @return the constant for this value
     */
    public static ProductCategory fromValue(
            final java.lang.String value) {
        ProductCategory c = ProductCategory.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * Method setValue.
     * 
     * @param value - 
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }
}
