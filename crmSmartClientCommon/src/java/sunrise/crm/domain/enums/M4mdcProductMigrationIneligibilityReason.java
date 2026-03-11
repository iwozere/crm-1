package sunrise.crm.domain.enums;

public enum M4mdcProductMigrationIneligibilityReason {
    BLOCKED_NON_PAYMENT("Customer is blocked because of non-payment"),
    SITE_NOT_ACTIVE("Customer is not active"),
    PENDING_ORDER("There is a pending migration order or migration request"),
    PENDING_CEASE_ORDER("There is a pending cease order"),
    SEGMENT("Ineligible customer segment"),
    IN_BINDING_PERIOD("Contract is in binding period"),
    NOT_SUPPORTED_OPTION ("Not supported option"),
    NOT_SUPPORTED_PRODUCT ("Migration product is part of the target portfolio"),
    INCORRECT_REQUEST ("Migration request is incorrect. Either requested product or option does not exist."),
    DISCOUNT_IN_DANGER ("Migration is going to remove cross-product discount."),
    PARTIALLY_BLOCKED ("Customer is partially blocked"),
    PRODUCT_IS_NOT_ACTIVE ("Product is deinstalled or suspended"),
    SUBSCRIPTION_IS_NOT_ACTIVE ("Subscription is not in active status"),
    SUBSCRIPTION_IS_NOT_POSTPAID ("Subscription is not mobile postpaid"),
    SUBSCRIPTION_HAS_CHANGED ("Subscription has been changed since time the request was created"),
    SITE_HAS_ACTIVE_ICB_DISCOUNT ("Site has active site level discount (ICB)");

    private String displayValue;

    private M4mdcProductMigrationIneligibilityReason(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
}
