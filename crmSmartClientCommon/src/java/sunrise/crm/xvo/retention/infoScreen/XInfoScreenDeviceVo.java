package sunrise.crm.xvo.retention.infoScreen;

import java.util.Date;

public class XInfoScreenDeviceVo {

	private String serialNo;
	private String subscriptionName;
	private String deviceName;
	private String deviceType;
	private Date devicePurchaseDate;
	
	public Date getDevicePurchaseDate() {
		return devicePurchaseDate;
	}
	public void setDevicePurchaseDate(Date devicePurchaseDate) {
		this.devicePurchaseDate = devicePurchaseDate;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSubscriptionName() {
		return subscriptionName;
	}
	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
}
