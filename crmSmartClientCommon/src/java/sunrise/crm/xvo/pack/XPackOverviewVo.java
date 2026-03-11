package sunrise.crm.xvo.pack;

import java.math.BigDecimal;

public class XPackOverviewVo {
	
	private String msisdn;
	private String productName;
	private String promotion;
	private BigDecimal promotionAmount;
	private BigDecimal baseFee;
	private String discount;
	private BigDecimal discountAmount;

	private BigDecimal currentMrc;
	private BigDecimal finalMrc;
	private BigDecimal youthDiscount;

	// Category and level are mostly for debugging purposes
	private String productSubType;   // sunrise.crm.wemobile.dto.ProductSubtype 	
	private String packLevel;            // sunrise.crm.wemobile.dto.WeMobilePackLevel
	
	private String ipContract;
	
	private boolean markedAsFirst;
	
	//GUI Flags: flags to be used in the GUI only. We can add values to a DM on the UI side, but we need to remove before submitting them back. having them here makes UI code cleaner
	private String guiFlag;

	private String alteredProductsMessage;

	private boolean migrationAllowed = true;
	
	private boolean migrationTo5gAllowed = false;

	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	
	public BigDecimal getPromotionAmount() {
		return promotionAmount;
	}
	public void setPromotionAmount(BigDecimal promotionAmount) {
		this.promotionAmount = promotionAmount;
	}
	
	public BigDecimal getBaseFee() {
		return baseFee;
	}
	public void setBaseFee(BigDecimal baseFee) {
		this.baseFee = baseFee;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	public BigDecimal getCurrentMrc() {
		return currentMrc;
	}
	public void setCurrentMrc(BigDecimal currentMrc) {
		this.currentMrc = currentMrc;
	}
	public BigDecimal getFinalMrc() {
		return finalMrc;
	}
	public void setFinalMrc(BigDecimal finalMrc) {
		this.finalMrc = finalMrc;
	} 
	public String getProductSubType() {
		return productSubType;
	}
	public void setProductSubType(String productSubType) {
		this.productSubType = productSubType;
	}
	public String getPackLevel() {
		return packLevel;
	}
	public void setPackLevel(String packLevel) {
		this.packLevel = packLevel;
	}

	public BigDecimal getYouthDiscount() {
		return youthDiscount;
	}
	public void setYouthDiscount(BigDecimal youthDiscount) {
		this.youthDiscount = youthDiscount;
	}
	
	// GUI Flags
	public String getGuiFlag() {
		return guiFlag;
	}
	public void setGuiFlag(String guiFlag) {
		this.guiFlag = guiFlag;
	}
	public String getIpContract() {
		return ipContract;
	}
	public void setIpContract(String ipContract) {
		this.ipContract = ipContract;
	}
	
	public boolean getMarkedAsFirst() {
		return markedAsFirst;
	}
	public void setMarkedAsFirst(boolean markedAsFirst) {
		this.markedAsFirst = markedAsFirst;
	}

	public String getAlteredProductsMessage() {
		return alteredProductsMessage;
	}

	public void setAlteredProductsMessage(String alteredProductsMessage) {
		this.alteredProductsMessage = alteredProductsMessage;
	}

	public boolean isMigrationAllowed() {
		return migrationAllowed;
	}

	public void setMigrationAllowed(boolean migrationAllowed) {
		this.migrationAllowed = migrationAllowed;
	}
	
	public boolean isMigrationTo5gAllowed() {
		return migrationTo5gAllowed;
	}
	public void setMigrationTo5gAllowed(boolean migrationTo5gAllowed) {
		this.migrationTo5gAllowed = migrationTo5gAllowed;
	}

	@Override
	public String toString() {
		return "XPackOverviewVo [msisdn=" + msisdn + ", productName=" + productName + ", promotion=" + promotion + ", promotionAmount=" + promotionAmount + ", baseFee=" + baseFee
				+ ", discount=" + discount + ", discountAmount=" + discountAmount + ", currentMrc=" + currentMrc + ", finalMrc=" + finalMrc
				+ ", youthDiscount=" + youthDiscount + ", productSubType=" + productSubType + ", packLevel=" + packLevel + ", ipContract=" + ipContract
				+ ", markedAsFirst=" + markedAsFirst + ", guiFlag=" + guiFlag + ", alteredProductsMessage=" + alteredProductsMessage + ", migrationAllowed=" + migrationAllowed + "]";
	}
	
}
