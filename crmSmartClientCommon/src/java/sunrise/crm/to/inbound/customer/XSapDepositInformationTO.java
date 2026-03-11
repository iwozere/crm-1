package sunrise.crm.to.inbound.customer;

import java.math.BigDecimal;
/*
 * @ author:neogi
 */
public class XSapDepositInformationTO {
	private String DepositID;
    private BigDecimal Amount;     
    private String Duration;
    private BigDecimal RemainingAmount;
    private String PaymentDate;
 //   private BigDecimal AmountperRate;
    
	/**
	 * @return the DepositID
	 */
	public final String getDepositID() {
		return DepositID;
	}
	/**
	 * @param DepositID the DepositID to set
	 */
	public final void setDepositID(String DepositID) {
		this.DepositID = DepositID;
	}
	/**
	 * @return the Amount
	 */
	
	public final BigDecimal getAmount() {
		return Amount;
	}
	/**
	 * @param Amount the Amount to set
	 */
	public final void setAmount(BigDecimal Amount) {
		this.Amount = Amount;
	}
	/**
	 * @return the Duration
	 */
	public final String getDuration() {
		return Duration;
	}
	/**
	 * @param credit the Duration to set
	 */
	public final void setDuration(String Duration) {
		this.Duration = Duration;
	}
	/**
	 * @return the RemainingAmount
	 */
	public final BigDecimal getRemainingAmount() {
		return RemainingAmount;
	}
	/**
	 * @param RemainingAmount the RemainingAmount to set
	 */
	public final void setRemainingAmount(BigDecimal RemainingAmount) {
		this.RemainingAmount = RemainingAmount;
	}
	/**
	 * @return the PaymentDate
	 */
	public final String getPaymentDate() {
		return PaymentDate;
	}
	/**
	 * @param PaymentDate the PaymentDate to set
	 */
	public final void setPaymentDate(String PaymentDate) {
		this.PaymentDate = PaymentDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XSapDepositInformationTO [DepositID=" + DepositID
				+ ", Amount=" + Amount + ", Duration=" + Duration
				+ ", RemainingAmount=" + RemainingAmount + ", PaymentDate=" + PaymentDate
				+ " ]";
			
	}
        
}


