package sunrise.crm.xvo.common;

public class XAuditSiteCatVo {
	private String siteId;
	private String auditTimestamp;
	private String auditUsername;
	private String auditOperation;
	private String xCategoryType;
	private String xName;
	private String xAllowedSubscriptions;
	private String xDiscountPct;
	private String xMinDuration;
	private String xCategoryFamily;
	private String XIsAllowedAdvDisc;
	private String XIsDiscPerProd;

	public String toString() {
		return "XAuditSiteCat [siteId=" + this.siteId + ", auditTimestamp=" + this.auditTimestamp + ", auditUsername="
				+ this.auditUsername + ", auditOperation=" + this.auditOperation + ", xCategoryType="
				+ this.xCategoryType + ", xName=" + this.xName + ", xAllowedSubscriptions=" + this.xAllowedSubscriptions
				+ ", xDiscountPct=" + this.xDiscountPct + ", xMinDuration=" + this.xMinDuration + ", xCategoryFamily="
				+ this.xCategoryFamily + ", XIsAllowedAdvDisc=" + this.XIsAllowedAdvDisc + ", XIsDiscPerProd="
				+ this.XIsDiscPerProd + "]";
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
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

	public String getxCategoryType() {
		return this.xCategoryType;
	}

	public void setxCategoryType(String xCategoryType) {
		this.xCategoryType = xCategoryType;
	}

	public String getxName() {
		return this.xName;
	}

	public void setxName(String xName) {
		this.xName = xName;
	}

	public String getxAllowedSubscriptions() {
		return this.xAllowedSubscriptions;
	}

	public void setxAllowedSubscriptions(String xAllowedSubscriptions) {
		this.xAllowedSubscriptions = xAllowedSubscriptions;
	}

	public String getxDiscountPct() {
		return this.xDiscountPct;
	}

	public void setxDiscountPct(String xDiscountPct) {
		this.xDiscountPct = xDiscountPct;
	}

	public String getxMinDuration() {
		return this.xMinDuration;
	}

	public void setxMinDuration(String xMinDuration) {
		this.xMinDuration = xMinDuration;
	}

	public String getxCategoryFamily() {
		return this.xCategoryFamily;
	}

	public void setxCategoryFamily(String xCategoryFamily) {
		this.xCategoryFamily = xCategoryFamily;
	}

	public String getXIsAllowedAdvDisc() {
		return this.XIsAllowedAdvDisc;
	}

	public void setXIsAllowedAdvDisc(String xIsAllowedAdvDisc) {
		this.XIsAllowedAdvDisc = xIsAllowedAdvDisc;
	}

	public String getXIsDiscPerProd() {
		return this.XIsDiscPerProd;
	}

	public void setXIsDiscPerProd(String xIsDiscPerProd) {
		this.XIsDiscPerProd = xIsDiscPerProd;
	}
}