package sunrise.crm.xvo.util;

import java.io.Serializable;

/**
 * Custom VO for passing list of the key/value pairs to the backend.
 * Amdocs framework does not support Object as a type.
 * Type is a fully qualified name of the Java class, e.g. java.lang.String or java.util.Date etc.
 * 
 * Agreements for serialization:
 * String <--> String
 * Date will be represented as number of milliseconds.
 * Calendar will be represented as number of milliseconds.
 * Numbers as numbers with period(?) as a decimal separator.
 * TBD
 *
 */
public class XKeyValueVo  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4071427646931427754L;
	protected String key;
	protected String value;
	protected String type;

	public XKeyValueVo(String key, String value, String type) {
		this.key = key;
		this.value = value;
		this.type = type;
	}
	
	public XKeyValueVo() {		
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "{key: " + key +
				", value: " + value +
				(type != null ? ", type: " + type : "") +
				'}';
	}
}
