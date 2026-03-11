package sunrise.crm.xvo.retention.infoScreen;

public class XInfoScreenDiscountAndAdjustmentVo {

	private String productName;
	private String subscriberNumber;
	private String discountName;
	private String discountAmount;
	private String startDate;
	private String endDate;
	private String style;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSubscriberNumber() {
		return subscriberNumber;
	}
	public void setSubscriberNumber(String subscriberNumber) {
		this.subscriberNumber = subscriberNumber;
	}
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	@Override
	public String toString() {
		return "XInfoScreenDiscountAndAdjustmentVo [productName=" + productName + ", subscriberNumber="
				+ subscriberNumber + ", discountName=" + discountName + ", discountAmount=" + discountAmount
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", style=" + style + "]";
	}
	
}
