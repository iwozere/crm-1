package sunrise.crm.xvo.product;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sunrise.crm.domain.enums.UpcProductMigrationIneligibilityReason;
import sunrise.crm.util.CrmStringUtil;

public class UpcProductInfoVo extends ProductInfoVo {

    private static final Log log = LogFactory.getLog(UpcProductInfoVo.class);

	private final List<String> migrationIneligibilityReasons = new ArrayList<>();
	private final List<String> warningMessages = new ArrayList<>();
	
	private String upcCustomerId;
	private String upcCustomerName;
	private String upcCustomerDob;
	private String upcCustomerEmail;
	private String installationAddress;
	

	public String getMigrationIneligibilityReason() {
		List<String> reasons = new ArrayList<>();
		try{
			for (String s : reasons){
				reasons.add(UpcProductMigrationIneligibilityReason.valueOf(s).getDisplayValue());
			}
		}catch(Exception ex){
			log.warn("", ex);
		}
		return CrmStringUtil.join(reasons, "\n");
	}
	public String getWarningMessage() {
		if (warningMessages.isEmpty()){
			return CrmStringUtil.EMPTY;
		}
		return "These items cannot be migrated to Sunrise. They will be cancelled and should be returned to UPC if needed.\n" + CrmStringUtil.join(warningMessages, "\n");
	}

    public List<String> getWarningMessages() {
        return warningMessages;
    }

	public List<String> getMigrationIneligibilityReasons() {
		return migrationIneligibilityReasons;
	}

	public void addMigrationIneligibilityReason(String reason) {
		if (!migrationIneligibilityReasons.contains(reason)){
			migrationIneligibilityReasons.add(reason);
		}
	}
	public void addAllMigrationIneligibilityReasons(List<String> reasons) {
		migrationIneligibilityReasons.addAll(reasons);
	}

	public void addWarningMessage(String message) {
		warningMessages.add(message);
	}

	public String getUpcCustomerId() {
		return upcCustomerId;
	}
	public String getUpcCustomerName() {
		return upcCustomerName;
	}
	public String getUpcCustomerDob() {
		return upcCustomerDob;
	}
	public String getUpcCustomerEmail() {
		return upcCustomerEmail;
	}
	public String getInstallationAddress() {
		return installationAddress;
	}
	public void setUpcCustomerId(String upcCustomerId) {
		this.upcCustomerId = upcCustomerId;
	}
	public void setUpcCustomerName(String upcCustomerName) {
		this.upcCustomerName = upcCustomerName;
	}
	public void setUpcCustomerDob(String upcCustomerDob) {
		this.upcCustomerDob = upcCustomerDob;
	}
	public void setUpcCustomerEmail(String upcCustomerEmail) {
		this.upcCustomerEmail = upcCustomerEmail;
	}
	public void setInstallationAddress(String installationAddress) {
		this.installationAddress = installationAddress;
	}
	
	@Override
	public String toString() {
		return "UpcProductInfoVo [migrationIneligibilityReasons=" + migrationIneligibilityReasons + ", warningMessages="
				+ warningMessages + ", upcCustomerId=" + upcCustomerId + ", upcCustomerName=" + upcCustomerName
				+ ", upcCustomerDob=" + upcCustomerDob + ", upcCustomerEmail=" + upcCustomerEmail
				+ ", installationAddress=" + installationAddress + super.toString() + "]";
	}
}
