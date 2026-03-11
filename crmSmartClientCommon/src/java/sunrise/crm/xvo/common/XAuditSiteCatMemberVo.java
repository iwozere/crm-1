package sunrise.crm.xvo.common;

public class XAuditSiteCatMemberVo {
	private String siteId;
	private String xCategoryType;
	private String auditTimestamp;
	private String auditUsername;
	private String auditOperation;
	private String xStartDate;
	private String xEndDate;
	private String xSiteCatObjid;
	private String xCatFamily;
	private String xDiscountStatus;
	private String xBizEmail;

	public String toString() {
		return "XAuditSiteCatMember [siteId=" + this.siteId + ", xCategoryType=" + this.xCategoryType
				+ ", auditTimestamp=" + this.auditTimestamp + ", auditUsername=" + this.auditUsername
				+ ", auditOperation=" + this.auditOperation + ", xStartDate=" + this.xStartDate + ", xEndDate="
				+ this.xEndDate + ", xSiteCatObjid=" + this.xSiteCatObjid + ", xCatFamily=" + this.xCatFamily
				+ ", xDiscountStatus=" + this.xDiscountStatus + ", xBizEmail=" + this.xBizEmail + "]";
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getxCategoryType() {
		return this.xCategoryType;
	}

	public void setxCategoryType(String xCategoryType) {
		this.xCategoryType = xCategoryType;
	}

	public String getAuditTimestamp() {
		return this.auditTimestamp;
	}

	public void setAuditTimestamp(String auditTimestamp) {
		this.auditTimestamp = auditTimestamp;
	}

	public String getAuditUsername() {
		return this.auditUsername;
	}

	public void setAuditUsername(String auditUsername) {
		this.auditUsername = auditUsername;
	}

	public String getAuditOperation() {
		return this.auditOperation;
	}

	public void setAuditOperation(String auditOperation) {
		this.auditOperation = auditOperation;
	}

	public String getxStartDate() {
		return this.xStartDate;
	}

	public void setxStartDate(String xStartDate) {
		this.xStartDate = xStartDate;
	}

	public String getxEndDate() {
		return this.xEndDate;
	}

	public void setxEndDate(String xEndDate) {
		this.xEndDate = xEndDate;
	}

	public String getxSiteCatObjid() {
		return this.xSiteCatObjid;
	}

	public void setxSiteCatObjid(String xSiteCatObjid) {
		this.xSiteCatObjid = xSiteCatObjid;
	}

	public String getxCatFamily() {
		return this.xCatFamily;
	}

	public void setxCatFamily(String xCatFamily) {
		this.xCatFamily = xCatFamily;
	}

	public String getxDiscountStatus() {
		return this.xDiscountStatus;
	}

	public void setxDiscountStatus(String xDiscountStatus) {
		this.xDiscountStatus = xDiscountStatus;
	}

	public String getxBizEmail() {
		return this.xBizEmail;
	}

	public void setxBizEmail(String xBizEmail) {
		this.xBizEmail = xBizEmail;
	}
}