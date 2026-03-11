package sunrise.crm.ui.iadmin.massloader;


@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.SAP_RETURN_SIMULATION)
public class XSapReturnSimulation {

    public String orderId;

	public void setorderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "XSapReturnSimulation [orderId=" + orderId + "]";
	}
	
}
