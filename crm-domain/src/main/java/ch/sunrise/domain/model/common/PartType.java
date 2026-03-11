package ch.sunrise.domain.model.common;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Part Type (table_part_num.part_type)
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
    DAAS_CONTRACT_LINE_ITEM("DaaS Contract Line Item");

    private final String displayValue;

    private static final Map<String, PartType> LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.displayValue.toUpperCase(),
                    type -> type)));

    PartType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    /**
     * Finds the PartType by its display value (case-insensitive).
     *
     * @param displayValue The display value to look up.
     * @return An Optional containing the PartType if found, or empty otherwise.
     */
    public static Optional<PartType> fromDisplayValue(String displayValue) {
        return Optional.ofNullable(displayValue)
                .map(String::toUpperCase)
                .map(LOOKUP::get);
    }
}