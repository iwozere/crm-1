package sunrise.crm.domain.enums;

public enum M4mdcMigrationStatus {

    PENDING_VALIDATION("PENDING_VALIDATION"),
    VALIDATION_SUCCESS("VALIDATION_SUCCESS"),
    VALIDATION_FAILED("VALIDATION_FAILED"),
    OPTED_IN("OPTED_IN"),
    EXECUTION_VALIDATION_FAILURE("EXECUTION_VALIDATION_FAILURE"),
    ORDER_CREATED("ORDER_CREATED"),
    MIGRATED("MIGRATED"),
    CANCELLED("CANCELLED");


    private String displayStatus;

    private M4mdcMigrationStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public String getDisplayStatus() {
        return this.displayStatus;
    }

    @Override
    public String toString() {
        return getDisplayStatus();
    }

}
