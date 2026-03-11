package sunrise.crm.to.inbound.customer;

import java.math.BigDecimal;

/**
 * SAP Account Outline call data TO
 * 
 * @author hudak 
 *
 */
public class XSapAccountOutlineResponseTO {
	
	
    private BigDecimal days_0_29 = BigDecimal.ZERO;
   
    private BigDecimal days_30_59 = BigDecimal.ZERO;   
    
    private BigDecimal days_60_89 = BigDecimal.ZERO;
       
    private BigDecimal days_90_119 = BigDecimal.ZERO;
        
    private BigDecimal days_120_plus = BigDecimal.ZERO;
    
    private BigDecimal total = BigDecimal.TEN;//just for testing change it to ZERO!!!!
    
    private BigDecimal unallocatedCash = BigDecimal.ZERO;

    private BigDecimal queryTransactions = BigDecimal.ZERO;

    private BigDecimal depositHeld = BigDecimal.ZERO;
    
    private String errorMessage = null;

	/**
	 * @return the days_0_29
	 */
	public final BigDecimal getDays_0_29() {
		return days_0_29;
	}

	/**
	 * @param days_0_29 the days_0_29 to set
	 */
	public final void setDays_0_29(BigDecimal days_0_29) {
		this.days_0_29 = days_0_29;
	}

	/**
	 * @return the days_30_59
	 */
	public final BigDecimal getDays_30_59() {
		return days_30_59;
	}

	/**
	 * @param days_30_59 the days_30_59 to set
	 */
	public final void setDays_30_59(BigDecimal days_30_59) {
		this.days_30_59 = days_30_59;
	}

	/**
	 * @return the days_60_89
	 */
	public final BigDecimal getDays_60_89() {
		return days_60_89;
	}

	/**
	 * @param days_60_89 the days_60_89 to set
	 */
	public final void setDays_60_89(BigDecimal days_60_89) {
		this.days_60_89 = days_60_89;
	}

	/**
	 * @return the days_90_119
	 */
	public final BigDecimal getDays_90_119() {
		return days_90_119;
	}

	/**
	 * @param days_90_119 the days_90_119 to set
	 */
	public final void setDays_90_119(BigDecimal days_90_119) {
		this.days_90_119 = days_90_119;
	}

	/**
	 * @return the days_120_plus
	 */
	public final BigDecimal getDays_120_plus() {
		return days_120_plus;
	}

	/**
	 * @param days_120_plus the days_120_plus to set
	 */
	public final void setDays_120_plus(BigDecimal days_120_plus) {
		this.days_120_plus = days_120_plus;
	}

	/**
	 * @return the unallocatedCash
	 */
	public final BigDecimal getUnallocatedCash() {
		return unallocatedCash;
	}

	/**
	 * @param unallocatedCash the unallocatedCash to set
	 */
	public final void setUnallocatedCash(BigDecimal unallocatedCash) {
		this.unallocatedCash = unallocatedCash;
	}

	/**
	 * @return the queryTransactions
	 */
	public final BigDecimal getQueryTransactions() {
		return queryTransactions;
	}

	/**
	 * @param queryTransactions the queryTransactions to set
	 */
	public final void setQueryTransactions(BigDecimal queryTransactions) {
		this.queryTransactions = queryTransactions;
	}

	/**
	 * @return the depositHeld
	 */
	public final BigDecimal getDepositHeld() {
		return depositHeld;
	}

	/**
	 * @param depositHeld the depositHeld to set
	 */
	public final void setDepositHeld(BigDecimal depositHeld) {
		this.depositHeld = depositHeld;
	}

	/**
	 * @return the errorMessage
	 */
	public final String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
		

	/**
	 * @return the total
	 */
	public final BigDecimal getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public final void setTotal(BigDecimal total) {
		this.total = total;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XSapAccountOutlineResponseTO [days_0_29=" + days_0_29
				+ ", days_30_59=" + days_30_59 + ", days_60_89=" + days_60_89
				+ ", days_90_119=" + days_90_119 + ", days_120_plus="
				+ days_120_plus + ", total=" + total + ", unallocatedCash="
				+ unallocatedCash + ", queryTransactions=" + queryTransactions
				+ ", depositHeld=" + depositHeld + ", errorMessage="
				+ errorMessage + "]";
	}
    
}
