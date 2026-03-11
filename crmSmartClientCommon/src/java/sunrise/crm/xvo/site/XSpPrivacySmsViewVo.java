package sunrise.crm.xvo.site;

import java.io.Serializable;

public class XSpPrivacySmsViewVo implements Serializable {
	
private static final long serialVersionUID = 4268720005288975792L;
	
	private String serialNo;
	private String allowSms;
	private String allowOnePinSms;
	

	public String getSerialNo() {
		return serialNo;
	}


	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}


	public String getAllowSms() {
		return allowSms;
	}


	public void setAllowSms(String allowSms) {
		this.allowSms = allowSms;
	}


	public String getAllowOnePinSms() {
		return allowOnePinSms;
	}


	public void setAllowOnePinSms(String allowOnePinSms) {
		this.allowOnePinSms = allowOnePinSms;
	}


	@Override
	public String toString() {
		return "XSpPrivacySmsViewVo [serialNo=" + serialNo + ", allowSms=" + allowSms + ", allowOnePinSms=" + allowOnePinSms + "]";
	}
	
}
