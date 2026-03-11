package sunrise.crm.xvo.product;

import java.util.Date;


public class XSelectTransferActionInfoVo {
	private String serialNo;                
    private String ipId;             
    private String ratePlan;
    private Date contractEndDate;
    private String action;	
    
    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

    public XSelectTransferActionInfoVo(){}
	// ***************************
    // *** Setters and getters ***
    // ***************************
	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getIpId() {
		return ipId;
	}

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getRatePlan() {
		return ratePlan;
	}

	public void setRatePlan(String ratePlan) {
		this.ratePlan = ratePlan;
	}

	public Date getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
