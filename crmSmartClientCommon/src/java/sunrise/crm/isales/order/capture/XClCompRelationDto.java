package sunrise.crm.isales.order.capture;

import sunrise.crm.util.CrmNumberUtil;

import java.util.Map;
import java.util.StringJoiner;

public class XClCompRelationDto {
        private String discountPartNumber;
        private String chargePartNumber;
        private String discountComponentId;
        private String chargeComponentId;

    public XClCompRelationDto(Map<String, Object> map) {
        this.discountPartNumber = (String) map.get("DISC_PART_NUMBER");
        this.chargePartNumber = (String) map.get("RC_PART_NUMBER");
        this.discountComponentId = CrmNumberUtil.bigDecimalToString(map.get("DISC_COMPONENT_ID"));
        this.chargeComponentId = CrmNumberUtil.bigDecimalToString(map.get("RC_COMPONENT_ID"));
    }

    public String getDiscountPartNumber() {
        return discountPartNumber;
    }

    public void setDiscountPartNumber(String discountPartNumber) {
        this.discountPartNumber = discountPartNumber;
    }

    public String getChargePartNumber() {
        return chargePartNumber;
    }

    public void setChargePartNumber(String chargePartNumber) {
        this.chargePartNumber = chargePartNumber;
    }

    public String getDiscountComponentId() {
        return discountComponentId;
    }

    public void setDiscountComponentId(String discountComponentId) {
        this.discountComponentId = discountComponentId;
    }

    public String getChargeComponentId() {
        return chargeComponentId;
    }

    public void setChargeComponentId(String chargeComponentId) {
        this.chargeComponentId = chargeComponentId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", XClCompRelationDto.class.getSimpleName() + "[", "]")
                .add("discountPartNumber='" + discountPartNumber + "'")
                .add("chargePartNumber='" + chargePartNumber + "'")
                .add("discountComponentId='" + discountComponentId + "'")
                .add("chargeComponentId='" + chargeComponentId + "'")
                .toString();
    }
}
