package sunrise.crm.xvo.product;

import sunrise.crm.wemobile.dto.WeMobilePackLevel;

/**
 * This class represents basic data about We Mobile Pack bundle, like Mobile Pack level, first subscription serial number etc.
 * 
 * @author Kosyrev
 *
 */
public class WeMobilePackInfoVo {

	private WeMobilePackLevel mobilePackLevel;
	private String currentFirstSubscriptionSerial;
	private String orderedFirstSubscriptionSerial;
	public WeMobilePackLevel getMobilePackLevel() {
		return mobilePackLevel;
	}
	public void setMobilePackLevel(WeMobilePackLevel mobilePackLevel) {
		this.mobilePackLevel = mobilePackLevel;
	}
	public String getCurrentFirstSubscriptionSerial() {
		return currentFirstSubscriptionSerial;
	}
	public void setCurrentFirstSubscriptionSerial(String currentFirstSubscriptionSerial) {
		this.currentFirstSubscriptionSerial = currentFirstSubscriptionSerial;
	}
	public String getOrderedFirstSubscriptionSerial() {
		return orderedFirstSubscriptionSerial;
	}
	public void setOrderedFirstSubscriptionSerial(String orderedFirstSubscriptionSerial) {
		this.orderedFirstSubscriptionSerial = orderedFirstSubscriptionSerial;
	}
	
}
