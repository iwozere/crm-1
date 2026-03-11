package sunrise.crm.to.inbound.customer;

public class XCustomerInvoiceInfoClientRequestTO {
	
	private String accountId;
    
    private String type;

	/**
	 * @return the accountId
	 */
	public final String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public final void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the type
	 */
	public final String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public final void setType(String type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XCustomerInvoiceInfoClientRequestTO [accountId=" + accountId
				+ ", type=" + type + "]";
	}
    
	
}
