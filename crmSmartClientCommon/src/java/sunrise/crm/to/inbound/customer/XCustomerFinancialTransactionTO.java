package sunrise.crm.to.inbound.customer;

import java.math.BigDecimal;

public class XCustomerFinancialTransactionTO {
	
	private String status;
    private String clazz;
    private String trxNumber;
    private String trxDate;
    private String dueDate;
    private String daysLate;
    private String paymentMethod;
    private String dispatchMethod;

    private BigDecimal debit;     
    private BigDecimal credit;
	private BigDecimal openItem;
    private BigDecimal balance;   
    private String currency;    
    private BigDecimal debitCredit;  //23285   

	/**
	 * @return the status
	 */
	public final String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public final void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the clazz
	 */
	public final String getClazz() {
		return clazz;
	}
	/**
	 * @param clazz the clazz to set
	 */
	public final void setClazz(String clazz) {
		this.clazz = clazz;
	}
	/**
	 * @return the trxNumber
	 */
	public final String getTrxNumber() {
		return trxNumber;
	}
	/**
	 * @param trxNumber the trxNumber to set
	 */
	public final void setTrxNumber(String trxNumber) {
		this.trxNumber = trxNumber;
	}
	/**
	 * @return the trxDate
	 */
	public final String getTrxDate() {
		return trxDate;
	}
	/**
	 * @param trxDate the trxDate to set
	 */
	public final void setTrxDate(String trxDate) {
		this.trxDate = trxDate;
	}
	/**
	 * @return the dueDate
	 */
	public final String getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public final void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	/**
	 * @return the daysLate
	 */
	public final String getDaysLate() {
		return daysLate;
	}
	/**
	 * @param daysLate the daysLate to set
	 */
	public final void setDaysLate(String daysLate) {
		this.daysLate = daysLate;
	}
	/**
	 * @return the debit
	 */
	public final BigDecimal getDebit() {
		return debit;
	}
	/**
	 * @param debit the debit to set
	 */
	public final void setDebit(BigDecimal debit) {
		this.debit = debit;
	}
	/**
	 * @return the credit
	 */
	public final BigDecimal getCredit() {
		return credit;
	}
	/**
	 * @param credit the credit to set
	 */
	public final void setCredit(BigDecimal credit) {
		this.credit = credit;
	}
	/**
	 * @return the openItem
	 */
	public final BigDecimal getOpenItem() {
		return openItem;
	}
	/**
	 * @param openItem the openItem to set
	 */
	public final void setOpenItem(BigDecimal openItem) {
		this.openItem = openItem;
	}
	/**
	 * @return the balance
	 */
	public final BigDecimal getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public final void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	/**
	 * @return the currency
	 */
	public final String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public final void setCurrency(String currency) {
		this.currency = currency;
	}
	
	/**
	 * Is Balance Open (positive)
	 * @return
	 */
	public boolean isPositiveBalance() {
		return openItem != null && (BigDecimal.ZERO.compareTo(openItem) < 0);
	}
	
	 public BigDecimal getDebitCredit() {
			return debitCredit;
	}
	
	 public void setDebitCredit(BigDecimal debitCredit) {
			this.debitCredit = debitCredit;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getDispatchMethod() {
		return dispatchMethod;
	}
	public void setDispatchMethod(String dispatchMethod) {
		this.dispatchMethod = dispatchMethod;
	}
	@Override
	public String toString() {
		return "XCustomerFinancialTransactionTO [status=" + status + ", clazz=" + clazz + ", trxNumber=" + trxNumber
				+ ", trxDate=" + trxDate + ", dueDate=" + dueDate + ", daysLate=" + daysLate + ", paymentMethod="
				+ paymentMethod + ", dispatchMethod=" + dispatchMethod + ", debit=" + debit + ", credit=" + credit
				+ ", openItem=" + openItem + ", balance=" + balance + ", currency=" + currency + ", debitCredit="
				+ debitCredit + "]";
	}
        
}
