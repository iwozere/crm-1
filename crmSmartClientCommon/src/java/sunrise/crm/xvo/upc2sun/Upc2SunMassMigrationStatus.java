package sunrise.crm.xvo.upc2sun;

import java.util.Arrays;

public enum Upc2SunMassMigrationStatus {

    NEW("NEW"),
    PENDING("PENDING"),
    D1_SUCCESS("D1_SUCCESS"),
    D1_FAILURE("D1_FAILURE"),
    D7_SUCCESS("D7_SUCCESS"),
    D7_FAILURE("D7_FAILURE"),
    D28_SUCCESS("D28_SUCCESS"),
    D28_FAILURE("D28_FAILURE"),
    ORDER_CREATED("ORDER_CREATED"),
    MIGRATED("MIGRATED"),
    CANCELLED("CANCELLED"),
    D0_D5_HW_SHIPPED("D0_D5_HW_SHIPPED"),
    D5_REMINDER_HW_RECEIVED("D5_REMINDER_HW_RECEIVED"),
    D5_REMINDER_HW_NOT_RECEIVED("D5_REMINDER_HW_NOT_RECEIVED"),
    D12_REMINDER_HW_RECEIVED("D12_REMINDER_HW_RECEIVED"),
    D12_REMINDER_HW_NOT_RECEIVED("D12_REMINDER_HW_NOT_RECEIVED"),
    D19_REMINDER_HW_RECEIVED("D19_REMINDER_HW_RECEIVED"),
    D19_REMINDER_HW_NOT_RECEIVED("D19_REMINDER_HW_NOT_RECEIVED"),
    CANCELLED_POND("CANCELLED_POND"),
    CANCELLED_BY_IT("CANCELLED_BY_IT")
    ;


    private String displayValue;

    private static final java.util.Map<String, Upc2SunMassMigrationStatus> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        Arrays.stream(Upc2SunMassMigrationStatus.values())
                .forEach(enumValue -> Upc2SunMassMigrationStatus.ENUM_CONSTANTS
                        .put(enumValue.displayValue, enumValue));
    }

    Upc2SunMassMigrationStatus(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    public static Upc2SunMassMigrationStatus fromDisplayValue(final String displayValue) {
        Upc2SunMassMigrationStatus foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid request status: " + displayValue);
    }
}
