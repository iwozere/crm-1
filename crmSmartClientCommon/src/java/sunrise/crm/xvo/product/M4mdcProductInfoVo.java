package sunrise.crm.xvo.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sunrise.crm.domain.enums.UpcProductMigrationIneligibilityReason;
import sunrise.crm.util.CrmStringUtil;

import java.util.ArrayList;
import java.util.List;

public class M4mdcProductInfoVo extends ProductInfoVo {

    private static final Log log = LogFactory.getLog(UpcProductInfoVo.class);

    private final List<String> migrationIneligibilityReasons = new ArrayList<>();
    private final List<String> warningMessages = new ArrayList<>();

    public String getMigrationIneligibilityReason() {
        List<String> reasons = new ArrayList<>();
        try {
            for (String s : reasons) {
                reasons.add(UpcProductMigrationIneligibilityReason.valueOf(s).getDisplayValue());
            }
        } catch (Exception ex) {
            log.warn("", ex);
        }
        return CrmStringUtil.join(reasons, "\n");
    }

    public String getWarningMessage() {
        if (warningMessages.isEmpty()) {
            return CrmStringUtil.EMPTY;
        }
        return "These items cannot be migrated.They will be cancelled and should be returned.\n" + CrmStringUtil.join(warningMessages, "\n");
    }

    public List<String> getWarningMessages() {
        return warningMessages;
    }

    public List<String> getMigrationIneligibilityReasons() {
        return migrationIneligibilityReasons;
    }

    public void addMigrationIneligibilityReason(String reason) {
        if (!migrationIneligibilityReasons.contains(reason)) {
            migrationIneligibilityReasons.add(reason);
        }
    }

    public void addAllMigrationIneligibilityReasons(List<String> reasons) {
        migrationIneligibilityReasons.addAll(reasons);
    }

    public void addWarningMessage(String message) {
        warningMessages.add(message);
    }

    @Override
    public String toString() {
        return "M4mdcProductInfoVo [migrationIneligibilityReasons=" + migrationIneligibilityReasons + ", warningMessages="
                + warningMessages + ","  + super.toString() + "]";
    }

}
