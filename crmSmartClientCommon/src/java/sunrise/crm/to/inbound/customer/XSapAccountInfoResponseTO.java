package sunrise.crm.to.inbound.customer;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SAP Account Info response TO
 * 
 * @author hudak
 *
 */
public class XSapAccountInfoResponseTO {
	
	private Date dunningStopEndDate;
    private Date arReadDate;
    private String arReadStage;
    private BigDecimal balance;
    private String currency;
    private BigDecimal depositPaid;
    private BigDecimal depositRefund;
    private BigDecimal depositTotal;
    private Date lastInvoiceDate;
    private Date lastBillDate;
    private Date lastDepositPaidDate;
    private Date lastDepositRefundDate;
    private Date lastPaymentDate;
    private String mahnv;
    private String mahns;
    private String mtext;
	private BigDecimal turnover;	
	private String errorMessage = null;
	private String dunningCount;
	
	
	
	/**
	 * @return the dunningStopEndDate
	 */
	public final Date getDunningStopEndDate() {
		return dunningStopEndDate;
	}

	/**
	 * @param dunningStopEndDate the dunningStopEndDate to set
	 */
	public final void setDunningStopEndDate(Date dunningStopEndDate) {
		this.dunningStopEndDate = dunningStopEndDate;
	}

	/**
	 * @return the arReadDate
	 */
	public final Date getArReadDate() {
		return arReadDate;
	}

	/**
	 * @param arReadDate the arReadDate to set
	 */
	public final void setArReadDate(Date arReadDate) {
		this.arReadDate = arReadDate;
	}

	/**
	 * @return the arReadStage
	 */
	public final String getArReadStage() {
		return arReadStage;
	}

	/**
	 * @param arReadStage the arReadStage to set
	 */
	public final void setArReadStage(String arReadStage) {
		this.arReadStage = arReadStage;
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
	 * @return the mtext
	 */	
    public String getMtext() {
		return mtext;
	}

    /**
	 * @param mtext the mtext to set
	 */
	public void setMtext(String mtext) {
		this.mtext = mtext;
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
	 * @return the depositPaid
	 */
	public final BigDecimal getDepositPaid() {
		return depositPaid;
	}

	/**
	 * @param depositPaid the depositPaid to set
	 */
	public final void setDepositPaid(BigDecimal depositPaid) {
		this.depositPaid = depositPaid;
	}

	/**
	 * @return the depositRefund
	 */
	public final BigDecimal getDepositRefund() {
		return depositRefund;
	}

	/**
	 * @param depositRefund the depositRefund to set
	 */
	public final void setDepositRefund(BigDecimal depositRefund) {
		this.depositRefund = depositRefund;
	}

	/**
	 * @return the depositTotal
	 */
	public final BigDecimal getDepositTotal() {
		return depositTotal;
	}

	/**
	 * @param depositTotal the depositTotal to set
	 */
	public final void setDepositTotal(BigDecimal depositTotal) {
		this.depositTotal = depositTotal;
	}

	/**
	 * @return the lastInvoiceDate
	 */
	public final Date getLastInvoiceDate() {
		return lastInvoiceDate;
	}

	/**
	 * @param lastInvoiceDate the lastInvoiceDate to set
	 */
	public final void setLastInvoiceDate(Date lastInvoiceDate) {
		this.lastInvoiceDate = lastInvoiceDate;
	}

	/**
	 * @return the lastBillDate
	 */
	public final Date getLastBillDate() {
		return lastBillDate;
	}

	/**
	 * @param lastBillDate the lastBillDate to set
	 */
	public final void setLastBillDate(Date lastBillDate) {
		this.lastBillDate = lastBillDate;
	}

	/**
	 * @return the lastDepositPaidDate
	 */
	public final Date getLastDepositPaidDate() {
		return lastDepositPaidDate;
	}

	/**
	 * @param lastDepositPaidDate the lastDepositPaidDate to set
	 */
	public final void setLastDepositPaidDate(Date lastDepositPaidDate) {
		this.lastDepositPaidDate = lastDepositPaidDate;
	}

	/**
	 * @return the lastDepositRefundDate
	 */
	public final Date getLastDepositRefundDate() {
		return lastDepositRefundDate;
	}

	/**
	 * @param lastDepositRefundDate the lastDepositRefundDate to set
	 */
	public final void setLastDepositRefundDate(Date lastDepositRefundDate) {
		this.lastDepositRefundDate = lastDepositRefundDate;
	}

	/**
	 * @return the lastPaymentDate
	 */
	public final Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	/**
	 * @param lastPaymentDate the lastPaymentDate to set
	 */
	public final void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	/**
	 * @return the mahnv
	 */
	public final String getMahnv() {
		return mahnv;
	}

	/**
	 * @param mahnv the mahnv to set
	 */
	public final void setMahnv(String mahnv) {
		this.mahnv = mahnv;
	}

	/**
	 * @return the mahns
	 */
	public final String getMahns() {
		return mahns;
	}

	/**
	 * @param mahns the mahns to set
	 */
	public final void setMahns(String mahns) {
		this.mahns = mahns;
	}

	/**
	 * @return the turnover
	 */
	public final BigDecimal getTurnover() {
		return turnover;
	}

	/**
	 * @param turnover the turnover to set
	 */
	public final void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
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

	public String getDunningCount() {
		return dunningCount;
	}

	public void setDunningCount(String dunningCount) {
		this.dunningCount = dunningCount;
	}

	@Override
	public String toString() {
		return "XSapAccountInfoResponseTO [dunningStopEndDate=" + dunningStopEndDate + ", arReadDate=" + arReadDate
				+ ", arReadStage=" + arReadStage + ", balance=" + balance + ", currency=" + currency + ", depositPaid="
				+ depositPaid + ", depositRefund=" + depositRefund + ", depositTotal=" + depositTotal
				+ ", lastInvoiceDate=" + lastInvoiceDate + ", lastBillDate=" + lastBillDate + ", lastDepositPaidDate="
				+ lastDepositPaidDate + ", lastDepositRefundDate=" + lastDepositRefundDate + ", lastPaymentDate="
				+ lastPaymentDate + ", mahnv=" + mahnv + ", mahns=" + mahns + ", mtext=" + mtext + ", turnover="
				+ turnover + ", errorMessage=" + errorMessage + ", dunningCount=" + dunningCount + "]";
	}
	
}
