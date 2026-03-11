package sunrise.crm.to.inbound.customer;

import java.math.BigDecimal;
import java.util.Arrays;

public class XCustomerInvoiceInfoClientResponseTO {
	
	private BigDecimal debitSum;
    private BigDecimal balanceSum;
    private BigDecimal creditSum;
    private BigDecimal debitCreditSum;
	private BigDecimal openItemSum;
    private BigDecimal amountDisputedSum;
    private BigDecimal Amount;
    private BigDecimal Duration;
    private BigDecimal RemainingAmount;
    private BigDecimal AmountperRate;
    private String PaymentDate;
    private String DepositID;
    private String errorMessage;
    private boolean deblockOnTrust;
    private boolean secondDeblock;
    
    private XCustomerFinancialTransactionTO[] transactions;	 
    private XSapDepositInformationTO[] trans;
   
    
	/**
	 * @return the debitSum
	 */
	public final BigDecimal getDebitSum() {
		return debitSum;
	}
	/**
	 * @param debitSum the debitSum to set
	 */
	public final void setDebitSum(BigDecimal debitSum) {
		this.debitSum = debitSum;
	}
	/**
	 * @return the balanceSum
	 */
	public final BigDecimal getBalanceSum() {
		return balanceSum;
	}
	/**
	 * @param balanceSum the balanceSum to set
	 */
	public final void setBalanceSum(BigDecimal balanceSum) {
		this.balanceSum = balanceSum;
	}
	/**
	 * @return the creditSum
	 */
	public final BigDecimal getCreditSum() {
		return creditSum;
	}
	/**
	 * @param creditSum the creditSum to set
	 */
	public final void setCreditSum(BigDecimal creditSum) {
		this.creditSum = creditSum;
	}
	/**
	 * @return the openItemSum
	 */
	public final BigDecimal getOpenItemSum() {
		return openItemSum;
	}
	/**
	 * @param openItemSum the openItemSum to set
	 */
	public final void setOpenItemSum(BigDecimal openItemSum) {
		this.openItemSum = openItemSum;
	}
	/**
	 * @return the DepositID
	 */
	public final String getDepositID() {
		return DepositID;
	}
	/**
	 * @param Amount the DepositID to set
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
	public final BigDecimal getDuration() {
		return Duration;
	}
	/**
	 * @param Duration the Duration to set
	 */
	public final void setDuration(BigDecimal Duration) {
		this.Duration = Duration;
	}
	/**
	 * @return the AmountperRate
	 */
	public void setAmountperRate(BigDecimal AmountperRate) {
		this.AmountperRate = AmountperRate;
	}
	/**
	 * @param AmountperRate the AmountperRate to set
	 */
	public BigDecimal getAmountperRate() {
		return AmountperRate;
	}
	/**
	 * @return the PaymentDate
	 */
	public void setPaymentDate(String PaymentDate) {
		this.PaymentDate = PaymentDate;
	}
	/**
	 * @param PaymentDate the PaymentDate to set
	 */
	public String getPaymentDate() {
		return PaymentDate;
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
	 * @return the amountDisputedSum
	 */
	public final BigDecimal getAmountDisputedSum() {
		return amountDisputedSum;
	}
	/**
	 * @param amountDisputedSum the amountDisputedSum to set
	 */
	public final void setAmountDisputedSum(BigDecimal amountDisputedSum) {
		this.amountDisputedSum = amountDisputedSum;
	}
	/**
	 * @return the transactions
	 */
	public final XCustomerFinancialTransactionTO[] getTransactions() {
		return transactions;
	}
	/**
	 * @param transactions the transactions to set
	 */
	public final void setTransactions(XCustomerFinancialTransactionTO[] transactions) {
		this.transactions = transactions;
	}
	
	public final void setTrans(XSapDepositInformationTO[] trans) {
		this.trans = trans;
	}
	public final XSapDepositInformationTO[] getTrans() {
		return trans;
	}
	
	/**
	 * @param errorMessage
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	/**
	 * Return errorMessage
	 * @return
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
		
	/**
	 * @return the deblockOnTrust
	 */
	public final boolean isDeblockOnTrust() {
		return deblockOnTrust;
	}
	
	/**
	 * @param deblockOnTrust the deblockOnTrust to set
	 */
	public final void setDeblockOnTrust(boolean deblockOnTrust) {
		this.deblockOnTrust = deblockOnTrust;
	}
	
	/**
	 * @return the secondDeblock
	 */
	public boolean isSecondDeblock() {
		return secondDeblock;
	}
	/**
	 * @param secondDeblock the secondDeblock to set
	 */
	public void setSecondDeblock(boolean secondDeblock) {
		this.secondDeblock = secondDeblock;
	}
	
	 public BigDecimal getDebitCreditSum() {
			return debitCreditSum;
	}
	 
	public void setDebitCreditSum(BigDecimal debitCreditSum) {//23285
			this.debitCreditSum = debitCreditSum;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XCustomerInvoiceInfoClientResponseTO [debitSum=" + debitSum
				+ ", balanceSum=" + balanceSum + ", creditSum=" + creditSum
				+ ", debitCreditSum=" + debitCreditSum
				+ ", openItemSum=" + openItemSum + ", DepositID=" + DepositID +", Amount=" + Amount
				+", Duration" + Duration +
				", RemainingAmount=" + RemainingAmount + ",amountDisputedSum="
				+ amountDisputedSum + ", errorMessage=" + errorMessage
				+ ", deblockOnTrust=" + deblockOnTrust + ", transactions="
				+ Arrays.toString(transactions) + "]";
	}
	
	
	
}
