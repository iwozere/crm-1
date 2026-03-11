package sunrise.crm.xvo.order;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class XPromoHardwarePlanVo {

    private String description;
    private String sapMaterialId;
    private String ratePlanName;
    private String planType;
    private int contractDuration;
    private BigDecimal initialPayment;
    private BigDecimal monthlyInstallment;
    private BigDecimal lastInstallment;
    private BigDecimal fullPrice;
    private BigDecimal residualAmount;

    public XPromoHardwarePlanVo() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSapMaterialId() {
        return sapMaterialId;
    }

    public void setSapMaterialId(String sapMaterialId) {
        this.sapMaterialId = sapMaterialId;
    }

    public String getRatePlanName() {
        return ratePlanName;
    }

    public void setRatePlanName(String ratePlanName) {
        this.ratePlanName = ratePlanName;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public BigDecimal getInitialPayment() {
        return initialPayment;
    }

    public void setInitialPayment(BigDecimal initialPayment) {
        this.initialPayment = initialPayment;
    }

    public BigDecimal getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(BigDecimal monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }

    public BigDecimal getLastInstallment() {
        return lastInstallment;
    }

    public void setLastInstallment(BigDecimal lastInstallment) {
        this.lastInstallment = lastInstallment;
    }

    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    public void setResidualAmount(BigDecimal residualAmount) {
        this.residualAmount = residualAmount;
    }

    public BigDecimal getResidualAmount() {
        return residualAmount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", XPromoHardwarePlanVo.class.getSimpleName() + "[", "]")
                .add("description='" + description + "'")
                .add("sapMaterialId='" + sapMaterialId + "'")
                .add("ratePlanName='" + ratePlanName + "'")
                .add("planType='" + planType + "'")
                .add("contractDuration=" + contractDuration)
                .add("initialPayment=" + initialPayment)
                .add("monthlyInstallment=" + monthlyInstallment)
                .add("lastInstallment=" + lastInstallment)
                .add("fullPrice=" + fullPrice)
                .add("residualAmount=" + residualAmount)
                .toString();
    }
}
