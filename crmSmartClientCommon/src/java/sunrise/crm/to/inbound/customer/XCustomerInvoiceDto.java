package sunrise.crm.to.inbound.customer;

import java.math.BigDecimal;

public class XCustomerInvoiceDto {

	private String invoiceDate;
	private BigDecimal amount;
	private String paid;
	private String aboAmount;
	private String number;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAboAmount() {
		return aboAmount;
	}
	public void setAboAmount(String aboAmount) {
		this.aboAmount = aboAmount;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getPaid() {
		return paid;
	}
	public void setPaid(String paid) {
		this.paid = paid;
	}
}
