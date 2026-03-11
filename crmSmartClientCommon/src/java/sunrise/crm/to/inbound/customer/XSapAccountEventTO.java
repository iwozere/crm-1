package sunrise.crm.to.inbound.customer;

import java.util.Date;

public class XSapAccountEventTO {
	
	private Date date;
	private String description;
	private String code;
	private String eventID;
	private String information;
	private String dunningInvoiceNumber;		
	private Date expectedDate;
	private String billNumber;
	private String detailDescription;//23285
	
	/**
	 * @return the date
	 */
	public final Date getDate() {
		return date;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

	/**
	 * @param date the date to set
	 */
	public final void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public final void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the code
	 */
	public final String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public final void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the eventID
	 */
	public final String getEventID() {
		return eventID;
	}

	/**
	 * @param eventID the eventID to set
	 */
	public final void setEventID(String eventID) {
		this.eventID = eventID;
	}

	
	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getDunningInvoiceNumber() {
		return dunningInvoiceNumber;
	}

	public void setDunningInvoiceNumber(String dunningInvoiceNumber) {
		this.dunningInvoiceNumber = dunningInvoiceNumber;
	}
	
	public Date getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}


	@Override
	public String toString() {
		return "XSapAccountEventTO [date=" + date + ", description=" + description + ", code=" + code + ", eventID="
				+ eventID + ", information=" + information + ", dunningInvoiceNumber=" + dunningInvoiceNumber
				+ ", expectedDate=" + expectedDate + ", billNumber=" + billNumber + ", detailDescription="
				+ detailDescription + "]";
	}
		
}
