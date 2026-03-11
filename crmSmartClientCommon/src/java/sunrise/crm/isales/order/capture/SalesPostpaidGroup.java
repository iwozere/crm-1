package sunrise.crm.isales.order.capture;

public enum SalesPostpaidGroup {
    REGULAR("Regular", "Regular"),
    LIGHT("Light", "Light"),
    YOUNG("Young", "Young"),
    EXTRA("Extra", "Extra"),
    CHILD("Child", "Child"),
    TVSTREAMING("TV Streaming", "TV Streaming"),
    BUSINESS("Business", "Business");

    private String displayValue;

    private String searchValue;

    private static final java.util.Map<String, SalesPostpaidGroup> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        for (SalesPostpaidGroup enumValue : SalesPostpaidGroup.values()) {
            SalesPostpaidGroup.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    SalesPostpaidGroup(String displayValue, String searchValue) {
        this.displayValue = displayValue;
        this.searchValue = searchValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    public String getSearchValue() {
        return this.searchValue;
    }

    public static SalesPostpaidGroup fromDisplayValue(final String displayValue) {
        SalesPostpaidGroup foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid sales postpaid group: " + displayValue);
    }

}
