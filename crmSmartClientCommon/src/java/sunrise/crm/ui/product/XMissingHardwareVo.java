package sunrise.crm.ui.product;

import java.io.Serializable;

public class XMissingHardwareVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4790771173940347304L;
	private String description ;
	private String id ;
	private String serialNo;

	public String getSerialNo() {
		return serialNo;
	}

	 public void setSerialNo(String serialNo) {
	        this.serialNo = serialNo;
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
		XMissingHardwareVo other = (XMissingHardwareVo) obj;
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
		return "XMissingHardwareVo [description=" + description + ", id=" + id + ", SerialNo=" + serialNo + "]";
	}

	public XMissingHardwareVo() {}

	public XMissingHardwareVo(String description, String id) {
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
}

