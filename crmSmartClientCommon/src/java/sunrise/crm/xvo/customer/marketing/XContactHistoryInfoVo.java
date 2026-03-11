package sunrise.crm.xvo.customer.marketing;

import java.util.List;


public class XContactHistoryInfoVo {

	private List<XContactHistoryItemVo> contactHistory;
	private String correlationId;

	public void setContactHistory(List<XContactHistoryItemVo> contactHistory) {
		this.contactHistory = contactHistory;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public List<XContactHistoryItemVo> getContactHistory() {
		return contactHistory;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	@Override
	public String toString() {
		return "XContactHistoryInfoVo [contactHistory=" + contactHistory + ", correlationId=" + correlationId + "]";
	}


}
