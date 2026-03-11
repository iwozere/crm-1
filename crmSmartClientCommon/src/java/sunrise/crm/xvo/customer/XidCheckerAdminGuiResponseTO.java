package sunrise.crm.xvo.customer;

import java.util.Date;

public class XidCheckerAdminGuiResponseTO {
	
	private String qrCode;
	private Boolean postponed;
	private String status;
	private String mrzType;
	
	//customerData
	private Date cdDOB;
	private String cdDocumentCountry;
	private String cdDocumentNumber;
	private String cdDocumentSubType;
	private String cdDocumentType;
	private Date cdExpirationDate;
	private String cdFirstName;
	private String cdGender;
	private String cdLastName;
	private String cdNationality;
	
	//yol files in base 64
	private String base64IDFrontFile;
	private String base64IDBackFile;
	private String base64FaceVideoFile;
	
	//Permit type to display on Customer Creation form
	private String permitType;
	
	public Boolean getPostponed() {
		return postponed;
	}
	public void setPostponed(Boolean postponed) {
		this.postponed = postponed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMrzType() {
		return mrzType;
	}
	public void setMrzType(String mrzType) {
		this.mrzType = mrzType;
	}
	public Date getCdDOB() {
		return cdDOB;
	}
	public void setCdDOB(Date cdDOB) {
		this.cdDOB = cdDOB;
	}
	public String getCdDocumentCountry() {
		return cdDocumentCountry;
	}
	public void setCdDocumentCountry(String cdDocumentCountry) {
		this.cdDocumentCountry = cdDocumentCountry;
	}
	public String getCdDocumentNumber() {
		return cdDocumentNumber;
	}
	public void setCdDocumentNumber(String cdDocumentNumber) {
		this.cdDocumentNumber = cdDocumentNumber;
	}
	public String getCdDocumentSubType() {
		return cdDocumentSubType;
	}
	public void setCdDocumentSubType(String cdDocumentSubType) {
		this.cdDocumentSubType = cdDocumentSubType;
	}
	public String getCdDocumentType() {
		return cdDocumentType;
	}
	public void setCdDocumentType(String cdDocumentType) {
		this.cdDocumentType = cdDocumentType;
	}
	public Date getCdExpirationDate() {
		return cdExpirationDate;
	}
	public void setCdExpirationDate(Date cdExpirationDate) {
		this.cdExpirationDate = cdExpirationDate;
	}
	public String getCdFirstName() {
		return cdFirstName;
	}
	public void setCdFirstName(String cdFirstName) {
		this.cdFirstName = cdFirstName;
	}
	public String getCdGender() {
		return cdGender;
	}
	public void setCdGender(String cdGender) {
		this.cdGender = cdGender;
	}
	public String getCdLastName() {
		return cdLastName;
	}
	public void setCdLastName(String cdLastName) {
		this.cdLastName = cdLastName;
	}
	public String getCdNationality() {
		return cdNationality;
	}
	public void setCdNationality(String cdNationality) {
		this.cdNationality = cdNationality;
	}
	public String getBase64IDFrontFile() {
		return base64IDFrontFile;
	}
	public void setBase64IDFrontFile(String base64idFrontFile) {
		base64IDFrontFile = base64idFrontFile;
	}
	public String getBase64IDBackFile() {
		return base64IDBackFile;
	}
	public void setBase64IDBackFile(String base64idBackFile) {
		base64IDBackFile = base64idBackFile;
	}
	public String getBase64FaceVideoFile() {
		return base64FaceVideoFile;
	}
	public void setBase64FaceVideoFile(String base64FaceVideoFile) {
		this.base64FaceVideoFile = base64FaceVideoFile;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	
	public String getPermitType() {
		return permitType;
	}
	
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}
	
	@Override
	public String toString() {
		return "XidCheckerAdminGuiResponseTO [qrCode=" + qrCode + ", postponed=" + postponed + ", status=" + status
				+ ", mrzType=" + mrzType + ", cdDOB=" + cdDOB + ", cdDocumentCountry=" + cdDocumentCountry
				+ ", cdDocumentNumber=" + cdDocumentNumber + ", cdDocumentSubType=" + cdDocumentSubType
				+ ", cdDocumentType=" + cdDocumentType + ", cdExpirationDate=" + cdExpirationDate + ", cdFirstName="
				+ cdFirstName + ", cdGender=" + cdGender + ", cdLastName=" + cdLastName + ", cdNationality="
				+ cdNationality + ", base64IDFrontFile=" + base64IDFrontFile + ", base64IDBackFile=" + base64IDBackFile
				+ ", base64FaceVideoFile=" + base64FaceVideoFile + "]";
	}

}
