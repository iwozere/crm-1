package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.NEW_CONTRACT_ACTIVATION)
public class XNewContractActivation {
	
    public String id;

	public String siteId;

	public String scheduleDate;

	public String contractDuration;

	public String product;
	
	public void setid(String id) {
        this.id = id;
    }
	
	public void setsiteId(String siteId) {
		this.siteId = siteId;
	}

	public void setscheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public void setcontractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}

	public void setproduct(String product) {
		this.product = product;
	}
}
