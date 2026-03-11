package sunrise.crm.isales.order.capture;

import sunrise.crm.util.CrmNumberUtil;

import java.util.Map;

public class XAdvnRuleDto {

    public static final String X_ADVN_RULE_OBJID = "x_advn_rule_objid";
    public static final String X_SEQ_NO = "x_seq_no";
    public static final String X_TRG_GROUP_OBJID = "x_trg_group_objid";

    public static final String X_TRG_GROUP_NAME = "x_trg_group_name";
    public static final String X_BNFT_GROUP_OBJID = "x_bnft_group_objid";
    public static final String X_BNFT_GROUP_NAME = "x_bnft_group_name";
    public static final String X_IS_RETENTION = "x_is_retention";

    public static final String X_DISC_NAME = "x_disc_name";
    public static final String X_SEGMENT = "x_segment";
    public static final String X_PART_NUM_OBJID = "x_part_num_objid";
    public static final String X_SEGTYPE_OBJID = "x_segtype_objid";

    private String xAdvnRuleObjid;
    private String xSeqNo;
    private String xTrgGroupObjid;

    private String xTrgGroupName;
    private String xBnftGroupObjid;
    private String xBnftGroupName;
    private String xIsRetention;

    private String xDiscName;
    private String xSegment;
    private String xPartNumObjid;
    private String xSegtypeObjid;

    public XAdvnRuleDto(Map<String, Object> map) {
        this.xAdvnRuleObjid = (map.get(X_ADVN_RULE_OBJID).toString());
        this.xSeqNo = CrmNumberUtil.bigDecimalToString(map.get(X_SEQ_NO));
        this.xTrgGroupObjid = CrmNumberUtil.bigDecimalToString(map.get(X_TRG_GROUP_OBJID));

        this.xTrgGroupName = map.get(X_TRG_GROUP_NAME).toString();
        this.xBnftGroupObjid = CrmNumberUtil.bigDecimalToString(map.get(X_BNFT_GROUP_OBJID));
        this.xBnftGroupName = map.get(X_BNFT_GROUP_NAME).toString();
        this.xIsRetention = CrmNumberUtil.bigDecimalToString(map.get(X_IS_RETENTION));

        this.xDiscName = map.get(X_DISC_NAME).toString();
        this.xSegment = map.get(X_SEGMENT).toString();
        this.xPartNumObjid = CrmNumberUtil.bigDecimalToString(map.get(X_PART_NUM_OBJID));
        this.xSegtypeObjid = CrmNumberUtil.bigDecimalToString(map.get(X_SEGTYPE_OBJID));
    }

    public String getxAdvnRuleObjid() {
        return xAdvnRuleObjid;
    }

    public void setxAdvnRuleObjid(String xAdvnRuleObjid) {
        this.xAdvnRuleObjid = xAdvnRuleObjid;
    }

    public String getxSeqNo() {
        return xSeqNo;
    }

    public void setxSeqNo(String xSeqNo) {
        this.xSeqNo = xSeqNo;
    }

    public String getxTrgGroupObjid() {
        return xTrgGroupObjid;
    }

    public void setxTrgGroupObjid(String xTrgGroupObjid) {
        this.xTrgGroupObjid = xTrgGroupObjid;
    }

    public String getxTrgGroupName() {
        return xTrgGroupName;
    }

    public void setxTrgGroupName(String xTrgGroupName) {
        this.xTrgGroupName = xTrgGroupName;
    }

    public String getxBnftGroupObjid() {
        return xBnftGroupObjid;
    }

    public void setxBnftGroupObjid(String xBnftGroupObjid) {
        this.xBnftGroupObjid = xBnftGroupObjid;
    }

    public String getxBnftGroupName() {
        return xBnftGroupName;
    }

    public void setxBnftGroupName(String xBnftGroupName) {
        this.xBnftGroupName = xBnftGroupName;
    }

    public String getxIsRetention() {
        return xIsRetention;
    }

    public void setxIsRetention(String xIsRetention) {
        this.xIsRetention = xIsRetention;
    }

    public String getxDiscName() {
        return xDiscName;
    }

    public void setxDiscName(String xDiscName) {
        this.xDiscName = xDiscName;
    }

    public String getxSegment() {
        return xSegment;
    }

    public void setxSegment(String xSegment) {
        this.xSegment = xSegment;
    }

    public String getxPartNumObjid() {
        return xPartNumObjid;
    }

    public void setxPartNumObjid(String xPartNumObjid) {
        this.xPartNumObjid = xPartNumObjid;
    }

    public String getxSegtypeObjid() {
        return xSegtypeObjid;
    }

    public void setxSegtypeObjid(String xSegtypeObjid) {
        this.xSegtypeObjid = xSegtypeObjid;
    }

    @Override
    public String toString() {
        return "XAdvnRuleDto{" +
                "xAdvnRuleObjid='" + xAdvnRuleObjid + '\'' +
                ", xSeqNo='" + xSeqNo + '\'' +
                ", xTrgGroupObjid='" + xTrgGroupObjid + '\'' +
                ", xTrgGroupName='" + xTrgGroupName + '\'' +
                ", xBnftGroupObjid='" + xBnftGroupObjid + '\'' +
                ", xBnftGroupName='" + xBnftGroupName + '\'' +
                ", xIsRetention='" + xIsRetention + '\'' +
                ", xDiscName='" + xDiscName + '\'' +
                ", xSegment='" + xSegment + '\'' +
                ", xPartNumObjid='" + xPartNumObjid + '\'' +
                ", xSegtypeObjid='" + xSegtypeObjid + '\'' +
                '}';
    }
}
