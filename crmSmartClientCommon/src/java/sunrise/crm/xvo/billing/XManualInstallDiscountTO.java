package sunrise.crm.xvo.billing;

import java.math.BigDecimal;
import java.util.Date;

public class XManualInstallDiscountTO {
	
	//Bill Cycle
	private String billCycle;	
	private boolean billCycleCurrentEnabled;	
	private boolean billCycleNextEnabled;	
	private boolean billCycleByDateEnabled;
	private Date billDate; //OUT
	
	//Duration
	private Integer duration;	
	private boolean durationEnabled;
	
	//Number Of Subscriptions
	private Integer numberOfSubscriptions;
	private boolean numberOfSubscriptionsEnabled;
	
	//Amount
	private BigDecimal amountPerUnit;	
	private boolean amountPerUnitEnabled;	
	private BigDecimal amountWithoutVAT;
	
	//Unit of Amount
	private String unitOfAmount;
	
	//RC Amount / Price 
	private BigDecimal rcAmountPerUnit;	
	private boolean rcAmountPerUnitEnabled;

	//Bill Text, Bill Text template	
	private String billText;	
	private boolean billTextEnabled;	
	
	private BigDecimal totalAmountPerUnit;	
	private BigDecimal totalRcAmountPerUnit;
	
	//Product Group, Reason Code, Cause - DDL
	private String reasonCode; // OUT
	private boolean reasonCodeEnabled; //OUT
	private String productGroup; // OUT
	private String cause; // OUT

	private String msisdn;
	
	//Deinstallation date
	private Date deinstallDate;
	private boolean deinstallDateEnabled;
	
	private boolean customerIsBbf;
	
	/**
	 * @return the reasonCode
	 */
	public final String getReasonCode() {
		return reasonCode;
	}

	/**
	 * @return the billCycleCurrentEnabled
	 */
	public boolean isBillCycleCurrentEnabled() {
		return billCycleCurrentEnabled;
	}

	/**
	 * @param billCycleCurrentEnabled the billCycleCurrentEnabled to set
	 */
	public void setBillCycleCurrentEnabled(boolean billCycleCurrentEnabled) {
		this.billCycleCurrentEnabled = billCycleCurrentEnabled;
	}

	/**
	 * @return the billCycleNextEnabled
	 */
	public boolean isBillCycleNextEnabled() {
		return billCycleNextEnabled;
	}

	/**
	 * @param billCycleNextEnabled the billCycleNextEnabled to set
	 */
	public void setBillCycleNextEnabled(boolean billCycleNextEnabled) {
		this.billCycleNextEnabled = billCycleNextEnabled;
	}

	/**
	 * @return the billCycleByDateEnabled
	 */
	public boolean isBillCycleByDateEnabled() {
		return billCycleByDateEnabled;
	}

	/**
	 * @param billCycleByDateEnabled the billCycleByDateEnabled to set
	 */
	public void setBillCycleByDateEnabled(boolean billCycleByDateEnabled) {
		this.billCycleByDateEnabled = billCycleByDateEnabled;
	}

	/**
	 * @param reasonCode the reasonCode to set
	 */
	public final void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	/**
	 * @return the productGroup
	 */
	public final String getProductGroup() {
		return productGroup;
	}

	/**
	 * @param productGroup the productGroup to set
	 */
	public final void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	/**
	 * @return the cause
	 */
	public final String getCause() {
		return cause;
	}

	/**
	 * @param cause the cause to set
	 */
	public final void setCause(String cause) {
		this.cause = cause;
	}

	/**
	 * @return the billText
	 */
	public final String getBillText() {
		return billText;
	}

	/**
	 * @param billText the billText to set
	 */
	public final void setBillText(String billText) {
		this.billText = billText;
	}

	/**
	 * @return the billCycle
	 */
	public final String getBillCycle() {
		return billCycle;
	}

	/**
	 * @param billCycle the billCycle to set
	 */
	public final void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
	}

	/**
	 * @return the duration
	 */
	public final Integer getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public final void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * @return the numberOfSubscriptions
	 */
	public final Integer getNumberOfSubscriptions() {
		return numberOfSubscriptions;
	}

	/**
	 * @param numberOfSubscriptions the numberOfSubscriptions to set
	 */
	public final void setNumberOfSubscriptions(Integer numberOfSubscriptions) {
		this.numberOfSubscriptions = numberOfSubscriptions;
	}

	/**
	 * @return the amountPerUnit
	 */
	public final BigDecimal getAmountPerUnit() {
		return amountPerUnit;
	}

	/**
	 * @param amountPerUnit the amountPerUnit to set
	 */
	public final void setAmountPerUnit(BigDecimal amountPerUnit) {
		this.amountPerUnit = amountPerUnit;
	}

	/**
	 * @return the rcAmountPerUnit
	 */
	public final BigDecimal getRcAmountPerUnit() {
		return rcAmountPerUnit;
	}

	/**
	 * @param rcAmountPerUnit the rcAmountPerUnit to set
	 */
	public final void setRcAmountPerUnit(BigDecimal rcAmountPerUnit) {
		this.rcAmountPerUnit = rcAmountPerUnit;
	}
	
	/**
	 * @return the rcAmountPerUnitEnabled
	 */
	public final boolean getRcAmountPerUnitEnabled() {
		return rcAmountPerUnitEnabled;
	}

	/**
	 * @param rcAmountPerUnit the rcAmountPerUnit to set
	 */
	public final void setRcAmountPerUnitEnabled(boolean rcAmountPerUnitEnabled) {
		this.rcAmountPerUnitEnabled = rcAmountPerUnitEnabled;
	}

	/**
	 * @return the billDate
	 */
	public final Date getBillDate() {
		return billDate;
	}

	/**
	 * @param billDate the billDate to set
	 */
	public final void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	/**
	 * @return the totalAmountPerUnit
	 */
	public final BigDecimal getTotalAmountPerUnit() {
		return totalAmountPerUnit;
	}

	/**
	 * @param totalAmountPerUnit the totalAmountPerUnit to set
	 */
	public final void setTotalAmountPerUnit(BigDecimal totalAmountPerUnit) {
		this.totalAmountPerUnit = totalAmountPerUnit;
	}

	/**
	 * @return the totalRcAmountPerUnit
	 */
	public final BigDecimal getTotalRcAmountPerUnit() {
		return totalRcAmountPerUnit;
	}

	/**
	 * @param totalRcAmountPerUnit the totalRcAmountPerUnit to set
	 */
	public final void setTotalRcAmountPerUnit(BigDecimal totalRcAmountPerUnit) {
		this.totalRcAmountPerUnit = totalRcAmountPerUnit;
	}
	
	/**
	 * return msisdn
	 */
	public String getMsisdn() {		
		return this.msisdn;
	}

	/**
	 * @param msisdn the msisdn to set
	 */
	public final void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	/**
	 * @return the billTextEnabled
	 */
	public final boolean isBillTextEnabled() {
		return billTextEnabled;
	}

	/**
	 * @param billTextEnabled the billTextEnabled to set
	 */
	public final void setBillTextEnabled(boolean billTextEnabled) {
		this.billTextEnabled = billTextEnabled;
	}

	/**
	 * @return the durationEnabled
	 */
	public final boolean isDurationEnabled() {
		return durationEnabled;
	}

	/**
	 * @param durationEnabled the durationEnabled to set
	 */
	public final void setDurationEnabled(boolean durationEnabled) {
		this.durationEnabled = durationEnabled;
	}

	/**
	 * @return the amountPerUnitEnabled
	 */
	public final boolean isAmountPerUnitEnabled() {
		return amountPerUnitEnabled;
	}

	/**
	 * @param amountPerUnitEnabled the amountPerUnitEnabled to set
	 */
	public final void setAmountPerUnitEnabled(boolean amountPerUnitEnabled) {
		this.amountPerUnitEnabled = amountPerUnitEnabled;
	}

	/**
	 * @return the numberOfSubscriptionsEnabled
	 */
	public final boolean isNumberOfSubscriptionsEnabled() {
		return numberOfSubscriptionsEnabled;
	}

	/**
	 * @param numberOfSubscriptionsEnabled the numberOfSubscriptionsEnabled to set
	 */
	public final void setNumberOfSubscriptionsEnabled(
			boolean numberOfSubscriptionsEnabled) {
		this.numberOfSubscriptionsEnabled = numberOfSubscriptionsEnabled;
	}

	/**
	 * @return the unitOfAmount
	 */
	public final String getUnitOfAmount() {
		return unitOfAmount;
	}

	/**
	 * @param unitOfAmount the unitOfAmount to set
	 */
	public final void setUnitOfAmount(String unitOfAmount) {
		this.unitOfAmount = unitOfAmount;
	}

	/**
	 * @return the amountWithoutVAT
	 */
	public final BigDecimal getAmountWithoutVAT() {
		return amountWithoutVAT;
	}

	/**
	 * @param amountWithoutVAT the amountWithoutVAT to set
	 */
	public final void setAmountWithoutVAT(BigDecimal amountWithoutVAT) {
		this.amountWithoutVAT = amountWithoutVAT;
	}	
	
	/**
	 * @return the deinstallDate
	 */
	public Date getDeinstallDate() {
		return deinstallDate;
	}

	/**
	 * @param deinstallDate the deinstallDate to set
	 */
	public void setDeinstallDate(Date deinstallDate) {
		this.deinstallDate = deinstallDate;
	}

	/**
	 * @return the deinstallDateEnabled
	 */
	public boolean isDeinstallDateEnabled() {
		return deinstallDateEnabled;
	}

	/**
	 * @param deinstallDateEnabled the deinstallDateEnabled to set
	 */
	public void setDeinstallDateEnabled(boolean deinstallDateEnabled) {
		this.deinstallDateEnabled = deinstallDateEnabled;
	}
		
	/**
	 * @return the reasonCodeEnabled
	 */
	public boolean isReasonCodeEnabled() {
		return reasonCodeEnabled;
	}

	/**
	 * @param reasonCodeEnabled the reasonCodeEnabled to set
	 */
	public void setReasonCodeEnabled(boolean reasonCodeEnabled) {
		this.reasonCodeEnabled = reasonCodeEnabled;
	}

	public void setCustomerIsBbf(boolean customerIsBbf) {
		this.customerIsBbf = customerIsBbf;
	}

	public boolean isCustomerIsBbf() {
		return customerIsBbf;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XManualInstallDiscountTO [billCycle=" + billCycle + ", billCycleCurrentEnabled="
				+ billCycleCurrentEnabled + ", billCycleNextEnabled=" + billCycleNextEnabled
				+ ", billCycleByDateEnabled=" + billCycleByDateEnabled + ", billDate=" + billDate + ", duration="
				+ duration + ", durationEnabled=" + durationEnabled + ", numberOfSubscriptions=" + numberOfSubscriptions
				+ ", numberOfSubscriptionsEnabled=" + numberOfSubscriptionsEnabled + ", amountPerUnit=" + amountPerUnit
				+ ", amountPerUnitEnabled=" + amountPerUnitEnabled + ", amountWithoutVAT=" + amountWithoutVAT
				+ ", unitOfAmount=" + unitOfAmount + ", rcAmountPerUnit=" + rcAmountPerUnit
				+ ", rcAmountPerUnitEnabled=" + rcAmountPerUnitEnabled + ", billText=" + billText + ", billTextEnabled="
				+ billTextEnabled + ", totalAmountPerUnit=" + totalAmountPerUnit + ", totalRcAmountPerUnit="
				+ totalRcAmountPerUnit + ", reasonCode=" + reasonCode + ", reasonCodeEnabled=" + reasonCodeEnabled
				+ ", productGroup=" + productGroup + ", cause=" + cause + ", msisdn=" + msisdn + ", deinstallDate="
				+ deinstallDate + ", deinstallDateEnabled=" + deinstallDateEnabled + ",customerIsBbf=" + customerIsBbf + " ]";
	}	
}
