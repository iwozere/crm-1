package sunrise.crm.ui.excelimports.model;

public class MigrationPricingCalculationRecord {

	private String serialNo;
	private String targetProductName;
	private String targetInternet;
	private String targetVoice;
	private String targetTv;
	private String option1;
	private String option2;
	private String option3;
	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getOption5() {
		return option5;
	}

	public void setOption5(String option5) {
		this.option5 = option5;
	}

	public String getOption6() {
		return option6;
	}

	public void setOption6(String option6) {
		this.option6 = option6;
	}

	public String getOption7() {
		return option7;
	}

	public void setOption7(String option7) {
		this.option7 = option7;
	}

	public String getOption8() {
		return option8;
	}

	public void setOption8(String option8) {
		this.option8 = option8;
	}

	public String getOption9() {
		return option9;
	}

	public void setOption9(String option9) {
		this.option9 = option9;
	}

	public String getOption10() {
		return option10;
	}

	public void setOption10(String option10) {
		this.option10 = option10;
	}

	private String option4;
	private String option5;
	private String option6;
	private String option7;
	private String option8;
	private String option9;
	private String option10;
	private String asIsPrice;
	private String futurePrice;
	private String asIsLog;
	private String futureLog;

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getTargetProductName() {
		return targetProductName;
	}

	public void setTargetProductName(String targetProductName) {
		this.targetProductName = targetProductName;
	}

	public String getTargetInternet() {
		return targetInternet;
	}

	public void setTargetInternet(String targetInternet) {
		this.targetInternet = targetInternet;
	}

	public String getTargetVoice() {
		return targetVoice;
	}

	public void setTargetVoice(String targetVoice) {
		this.targetVoice = targetVoice;
	}

	public String getTargetTv() {
		return targetTv;
	}

	public void setTargetTv(String targetTv) {
		this.targetTv = targetTv;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getAsIsPrice() {
		return asIsPrice;
	}

	public void setAsIsPrice(String asIsPrice) {
		this.asIsPrice = asIsPrice;
	}

	public String getFuturePrice() {
		return futurePrice;
	}

	public void setFuturePrice(String futurePrice) {
		this.futurePrice = futurePrice;
	}

	public String getAsIsLog() {
		return asIsLog;
	}

	public void setAsIsLog(String asIsLog) {
		this.asIsLog = asIsLog;
	}

	public String getFutureLog() {
		return futureLog;
	}

	public void setFutureLog(String futureLog) {
		this.futureLog = futureLog;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("MigrationPricingCalculationRecord{");
		sb.append("serialNo='").append(serialNo).append('\'');
		sb.append(", targetProductName='").append(targetProductName).append('\'');
		sb.append(", targetInternet='").append(targetInternet).append('\'');
		sb.append(", targetVoice='").append(targetVoice).append('\'');
		sb.append(", targetTv='").append(targetTv).append('\'');
		sb.append(", option1='").append(option1).append('\'');
		sb.append(", option2='").append(option2).append('\'');
		sb.append(", option3='").append(option3).append('\'');
		sb.append(", asIsPrice='").append(asIsPrice).append('\'');
		sb.append(", futurePrice='").append(futurePrice).append('\'');
		sb.append(", asIsLog='").append(asIsLog).append('\'');
		sb.append(", futureLog='").append(futureLog).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
