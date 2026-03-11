package sunrise.crm.xvo.product;

import com.google.gson.Gson;
import sunrise.crm.PricingAttribute;
import sunrise.crm.util.CrmStringUtil;

import java.util.Arrays;
import java.util.List;

public class CampaignBenefitAttrValueInfoVo {

    private String objid;
    private String value;
    private String attrDefObjid;
    private String benefitObjid;
    private String uom;
    private String name;
    private String uomType;
    private String auditOperation;
    private String campaignObjid;

    public static final List<String> END_DATES_ATTRIBUTES = Arrays.asList("teaser end date", "end date");
    public static final List<String> DURATION_ATTRIBUTES = Arrays.asList("service duration", "promotion duration", "duration", "teaser duration", "binding duration");
    public static final String SAP_MATERIAL_ATTR = "SAP Material ID";
    public static final String FULL_AMOUNT_ATTR = "FullAmount";
    public static final String DESCRIPTION_ATTR = "Description";
    public static final String DISCOUNT_ATTR = "Discount";
    private static final String OPTION_BINDING_DURATION_ATTRIBUTE = "Option Binding Duration";
    public static final String HW_DELIVER_TOGETHER_ATTR = "HW Deliver Together";


    public boolean isDurationAttribute() {
        return CrmStringUtil.isNotBlank(name) && DURATION_ATTRIBUTES.contains(name.toLowerCase());
    }

    public boolean isServiceEndDateAttribute() {
        return CrmStringUtil.isNotBlank(name) && END_DATES_ATTRIBUTES.contains(name.toLowerCase());
    }

    public boolean isInvoiceTextAttribute() {
        return PricingAttribute.ATTR_INVOICE_ITEM_DESCRIPTION.equalsIgnoreCase(name);
    }

    public boolean isDiscountAttribute() {
        return DISCOUNT_ATTR.equalsIgnoreCase(name);
    }

    public boolean isSapDescriptionAttribute() {
        return DESCRIPTION_ATTR.equalsIgnoreCase(name);
    }

    public boolean isOptionBindingDurationAttribute() {
        return OPTION_BINDING_DURATION_ATTRIBUTE.equalsIgnoreCase(name);
    }

    public boolean isSapMaterialIdAttribute(){
        return SAP_MATERIAL_ATTR.equalsIgnoreCase(name);
    }

    public CampaignBenefitAttrValueInfoVo() {}

    public CampaignBenefitAttrValueInfoVo(CampaignBenefitAttrValueInfoVo vo) {
        updateFields(vo);
    }

    public void updateFields(CampaignBenefitAttrValueInfoVo vo) {
        this.objid = vo.getObjid();
        this.value = vo.getValue();
        this.attrDefObjid = vo.getAttrDefObjid();
        this.benefitObjid = vo.getBenefitObjid();
        this.uom = vo.getUom();
        this.name = vo.getName();
        this.uomType = vo.getUomType();
        auditOperation = vo.getAuditOperation();
        campaignObjid = vo.getCampaignObjid();
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAttrDefObjid() {
        return attrDefObjid;
    }

    public void setAttrDefObjid(String attrDefObjid) {
        this.attrDefObjid = attrDefObjid;
    }

    public String getBenefitObjid() {
        return benefitObjid;
    }

    public void setBenefitObjid(String benefitObjid) {
        this.benefitObjid = benefitObjid;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public String getAuditOperation() {
		return auditOperation;
	}

	public void setAuditOperation(String auditOperation) {
		this.auditOperation = auditOperation;
	}

    public String getCampaignObjid() {
        return campaignObjid;
    }

    public void setCampaignObjid(String campaignObjid) {
        this.campaignObjid = campaignObjid;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
