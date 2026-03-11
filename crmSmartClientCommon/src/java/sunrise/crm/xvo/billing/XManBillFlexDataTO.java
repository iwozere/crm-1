package sunrise.crm.xvo.billing;

public class XManBillFlexDataTO {
	
	private boolean reasonCodeEdit = false;
	
	private boolean productGroupEdit = false;
	
	private boolean causeEdit = false;
	
	private boolean billTextEdit = false;
	
	private boolean durationEdit = false;
	
	private boolean numberOfSubscriptionEdit = false;
	
	private boolean amountPerUnitEdit = false;
	
	private boolean rcAmountPerUnitEdit = false;
	
	private boolean totalAmountPerUnitEdit = false;
	
	private boolean totalRcAmountPerUnitEdit = false;

	public XManBillFlexDataTO(boolean edit) {
		reasonCodeEdit = edit;
		productGroupEdit = edit;		
		causeEdit = edit;		
		billTextEdit = edit;		
		durationEdit = edit;		
		numberOfSubscriptionEdit = edit;
		amountPerUnitEdit = edit;		
		rcAmountPerUnitEdit = edit;		
		totalAmountPerUnitEdit = edit;		
		totalRcAmountPerUnitEdit = edit;
	}

	/**
	 * @return the reasonCodeEdit
	 */
	public final boolean isReasonCodeEdit() {
		return reasonCodeEdit;
	}

	/**
	 * @param reasonCodeEdit the reasonCodeEdit to set
	 */
	public final void setReasonCodeEdit(boolean reasonCodeEdit) {
		this.reasonCodeEdit = reasonCodeEdit;
	}

	/**
	 * @return the productGroupEdit
	 */
	public final boolean isProductGroupEdit() {
		return productGroupEdit;
	}

	/**
	 * @param productGroupEdit the productGroupEdit to set
	 */
	public final void setProductGroupEdit(boolean productGroupEdit) {
		this.productGroupEdit = productGroupEdit;
	}

	/**
	 * @return the causeEdit
	 */
	public final boolean isCauseEdit() {
		return causeEdit;
	}

	/**
	 * @param causeEdit the causeEdit to set
	 */
	public final void setCauseEdit(boolean causeEdit) {
		this.causeEdit = causeEdit;
	}

	/**
	 * @return the billTextEdit
	 */
	public final boolean isBillTextEdit() {
		return billTextEdit;
	}

	/**
	 * @param billTextEdit the billTextEdit to set
	 */
	public final void setBillTextEdit(boolean billTextEdit) {
		this.billTextEdit = billTextEdit;
	}

	/**
	 * @return the durationEdit
	 */
	public final boolean isDurationEdit() {
		return durationEdit;
	}

	/**
	 * @param durationEdit the durationEdit to set
	 */
	public final void setDurationEdit(boolean durationEdit) {
		this.durationEdit = durationEdit;
	}

	/**
	 * @return the numberOfSubscriptionEdit
	 */
	public final boolean isNumberOfSubscriptionEdit() {
		return numberOfSubscriptionEdit;
	}

	/**
	 * @param numberOfSubscriptionEdit the numberOfSubscriptionEdit to set
	 */
	public final void setNumberOfSubscriptionEdit(boolean numberOfSubscriptionEdit) {
		this.numberOfSubscriptionEdit = numberOfSubscriptionEdit;
	}

	/**
	 * @return the amountPerUnitEdit
	 */
	public final boolean isAmountPerUnitEdit() {
		return amountPerUnitEdit;
	}

	/**
	 * @param amountPerUnitEdit the amountPerUnitEdit to set
	 */
	public final void setAmountPerUnitEdit(boolean amountPerUnitEdit) {
		this.amountPerUnitEdit = amountPerUnitEdit;
	}

	/**
	 * @return the rcAmountPerUnitEdit
	 */
	public final boolean isRcAmountPerUnitEdit() {
		return rcAmountPerUnitEdit;
	}

	/**
	 * @param rcAmountPerUnitEdit the rcAmountPerUnitEdit to set
	 */
	public final void setRcAmountPerUnitEdit(boolean rcAmountPerUnitEdit) {
		this.rcAmountPerUnitEdit = rcAmountPerUnitEdit;
	}

	/**
	 * @return the totalAmountPerUnitEdit
	 */
	public final boolean isTotalAmountPerUnitEdit() {
		return totalAmountPerUnitEdit;
	}

	/**
	 * @param totalAmountPerUnitEdit the totalAmountPerUnitEdit to set
	 */
	public final void setTotalAmountPerUnitEdit(boolean totalAmountPerUnitEdit) {
		this.totalAmountPerUnitEdit = totalAmountPerUnitEdit;
	}

	/**
	 * @return the totalRcAmountPerUnitEdit
	 */
	public final boolean isTotalRcAmountPerUnitEdit() {
		return totalRcAmountPerUnitEdit;
	}

	/**
	 * @param totalRcAmountPerUnitEdit the totalRcAmountPerUnitEdit to set
	 */
	public final void setTotalRcAmountPerUnitEdit(boolean totalRcAmountPerUnitEdit) {
		this.totalRcAmountPerUnitEdit = totalRcAmountPerUnitEdit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XManBillFlexDataTO [reasonCodeEdit=" + reasonCodeEdit
				+ ", productGroupEdit=" + productGroupEdit + ", causeEdit="
				+ causeEdit + ", billTextEdit=" + billTextEdit
				+ ", durationEdit=" + durationEdit
				+ ", numberOfSubscriptionEdit=" + numberOfSubscriptionEdit
				+ ", amountPerUnitEdit=" + amountPerUnitEdit
				+ ", rcAmountPerUnitEdit=" + rcAmountPerUnitEdit
				+ ", totalAmountPerUnitEdit=" + totalAmountPerUnitEdit
				+ ", totalRcAmountPerUnitEdit=" + totalRcAmountPerUnitEdit
				+ "]";
	}
	
}
