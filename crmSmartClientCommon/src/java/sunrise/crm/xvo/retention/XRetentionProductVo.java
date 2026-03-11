package sunrise.crm.xvo.retention;

public class XRetentionProductVo {
	String productType;
	String productName;
	String subscriptionNo;
	String ipContractId;
	String subcaseId;
	String subcaseStatus;
	
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}	
	public String getIpContractId() {
		return ipContractId;
	}
	public void setIpContractId(String ipContractId) {
		this.ipContractId = ipContractId;
	}
	public String getSubcaseId() {
		return subcaseId;
	}
	public void setSubcaseId(String subcaseId) {
		this.subcaseId = subcaseId;
	}
	public String getSubcaseStatus() {
		return subcaseStatus;
	}
	public void setSubcaseStatus(String subcaseStatus) {
		this.subcaseStatus = subcaseStatus;
	}
	public String getSubscriptionNo() {
		return subscriptionNo;
	}
	public void setSubscriptionNo(String subscriptionNo) {
		this.subscriptionNo = subscriptionNo;
	}

}
