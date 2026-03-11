package sunrise.crm.isales.order.capture;

import java.util.Map;

import sunrise.crm.util.CrmNumberUtil;

public class WeBenefitRuleDto {
	
    private static final String RULE_OBJID = "objid";
    private static final String SEQ_NO = "x_seq_no";
    private static final String MAX_ALLOWED_PER_SITE = "x_max_allowed_per_site";
    private static final String AMOUNT = "x_amount";
    private static final String UOM = "x_uom";

    private static final String DSCOUTN_NAME = "x_dsctn_name";
    private static final String DSCOUTN_OBJID = "x_dscnt_objid";

    private static final String TARGET_BENEFIT_NAME = "x_tgt_bnf_name";
    private static final String TARGET_BENEFIT_OBJID = "x_tgt_bnf_objid";

    private static final String ENABLER_A_OBJID = "x_bdl_enbl_a_objid";
    private static final String ENABLER_A_NAME = "x_bdl_enbl_a_name";
    private static final String ENABLER_B_OBJID = "x_bdl_enbl_b_objid";
    private static final String ENABLER_B_NAME = "x_bdl_enbl_b_name";
    
    private static final String BENEFIT_TYPE = "x_bnf_type";
    private static final String SUPPRESS_TYPE = "x_bnf_suppr_type";
    

    private String ruleObjid;
    private String seqNo;
    private String maxAllowance;
    private String discountAmount;
    private String amountUom;

    private String discountName;
    private String discountObjid;

    private String targetBenefitObjid;
    private String targetBenefitName;

    private String enablerAObjid;
    private String enablerAName;
    private String enablerBObjid;
    private String enablerBName;
    private String benefitType;
    private String suppressType;
    
    public WeBenefitRuleDto(){}

	public WeBenefitRuleDto(Map<String, Object> map) {
        this.ruleObjid = CrmNumberUtil.bigDecimalToString(map.get(RULE_OBJID));
        this.seqNo = CrmNumberUtil.bigDecimalToString(map.get(SEQ_NO));
        this.discountAmount = CrmNumberUtil.bigDecimalToString(map.get(AMOUNT));
        this.maxAllowance = CrmNumberUtil.bigDecimalToString(map.get(MAX_ALLOWED_PER_SITE));
        this.amountUom = (String)map.get(UOM);

        this.discountName = (String)map.get(DSCOUTN_NAME);
        this.discountObjid = CrmNumberUtil.bigDecimalToString(map.get(DSCOUTN_OBJID));

        this.targetBenefitName = (String)map.get(TARGET_BENEFIT_NAME);
        this.targetBenefitObjid = CrmNumberUtil.bigDecimalToString(map.get(TARGET_BENEFIT_OBJID));

        this.enablerAName = (String)map.get(ENABLER_A_NAME);
        this.enablerAObjid = CrmNumberUtil.bigDecimalToString(map.get(ENABLER_A_OBJID));
        this.enablerBName = (String)map.get(ENABLER_B_NAME);
        this.enablerBObjid = CrmNumberUtil.bigDecimalToString(map.get(ENABLER_B_OBJID));
        
        this.benefitType = (String)map.get(BENEFIT_TYPE);
        this.suppressType = (String)map.get(SUPPRESS_TYPE);
    }

    public String getRuleObjid() {
        return ruleObjid;
    }

    public void setRuleObjid(String fmcRuleObjid) {
        this.ruleObjid = fmcRuleObjid;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getMaxAllowance() {
        return maxAllowance;
    }

    public void setMaxAllowance(String maxAllowance) {
        this.maxAllowance = maxAllowance;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getDiscountObjid() {
        return discountObjid;
    }

    public void setDiscountObjid(String discountObjid) {
        this.discountObjid = discountObjid;
    }

    public String getEnablerAObjid() {
        return enablerAObjid;
    }

    public void setEnablerAObjid(String enablerAObjid) {
        this.enablerAObjid = enablerAObjid;
    }

    public String getEnablerAName() {
        return enablerAName;
    }

    public void setEnablerAName(String enablerAName) {
        this.enablerAName = enablerAName;
    }

    public String getEnablerBObjid() {
        return enablerBObjid;
    }

    public void setEnablerBObjid(String enablerBObjid) {
        this.enablerBObjid = enablerBObjid;
    }

    public String getEnablerBName() {
        return enablerBName;
    }

    public void setEnablerBName(String fmcEnablerBName) {
        this.enablerBName = fmcEnablerBName;
    }

    public String getUom() {
        return amountUom;
    }

    public void setUom(String uom) {
        this.amountUom = uom;
    }

    public String getTargetBenefitObjid() {
        return targetBenefitObjid;
    }

    public void setTargetBenefitObjid(String targetBenefitObjid) {
        this.targetBenefitObjid = targetBenefitObjid;
    }

    public String getTargetBenefitName() {
        return targetBenefitName;
    }

    public void setTargetBenefitName(String targetBenefitName) {
        this.targetBenefitName = targetBenefitName;
    }

    public String getSuppressType() {
		return suppressType;
	}

	public void setSuppressType(String suppressType) {
		this.suppressType = suppressType;
	}

	public String getBenefitType() {
		return benefitType;
	}

	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	@Override
	public String toString() {
		return "WeBenefitRuleDto [ruleObjid=" + ruleObjid + ", seqNo=" + seqNo + ", maxAllowance=" + maxAllowance
				+ ", discountAmount=" + discountAmount + ", amountUom=" + amountUom + ", discountName=" + discountName
				+ ", discountObjid=" + discountObjid + ", targetBenefitObjid=" + targetBenefitObjid
				+ ", targetBenefitName=" + targetBenefitName + ", enablerAObjid=" + enablerAObjid + ", enablerAName="
				+ enablerAName + ", enablerBObjid=" + enablerBObjid + ", enablerBName=" + enablerBName
				+ ", benefitType=" + benefitType + ", suppressType=" + suppressType + "]";
	}
}
