package sunrise.crm.xvo.billing;

/**
 * Container for extra Financial Information 
 * Used: Financial Overview screen
 * 
 * @author hudak
 *
 */
public class XFinancialExtraInfoVo {
	
	private String siteId = null;
	
	private String billingCycle = null;

	private String billingMedium = null;	
	
	private String taxExemption = null;

	private String paymentMethod = null;
	
	private String blocked6Months = null;
	private String blocked12Months = null;//23285

	
	public String getBlocked12Months() {
		return blocked12Months;
	}

	public void setBlocked12Months(String blocked12Months) {
		this.blocked12Months = blocked12Months;
	}

	private Boolean isCustBbf = false;
	
	private Boolean remFeeBbfForFirstTime = false;

	/**
	 * @return the siteId
	 */
	public final String getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId the siteId to set
	 */
	public final void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	/**
	 * @return the billingCycle
	 */
	public final String getBillingCycle() {
		return billingCycle;
	}

	/**
	 * @param billingCycle the billingCycle to set
	 */
	public final void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}

	/**
	 * @return the billingMedium
	 */
	public final String getBillingMedium() {
		return billingMedium;
	}

	/**
	 * @param billingMedium the billingMedium to set
	 */
	public final void setBillingMedium(String billingMedium) {
		this.billingMedium = billingMedium;
	}
	
	/**
	 * @return the taxExemption
	 */
	public final String getTaxExemption() {
		return taxExemption;
	}

	/**
	 * @param taxExemption the taxExemption to set
	 */
	public final void setTaxExemption(String taxExemption) {
		this.taxExemption = taxExemption;
	}	
	
	/**
	 * Sets Payment Method 
	 * @param paymentMethod
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
		
	}

	/**
	 * @return the paymentMethod
	 */
	public final String getPaymentMethod() {
		return paymentMethod;
	}
		
	
	/**
	 * @return the blocked6Months
	 */
	public final String getBlocked6Months() {
		return blocked6Months;
	}

	/**
	 * @param blocked6Months the blocked6Months to set
	 */
	public final void setBlocked6Months(String blocked6Months) {
		this.blocked6Months = blocked6Months;
	}			

	

	public Boolean getIsCustBbf() {
		return isCustBbf;
	}

	public void setIsCustBbf(Boolean isCustBbf) {
		this.isCustBbf = isCustBbf;
	}

	public Boolean getRemFeeBbfForFirstTime() {
		return remFeeBbfForFirstTime;
	}

	public void setRemFeeBbfForFirstTime(Boolean remFeeBbfForFirstTime) {
		this.remFeeBbfForFirstTime = remFeeBbfForFirstTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XFinancialExtraInfoVo [siteId=" + siteId + ", billingCycle="
				+ billingCycle + ", billingMedium=" + billingMedium
				+ ", taxExemption=" + taxExemption + ", paymentMethod="
				+ paymentMethod + ", blocked6Months=" + blocked6Months + ", blocked12Months=" + blocked12Months + ", isCustBbf=" + isCustBbf + ", remFeeBbfForFirstTime=" + remFeeBbfForFirstTime + "]";
	}
	
}
