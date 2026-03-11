package sunrise.crm.xvo.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;

import sunrise.crm.ProductAttribute;
import sunrise.crm.util.CrmNumberUtil;

public class XCampaignBenefitInfoVo {

	private String objid;
    private String campaignObjid;
    private String modLevelObjid;
    private String segmentObjid;
    private String priceProgObjid;
    private boolean deinstallShiftToEom;
    private String oneTimeDiscountAmnt;
    private String recurringDiscountAmnt;
    private boolean isInstalledByCampaign;
    private String priceProgName;
    private String partNumber;
    private String segment;
	private String auditOperation;
	private String groupId;
	private String sortOrder;
	private CampaignBenefitType benefitType;

	private List<String> charges = new ArrayList<>();

	public List<String> getCharges() {
		return charges;
	}

	private List<CampaignBenefitAttrValueInfoVo> benefitAttrValueVo;


	public XCampaignBenefitInfoVo() {}

    public XCampaignBenefitInfoVo(XCampaignBenefitInfoVo vo) {
		updateFields(vo);
        
        benefitAttrValueVo = new ArrayList<>();
        vo.getBenefitAttrValueVo().forEach(av -> benefitAttrValueVo.add(new CampaignBenefitAttrValueInfoVo(av)));
    }

	public void updateFields(XCampaignBenefitInfoVo vo) {
		this.objid = vo.getObjid();
		this.campaignObjid = vo.getCampaignObjid();
		this.modLevelObjid = vo.getModLevelObjid();
		this.segmentObjid = vo.getSegmentObjid();
		this.priceProgObjid = vo.getPriceProgObjid();
		this.deinstallShiftToEom = vo.isDeinstallShiftToEom();
		this.oneTimeDiscountAmnt = vo.getOneTimeDiscountAmnt();
		this.recurringDiscountAmnt = vo.getRecurringDiscountAmnt();
		this.isInstalledByCampaign = vo.isInstalledByCampaign();
		this.priceProgName = vo.getPriceProgName();
		this.partNumber = vo.getPartNumber();
		this.segment = vo.getSegment();
		this.auditOperation = vo.getAuditOperation();
		this.groupId = vo.getGroupId();
		this.sortOrder = vo.getSortOrder();
		this.benefitType = vo.getBenefitType();
	}

	public String getAttributeValue(String name) {
		CampaignBenefitAttrValueInfoVo attr = getAttributeByName(name);
		 return attr == null ? null : attr.getValue();
	}

	public CampaignBenefitAttrValueInfoVo getAttributeByName(String name) {
		if (benefitAttrValueVo!= null)
		{
			return benefitAttrValueVo.stream()
					.filter(attrValueInfoVo -> name.equals(attrValueInfoVo.getName()))
					.findFirst()
					.orElse(null);
		}
		return null;
	}

	public boolean hasAttributeByName(String name) {
		return getAttributeByName(name) != null;
	}

	public String getObjid() {
		return objid;
	}

	public void setObjid(String objid) {
		this.objid = objid;
	}

	public String getCampaignObjid() {
		return campaignObjid;
	}

	public void setCampaignObjid(String campaignObjid) {
		this.campaignObjid = campaignObjid;
	}

	public String getModLevelObjid() {
		return modLevelObjid;
	}

	public void setModLevelObjid(String modLevelObjid) {
		this.modLevelObjid = modLevelObjid;
	}

	public String getSegmentObjid() {
		return segmentObjid;
	}

	public void setSegmentObjid(String segmentObjid) {
		this.segmentObjid = segmentObjid;
	}

	public String getPriceProgObjid() {
		return priceProgObjid;
	}

	public void setPriceProgObjid(String priceProgObjid) {
		this.priceProgObjid = priceProgObjid;
	}

	public boolean isDeinstallShiftToEom() {
		return deinstallShiftToEom;
	}

	public void setDeinstallShiftToEom(boolean deinstallShiftToEom) {
		this.deinstallShiftToEom = deinstallShiftToEom;
	}

	public String getOneTimeDiscountAmnt() {
		return oneTimeDiscountAmnt;
	}

	public void setOneTimeDiscountAmnt(String oneTimeDiscountAmnt) {
		this.oneTimeDiscountAmnt = oneTimeDiscountAmnt;
	}

	public String getRecurringDiscountAmnt() {
		return recurringDiscountAmnt;
	}

	public void setRecurringDiscountAmnt(String recurringDiscountAmnt) {
		this.recurringDiscountAmnt = recurringDiscountAmnt;
	}

	public boolean isInstalledByCampaign() {
		return isInstalledByCampaign;
	}

	public void setInstalledByCampaign(boolean isInstalledByCampaign) {
		this.isInstalledByCampaign = isInstalledByCampaign;
	}

	public String getPriceProgName() {
		return priceProgName;
	}

	public void setPriceProgName(String priceProgName) {
		this.priceProgName = priceProgName;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getAuditOperation() {
		return auditOperation;
	}

	public void setAuditOperation(String auditOperation) {
		this.auditOperation = auditOperation;
	}

	public List<CampaignBenefitAttrValueInfoVo> getBenefitAttrValueVo() {
		return benefitAttrValueVo;
	}

	public void setBenefitAttrValueVo(List<CampaignBenefitAttrValueInfoVo> benefitAttrValueVo) {
		this.benefitAttrValueVo = benefitAttrValueVo;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	public CampaignBenefitAttrValueInfoVo getDurationAttribute() {
		return benefitAttrValueVo.stream()
				.filter(CampaignBenefitAttrValueInfoVo::isDurationAttribute)
				.findFirst().orElse(null);
	}

	public CampaignBenefitAttrValueInfoVo getServiceEndDateAttribute() {
		return benefitAttrValueVo.stream()
				.filter(CampaignBenefitAttrValueInfoVo::isServiceEndDateAttribute)
				.findFirst().orElse(null);
	}

	public CampaignBenefitAttrValueInfoVo getInvoiceTextAttribute() {
		return benefitAttrValueVo.stream()
				.filter(CampaignBenefitAttrValueInfoVo::isInvoiceTextAttribute)
				.findFirst().orElse(null);
	}

	public CampaignBenefitAttrValueInfoVo getDiscountAttribute() {
		return benefitAttrValueVo.stream()
				.filter(CampaignBenefitAttrValueInfoVo::isDiscountAttribute)
				.findFirst().orElse(null);
	}

	public CampaignBenefitAttrValueInfoVo getSapMaterialDescriptionAttribute() {
		return benefitAttrValueVo.stream()
				.filter(CampaignBenefitAttrValueInfoVo::isSapDescriptionAttribute)
				.findFirst().orElse(null);
	}

	public CampaignBenefitAttrValueInfoVo getOptionBindingDurationAttribute() {
		return benefitAttrValueVo.stream()
				.filter(CampaignBenefitAttrValueInfoVo::isOptionBindingDurationAttribute)
				.findFirst().orElse(null);
	}

	public CampaignBenefitAttrValueInfoVo getSapMaterialIdAttribute() {
		return benefitAttrValueVo.stream()
				.filter(CampaignBenefitAttrValueInfoVo::isSapMaterialIdAttribute)
				.findFirst().orElse(null);
	}


	public static final String DATE_TBD = "TBD";

	public int getDuration() {
		CampaignBenefitAttrValueInfoVo attribute = getDurationAttribute();
		if (attribute == null){
			return -1;
		}
		String value = attribute.getValue();
		if (CrmNumberUtil.isNumeric(value)) {
			return Integer.parseInt(value);
		}
		return -1;
	}

	public String getServiceEndDate() {
		if (getDuration() > 0){
			return DATE_TBD;
		}
		CampaignBenefitAttrValueInfoVo attribute = getServiceEndDateAttribute();
		if (attribute == null){
			return DATE_TBD;
		}
		return attribute.getValue();
	}

	public String getSapDiscount() {
		CampaignBenefitAttrValueInfoVo sapAmountAttribute = getDiscountAttribute();
		return sapAmountAttribute == null ? null : sapAmountAttribute.getValue();
	}

	public final String getSapMaterialDescription() {
		CampaignBenefitAttrValueInfoVo sapMaterialDescriptionAttribute = getSapMaterialDescriptionAttribute();
		return sapMaterialDescriptionAttribute == null ? null : sapMaterialDescriptionAttribute.getValue();
	}

	public final String getSapMaterialId() {
		CampaignBenefitAttrValueInfoVo sapMaterialIdAttribute = getSapMaterialIdAttribute();
		return sapMaterialIdAttribute == null ? null : sapMaterialIdAttribute.getValue();
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public CampaignBenefitType getBenefitType() {
		return benefitType;
	}

	public void setBenefitType(CampaignBenefitType benefitType) {
		this.benefitType = benefitType;
	}
	
    public static CampaignBenefitType getBenefitType(String partNumber, String benefitGroupId){
        if ("Promotional Hardware".equals(partNumber)){
            return CampaignBenefitType.GIFT;
        }else if (ProductAttribute.PART_PROMOTIONAL_CASHBACK.equals(partNumber) || "Dealer Cashback".equals(partNumber)){
            return CampaignBenefitType.CASHBACK;
        }else if ("Subsidized HW Discount".equals(partNumber)){
        	if (CrmNumberUtil.isNegativeInteger(benefitGroupId)) {
                if (Integer.parseInt(benefitGroupId) < -1) {
                    return CampaignBenefitType.AP_SUBSIDY;
                }
        	}
            return CampaignBenefitType.DP_SUBSIDY;
        }else if ("SIM".equals(partNumber) || "Activation Fee".equals(partNumber)){
            return CampaignBenefitType.ACTIVATION_FEE;
        } else if ("Disc. eSIM Activation Fee".equals(partNumber)) {
        	return CampaignBenefitType.ACTIVATION_FEE;
        } else if ("SIM Activation Discount".equals(partNumber)) {
        	return CampaignBenefitType.ACTIVATION_FEE;
		} else {
            return CampaignBenefitType.MRC;
        }
    }
	public XCampaignBenefitInfoVo normalize() {
		if (benefitAttrValueVo != null) {
			benefitAttrValueVo.sort(Comparator.comparing(CampaignBenefitAttrValueInfoVo::getObjid));
		}
		if (charges != null) {
			charges.sort(Comparator.comparing(String::toString));
		}

		Collections.sort(benefitAttrValueVo, new MyComparator());

		charges.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		return this;
	}

	static class MyComparator implements Comparator<CampaignBenefitAttrValueInfoVo> {
		@Override
		public int compare(CampaignBenefitAttrValueInfoVo o1, CampaignBenefitAttrValueInfoVo o2) {
			return o1.toString().compareTo(o2.toString());
		}
	}
}
