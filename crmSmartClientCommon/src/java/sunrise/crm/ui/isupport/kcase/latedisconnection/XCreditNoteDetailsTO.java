/**
 * 
 */
package sunrise.crm.ui.isupport.kcase.latedisconnection;

/**
 * @author ansari
 * @author singhr
 */
public class XCreditNoteDetailsTO {
	private String component_id;
	private String to_date;
	private String total_amount;
	private String description_text;
	private String from_Date;
	private String subscription;
	private String invoice_Ref_no;
	
	/**
	 * @return the component_id
	 */
	public final String getComponent_id() {
		return component_id;
	}
	
	/**
	 * @param component_id the component_id to set
	 */
	public final void setComponent_id(String component_id) {
		this.component_id = component_id;
	}
	
	/**
	 * @return the to_date
	 */
	public final String getTo_date() {
		return to_date;
	}
	
	/**
	 * @param to_date the to_date to set
	 */
	public final void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	
	/**
	 * @return the total_amount
	 */
	public final String getTotal_amount() {
		return total_amount;
	}
	
	/**
	 * @param total_amount the total_amount to set
	 */
	public final void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}
	
	/**
	 * @return the description_text
	 */
	public final String getDescription_text() {
		return description_text;
	}
	
	/**
	 * @param description_text the description_text to set
	 */
	public final void setDescription_text(String description_text) {
		this.description_text = description_text;
	}
	
	/**
	 * @return the from_Date
	 */
	public final String getFrom_Date() {
		return from_Date;
	}
	
	/**
	 * @param from_Date the from_Date to set
	 */
	public final void setFrom_Date(String from_Date) {
		this.from_Date = from_Date;
	}
	
	/**
	 * @return the subscription
	 */
	public final String getSubscription() {
		return subscription;
	}
	
	/**
	 * @param subscription the subscription to set
	 */
	public final void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XCreditNoteDetailsTO [component_id=" + component_id + ", to_date=" + to_date + ", total_amount="
				+ total_amount + ", description_text=" + description_text + ", from_Date=" + from_Date
				+ ", subscription=" + subscription + "]";
	}

	public String getInvoice_Ref_no() {
		return invoice_Ref_no;
	}

	public void setInvoice_Ref_no(String invoice_Ref_no) {
		this.invoice_Ref_no = invoice_Ref_no;
	}
}
