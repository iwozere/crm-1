package sunrise.crm.isales.order.capture;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import sunrise.crm.PricingAttribute;
import sunrise.crm.util.CrmNumberUtil;
import sunrise.crm.util.CrmStringUtil;
import sunrise.crm.xvo.order.XAttributeValueVo;
import sunrise.crm.xvo.order.XLineItemVo;
import sunrise.crm.xvo.product.ProductOptionInfoVo;

/**
 * Represents billing information for single product option (site part) or order definition line item.
 * 
 * Contains type: option or discount, OC - one time amount (charge or discount), RC amount (charge or discount),
 * part number, description (for SAP HW items), number of installments and number of remaining installments from DP/AP etc.
 * 
 * In case of discounts amounts will be negative.
 * 
 * @author Kosyrev
 *
 */
public class SalesItemBillingDto extends XLineItemVo {
	
	private static final String COMPONENT_TYPE_UC = "COMPONENT_TYPE";

	private static final String COMPONENT_ID_UC = "COMPONENT_ID";

	private static final String RATE_DESCRIPTION_UC = "RATE_DESCRIPTION";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final BigDecimal ONE_HUNDRED = BigDecimal.valueOf(100);
	
	private static final List<String> UI_DISPLAY_ORDER = Arrays.asList("RATE PLAN", "DISCOUNT", "ADVANTAGE", "OPTION");
	

	private boolean isDiscount = false;
	private boolean isRatePlan = false;
	private boolean isOption = false;
	private boolean isSalesOption = false;
	private boolean isChildOption = false;

	private SalesDiscountType optionType;
	private Date scheduledDeactivatedDate;
	private Date activationDate;
	private BigDecimal oneTimeAmount;
	private BigDecimal recurringAmount;

	private String sapDescription;
	private Integer installmentsCount; // Total number of installments
	
	// For installations only.
	private String sapMaterialId;
	private Integer remainingInstallments;

	private String serialNo;

	private String mainProductSerial;

	private int uiSortingWeight = 0;
	
	private String uiTooltip = null;
	
	private String uiName = null;

	private List<SalesBillingComponentDto> components = new ArrayList<>();

	private String etfAmount;

	private int requiredPaidMonthsCount;

	private Date cancellationDate;

	private SalesItemBillingDto[] childOptions;

	public SalesItemBillingDto(){}
	
	public SalesItemBillingDto(XLineItemVo vo){
		this.setAction(vo.getAction());
		this.setAttributes(vo.getAttributes());
		this.setContrItmObjid(vo.getContrItmObjid());
		this.setDomain(vo.getDomain());
		this.setIsDummy(vo.getIsDummy());
		this.setIsOptional(vo.getIsOptional());
		this.setLine(vo.getLine());
		this.setLineNo(vo.getLineNo());
		this.setParentContrItmObjid(vo.getParentContrItmObjid());
		this.setParentLineNo(vo.getParentLineNo());
		this.setPartClass(vo.getPartClass());
		this.setPartNumber(vo.getPartNumber());
		this.setPartNumObjid(vo.getPartNumObjid());
		this.setPartType(vo.getPartType());
		this.setPrice(vo.getPrice());
		this.setRelatedSitePartObjid(vo.getRelatedSitePartObjid());
//
//		this.setSapMaterialId(null);
//		this.setSapDescription(null);
//		this.setRemainingInstallments(0);
//		this.setRecurringAmount(null);
//		this.setOptionType(optionType);
//		this.setOneTimeAmount(null);
//		this.setInstallmentsCount(0);
		
		doUiEnrichment();
	}

	public SalesItemBillingDto(Map<String, Object> map) {
		initFromProduct(map);
	}

	public SalesItemBillingDto(ProductOptionInfoVo option) {
        this.setRelatedSitePartObjid(option.getSitePartObjid());
        this.setPartNumber(option.getInstanceName());
        this.setPartNumObjid(option.getSitePartObjid());
        this.setSerialNo(option.getSerialNo());
        this.setPartType(option.getPartType());
        this.setPartClass(option.getPartClassification());

        doUiEnrichment();
	}


	private void initFromProduct(Map<String, Object> map){
		this.setRelatedSitePartObjid(CrmNumberUtil.bigDecimalToString(map.get("OPTION_OBJID")));
		this.setPartNumber((String) map.get("INSTANCE_NAME"));
		this.setPartNumObjid(CrmNumberUtil.bigDecimalToString("PART_NUM_OBJID"));
		this.setSerialNo((String) map.get("SERIAL"));
		this.setPartType((String) map.get("PART_TYPE"));
		this.setPartClass((String) map.get("PART_CLASS"));
		uiTooltip = (String) map.get("DESCRIPTION");

		doUiEnrichment();
	}

	
	private void initFromPendingActivationOrder(Map<String, Object> map){
		//this.setRelatedSitePartObjid(bigDecimalToString(map.get("OPTION_OBJID")));
		this.setPartNumber((String) map.get("PART_NUMBER"));
		this.setPartNumObjid(CrmNumberUtil.bigDecimalToString("PART_NUM_OBJID"));
		this.setSerialNo((String) map.get("SERIAL_NO"));
		CrmNumberUtil.bigDecimalToInt(map.get("MOD_LEVEL_OBJID"));
		this.setPartType((String) map.get("PART_TYPE"));
		uiTooltip = (String) map.get("DESCRIPTION");
		
		SalesBillingComponentDto cmp = new SalesBillingComponentDto();
		cmp.setComponentId(CrmNumberUtil.bigDecimalToInt(map.get(COMPONENT_ID_UC)));
		cmp.setComponentType(CrmNumberUtil.bigDecimalToInt(map.get(COMPONENT_TYPE_UC)));
		if (CrmNumberUtil.isNumeric((String) map.get(RATE_DESCRIPTION_UC))) {
			cmp.setAmount(CrmNumberUtil.toBigDecimal((String) map.get(RATE_DESCRIPTION_UC)).divide(ONE_HUNDRED));
		}
		this.getComponents().add(cmp);

		doUiEnrichment();
	}

	/**
	 * 
	 * @param map
	 * @param mode - PRODUCT, NEW PENDING ORDER, MODIFY PENDING ORDER, BASKET
	 */
	public SalesItemBillingDto(Map<String, Object> map, String mode) {
		if ("PRODUCT".equalsIgnoreCase(mode)){
			initFromProduct(map);
		}else if ("NEW PENDING ORDER".equalsIgnoreCase(mode)){
			initFromPendingActivationOrder(map);
		}
	}

	private void doUiEnrichment(){
		String partType = CrmStringUtil.nvl(this.getPartType(), "");
		if ("Rate Plan".equalsIgnoreCase(this.getPartType())){
			String partClass = CrmStringUtil.nvl(this.getPartClass(), "");
			if ("Voice".equalsIgnoreCase(partClass) || "TV".equalsIgnoreCase(partClass) || "Internet".equalsIgnoreCase(partClass) || "OTT TV".equalsIgnoreCase(partClass) || "HZN TV".equalsIgnoreCase(partClass)) {
				uiName = this.getPartNumber();
			} else {
				uiName = PricingAttribute.ATTR_PRICE;
			}
		}else if (this.getPartNumber().toUpperCase().contains("ADVANTAGE")){
			uiName = this.getPartNumber();
			partType = "ADVANTAGE";
		}else{
			uiName = this.getPartNumber();
		}

		uiSortingWeight = UI_DISPLAY_ORDER.indexOf(partType.toUpperCase());
		if (uiSortingWeight < 0) uiSortingWeight = 99;
		
		// TODO: Tooltip. We cannot get it from cache and it is too expensive to go to the DB...
	}
	
	
	
	private static BigDecimal round(BigDecimal bd){
		if (bd == null) return BigDecimal.ZERO;
		return bd.setScale(2, RoundingMode.HALF_UP);
	}

	public List<SalesBillingComponentDto> getComponents() {
		return components;
	}
	public SalesDiscountType getOptionType() {
		return optionType;
	}
	public void setOptionType(SalesDiscountType optionType) {
		this.optionType = optionType;
	}
	public BigDecimal getOneTimeAmount() {
		return oneTimeAmount;
	}
	public void setOneTimeAmount(BigDecimal oneTimeAmount) {
		this.oneTimeAmount = round(oneTimeAmount);
	}
	public BigDecimal getRecurringAmount() {
		return recurringAmount;
	}
	public void setRecurringAmount(BigDecimal recurringAmount) {
		this.recurringAmount = round(recurringAmount);
	}
	public String getSapDescription() {
		return sapDescription;
	}
	public void setSapDescription(String sapDescription) {
		this.sapDescription = sapDescription;
	}
	public Integer getInstallmentsCount() {
		return installmentsCount;
	}
	public void setInstallmentsCount(Integer installmentsCount) {
		this.installmentsCount = installmentsCount;
	}
	public String getSapMaterialId() {
		return sapMaterialId;
	}
	public void setSapMaterialId(String sapMaterialId) {
		this.sapMaterialId = sapMaterialId;
	}
	public Integer getRemainingInstallments() {
		return remainingInstallments;
	}
	public void setRemainingInstallments(Integer remainingInstallments) {
		this.remainingInstallments = remainingInstallments;
	}
	public boolean getIsDiscount() {
		return isDiscount;
	}
	public void setIsDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}
	public boolean getIsRatePlan() {
		return isRatePlan;
	}
	public void setIsRatePlan(boolean isRatePlan) {
		this.isRatePlan = isRatePlan;
	}
	public boolean getIsOption() {
		return isOption;
	}
	public void setIsOption(boolean isOption) {
		this.isOption = isOption;
	}

	public boolean getIsChildOption() {
		return isChildOption;
	}

	public void setIsChildOption(boolean childOption) {
		isChildOption = childOption;
	}

	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public int getUiSortingWeight() {
		return uiSortingWeight;
	}
	public String getUiTooltip() {
		return uiTooltip;
	}
	public String getUiName() {
		return uiName;
	}

	public void setUiName(String uiName) {
		this.uiName = uiName;
	}

	public String getEtfAmount() {
		return etfAmount;
	}

	public void setEtfAmount(String etfAmount) {
		this.etfAmount = etfAmount;
	}

	public int getRequiredPaidMonthsCount() {
		return requiredPaidMonthsCount;
	}

	public void setRequiredPaidMonthsCount(int requiredPaidMonthsCount) {
		this.requiredPaidMonthsCount = requiredPaidMonthsCount;
	}

	public Date getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(Date cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public Date getScheduledDeactivatedDate() {
		return scheduledDeactivatedDate;
	}

	public void setScheduledDeactivatedDate(Date scheduledDeactivatedDate) {
		this.scheduledDeactivatedDate = scheduledDeactivatedDate;
	}

	public boolean isSalesOption() {
		return isSalesOption;
	}

	public void setIsSalesOption(boolean isSalesOption) {
		this.isSalesOption = isSalesOption;
	}

	public String getMainProductSerial() {
		return mainProductSerial;
	}

	public void setMainProductSerial(String mainProductSerial) {
		this.mainProductSerial = mainProductSerial;
	}

	public XAttributeValueVo getAttribute(String attrName) {
		XAttributeValueVo[] attributes = getAttributes();
		if (attributes == null) {
			return null;
		}
		return Arrays.stream(attributes)
				.filter(attr -> attr.getAttributeName() != null && attr.getAttributeName().equals(attrName))
				.findFirst().orElse(null);
	}

	public SalesItemBillingDto[] getChildOptions() {
		return childOptions;
	}

	public void addChildrenOption(SalesItemBillingDto dto) {
		if (childOptions == null) {
			childOptions = new SalesItemBillingDto[]{dto};
		} else {
			List<SalesItemBillingDto> list = new ArrayList<>(Arrays.asList(childOptions));
			list.add(dto);
			childOptions = list.toArray(new SalesItemBillingDto[0]);
		}
	}


	@Override
	public String toString() {
		return "SalesItemBillingDto{" +
				"isDiscount=" + isDiscount +
				", isRatePlan=" + isRatePlan +
				", isOption=" + isOption +
				", isChildOption=" + isChildOption +
				", optionType=" + optionType +
				", oneTimeAmount=" + oneTimeAmount +
				", recurringAmount=" + recurringAmount +
				", sapDescription='" + sapDescription + '\'' +
				", installmentsCount=" + installmentsCount +
				", sapMaterialId='" + sapMaterialId + '\'' +
				", remainingInstallments=" + remainingInstallments +
				", serialNo='" + serialNo + '\'' +
				", mainProductSerial='" + mainProductSerial + '\'' +
				", components=" + components +
				", requiredPaidMonthsCount=" + requiredPaidMonthsCount +
				", etfAmount=" + etfAmount +
				", cancellationDate=" + cancellationDate +
				", scheduledDeactivatedDate=" + scheduledDeactivatedDate +
				", activationDate=" + activationDate +
				", childOptions=" + childOptions +
				'}' + super.toString();
	}

    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    public Date getActivationDate() {
        return activationDate;
    }
}
