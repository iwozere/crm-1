package sunrise.crm.xvo.retention;

import java.util.Date;

public class XWrittenCancellationListVo {
	private String serialNo;
	private String letterNo;
	private Date firstNotification;
	private Date secondNotification;
	private String letterStatus;
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getLetterNo() {
		return letterNo;
	}
	public void setLetterNo(String letterNo) {
		this.letterNo = letterNo;
	}
	public Date getFirstNotification() {
		return firstNotification;
	}
	public void setFirstNotification(Date firstNotification) {
		this.firstNotification = firstNotification;
	}
	public Date getSecondNotification() {
		return secondNotification;
	}
	public void setSecondNotification(Date secondNotification) {
		this.secondNotification = secondNotification;
	}
	public String getLetterStatus() {
		return letterStatus;
	}
	public void setLetterStatus(String letterStatus) {
		this.letterStatus = letterStatus;
	}	
}
