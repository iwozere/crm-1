package sunrise.crm.xvo.retention;

import java.math.BigDecimal;

public class XRetentionOffersVo {
	
	String subscriptionNo;
	String productName;
	String productType;
	
	String targetProduct;
	String targetRPInternet;
	String targetRPTV;	
	
	String discProduct;
	String discInternet;
	String discTV;
	
	BigDecimal discProductAmount;
	BigDecimal discRPInternetAmount;
	BigDecimal discRPTVAmount;	
	
	int discProdDuration;
	int discInternetDuration;
	int discTVDuration;	
	
	String option;
	String optionAttrName;
	String optionAttrValue;
	
	String optionDiscount;
	BigDecimal optionDiscAmount;
	BigDecimal optionDiscPerc;
	int optionDiscDuration;
	
	int offerPriority;
	String orderId;
	String offerType;
	
	String creditAmount;
	String creditModObjid;
	
	// For Fixnet offers, Offered Price of Internet and TV on Line Checker
	BigDecimal originalInternetPrice;
	BigDecimal offeredInternetPrice;
	BigDecimal originalTVPrice;
	BigDecimal offeredTVPrice;
	
	Boolean isOverBudget;
    String contractBindingStatus;
    String splitOrderId;
    String xSellOrderId;
	String xSellOrderLinkedSubscription;
    
	public String getDiscProduct() {
		return discProduct;
	}
	public void setDiscProduct(String discProduct) {
		this.discProduct = discProduct;
	}
	public String getDiscInternet() {
		return discInternet;
	}
	public void setDiscInternet(String discInternet) {
		this.discInternet = discInternet;
	}	
	
	public String getTargetProduct() {
		return targetProduct;
	}
	public void setTargetProduct(String targetProduct) {
		this.targetProduct = targetProduct;
	}
	public String getTargetRPInternet() {
		return targetRPInternet;
	}
	public void setTargetRPInternet(String targetRPInternet) {
		this.targetRPInternet = targetRPInternet;
	}
	public String getTargetRPTV() {
		return targetRPTV;
	}
	public void setTargetRPTV(String targetRPTV) {
		this.targetRPTV = targetRPTV;
	}	
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}	
	
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getOptionAttrName() {
		return optionAttrName;
	}
	public void setOptionAttrName(String optionAttrName) {
		this.optionAttrName = optionAttrName;
	}
	public String getOptionAttrValue() {
		return optionAttrValue;
	}
	public void setOptionAttrValue(String optionAttrValue) {
		this.optionAttrValue = optionAttrValue;
	}
	public BigDecimal getDiscProductAmount() {
		return discProductAmount;
	}
	public void setDiscProductAmount(BigDecimal discProductAmount) {
		this.discProductAmount = discProductAmount;
	}
	public BigDecimal getDiscRPInternetAmount() {
		return discRPInternetAmount;
	}
	public void setDiscRPInternetAmount(BigDecimal discRPInternetAmount) {
		this.discRPInternetAmount = discRPInternetAmount;
	}
	public BigDecimal getDiscRPTVAmount() {
		return discRPTVAmount;
	}
	public void setDiscRPTVAmount(BigDecimal discRPTVAmount) {
		this.discRPTVAmount = discRPTVAmount;
	}
	public int getDiscProdDuration() {
		return discProdDuration;
	}
	public void setDiscProdDuration(int discProdDuration) {
		this.discProdDuration = discProdDuration;
	}
	public int getDiscInternetDuration() {
		return discInternetDuration;
	}
	public void setDiscInternetDuration(int discInternetDuration) {
		this.discInternetDuration = discInternetDuration;
	}
	public int getDiscTVDuration() {
		return discTVDuration;
	}
	public void setDiscTVDuration(int discTVDuration) {
		this.discTVDuration = discTVDuration;
	}

	public BigDecimal getOptionDiscAmount() {
		return optionDiscAmount;
	}
	public void setOptionDiscAmount(BigDecimal optionDiscAmount) {
		this.optionDiscAmount = optionDiscAmount;
	}
	public BigDecimal getOptionDiscPerc() {
		return optionDiscPerc;
	}
	public void setOptionDiscPerc(BigDecimal optionDiscPerc) {
		this.optionDiscPerc = optionDiscPerc;
	}
	public int getOfferPriority() {
		return offerPriority;
	}
	public void setOfferPriority(int offerPriority) {
		this.offerPriority = offerPriority;
	}
	public String getOptionDiscount() {
		return optionDiscount;
	}
	public void setOptionDiscount(String optionDiscount) {
		this.optionDiscount = optionDiscount;
	}
	public String getSubscriptionNo() {
		return subscriptionNo;
	}
	public void setSubscriptionNo(String subscriptionNo) {
		this.subscriptionNo = subscriptionNo;
	}
	public String getDiscTV() {
		return discTV;
	}
	public void setDiscTV(String discTV) {
		this.discTV = discTV;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getOptionDiscDuration() {
		return optionDiscDuration;
	}
	public void setOptionDiscDuration(int optionDiscDuration) {
		this.optionDiscDuration = optionDiscDuration;
	}
	public BigDecimal getOriginalInternetPrice() {
		return originalInternetPrice;
	}
	public void setOriginalInternetPrice(BigDecimal originalInternetPrice) {
		this.originalInternetPrice = originalInternetPrice;
	}
	public BigDecimal getOfferedInternetPrice() {
		return offeredInternetPrice;
	}
	public void setOfferedInternetPrice(BigDecimal offeredInternetPrice) {
		this.offeredInternetPrice = offeredInternetPrice;
	}
	public BigDecimal getOriginalTVPrice() {
		return originalTVPrice;
	}
	public void setOriginalTVPrice(BigDecimal originalTVPrice) {
		this.originalTVPrice = originalTVPrice;
	}
	public BigDecimal getOfferedTVPrice() {
		return offeredTVPrice;
	}
	public void setOfferedTVPrice(BigDecimal offeredTVPrice) {
		this.offeredTVPrice = offeredTVPrice;
	}
	public String getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getCreditModObjid() {
		return creditModObjid;
	}
	public void setCreditModObjid(String creditModObjid) {
		this.creditModObjid = creditModObjid;
	}	
	
	public Boolean getIsOverBudget() {
		return isOverBudget;
	}
	public void setIsOverBudget(Boolean isOverBudget) {
		this.isOverBudget = isOverBudget;
	}
	public String getContractBindingStatus() {
		return contractBindingStatus;
	}
	public void setContractBindingStatus(String contractBindingStatus) {
		this.contractBindingStatus = contractBindingStatus;
	}
	public String getSplitOrderId() {
		return splitOrderId;
	}
	public void setSplitOrderId(String splitOrderId) {
		this.splitOrderId = splitOrderId;
	}
	public String getxSellOrderId() {
		return xSellOrderId;
	}
	public void setxSellOrderId(String xSellOrderId) {
		this.xSellOrderId = xSellOrderId;
	}
	public String getxSellOrderLinkedSubscription() {
		return xSellOrderLinkedSubscription;
	}
	public void setxSellOrderLinkedSubscription(String xSellOrderLinkedSubscription) {
		this.xSellOrderLinkedSubscription = xSellOrderLinkedSubscription;
	}
}
