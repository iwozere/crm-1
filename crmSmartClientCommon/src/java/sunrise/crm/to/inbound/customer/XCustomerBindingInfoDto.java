package sunrise.crm.to.inbound.customer;


public class XCustomerBindingInfoDto {
	
	private String subscrNo;
	private String binding;
	private String type;
	private String expires;
	private String until;
	private String subscriptionName;
	
	
	public String getSubscrNo() {
		return subscrNo;
	}
	public void setSubscrNo(String subscrNo) {
		this.subscrNo = subscrNo;
	}
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExpires() {
		return expires;
	}
	public void setExpires(String expires) {
		this.expires = expires;
	}
	public String getUntil() {
		return until;
	}
	public void setUntil(String until) {
		this.until = until;
	}
	public String getSubscriptionName() {
		return subscriptionName;
	}
	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}
	
}
