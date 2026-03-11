package sunrise.crm.domain.enums;


import java.util.Arrays;
import java.util.Map;

public enum InsuranceClaimInfoCrmStatus {

    NEW("NEW"), //DP Renewal (Upgrade) order with device insurance claim created, no shipment done yet
    NEW_DEVICE_ON_THE_WAY("NEW_DEVICE_ON_THE_WAY"), // New DP device together with return package sent to customer, not received yet -->
    // Statuses relevant for GOOD/BROKEN device condition -->
    OLD_DEVICE_ARRIVAL_PENDING("OLD_DEVICE_ARRIVAL_PENDING"), //  New device + return package received by customer, but not received by ReCommerce yet -->
    NO_DEVICE_RECEIVED("NO_DEVICE_RECEIVED"), // Final. If return package not received by ReCOmmerce within allowed number of days-->
    DEVICE_RECEIVED_VALUE_ASSESSMENT_PENDING("DEVICE_RECEIVED_VALUE_ASSESSMENT_PENDING"), //Old device received by ReCommerce. Pending their assessment. -->
    WAIT_CUSTOMER_RESPONSE("WAIT_CUSTOMER_RESPONSE"), // Recommerce requires some input from customer. F.i. in combination with LOCK_DEVICE_ACTIVE set as status reason. -->
    DEVICE_VALUE_ASSESSED("DEVICE_VALUE_ASSESSED"), // Final. Device evaluated by Recommerce -->
    DEVICE_SENT_BACK("DEVICE_SENT_BACK"), // Final. Device is sent back to customer by ReCommerce. -->
    // Statuses relevant for STOLEN device condition -->
    STOLEN_CLAIM_PENDING("STOLEN_CLAIM_PENDING"), // Insurance claim for stolen device not yet opened in Chubb by customer. -->
    STOLEN_CLAIM_OPENED("STOLEN_CLAIM_OPENED"), // Final?. Insurance claim for stolen device opened in Chubb by customer. -->
    STOLEN_CLAIM_CANCELLED("STOLEN_CLAIM_CANCELLED") // Final?. Insurance claim for stolen device NOT opened in Chubb by customer within allowed time (XY days). -->
    ;

    private String displayValue;

    private static final Map<String, InsuranceClaimInfoCrmStatus> ENUM_CONSTANTS = new java.util.HashMap<String, InsuranceClaimInfoCrmStatus>();
    private static final java.util.List<InsuranceClaimInfoCrmStatus> NO_DEVICE_RECEIVED_YET_STATUSES = Arrays.asList(NEW, NEW_DEVICE_ON_THE_WAY, OLD_DEVICE_ARRIVAL_PENDING, NO_DEVICE_RECEIVED);
    private static final java.util.List<InsuranceClaimInfoCrmStatus> BEFORE_WORKORDER_STATUSES = Arrays.asList(NEW, NEW_DEVICE_ON_THE_WAY, OLD_DEVICE_ARRIVAL_PENDING, STOLEN_CLAIM_PENDING,STOLEN_CLAIM_OPENED);
    

    static {
        for (InsuranceClaimInfoCrmStatus enumValue: InsuranceClaimInfoCrmStatus.values()) {
            InsuranceClaimInfoCrmStatus.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    };

    private InsuranceClaimInfoCrmStatus(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }


    @Override
    public String toString() {
        return getDisplayValue();
    }

    public static InsuranceClaimInfoCrmStatus fromDisplayValue(final String displayValue) {
        InsuranceClaimInfoCrmStatus foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid Buy Back CRM status: " + displayValue);
    }

    public static InsuranceClaimInfoCrmStatus fromDisplayValueWE(final String displayValue) {
        InsuranceClaimInfoCrmStatus foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        return null;
    }

    public boolean wasDeviceReceived() {
        return !NO_DEVICE_RECEIVED_YET_STATUSES.contains(this);
    }
    
    public boolean isStatusBeforeWorkorderCreation() {
        return BEFORE_WORKORDER_STATUSES.contains(this);
    }
    
    
}
