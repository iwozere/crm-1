package sunrise.crm.xvo.kcase;

public class XHandlingUnitConfiguration {
	private String handlingUnit;
	private String caseType;
	private String subtype;
	private String detail;
	private String symptom;
	private String diagnosis;
	
	@Override
	public String toString() {
		return "XHandlingUnitConfiguration [handlingUnit=" + handlingUnit + ", caseType=" + caseType + ", subtype="
				+ subtype + ", detail=" + detail + ", symptom=" + symptom + ", diagnosis=" + diagnosis + "]";
	}
	public String getHandlingUnit() {
		return handlingUnit;
	}
	public void setHandlingUnit(String handlingUnit) {
		this.handlingUnit = handlingUnit;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

}
