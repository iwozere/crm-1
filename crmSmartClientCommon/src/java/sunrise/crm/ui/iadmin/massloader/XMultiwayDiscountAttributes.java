package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.MULTIWAY_DISCOUNT)
public class XMultiwayDiscountAttributes {

    public String discountName;
    public String duration;
    public String billCycle;
    public String noOfSubs;
    public String amtPerc;
    public String rcAmt;
    public String componentId;
    public String action;
    
    
	public String getdiscountName() {
		return discountName;
	}
	public void setdiscountName(String discountName) {
		this.discountName = discountName;
	}
	public String getduration() {
		return duration;
	}
	public void setduration(String duration) {
		this.duration = duration;
	}
	public String getbillCycle() {
		return billCycle;
	}
	public void setbillCycle(String billCycle) {
		this.billCycle = billCycle;
	}
	public String getnoOfSubs() {
		return noOfSubs;
	}
	public void setnoOfSubs(String noOfSubs) {
		this.noOfSubs = noOfSubs;
	}
	public String getamtPerc() {
		return amtPerc;
	}
	public void setamtPerc(String amtPerc) {
		this.amtPerc = amtPerc;
	}
	public String getrcAmt() {
		return rcAmt;
	}
	public void setrcAmt(String rcAmt) {
		this.rcAmt = rcAmt;
	}
	public String getcomponentId() {
		return componentId;
	}
	public void setcomponentId(String componentId) {
		this.componentId = componentId;
	}
	public String getaction() {
		return action;
	}
	public void setaction(String action) {
		this.action = action;
	}
    
	
}
