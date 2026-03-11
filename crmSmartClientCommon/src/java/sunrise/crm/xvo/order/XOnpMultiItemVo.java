package sunrise.crm.xvo.order;

import java.io.Serializable;

/**
 * Holds MultiONP Item Info, in Tdm.
 * @author bansalg
 * sunrise.crm.xvo.order.XOnpMultiItemVo
 */
public class XOnpMultiItemVo implements Serializable {
	public String donorName;
	public String connectionType;
	public String portingNumber;
	public String partialPorting;
	public String groupId;
	public String donorId;
	
	public String getDonorName() {
		return donorName;
	}
	public String getConnectionType() {
		return connectionType;
	}
	public String getPortingNumber() {
		return portingNumber;
	}
	public String getPartialPorting() {
		return partialPorting;
	}
	public String getGroupId() {
		return groupId;
	}
	public String getDonorId() {
		return donorId;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public void setPortingNumber(String portingNumber) {
		this.portingNumber = portingNumber;
	}
	public void setPartialPorting(String partialPorting) {
		this.partialPorting = partialPorting;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}

}
