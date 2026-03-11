package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.BIZ_ORDER_CONTRACT_EXTENSION)
public class XBizOrderContractExtension {

	@XColumn(id = 0)
	public String siteId;

	@XColumn(id = 1)
	public String serviceId;

	@XColumn(id = 2)
	public String billingStartDate;

	@XColumn(id = 3)
	public String prolongation;

	public void setsiteId(String siteId) {

		this.siteId = siteId;
	}

	public void setserviceId(String serviceId) {

		this.serviceId = serviceId;
	}

	public void setbillingStartDate(String billingStartDate) {

		this.billingStartDate = billingStartDate;
	}

	public void setprolongation(String prolongation) {

		this.prolongation = prolongation;
	}
}
