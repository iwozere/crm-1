package sunrise.crm.domain.enums;

public enum UpcProductMigrationIneligibilityReason {
    NON_HFC_ACCESS("Product is no on HFC access"),
    BCS("BCS fee is not included in the bundle price"),
    PARTNER_NETWORK("UPC product is on a partner network. If you see no products available after line check, please check Hulk/Einstein for instructions."),
    NO_INTERNET("There is no internet product"),
    NON_PAYMENT_UPC("Customer is blocked because of non-payment on UPC side"),
    NON_PAYMENT_SUN("Customer is blocked because of non-payment on Sunrise side"),
    NOT_ACTIVE_SUN("Customer is not active on Sunrise side"),
    NOT_ACTIVE_UPC("Customer is not active on UPC side"),
    PENDING_ORDER_SUN("There is a pending migration order or migration request on Sunrise side"),
    PENDING_ORDER_UPC("There is a pending order for this product on UPC side"),
    WRONG_INSTALLATION_ADDRESS("Installation address must be either in Switzerland or in Lichtenstein"),
    SEGMENT("Ineligible customer segment"),
    SAP_EOS_NOT_FOUND("EOS set-top box not found in UPC SAP asset inventory"),
    //IN_BINDING_PERIOD("Contract is in binding period"),
    NOT_TRANSFERRABLE("Cannot be migrated to Sunrise"),
    UNKNOWN_PAYMENT_METHOD ("Unknown pament method"),
    UNKNOWN_INVOICE_DELIVERY_METHOD ("Unknown invoice delivery method"),
    SUNRISE_SITE_DOES_NOT_EXIST ("Linked site does not exist"),
    UPC_SERVICE_SUSPENDED ("Service is suspended"),
    UPC_INACTIVE_SUBSCRIPTION ("Inactive subscription"),
    HAS_RECENT_CHANGES("Has recent changes"),
    NOT_SUPPORTED_HARDWARE ("Not supported hardware"),
    NOT_SUPPORTED_OPTION ("Not supported option"),
    HW_SHIPMENT_REQUIRED ("Hardware shipping required"),
    VALIDATION_FAILED_02 ("Only modem is requested to be changed, but STB is also needs to be changed"),
    VALIDATION_FAILED_03 ("Modem is requested to be changed along with STB, but either modem or STB is taken over"),
    INCORRECT_REQUEST ("Migration request is incorrect. Either requested product or option does not exist."),
    PRICE_MISMATCH ("Migration request expected price does not match with the real price."),
    EXPECTED_PRICE_MISSING ("Migration request expected price is missing."),
    PARTIALLY_BLOCKED ("Sunrise Customer is partially blocked")
    ;

            ;

    private String displayValue;

    private UpcProductMigrationIneligibilityReason(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
}
