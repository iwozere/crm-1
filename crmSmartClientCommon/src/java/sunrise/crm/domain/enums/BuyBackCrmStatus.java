package sunrise.crm.domain.enums;

import java.util.Arrays;

public enum BuyBackCrmStatus {


	NEW("NEW","$NEW"),
	PACKAGE_ON_THE_WAY("PACKAGE_ON_THE_WAY", "$PACKAGE_ON_THE_WAY"),
	PENDING_PACKAGE_ARRIVAL("PENDING_PACKAGE_ARRIVAL", "$PENDING_PACKAGE_ARRIVAL"),
	LAST_CHANCE_SENT_DEVICE("LAST_CHANCE_SENT_DEVICE", "$LAST_CHANCE_SENT_DEVICE"),
	NO_DEVICE_RECEIVED("NO_DEVICE_RECEIVED", "$NO_DEVICE_RECEIVED"),
	DEVICE_RECEIVED_VALUE_ASSESSMENT_PENDING("DEVICE_RECEIVED_VALUE_ASSESSMENT_PENDING", "$DEVICE_RECEIVED_VALUE_ASSESSMENT_PENDING"),
	DEVICE_VALUE_ACCEPTED("DEVICE_VALUE_ACCEPTED", "$DEVICE_VALUE_ACCEPTED"),
	WAIT_CUSTOMER_ACCEPTANCE("WAIT_CUSTOMER_ACCEPTANCE", "$WAIT_CUSTOMER_ACCEPTANCE"),
	DEVICE_VALUE_REJECTED("DEVICE_VALUE_REJECTED","$DEVICE_VALUE_REJECTED"),
	DEVICE_SENT_BACK("DEVICE_SENT_BACK","$DEVICE_SENT_BACK"),
	COMPLETED("COMPLETED","$COMPLETED"),
    CUST_DECIDED("CUST_DECIDED","$CUST_DECIDED"),
    DEFAULT_DECISION("DEFAULT_DECISION", "$DEFAULT_DECISION")
	;
	
	private String displayValue;
	private String eventName;
    
    private static final java.util.Map<String, BuyBackCrmStatus> ENUM_CONSTANTS = new java.util.HashMap<String, BuyBackCrmStatus>();
    
    private static final java.util.List<BuyBackCrmStatus> FINAL_STATUSES = Arrays.asList(NO_DEVICE_RECEIVED, DEVICE_VALUE_ACCEPTED, DEVICE_VALUE_REJECTED, COMPLETED, DEVICE_SENT_BACK);
    private static final java.util.List<BuyBackCrmStatus> NO_DEVICE_RECEIVED_YET_STATUSES = Arrays.asList(NEW, PACKAGE_ON_THE_WAY, PENDING_PACKAGE_ARRIVAL, LAST_CHANCE_SENT_DEVICE, NO_DEVICE_RECEIVED, CUST_DECIDED);

    static {
        for (BuyBackCrmStatus enumValue: BuyBackCrmStatus.values()) {
        	BuyBackCrmStatus.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    };

    private BuyBackCrmStatus(String displayValue, final String eventName) {
        this.displayValue = displayValue;
        this.eventName = eventName;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    public String getEventName() {
        return this.eventName;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static BuyBackCrmStatus fromDisplayValue(final String displayValue) {
    	BuyBackCrmStatus foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid Buy Back CRM status: " + displayValue);
    }
    
    public static BuyBackCrmStatus fromDisplayValueWE(final String displayValue) {
    	BuyBackCrmStatus foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        return null;
    }
    
    public boolean isFinal() {
    	return FINAL_STATUSES.contains(this);
    }
    
    public boolean wasDeviceReceived() {
    	return !NO_DEVICE_RECEIVED_YET_STATUSES.contains(this);
    }
	
}
