package sunrise.crm.domain.enums;

public enum M4mdcMigrationOrderCreationStatus {

    ORDER_CREATED("ORDER_CREATED"),
    MIGRATION_DATE_SHIFTED("OPTED_IN_MIGRATION_DATE_SHIFTED"),
    PENDING_CEASE("PENDING_CEASE_ORDER"),
    ERROR_OCCURED("ERROR_OCCURED"),
    OTHER_FAILURE("1D_CHECK_FAILURE");



    private String displayStatus;

    private M4mdcMigrationOrderCreationStatus(String displayStatus) {
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
