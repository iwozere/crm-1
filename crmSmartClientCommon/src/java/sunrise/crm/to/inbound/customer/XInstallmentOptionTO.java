package sunrise.crm.to.inbound.customer;


/**
 * TO to hold installment options
 * @author borkar
 *
 */
public class XInstallmentOptionTO {
	
	private String installmentNo;
	private String amountPerInstallment;
	private String feePerInstallment;
	private String invoiceAmount;
	private String costOfPPA;
	private String dueDate;
	private String installmentId;
	private String lastInstallmentAmount;
	
	
	public String getLastInstallmentAmount() {
		return lastInstallmentAmount;
	}


	public void setLastInstallmentAmount(String lastInstallmentAmount) {
		this.lastInstallmentAmount = lastInstallmentAmount;
	}


	public String getInstallmentNo() {
		return installmentNo;
	}


	public void setInstallmentNo(String installmentNo) {
		this.installmentNo = installmentNo;
	}


	public String getAmountPerInstallment() {
		return amountPerInstallment;
	}


	public void setAmountPerInstallment(String amountPerInstallment) {
		this.amountPerInstallment = amountPerInstallment;
	}


	public String getFeePerInstallment() {
		return feePerInstallment;
	}


	public void setFeePerInstallment(String feePerInstallment) {
		this.feePerInstallment = feePerInstallment;
	}


	public String getInvoiceAmount() {
		return invoiceAmount;
	}


	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}


	public String getCostOfPPA() {
		return costOfPPA;
	}


	public void setCostOfPPA(String costOfPPA) {
		this.costOfPPA = costOfPPA;
	}


	public String getDueDate() {
		return dueDate;
	}


	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}


	public String getInstallmentId() {
		return installmentId;
	}


	public void setInstallmentId(String installmentId) {
		this.installmentId = installmentId;
	}


	@Override
	public String toString() {
		return "XInstallmentOptionTO [installmentNo=" + installmentNo
				+ ", amountPerInstallment=" + amountPerInstallment
				+ ", feePerInstallment=" + feePerInstallment
				+ ", invoiceAmount=" + invoiceAmount + ", costOfPPA="
				+ costOfPPA + ", dueDate=" + dueDate + ", installmentId="
				+ installmentId +", lastInstallmentAmount="+lastInstallmentAmount+ " ]";
	}
	
	

}
