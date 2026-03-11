package sunrise.crm.domain.enums;

public enum TechnicianPackageType {

    NO_TECHNICIAN("No Technician"),
    HOME_SECURITY_INSTALLATION("Home Security Installation");

    private final String displayValue;

    TechnicianPackageType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
