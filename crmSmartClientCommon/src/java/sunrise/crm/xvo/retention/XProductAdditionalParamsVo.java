package sunrise.crm.xvo.retention;

import java.math.BigDecimal;

public class XProductAdditionalParamsVo {
	String subscriptionNo;
	BigDecimal avgBillAmount;
	BigDecimal avgIntCallUsg;
	BigDecimal avgNatCallUsg;
	BigDecimal avgNatDataUsg;
	BigDecimal avgRoamCallUsg;
	BigDecimal avgRoamDataUsg;
	
	public BigDecimal getAvgBillAmount() {
		return avgBillAmount;
	}
	public void setAvgBillAmount(BigDecimal avgBillAmount) {
		this.avgBillAmount = avgBillAmount;
	}
	public BigDecimal getAvgIntCallUsg() {
		return avgIntCallUsg;
	}
	public void setAvgIntCallUsg(BigDecimal avgIntCallUsg) {
		this.avgIntCallUsg = avgIntCallUsg;
	}
	public BigDecimal getAvgNatCallUsg() {
		return avgNatCallUsg;
	}
	public void setAvgNatCallUsg(BigDecimal avgNatCallUsg) {
		this.avgNatCallUsg = avgNatCallUsg;
	}
	public BigDecimal getAvgNatDataUsg() {
		return avgNatDataUsg;
	}
	public void setAvgNatDataUsg(BigDecimal avgNatDataUsg) {
		this.avgNatDataUsg = avgNatDataUsg;
	}
	public BigDecimal getAvgRoamCallUsg() {
		return avgRoamCallUsg;
	}
	public void setAvgRoamCallUsg(BigDecimal avgRoamCallUsg) {
		this.avgRoamCallUsg = avgRoamCallUsg;
	}
	public BigDecimal getAvgRoamDataUsg() {
		return avgRoamDataUsg;
	}
	public void setAvgRoamDataUsg(BigDecimal avgRoamDataUsg) {
		this.avgRoamDataUsg = avgRoamDataUsg;
	}
	public String getSubscriptionNo() {
		return subscriptionNo;
	}
	public void setSubscriptionNo(String subscriptionNo) {
		this.subscriptionNo = subscriptionNo;
	}
	

}
