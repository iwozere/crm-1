package ch.sunrise.domain.model.order;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum LineItemAction {
    ADD("Add"),
    DELETE("Delete"),
    REPLACE_ADD("Replace/Add"),
    REPLACE_ADDMODIFY("Replace/AddModify"),
    REPLACE_DELETE("Replace/Delete"),
    REPLACE_DELETEMODIFY("Replace/DeleteModify"),
    ADD_SKIP("Add-Skip"),
    DELETE_SKIP("Delete-Skip"),
    REPLACE_ADD_SKIP("Replace/Add-Skip"),
    REPLACE_DELETE_SKIP("Replace/Delete-Skip"),
    CEASE("Cease"),
    RELOCATION_ADD("Relocation/Add"),
    RELOCATION_DELETE("Relocation/Delete"),
    ADD_BILLING("AddBilling"), // maybe not used at all, double check
    REMOVE_BILLING("RemoveBilling"),
    REFUND("Refund"),
    RECONNECT("Reconnect"),
    RECREATE("Recreate"),
    CONVERSION("Conversion"),
    MIGRATE("Migrate"),
    ADD_CHILD("AddChild"),
    MODIFY_INBOX("Modify Inbox"),
    UPDATE("Update"),
    MOBILE_REFERENCE("MobileReference"),
    // new actions introduced for Copper 2 Fiber conversions
    SKIP_ADD("SkipAdd"),
    SKIP_DELETE("SkipDelete"),
    SKIP_CEASE("SkipCease"),
    SKIP_REPLACE_ADD("SkipReplaceAdd"),
    SKIP_REPLACE_DELETE("SkipReplaceDelete"),
    SKIP_BILLING_ADD("SkipBillingAdd"),
    SKIP_BILLING_DELETE("SkipBillingDelete"),
    SUSPEND("Suspend"),
    UNSUSPEND("Unsuspend"),
    BILLING_ADD("BillingAdd"),
    BILLING_DELETE("BillingDelete"),
    UPC_MIGRATE("UpcMigrate"),
    UPC_CEASE("UpcCease"),
    ADD_MODIFY("AddModify");

    private final String displayValue;

    LineItemAction(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }

    private static final Map<String, LineItemAction> LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.displayValue.toUpperCase(),
                    type -> type)));

    /**
     * Finds the LineItemAction by its display value (case-insensitive).
     *
     * @param displayValue The display value to look up.
     * @return An Optional containing the LineItemAction if found, or empty
     *         otherwise.
     */
    public static Optional<LineItemAction> fromDisplayValue(String displayValue) {
        return Optional.ofNullable(displayValue)
                .map(String::toUpperCase)
                .map(LOOKUP::get);
    }
}
