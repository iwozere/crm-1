package sunrise.crm.ui.product;

import java.io.Serializable;

public class XUnnecessaryHardwareVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6597608187723415153L;

	private String description ;
	private String id ;
	private String SerialNo;

	public XUnnecessaryHardwareVo() {}

	public XUnnecessaryHardwareVo(String description, String id) {
		this.description = description;
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(String serialNo) {
		this.SerialNo = serialNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		XUnnecessaryHardwareVo other = (XUnnecessaryHardwareVo) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "XUnnecessaryHardwareVo [description=" + description + ", id=" + id + ", SerialNo=" + SerialNo + "]";
	}
}
