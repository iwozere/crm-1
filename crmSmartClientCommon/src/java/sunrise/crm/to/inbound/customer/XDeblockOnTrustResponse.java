package sunrise.crm.to.inbound.customer;

public class XDeblockOnTrustResponse {
	
	private String siteId;
	
	private String message;
	
	private boolean eligible;

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
	 * @return the message
	 */
	public final String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public final void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the eligible
	 */
	public final boolean isEligible() {
		return eligible;
	}

	/**
	 * @param eligible the eligible to set
	 */
	public final void setEligible(boolean eligible) {
		this.eligible = eligible;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XDeblockOnTrustResponse [siteId=" + siteId
				+ ", message=" + message + ", eligible="
				+ eligible + "]";
	}	

}
