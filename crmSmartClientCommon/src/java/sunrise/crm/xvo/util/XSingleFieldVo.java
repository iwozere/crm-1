package sunrise.crm.xvo.util;

import java.io.Serializable;

/**
 * Custom VO for passing single lists to the backend
 *
 */
public class XSingleFieldVo  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4071427646931427754L;
	private String value;

	public XSingleFieldVo()  {}
	
	public XSingleFieldVo(String value)  {
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "XSingleFieldVo [value=" + value + "]";
	}
}
