package sunrise.crm.xvo.product;

import java.io.Serializable;

/**
 * @author kumarab
 *
 */
public class XCeaseRequestLineCeaseReasons implements Serializable {

	private static final long serialVersionUID = -2613353693860651755L;

	private String xCeaseReason;
	private String xCeaseType;
	private String xSendletter;
	
	public XCeaseRequestLineCeaseReasons() { };
	
	public XCeaseRequestLineCeaseReasons(String xCeaseReason,
			String xCeaseType, String xSendletter) {
		super();
		this.xCeaseReason = xCeaseReason;
		this.xCeaseType = xCeaseType;
		this.xSendletter = xSendletter;
	}
	
	public String getxCeaseReason() {
		return xCeaseReason;
	}
	public void setxCeaseReason(String xCeaseReason) {
		this.xCeaseReason = xCeaseReason;
	}
	public String getxCeaseType() {
		return xCeaseType;
	}
	public void setxCeaseType(String xCeaseType) {
		this.xCeaseType = xCeaseType;
	}
	public String getxSendletter() {
		return xSendletter;
	}
	public void setxSendletter(String xSendletter) {
		this.xSendletter = xSendletter;
	}
}
