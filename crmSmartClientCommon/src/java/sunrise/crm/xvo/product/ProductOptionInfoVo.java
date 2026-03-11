package sunrise.crm.xvo.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sunrise.crm.domain.enums.PartType;
import sunrise.crm.util.CrmDateUtil;
import sunrise.crm.util.CrmStringUtil;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This class represents installed site parts (product options) as well as order line item (it has actionType in it).
 * 
 * @author Kosyrev
 *
 */
public class ProductOptionInfoVo {
    private String siteObjid;
    private String sitePartObjid;
    private String instanceName;
    private String actionType;
    private String sitePartStatus;
    private String serialNo;

    private BigDecimal oneTimeCharge;
    private BigDecimal recurringCharge;
    private Integer remainingInstallments;
    private Integer installmentsCount;
    private String sapDescription;
    private String sapMaterialId;
    private boolean isDiscount;
    private boolean isOption;
    private String partType;
    private String partLine;
    private String partClassification;
    private String partDomain;
    private String serviceGroup;
    private String addContrItmObjid;
    private String enrichContrItmObjid;
    private String flexBenefitObjid;
    private String addContrScheduleObjid;
    private String modLevelObjid;
    private String partNumber;
    private String promotionName;

    private boolean showRecommendation;
    private String recommendationText;
    private boolean isChangedByQuotation;

    private Calendar activationDate;
    private Calendar scheduledDeactivationDate;
    private Calendar installDate;

    private List<String> parentSitePartObjid = new ArrayList<>();
    private List<ProductAttributeInfoVo> attributes = new ArrayList<>();

    private List<BillingItemInfoVo> billingItems = new ArrayList<>();
    private Object storage;

	private static Log log = LogFactory.getLog(ProductOptionInfoVo.class);
    
    private static final List<String> SKIP_FOR_EQUALS = Arrays.asList(
            "Parental Consent",
            "Language",
            "Password"
    );
    
    private static final List<String> DISCOUNT_PART_TYPES = Arrays.asList("Discount", "Promotion", "Loyalty", "PCRF RP");

    /**
     * Used for UPC 2 SUN Migration to store EIS object, corresponding to this item
     * @return
     */
    public Object getStorage() {
		return storage;
	}

    /**
     * Used for UPC 2 SUN Migration to store EIS object, corresponding to this item
     * @param storage
     */
	public void setStorage(Object storage) {
		this.storage = storage;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getModLevelObjid() {
		return modLevelObjid;
	}

	public void setModLevelObjid(String modLevelObjid) {
		this.modLevelObjid = modLevelObjid;
	}

	public String getAddContrScheduleObjid() {
		return addContrScheduleObjid;
	}

	public void setAddContrScheduleObjid(String addContrScheduleObjid) {
		this.addContrScheduleObjid = addContrScheduleObjid;
	}

	private List<ProductOptionInfoVo> childOptions = new ArrayList<>();

    public ProductOptionInfoVo() {
    }
    public ProductOptionInfoVo(String instanceName) {
        this.instanceName = instanceName;
    }

    public ProductOptionInfoVo(ProductOptionInfoVo option) {
        this.siteObjid = option.getSiteObjid();
        this.sitePartObjid = option.getSitePartObjid();
        this.sapDescription = option.getSapDescription();
        this.instanceName = option.getInstanceName();
        this.sitePartStatus = option.getSitePartStatus();
        this.serialNo = option.getSerialNo();
        this.parentSitePartObjid.addAll(option.getParentSitePartObjid());
        this.actionType = option.getActionType();

        this.activationDate = CrmDateUtil.cloneCalendar(option.getActivationDate());
        this.scheduledDeactivationDate = CrmDateUtil.cloneCalendar(option.getScheduledDeactivationDate());
        this.installDate = CrmDateUtil.cloneCalendar(option.getInstallDate());

        this.promotionName = option.getPromotionName();

        this.attributes = option.getAttributes().stream().map(ProductAttributeInfoVo::new).collect(Collectors.toList());
        this.billingItems = option.getBillingItems().stream().map(BillingItemInfoVo::new).collect(Collectors.toList());
        this.oneTimeCharge = option.getOneTimeCharge();
        this.recurringCharge = option.getRecurringCharge();
        this.remainingInstallments = option.getRemainingInstallments();
        this.installmentsCount = option.getInstallmentsCount();

        this.sapDescription = option.getSapDescription();
        this.sapMaterialId = option.getSapMaterialId();
        this.isDiscount = option.getIsDiscount();
        this.isOption = option.getIsOption();

        this.partType = option.getPartType();
        this.partLine = option.getPartLine();
        this.partClassification = option.getPartClassification();
        this.partDomain = option.getPartDomain();
        this.serviceGroup = option.getServiceGroup();
        this.addContrItmObjid = option.getAddContrItmObjid();
        this.flexBenefitObjid = option.getFlexBenefitObjid();
        
        this.modLevelObjid = option.getModLevelObjid();
        this.partNumber = option.getPartNumber();
        this.addContrScheduleObjid = option.getAddContrScheduleObjid();
        this.childOptions = option.getChildOptions().stream().map(ProductOptionInfoVo::new).collect(Collectors.toList());
    }

	public void addAttribute(ProductAttributeInfoVo attribute) {
        attributes.add(attribute);
    }

    public List<ProductAttributeInfoVo> getAttributes() {
        return attributes;
    }

    public Map<String, String> getAttributesMap() {
        return this.attributes.stream()
                .collect(Collectors.toMap(ProductAttributeInfoVo::getAttributeName, rec -> CrmStringUtil.null2empty(rec.getAttributeValue())));
    }

    public String getAttributeValue(String attributeName) {
        ProductAttributeInfoVo attribute = attributes.stream()
                .filter(attr -> attr.getAttributeName() != null && attr.getAttributeName().equals(attributeName))
                .findAny().orElse(null);
        return attribute == null ? null : attribute.getAttributeValue();
    }
    
    public void setAttributeValue(String attributeName, String attirbuteValue){
        attributes.stream()
                .filter(attr -> attr.getAttributeName() != null && attr.getAttributeName().equals(attributeName))
                .findAny().ifPresent(attribute -> attribute.setAttributeValue(attirbuteValue));
    }

    public boolean hasAttribute(String attributeName) {
        return attributes.stream()
                .map(ProductAttributeInfoVo::getAttributeName)
                .anyMatch(attributeName::equals);
    }

    public List<ProductOptionInfoVo> getChildOptions() {
        return childOptions;
    }

    public void addBillingItem(BillingItemInfoVo billingItem) {
    	Iterator<BillingItemInfoVo> iter = billingItems.iterator();
    	while (iter.hasNext()){
    		BillingItemInfoVo bi = iter.next();
    		if (bi.getComponentId() == billingItem.getComponentId() && bi.getPackageId() == billingItem.getPackageId()){
    			log.debug(String.format("Replacing component %s with %s", bi, billingItem));
    			iter.remove();
    			break;
    		}
    	}
        if (!billingItems.contains(billingItem)) {
            billingItems.add(billingItem);
        }
    }

    public List<BillingItemInfoVo> getBillingItems() {
        return Collections.unmodifiableList(billingItems);
    }

    public String getSiteObjid() {
        return siteObjid;
    }

    public void setSiteObjid(String siteObjid) {
        this.siteObjid = siteObjid;
    }

    public String getSitePartObjid() {
        return sitePartObjid;
    }

    public void setSitePartObjid(String sitePartObjid) {
        this.sitePartObjid = sitePartObjid;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getSitePartStatus() {
        return sitePartStatus;
    }

    public void setSitePartStatus(String sitePartStatus) {
        this.sitePartStatus = sitePartStatus;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public List<String> getParentSitePartObjid() {
        return parentSitePartObjid;
    }

    public void setParentSitePartObjid(List<String> parentSitePartObjid) {
        this.parentSitePartObjid = parentSitePartObjid;
    }

    public Calendar getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Calendar activationDate) {
        this.activationDate = activationDate;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Calendar getScheduledDeactivationDate() {
        return scheduledDeactivationDate;
    }

    public void setScheduledDeactivationDate(Calendar scheduledDeactivationDate) {
        this.scheduledDeactivationDate = scheduledDeactivationDate;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Calendar getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Calendar installDate) {
        this.installDate = installDate;
    }

    @Override
    public String toString() {
        return  new StringBuilder()
                .append("ProdOpt [")
                .append("instanceName = ").append(instanceName)
                .append(", actionType = ").append(actionType)
                .append(", recurringCharge = ").append(recurringCharge)
                .append(", oneTimeCharge = ").append(oneTimeCharge)
                .append(", sitePartObjid = ").append(sitePartObjid)
                .append(", parentSitePartObjid = ").append(parentSitePartObjid)
                .append(", partType = ").append(partType)
                .append(", promotionName = ").append(promotionName)
                .append(", scheduledDeactivationDate = ").append(scheduledDeactivationDate == null ? "null" : scheduledDeactivationDate.getTime())
                .append(", billingItems = ").append(billingItems)
                .append(", remainingInstallments = ").append(remainingInstallments)
                .append(", partDomain = ").append(partDomain)
                .append(", installDate = ").append(installDate == null ? "null" : installDate.getTime())
                .append(", attributes = ").append(attributes)
                .append(", installmentsCount = ").append(installmentsCount)
                .append(", sapDescription = ").append(sapDescription)
                .append(", sapMaterialId = ").append(sapMaterialId)
                .append(", isDiscount = ").append(isDiscount)
                .append(", isOption = ").append(isOption)
                .append(", partClassification = ").append(partClassification)
                .append(", serviceGroup = ").append(serviceGroup)
                .append(", addContrItmObjid = ").append(addContrItmObjid)
                .append(", flexBenefitObjid = ").append(flexBenefitObjid)
                .append(", isChangedByQuotation = ").append(isChangedByQuotation)
                .append("]")
                .toString();
    }

    public void setOneTimeCharge(BigDecimal oneTimeCharge) {
        this.oneTimeCharge = oneTimeCharge;
    }

    public BigDecimal getOneTimeCharge() {
        return oneTimeCharge;
    }

    public void setRecurringCharge(BigDecimal recurringCharge) {
        this.recurringCharge = recurringCharge;
    }

    public BigDecimal getRecurringCharge() {
        return recurringCharge;
    }

    public void setRemainingInstallments(Integer remainingInstallments) {
        this.remainingInstallments = remainingInstallments;
    }

    public Integer getRemainingInstallments() {
        return remainingInstallments;
    }

    public void setInstallmentsCount(Integer installmentsCount) {
        this.installmentsCount = installmentsCount;
    }

    public Integer getInstallmentsCount() {
        return installmentsCount;
    }

    public void setSapDescription(String sapDescription) {
        this.sapDescription = sapDescription;
    }

    public String getSapDescription() {
        return sapDescription;
    }

    public void setSapMaterialId(String sapMaterialId) {
        this.sapMaterialId = sapMaterialId;
    }

    public String getSapMaterialId() {
        return sapMaterialId;
    }

    public boolean getIsDiscount() {
        return DISCOUNT_PART_TYPES.contains(partType);
    }

    public void setIsDiscount(boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public boolean getIsRatePlan() {
        return PartType.RATE_PLAN.toString().equals(partType);
    }

//    public void setIsOption(boolean isOption) {
//        this.isOption = isOption;
//    }

    public boolean getIsOption() {
    	//return PartType.OPTION.toString().equals(partType);
        return !getIsRatePlan() && !getIsDiscount();
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getPartLine() {
        return partLine;
    }

    public void setPartLine(String partLine) {
        this.partLine = partLine;
    }

    public String getPartClassification() {
        return partClassification;
    }

    public String getPartDomain() {
        return partDomain;
    }

    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setPartClassification(String partClassification) {
        this.partClassification = partClassification;
    }

    public void setPartDomain(String partDomain) {
        this.partDomain = partDomain;
    }

    public String getAddContrItmObjid() {
        return addContrItmObjid;
    }

    public void setAddContrItmObjid(String addContrItmObjid) {
        this.addContrItmObjid = addContrItmObjid;
    }

    public String getFlexBenefitObjid() {
        return flexBenefitObjid;
    }

    public void setFlexBenefitObjid(String flexBenefitObjid) {
        this.flexBenefitObjid = flexBenefitObjid;
    }

    public void addChildOption(ProductOptionInfoVo option) {
        childOptions.add(option);
    }

    public void clearChildOptions() {
        childOptions.clear();
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    public ProductAttributeInfoVo getAttribute(String attrName) {
        return attributes.stream()
                .filter(attr -> attr.getAttributeName() != null && attr.getAttributeName().equals(attrName))
                .findAny()
                .orElse(null);
    }

    public String shortDisplay() {
        return String.format("(%s, %s, %s, parents:%s)", sitePartObjid, instanceName, actionType, String.join(",", parentSitePartObjid));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductOptionInfoVo productOptionInfoVo = (ProductOptionInfoVo) o;

        if (!Objects.equals(this.isDiscount, productOptionInfoVo.isDiscount)) {
            //log.debug("IsDiscount is not equal.");
            return false;
        }
        if (!Objects.equals(this.isOption, productOptionInfoVo.isOption)) {
            //log.debug("IsOption is not equal.");
            return false;
        }
        if (!Objects.equals(this.siteObjid, productOptionInfoVo.siteObjid)) {
            //log.debug("SiteObjid is not equal.");
            return false;
        }
        if (!Objects.equals(this.instanceName, productOptionInfoVo.instanceName)) {
            //log.debug("InstanceName is not equal.");
            return false;
        }
        if (!Objects.equals(this.sitePartStatus, productOptionInfoVo.sitePartStatus)) {
            //log.debug("SitePartStatus is not equal.");
            return false;
        }
        if (!Objects.equals(this.activationDate, productOptionInfoVo.activationDate)) {
            //log.debug("ActivationDate is not equal.");
            return false;
        }
        if (!Objects.equals(this.promotionName, productOptionInfoVo.promotionName)) {
            //log.debug("PromotionName is not equal.");
            return false;
        }
        if (!Objects.equals(this.scheduledDeactivationDate, productOptionInfoVo.scheduledDeactivationDate)) {
            //log.debug("ScheduledDeactivationDate is not equal.");
            return false;
        }
        if (!Objects.equals(this.serialNo, productOptionInfoVo.serialNo)) {
            //log.debug("SerialNo is not equal.");
            return false;
        }
        if (!Objects.equals(this.actionType, productOptionInfoVo.actionType)) {
            //log.debug("ActionType is not equal.");
            return false;
        }

        if (! checkIfAttributesAreEqual(productOptionInfoVo)) return false;

        if (!Objects.equals(this.oneTimeCharge, productOptionInfoVo.oneTimeCharge)) {
            //log.debug("OneTimeCharge is not equal.");
            return false;
        }
        if (!Objects.equals(this.recurringCharge, productOptionInfoVo.recurringCharge)) {
            //log.debug("RecurringCharge is not equal.");
            return false;
        }
        if (!Objects.equals(this.remainingInstallments, productOptionInfoVo.remainingInstallments)) {
            //log.debug("RemainingInstallments are not equal.");
            return false;
        }
        if (!Objects.equals(this.installmentsCount, productOptionInfoVo.installmentsCount)) {
            //log.debug("InstallmentsCount is not equal.");
            return false;
        }
        if (!Objects.equals(this.sapDescription, productOptionInfoVo.sapDescription)) {
            //log.debug("SapDescription is not equal.");
            return false;
        }
        if (!Objects.equals(this.sapMaterialId, productOptionInfoVo.sapMaterialId)) {
            //log.debug("SapMaterialId is not equal.");
            return false;
        }
        if (!Objects.equals(this.partType, productOptionInfoVo.partType)) {
            //log.debug("PartType is not equal.");
            return false;
        }
        if (!Objects.equals(this.partLine, productOptionInfoVo.partLine)) {
            //log.debug("PartLine is not equal.");
            return false;
        }
        if (!Objects.equals(this.partClassification, productOptionInfoVo.partClassification)) {
            //log.debug("PartClassification is not equal.");
            return false;
        }
        if (!Objects.equals(this.partDomain, productOptionInfoVo.partDomain)) {
            //log.debug("PartDomain is not equal.");
            return false;
        }
        if (!Objects.equals(this.serviceGroup, productOptionInfoVo.serviceGroup)) {
            //log.debug("ServiceGroup is not equal.");
            return false;
        }
        if (!Objects.equals(this.addContrItmObjid, productOptionInfoVo.addContrItmObjid)) {
            //log.debug("AddContrItmObjid is not equal.");
            return false;
        }
        if (!Objects.equals(this.flexBenefitObjid, productOptionInfoVo.flexBenefitObjid)) {
            //log.debug("FlexBenefitObjid is not equal.");
            return false;
        }
        if (!Objects.equals(this.addContrScheduleObjid, productOptionInfoVo.addContrScheduleObjid)) {
            //log.debug("AddContrScheduleObjid is not equal.");
            return false;
        }
        if (!Objects.equals(this.modLevelObjid, productOptionInfoVo.modLevelObjid)) {
            //log.debug("ModLevelObjid is not equal.");
            return false;
        }
        if (!Objects.equals(this.partNumber, productOptionInfoVo.partNumber)) {
            //log.debug("PartNumber is not equal.");
            return false;
        }
        if (!Objects.equals(this.storage, productOptionInfoVo.storage)) {
            //log.debug("Storage is not equal.");
            return false;
        }
        if (!Objects.equals(sortingChildOptionsBySitePartObjidAndActionType(this.childOptions)
                , sortingChildOptionsBySitePartObjidAndActionType(productOptionInfoVo.childOptions))) {
            //log.debug("ChildOptions are not equal.");
            return false;
        }
        return true;
    }

    private boolean checkIfAttributesAreEqual(ProductOptionInfoVo productOptionInfoVo) {
        if (this.attributes != null && productOptionInfoVo.attributes != null) {
                    if (!Objects.equals(sortingAttributesByAttributeName(this.attributes), sortingAttributesByAttributeName(productOptionInfoVo.attributes))) {
                        //log.debug("Attributes are not equal.");
                        return false;
                    }
        }
        else if (!Objects.equals(this.attributes, productOptionInfoVo.attributes)) {
            //log.debug("Attributes are not equal.");
            return false;
        }
        return true;
    }

    private List<ProductAttributeInfoVo> sortingAttributesByAttributeName(List<ProductAttributeInfoVo> attributes) {
        return attributes.stream()
                .filter(productAttributeInfoVo -> ! SKIP_FOR_EQUALS.contains(productAttributeInfoVo.getAttributeName()))
                .sorted(Comparator.comparing(ProductAttributeInfoVo::getAttributeName, Comparator.nullsFirst(Comparator.naturalOrder()))).collect(Collectors.toList());
    }

    private List<ProductOptionInfoVo> sortingChildOptionsBySitePartObjidAndActionType(List<ProductOptionInfoVo> childOptions) {
        return childOptions.stream()
                .sorted(Comparator.comparing(ProductOptionInfoVo::getSitePartObjid, Comparator.nullsFirst(Comparator.naturalOrder()))
                        .thenComparing(ProductOptionInfoVo::getActionType, Comparator.nullsFirst(Comparator.naturalOrder()))).collect(Collectors.toList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteObjid, instanceName, sitePartStatus
                , serialNo, activationDate, promotionName
                , scheduledDeactivationDate,  actionType, sortingAttributesByAttributeName(attributes)
                , oneTimeCharge, recurringCharge, remainingInstallments
                , installmentsCount, sapDescription, sapMaterialId, isDiscount
                , isOption, partType, partClassification, partDomain, serviceGroup
                , addContrItmObjid, flexBenefitObjid, addContrScheduleObjid
                , modLevelObjid, partNumber, storage, sortingChildOptionsBySitePartObjidAndActionType(childOptions));
    }
    public boolean hasRecurringCharge() {
        return billingItems.stream().anyMatch(bi -> bi.getComponentType() == 2 || bi.getComponentType() == 10);
    }
    public boolean hasOneTimeCharge() {
        return billingItems.stream().anyMatch(bi -> bi.getComponentType() == 1);
    }

    public boolean isShowRecommendation() {
        return showRecommendation;
    }

    public void setShowRecommendation(boolean showRecommendation) {
        this.showRecommendation = showRecommendation;
    }

    public String getRecommendationText() {
        return recommendationText;
    }

    public void setRecommendationText(String recommendationText) {
        this.recommendationText = recommendationText;
    }

    public void setEnrichContrItmObjid(String enrichContrItmObjid) {
        this.enrichContrItmObjid = enrichContrItmObjid;
    }

    public String getEnrichContrItmObjid() {
        return enrichContrItmObjid;
    }

    /**
     * Indicates, that option has been installed or deinstalled by Complete Site Discount task
     * @return
     */
    public boolean isChangedByQuotation() {
		return isChangedByQuotation;
	}

    /**
     * Indicates, that option has been installed or deinstalled by Complete Site Discount task
     * @param isChangedByQuotation
     */
	public void setChangedByQuotation(boolean isChangedByQuotation) {
		this.isChangedByQuotation = isChangedByQuotation;
	}
}
