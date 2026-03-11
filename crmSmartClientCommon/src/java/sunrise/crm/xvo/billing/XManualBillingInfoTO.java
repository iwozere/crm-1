package sunrise.crm.xvo.billing;

/**
 * Manual Billing info screen transfer object
 * 
 * @author hudak
 *
 */
public class XManualBillingInfoTO {
	
	private String siteId;
	
	private boolean allowCurrentBillCycle;

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
	 * @return the allowCurrentBillCycle
	 */
	public final boolean isAllowCurrentBillCycle() {
		return allowCurrentBillCycle;
	}

	/**
	 * @param allowCurrentBillCycle the allowCurrentBillCycle to set
	 */
	public final void setAllowCurrentBillCycle(boolean allowCurrentBillCycle) {
		this.allowCurrentBillCycle = allowCurrentBillCycle;
	}	
	
}
