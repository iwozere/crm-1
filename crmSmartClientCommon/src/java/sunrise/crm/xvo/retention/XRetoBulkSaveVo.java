package sunrise.crm.xvo.retention;

import java.util.Arrays;
import java.util.Date;

public class XRetoBulkSaveVo {
	
	private String ipContract;
	private String callForm;
	private XCurrentOptionsListVo[] basket;
	private Date schedDate;
	private String usedBudget;
	private String remainingBudget;
	private String duration;
	private Boolean isProlong;
	private String discountAmount;
	private String retentionDiscAmt;
	private String medium;
	private String contractBindingStatus;
	private Date contractEndDate; 
	private String saveAction;
	private String productName;
	private String productType;
	private String subscriptionNo;
	private String usedBudgetPerc;
	private String churnRiskScore;
	private String threshold;
	private String updatedCB;
	private String oldCB;
	private String creaditAmount;
	private String creditModObjid;
	private Boolean isOverBudget;
	private String discDurOverride;
	private String conBindDurOverride;
	private String durationExtension;
	private String suppressDiscount;
	private String availableOverBudget;
	private String availableBudget;
	private String isSubscProfitable;
	private String isOverBudgetUsed;
	private String overBudgetreason;
	private String orderAction;
	private String isOverrideMigration;
	private String origBudgetValue;
	
	
	public String getIpContract() {
		return ipContract;
	}
	public void setIpContract(String ipContract) {
		this.ipContract = ipContract;
	}
	public String getCallForm() {
		return callForm;
	}
	public void setCallForm(String callForm) {
		this.callForm = callForm;
	}
	public XCurrentOptionsListVo[] getBasket() {
		return basket;
	}
	public void setBasket(XCurrentOptionsListVo[] basket) {
		this.basket = basket;
	}
	public Date getSchedDate() {
		return schedDate;
	}
	public void setSchedDate(Date schedDate) {
		this.schedDate = schedDate;
	}
	public String getUsedBudget() {
		return usedBudget;
	}
	public void setUsedBudget(String usedBudget) {
		this.usedBudget = usedBudget;
	}
	public String getRemainingBudget() {
		return remainingBudget;
	}
	public void setRemainingBudget(String remainingBudget) {
		this.remainingBudget = remainingBudget;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Boolean getIsProlong() {
		return isProlong;
	}
	public void setIsProlong(Boolean isProlong) {
		this.isProlong = isProlong;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getRetentionDiscAmt() {
		return retentionDiscAmt;
	}
	public void setRetentionDiscAmt(String retentionDiscAmt) {
		this.retentionDiscAmt = retentionDiscAmt;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getContractBindingStatus() {
		return contractBindingStatus;
	}
	public void setContractBindingStatus(String contractBindingStatus) {
		this.contractBindingStatus = contractBindingStatus;
	}
	public Date getContractEndDate() {
		return contractEndDate;
	}
	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	public String getSaveAction() {
		return saveAction;
	}
	public void setSaveAction(String saveAction) {
		this.saveAction = saveAction;
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
	public String getSubscriptionNo() {
		return subscriptionNo;
	}
	public void setSubscriptionNo(String subscriptionNo) {
		this.subscriptionNo = subscriptionNo;
	}
	
	public String getUsedBudgetPerc() {
		return usedBudgetPerc;
	}
	public void setUsedBudgetPerc(String usedBudgetPerc) {
		this.usedBudgetPerc = usedBudgetPerc;
	}
	public String getChurnRiskScore() {
		return churnRiskScore;
	}
	public void setChurnRiskScore(String churnRiskScore) {
		this.churnRiskScore = churnRiskScore;
	}
	public String getThreshold() {
		return threshold;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}
	public String getUpdatedCB() {
		return updatedCB;
	}
	public void setUpdatedCB(String updatedCB) {
		this.updatedCB = updatedCB;
	}
	public String getOldCB() {
		return oldCB;
	}
	public void setOldCB(String oldCB) {
		this.oldCB = oldCB;
	}
	public String getCreaditAmount() {
		return creaditAmount;
	}
	public void setCreaditAmount(String creaditAmount) {
		this.creaditAmount = creaditAmount;
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
	
	public String getDiscDurOverride() {
		return discDurOverride;
	}
	public void setDiscDurOverride(String discDurOverride) {
		this.discDurOverride = discDurOverride;
	}
	public String getConBindDurOverride() {
		return conBindDurOverride;
	}
	public void setConBindDurOverride(String conBindDurOverride) {
		this.conBindDurOverride = conBindDurOverride;
	}

	public String getDurationExtension() {
		return durationExtension;
	}
	public void setDurationExtension(String durationExtension) {
		this.durationExtension = durationExtension;
	}
	
	public String getSuppressDiscount() {
		return suppressDiscount;
	}
	public void setSuppressDiscount(String suppressDiscount) {
		this.suppressDiscount = suppressDiscount;
	}
	
	public String getAvailableOverBudget() {
		return availableOverBudget;
	}
	public void setAvailableOverBudget(String availableOverBudget) {
		this.availableOverBudget = availableOverBudget;
	}
	public String getAvailableBudget() {
		return availableBudget;
	}
	public void setAvailableBudget(String availableBudget) {
		this.availableBudget = availableBudget;
	}
	public String getIsSubscProfitable() {
		return isSubscProfitable;
	}
	public void setIsSubscProfitable(String isSubscProfitable) {
		this.isSubscProfitable = isSubscProfitable;
	}
	public String getIsOverBudgetUsed() {
		return isOverBudgetUsed;
	}
	public void setIsOverBudgetUsed(String isOverBudgetUsed) {
		this.isOverBudgetUsed = isOverBudgetUsed;
	}
	public String getOverBudgetreason() {
		return overBudgetreason;
	}
	public void setOverBudgetreason(String overBudgetreason) {
		this.overBudgetreason = overBudgetreason;
	}
	public String getOrigBudgetValue() {
		return origBudgetValue;
	}
	public void setOrigBudgetValue(String origBudgetValue) {
		this.origBudgetValue = origBudgetValue;
	}
	
	public String getOrderAction() {
		return orderAction;
	}
	public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
	}
	public String getIsOverrideMigration() {
		return isOverrideMigration;
	}
	public void setIsOverrideMigration(String isOverrideMigration) {
		this.isOverrideMigration = isOverrideMigration;
	}
	
	@Override
	public String toString() {
		return "XRetoBulkSaveVo [ipContract=" + ipContract + ", callForm=" + callForm + ", basket="
				+ Arrays.toString(basket) + ", schedDate=" + schedDate + ", usedBudget=" + usedBudget
				+ ", remainingBudget=" + remainingBudget + ", duration=" + duration + ", isProlong=" + isProlong
				+ ", discountAmount=" + discountAmount + ", retentionDiscAmt=" + retentionDiscAmt + ", medium=" + medium
				+ ", contractBindingStatus=" + contractBindingStatus + ", contractEndDate=" + contractEndDate
				+ ", saveAction=" + saveAction + ", productName=" + productName + ", productType=" + productType
				+ ", subscriptionNo=" + subscriptionNo + ", usedBudgetPerc=" + usedBudgetPerc + ", churnRiskScore="
				+ churnRiskScore + ", threshold=" + threshold + ", updatedCB=" + updatedCB + ", oldCB=" + oldCB
				+ ", creaditAmount=" + creaditAmount + ", creditModObjid=" + creditModObjid + ", isOverBudget="
				+ isOverBudget + ", discDurOverride=" + discDurOverride + ", conBindDurOverride=" + conBindDurOverride
				+ ", durationExtension=" + durationExtension + ", suppressDiscount=" + suppressDiscount
				+ ", availableOverBudget=" + availableOverBudget + ", availableBudget=" + availableBudget
				+ ", isSubscProfitable=" + isSubscProfitable + ", isOverBudgetUsed=" + isOverBudgetUsed
				+ ", overBudgetreason=" + overBudgetreason + ", orderAction=" + orderAction + ", isOverrideMigration="
				+ isOverrideMigration + "]";
	}
	
	
	
}
