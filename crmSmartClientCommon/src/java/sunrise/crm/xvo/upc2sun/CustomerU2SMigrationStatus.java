package sunrise.crm.xvo.upc2sun;

import java.util.Arrays;

public enum CustomerU2SMigrationStatus {

    NEW("NEW"),
    PENDING("PENDING"),
    COMPLETED("COMPLETED");


    private String displayValue;

    private static final java.util.Map<String, CustomerU2SMigrationStatus> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        Arrays.stream(CustomerU2SMigrationStatus.values())
                .forEach(enumValue -> CustomerU2SMigrationStatus.ENUM_CONSTANTS
                        .put(enumValue.displayValue, enumValue));
    }

    CustomerU2SMigrationStatus(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    public static CustomerU2SMigrationStatus fromDisplayValue(final String displayValue) {
        CustomerU2SMigrationStatus foundValue = ENUM_CONSTANTS.get(displayValue.toUpperCase());
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid part type name: " + displayValue);
    }
}
