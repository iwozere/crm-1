package sunrise.crm.domain.enums;

public enum HwReconciliationAction {

	CREATE_INTERNET_SERVICE("Create Internet Service"), 
	CREATE_VOICE_SERVICE("Create Voice Service"), 
	ADD_MODEM("Add Modem"), 
	DELETE_MODEM("Delete Modem"),
	CEASE_VOICE_SERVICE("Cease Voice Service"),
	CEASE_INTERNET_SERVICE("Cease Internet Service"),

	CREATE_TV_SERVICE("Create TV Service"), 
	CEASE_TV_SERVICE("Cease TV Service"), 
	ADD_TV_BOX("Add TV Box"), 
	DELETE_TV_BOX("Delete TV Box"),
	
	//Added for 46648
	ADD_POD("Add Pod"), 
	DELETE_POD("Delete Pod");

	private String displayValue;

	private static final java.util.Map<String, HwReconciliationAction> ENUM_CONSTANTS = new java.util.HashMap<>();

	static {
		for (HwReconciliationAction enumValue : HwReconciliationAction.values()) {
			HwReconciliationAction.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
		}
	}

	private HwReconciliationAction(String displayValue) {
		this.displayValue = displayValue;
	}

	public String getDisplayValue() {
		return this.displayValue;
	}

	@Override
	public String toString() {
		return getDisplayValue();
	}

	public static HwReconciliationAction fromDisplayValue(final String displayValue) {
		HwReconciliationAction foundValue = ENUM_CONSTANTS.get(displayValue);
		if (foundValue != null) {
			return foundValue;
		}
		throw new IllegalArgumentException("Invalid Reconciliation action type: " + displayValue);
	}
}
