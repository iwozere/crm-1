package sunrise.crm.order.dto;

public enum ProcessingMode {
	
	SEQUENTIAL("SEQUENTIAL"),
	PARALLEL("PARALLEL"),
    INDEPENDENT("INDEPENDENT");

    private String displayValue;

    private static final java.util.Map<String, ProcessingMode> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        for (ProcessingMode enumValue : ProcessingMode.values()) {
        	ProcessingMode.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    ProcessingMode(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    public static ProcessingMode fromDisplayValue(final String displayValue) {
    	ProcessingMode foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid attribute type: " + displayValue);
    }
}
