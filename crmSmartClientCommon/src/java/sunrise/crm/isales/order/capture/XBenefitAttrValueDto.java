package sunrise.crm.isales.order.capture;

import sunrise.crm.util.CrmNumberUtil;

import java.util.Map;
import java.util.StringJoiner;

public class XBenefitAttrValueDto {

    private String objid;
    private String xValue;
    private String xFbAttval2XAttdef;
    private String xFbAttval2XFlexb;
    private String xUom;

    public static final String OBJID = "BEN_A_OBJID";
    private static final String X_VALUE = "BEN_A_X_VALUE";
    private static final String X_FB_ATTVAL2X_ATTDEF = "BEN_A_X_FB_ATTVAL2X_ATTDEF";
    private static final String X_FB_ATTVAL2X_FLEXB = "BEN_A_X_FB_ATTVAL2X_FLEXB";
    private static final String X_UOM = "BEN_A_X_UOM";

    public XBenefitAttrValueDto(Map<String, Object> map) {
        this.objid = map.get(OBJID).toString();
        this.xValue = objectToStringOrNull(map.get(X_VALUE));
        this.xFbAttval2XAttdef = CrmNumberUtil.bigDecimalToString(map.get(X_FB_ATTVAL2X_ATTDEF));
        this.xFbAttval2XFlexb = CrmNumberUtil.bigDecimalToString(map.get(X_FB_ATTVAL2X_FLEXB));
        this.xUom = objectToStringOrNull(map.get(X_UOM));
    }

    // ToDo: Should it be replaced with String.valueOf(), that returns "null" string but not null value.
    private String objectToStringOrNull(Object object) {
        return object != null ? object.toString() : null;
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getxValue() {
        return xValue;
    }

    public void setxValue(String xValue) {
        this.xValue = xValue;
    }

    public String getxFbAttval2XAttdef() {
        return xFbAttval2XAttdef;
    }

    public void setxFbAttval2XAttdef(String xFbAttval2XAttdef) {
        this.xFbAttval2XAttdef = xFbAttval2XAttdef;
    }

    public String getxFbAttval2XFlexb() {
        return xFbAttval2XFlexb;
    }

    public void setxFbAttval2XFlexb(String xFbAttval2XFlexb) {
        this.xFbAttval2XFlexb = xFbAttval2XFlexb;
    }

    public String getxUom() {
        return xUom;
    }

    public void setxUom(String xUom) {
        this.xUom = xUom;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", XBenefitAttrValueDto.class.getSimpleName() + "[", "]")
                .add("objid='" + objid + "'")
                .add("xValue='" + xValue + "'")
                .add("xFbAttval2XAttdef='" + xFbAttval2XAttdef + "'")
                .add("xFbAttval2XFlexb='" + xFbAttval2XFlexb + "'")
                .add("xUom='" + xUom + "'")
                .toString();
    }
}
