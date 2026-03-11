package sunrise.crm.ui.iadmin;

import java.io.Serializable;

public class XAMLASiteBlockVo implements Serializable {
	
private static final long serialVersionUID = 4268720005288975792L;
	
	private String siteId;
	private String amount;
	
	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "XAMLASiteBlockVo [siteId=" + siteId + ", amount=" + amount + "]";
	}
	
}
