package sunrise.crm.to.inbound.customer;

import java.util.Date;

/**
 * TO to hold detailed summary of the installment option
 * 
 * @author borkar
 * 
 */
public class XInstallmentSummaryTO {
	
	private String installmentNo;
	private String installmentAmount;
	private String installmentFee;
	private String totalInvoiceAmount;
	private String dueDate;
	private String installmentId;
	
	public String getInstallmentNo() {
		return installmentNo;
	}
	public void setInstallmentNo(String installmentNo) {
		this.installmentNo = installmentNo;
	}
	public String getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(String installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public String getInstallmentFee() {
		return installmentFee;
	}
	public void setInstallmentFee(String installmentFee) {
		this.installmentFee = installmentFee;
	}
	public String getTotalInvoiceAmount() {
		return totalInvoiceAmount;
	}
	public void setTotalInvoiceAmount(String totalInvoiceAmount) {
		this.totalInvoiceAmount = totalInvoiceAmount;
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
		return "XInstallmentSummaryTO [installmentNo=" + installmentNo
				+ ", installmentAmount=" + installmentAmount
				+ ", installmentFee=" + installmentFee
				+ ", totalInvoiceAmount=" + totalInvoiceAmount + ", dueDate="
				+ dueDate + ", installmentId=" + installmentId + " ]";
	}

}
