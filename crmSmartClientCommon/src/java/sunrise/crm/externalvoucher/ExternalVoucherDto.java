package sunrise.crm.externalvoucher;

import java.util.Date;

public class ExternalVoucherDto {
	private String voucherId;
	private String voucherGroup;
	private String voucherCode;
	private String siteId;
	private String orderId;
	private String campaignName;
	private String status;
	private String productSerial;
	private Date reserveDate;
	private Date sendDate;
	
	public ExternalVoucherDto() {
		//let it be empty
	}

	public String getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherGroup() {
		return voucherGroup;
	}

	public void setVoucherGroup(String voucherGroup) {
		this.voucherGroup = voucherGroup;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProductSerial() {
		return productSerial;
	}

	public void setProductSerial(String productSerial) {
		this.productSerial = productSerial;
	}

	public Date getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	public String getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	@Override
	public String toString() {
		return "ExternalVoucherDto [voucherId=" + voucherId + ", voucherGroup=" + voucherGroup + ", voucherCode="
				+ voucherCode + ", siteId=" + siteId + ", orderId=" + orderId + ", campaignName=" + campaignName
				+ ", status=" + status + ", productSerial=" + productSerial + ", reserveDate=" + reserveDate
				+ ", sendDate=" + sendDate + "]";
	}
}
