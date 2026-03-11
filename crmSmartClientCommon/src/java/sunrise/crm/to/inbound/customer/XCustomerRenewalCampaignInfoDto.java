package sunrise.crm.to.inbound.customer;

public class XCustomerRenewalCampaignInfoDto {
	
	private String subscrNo;
	private String status;
	private String targeted;
	private String offer;
	private String date;
	private String subscriptionName;
	
	
	public String getSubscrNo() {
		return subscrNo;
	}
	public void setSubscrNo(String subscrNo) {
		this.subscrNo = subscrNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTargeted() {
		return targeted;
	}
	public void setTargeted(String targeted) {
		this.targeted = targeted;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSubscriptionName() {
		return subscriptionName;
	}
	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}
}