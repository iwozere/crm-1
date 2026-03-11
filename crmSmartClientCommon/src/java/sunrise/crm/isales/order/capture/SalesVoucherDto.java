package sunrise.crm.isales.order.capture;

import java.util.Date;

public class SalesVoucherDto {
	
	private String voucherCode;
	private String voucherName;
	private String promoDescription;
	private String status;
	private String allocationType;
	private String allocationValue;
	private Date actDate;
	private Date deactDate;
	public String getVoucherCode() {
		return voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}
	public String getVoucherName() {
		return voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}
	public String getPromoDescription() {
		return promoDescription;
	}
	public void setPromoDescription(String promoDescription) {
		this.promoDescription = promoDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAllocationType() {
		return allocationType;
	}
	public void setAllocationType(String allocationType) {
		this.allocationType = allocationType;
	}
	public String getAllocationValue() {
		return allocationValue;
	}
	public void setAllocationValue(String allocationValue) {
		this.allocationValue = allocationValue;
	}
	public Date getActDate() {
		return actDate;
	}
	public void setActDate(Date actDate) {
		this.actDate = actDate;
	}
	public Date getDeactDate() {
		return deactDate;
	}
	public void setDeactDate(Date deactDate) {
		this.deactDate = deactDate;
	}
	@Override
	public String toString() {
		return "SalesVoucherDto [voucherCode=" + voucherCode + ", voucherName=" + voucherName + ", promoDescription="
				+ promoDescription + ", status=" + status + ", allocationType=" + allocationType + ", allocationValue="
				+ allocationValue + ", actDate=" + actDate + ", deactDate=" + deactDate + "]";
	}
}
