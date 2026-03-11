package sunrise.crm.ui.credit.note.info;

public class XCreditNoteCreationVo {
	private String billText;
	private String amountWithoutVAT;
	private String amountPerUnit;	
	private String reasonCode; 
	private String productGroup;
	private String cause; 
	private String invoiceNumber;
	// 58443
	private String PNKReason;
	
	public String getDeliveryChannel() {
		return deliveryChannel;
	}
	public void setDeliveryChannel(String deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	private String matId;
	private String matDescription;
	private String msisdn;
	private String deliveryChannel;
	private String email_to;
	public String getEmail_to() {
		return email_to;
	}
	public void setEmail_to(String email_to) {
		this.email_to = email_to;
	}
	public String getEmail_cc() {
		return email_cc;
	}
	public void setEmail_cc(String email_cc) {
		this.email_cc = email_cc;
	}
	private String email_cc;
	
	public String getBillText() {
		return billText;
	}
	public void setBillText(String billText) {
		this.billText = billText;
	}
	public String getAmountWithoutVAT() {
		return amountWithoutVAT;
	}
	public void setAmountWithoutVAT(String amountWithoutVAT) {
		this.amountWithoutVAT = amountWithoutVAT;
	}
	public String getAmountPerUnit() {
		return amountPerUnit;
	}
	public void setAmountPerUnit(String amountPerUnit) {
		this.amountPerUnit = amountPerUnit;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getMatId() {
		return matId;
	}
	public void setMatId(String matId) {
		this.matId = matId;
	}
	public String getMatDescription() {
		return matDescription;
	}
	public void setMatDescription(String matDescription) {
		this.matDescription = matDescription;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	// CR 33875
		private String emailText;
		public String getEmailText() {
			return emailText;
		}
		public void setEmailText(String emailText) {
			this.emailText = emailText;
		}

	public String getPNKReason() {
		return PNKReason;
	}

	public void setPNKReason(String pNKReason) {
		PNKReason = pNKReason;
	}
}
