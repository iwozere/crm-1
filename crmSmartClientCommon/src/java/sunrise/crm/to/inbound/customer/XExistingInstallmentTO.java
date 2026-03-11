package sunrise.crm.to.inbound.customer;

import java.util.Date;

/**
 * To hold running PPA in SAP
 * 
 * @author borkar
 * @project 9086 - PPA - R91.1
 *
 */
public class XExistingInstallmentTO {

	private String ppaDate;
	private String totalPpaAmount;
	private String installmentAmount;
	private String installmentDueDate;
	private String outStandingAmount;
	private String installmentStatus;
	private String reason;
	private String ppaEndDate;
	private String ppaId;
	private String currency;
	private String deactivationDate;
	private String ppaCategory;
	private String ppaStatus;
	private String invoiceConsideredForPPA;
	private String ppaActivationDate;

	
	public String getInvoiceConsideredForPPA() {
		return invoiceConsideredForPPA;
	}
	public void setInvoiceConsideredForPPA(String invoiceConsideredForPPA) {//23285
		this.invoiceConsideredForPPA = invoiceConsideredForPPA;
	}
	public String getPpaActivationDate() {
		return ppaActivationDate;
	}
	public void setPpaActivationDate(String ppaActivationDate) {
		this.ppaActivationDate = ppaActivationDate;
	}
	public String getPpaStatus() {
		return ppaStatus;
	}
	public void setPpaStatus(String ppaStatus) {
		this.ppaStatus = ppaStatus;
	}		
	public String getPpaId() {
		return ppaId;
	}
	public void setPpaId(String ppaId) {
		this.ppaId = ppaId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDeactivationDate() {
		return deactivationDate;
	}
	public void setDeactivationDate(String deactivationDate) {
		this.deactivationDate = deactivationDate;
	}
	public String getPpaCategory() {
		return ppaCategory;
	}
	public void setPpaCategory(String ppaCategory) {
		this.ppaCategory = ppaCategory;
	}
	public String getPpaDate() {
		return ppaDate;
	}
	public void setPpaDate(String ppaDate) {
		this.ppaDate = ppaDate;
	}
	public String getTotalPpaAmount() {
		return totalPpaAmount;
	}
	public void setTotalPpaAmount(String totalPpaAmount) {
		this.totalPpaAmount = totalPpaAmount;
	}
	public String getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(String installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public String getInstallmentDueDate() {
		return installmentDueDate;
	}
	public void setInstallmentDueDate(String installmentDueDate) {
		this.installmentDueDate = installmentDueDate;
	}
	public String getOutStandingAmount() {
		return outStandingAmount;
	}
	public void setOutStandingAmount(String outStandingAmount) {
		this.outStandingAmount = outStandingAmount;
	}
	public String getInstallmentStatus() {
		return installmentStatus;
	}
	public void setInstallmentStatus(String installmentStatus) {
		this.installmentStatus = installmentStatus;
	}
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getPpaEndDate() {
		return ppaEndDate;
	}
	public void setPpaEndDate(String ppaEndDate) {
		this.ppaEndDate = ppaEndDate;
	}
	
}
