package sunrise.crm.externalvoucher;

import java.util.Date;

public class ExternalVoucherGroupDto {
	private String objid;
	private String voucherGroup;
	private String allocationType;
	private String emailLetterCode;
	private String smsLetterCode;
	private Date startDate;
	private Date endDate;
	private boolean validatedEmailOnly;
	private int notificationThreshold;
	private String notificationEmail;
	private Date createDate;
	private Date updateDate;
	
	public ExternalVoucherGroupDto() {
	}

	public String getObjid() {
		return objid;
	}

	public void setObjid(String objid) {
		this.objid = objid;
	}

	public String getVoucherGroup() {
		return voucherGroup;
	}

	public void setVoucherGroup(String voucherGroup) {
		this.voucherGroup = voucherGroup;
	}

	public String getAllocationType() {
		return allocationType;
	}

	public void setAllocationType(String allocationType) {
		this.allocationType = allocationType;
	}

	public String getEmailLetterCode() {
		return emailLetterCode;
	}

	public void setEmailLetterCode(String emailLetterCode) {
		this.emailLetterCode = emailLetterCode;
	}

	public String getSmsLetterCode() {
		return smsLetterCode;
	}

	public void setSmsLetterCode(String smsLetterCode) {
		this.smsLetterCode = smsLetterCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isValidatedEmailOnly() {
		return validatedEmailOnly;
	}

	public void setValidatedEmailOnly(boolean validatedEmailOnly) {
		this.validatedEmailOnly = validatedEmailOnly;
	}

	public int getNotificationThreshold() {
		return notificationThreshold;
	}

	public void setNotificationThreshold(int notificationThreshold) {
		this.notificationThreshold = notificationThreshold;
	}

	public String getNotificationEmail() {
		return notificationEmail;
	}

	public void setNotificationEmail(String notificationEmail) {
		this.notificationEmail = notificationEmail;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "ExternalVoucherGroupDto [objid=" + objid + ", voucherGroup=" + voucherGroup + ", allocationType="
				+ allocationType + ", emailLetterCode=" + emailLetterCode + ", smsLetterCcode=" + smsLetterCode
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", validatedEmailOnly=" + validatedEmailOnly
				+ ", notificationThreshold=" + notificationThreshold + ", notificationEmail=" + notificationEmail
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
}
