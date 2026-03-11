package sunrise.crm.xvo.product;

import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.List;

public class XCalculatedEtfInfoVo {

        private String contractId;             // The IP-Contract ID
        private String code;
        private String message;
        private String etfProductPartNumber;
        private String etfOptionPartNumber;
        private BigDecimal productEtfAmount;
        private BigDecimal optionEtfAmount;
        private BigDecimal tvEtfAmount;
        private BigDecimal totalEtfAmount;
        private BigDecimal devicePlanEtfAmount;
        private java.util.Date earliestCeaseDate;
        private EtfCalculationInfoLogVo productEtfCalculationDetails;
        private BigDecimal dailyEtfAmount;
        
        //9756 : ETF Bill Layout
        private BigDecimal adminFeeEtf;
        private BigDecimal hardwarePromoEtf;
        private BigDecimal cashbackPromoEtf;
        private BigDecimal contractEtf;
        private List<OptionEtfVo> optionEtfList;
        
        private List<OptionEtfVo> deviceEtfList;

        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

        public XCalculatedEtfInfoVo(){}
        
        // ***************************
        // *** Setters and getters ***
        // ***************************

		public void setContractId(String contractId) {
			this.contractId = contractId;
		}

		public String getContractId() {
			return contractId;
		}

		public void setEtfProductPartNumber(String etfProductPartNumber) {
			this.etfProductPartNumber = etfProductPartNumber;
		}

		public String getEtfProductPartNumber() {
			return etfProductPartNumber;
		}

		public void setEtfOptionPartNumber(String etfOptionPartNumber) {
			this.etfOptionPartNumber = etfOptionPartNumber;
		}

		public String getEtfOptionPartNumber() {
			return etfOptionPartNumber;
		}

		public void setProductEtfAmount(BigDecimal productEtfAmount) {
			this.productEtfAmount = productEtfAmount;
		}

		public BigDecimal getProductEtfAmount() {
			return productEtfAmount;
		}

		public void setOptionEtfAmount(BigDecimal optionEtfAmount) {
			this.optionEtfAmount = optionEtfAmount;
		}

		public BigDecimal getOptionEtfAmount() {
			return optionEtfAmount;
		}

		public void setTvEtfAmount(BigDecimal tvEtfAmount) {
			this.tvEtfAmount = tvEtfAmount;
		}

		public BigDecimal getTvEtfAmount() {
			return tvEtfAmount;
		}

		public void setTotalEtfAmount(BigDecimal totalEtfAmount) {
			this.totalEtfAmount = totalEtfAmount;
		}

		public BigDecimal getTotalEtfAmount() {
			return totalEtfAmount;
		}

		public void setDevicePlanEtfAmount(BigDecimal devicePlanEtfAmount) {
			this.devicePlanEtfAmount = devicePlanEtfAmount;
		}

		public BigDecimal getDevicePlanEtfAmount() {
			return devicePlanEtfAmount;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		public void setEarliestCeaseDate(java.util.Date earliestCeaseDate) {
			this.earliestCeaseDate = earliestCeaseDate;
		}

		public java.util.Date getEarliestCeaseDate() {
			return earliestCeaseDate;
		}

		public EtfCalculationInfoLogVo getProductEtfCalculationDetails() {
			return productEtfCalculationDetails;
		}

		public void setProductEtfCalculationDetails(EtfCalculationInfoLogVo productEtfCalculationDetails) {
			this.productEtfCalculationDetails = productEtfCalculationDetails;
		}

		public BigDecimal getDailyEtfAmount() {
			return dailyEtfAmount;
		}

		public void setDailyEtfAmount(BigDecimal dailyEtfAmount) {
			this.dailyEtfAmount = dailyEtfAmount;
		}

		public BigDecimal getAdminFeeEtf() {
			return adminFeeEtf;
		}

		public void setAdminFeeEtf(BigDecimal adminFeeEtf) {
			this.adminFeeEtf = adminFeeEtf;
		}

		public BigDecimal getHardwarePromoEtf() {
			return hardwarePromoEtf;
		}

		public void setHardwarePromoEtf(BigDecimal hardwarePromoEtf) {
			this.hardwarePromoEtf = hardwarePromoEtf;
		}

		public BigDecimal getCashbackPromoEtf() {
			return cashbackPromoEtf;
		}

		public void setCashbackPromoEtf(BigDecimal cashbackPromoEtf) {
			this.cashbackPromoEtf = cashbackPromoEtf;
		}

		public BigDecimal getContractEtf() {
			return contractEtf;
		}

		public void setContractEtf(BigDecimal contractEtf) {
			this.contractEtf = contractEtf;
		}

		public List<OptionEtfVo> getOptionEtfList() {
			return optionEtfList;
		}

		public void setOptionEtfList(List<OptionEtfVo> optionEtfList) {
			this.optionEtfList = optionEtfList;
		}
		
		public List<OptionEtfVo> getDeviceEtfList() {
			return deviceEtfList;
		}

		public void setDeviceEtfList(List<OptionEtfVo> deviceEtfList) {
			this.deviceEtfList = deviceEtfList;
		}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
