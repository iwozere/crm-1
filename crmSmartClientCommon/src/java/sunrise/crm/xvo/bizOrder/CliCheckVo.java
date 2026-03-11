package sunrise.crm.xvo.bizOrder;

public class CliCheckVo {

    private String returnCode;    // OK, ERROR, WARNING
    private String returnMsg;     //
    private String billingSite;   // 
    private String caseId;        // 
    private String orderStatus;   //

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

    public CliCheckVo(){}
        
    // ***************************
    // *** Setters and getters ***
    // ***************************

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setBillingSite(String billingSite) {
		this.billingSite = billingSite;
	}

	public String getBillingSite() {
		return billingSite;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getReturnMsg() {
		return returnMsg;
	}
}
