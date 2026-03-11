package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sunrise.crm.domain.enums.CampaignType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class BaseRequestDto {
	private boolean skipRulesEvaluation;
    private String campaignName;
    private List<CampaignType> campaignType = new ArrayList<>();
    private Date contractWishDate;
    private String creditCheckId;
    private Boolean digitalOrder;
    private Integer duration;
    private Boolean eSignature;
    private OnpDto onp;
    private String productName;
    private String productSerial;
    private String orderType;
    private String bindingPromoName;
    private String sapMaterialId;
    private SalesInfoDto salesInfo;
    private String orderIndex;
    private String voucherCode;
    private String verifyOffer;
    private List<BaseItemDto> baseItems = new ArrayList<>();
    private String orderSubAction;
    private List<AttributeDto> attributes = new ArrayList<>();
    private List<PromotionalHardwareDto> promotionalHardwares = new ArrayList<>();
    private OrbitInfoDto orbitInfo;
    
	private int errorCode;
    private String errorDescription;
    private String ipId;
    private Boolean isMobilePackFirstSubscription;

    /**
     * semicolon separated rule names, colon separated rule parameters,
     * hasContractAddItem:Device Plan;hasSapMaterial;hasSapMaterials
     */
    private String skipRuleNames;

    private static Log log = LogFactory.getLog(BaseRequestDto.class);

    public BaseRequestDto(){}
    
    public BaseRequestDto(BaseRequestDto dto){
    	if (dto == null){
    		return;
    	}
    	this.bindingPromoName = dto.getBindingPromoName();
    	this.sapMaterialId = dto.getSapMaterialId();
    	this.campaignName = dto.getCampaignName();
    	this.contractWishDate = dto.getContractWishDate();
    	this.creditCheckId = dto.getCreditCheckId();
    	this.digitalOrder = dto.getDigitalOrder();
    	this.duration = dto.getDuration();
    	this.errorCode = dto.getErrorCode();
    	this.errorDescription = dto.getErrorDescription();
    	this.eSignature = dto.geteSignature();
    	this.ipId = dto.getIpId();
    	this.isMobilePackFirstSubscription = dto.getIsMobilePackFirstSubscription();
    	this.orderIndex = dto.getOrderIndex();
    	this.productName = dto.getProductName();
    	this.productSerial = dto.getProductSerial();
    	this.skipRulesEvaluation = dto.isSkipRulesEvaluation();
    	this.verifyOffer = dto.getVerifyOffer();
    	this.voucherCode = dto.getVoucherCode();
    	this.onp = new OnpDto(dto.getOnp());
    	this.salesInfo = new SalesInfoDto(dto.getSalesInfo());
        this.campaignType.addAll(dto.getCampaignType());
    	for (BaseItemDto d : dto.getBaseItems()){
        	this.baseItems.add(new BaseItemDto(d));    		
    	}
    	for (AttributeDto attr : dto.getAttributes()){
    		this.attributes.add(new AttributeDto(attr));
    	}
    	for (PromotionalHardwareDto hw : dto.getPromotionalHardwares()){
    		this.promotionalHardwares.add(new PromotionalHardwareDto(hw));
    	}
    	this.skipRuleNames = dto.getSkipRuleNames();
    	this.orbitInfo = dto.getOrbitInfo();
    }

    public List<CampaignType> getCampaignType() {
		return campaignType;
	}
    
    public CampaignType getCampaignType(int index) {
		return campaignType.get(index);
	}
    
    public void setCampaignType(int index, CampaignType campaignType) {
		this.campaignType.set(index, campaignType);
	}
    
    public int getCampaignTypeCount() {
		return campaignType.size();
    }

	public void setCampaignType(List<CampaignType> campaignType) {
		this.campaignType = campaignType;
	}

	public String getCampaignName() {
        return campaignName;
    }

    public String getVerifyOffer() {
        return verifyOffer;
    }

    public Date getContractWishDate() {
        return contractWishDate;
    }

    public String getCreditCheckId() {
        return creditCheckId;
    }

    public Boolean getDigitalOrder() {
        return digitalOrder;
    }

    public Integer getDuration() {
        return duration;
    }

    public Boolean geteSignature() {
        return eSignature;
    }

    public OnpDto getOnp() {
        return onp;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductSerial() {
        return productSerial;
    }

    public String getBindingPromoName() {
        return bindingPromoName;
    }

    public SalesInfoDto getSalesInfo() {
        return salesInfo;
    }

    public void setVerifyOffer(String verifyOffer) {
        this.verifyOffer = verifyOffer;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public void setContractWishDate(Date contractWishDate) {
        this.contractWishDate = contractWishDate;
    }

    public void setCreditCheckId(String creditCheckId) {
        this.creditCheckId = creditCheckId;
    }

    public void setDigitalOrder(Boolean digitalOrder) {
        this.digitalOrder = digitalOrder;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setESignature(Boolean eSignature) {
        this.eSignature = eSignature;
    }

    public void setOnp(OnpDto onp) {
        this.onp = onp;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductSerial(String productSerial) {
        this.productSerial = productSerial;
    }

    public void setBindingPromoName(String bindingPromoName) {
        this.bindingPromoName = bindingPromoName;
    }

    public void setSalesInfo(SalesInfoDto salesInfo) {
        this.salesInfo = salesInfo;
    }

    public List<BaseItemDto> getBaseItems() {
        return baseItems;
    }

    public void setBaseItems(List<BaseItemDto> baseItems) {
        this.baseItems = baseItems;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(String orderIndex) {
        this.orderIndex = orderIndex;
    }

	public String getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public boolean isSkipRulesEvaluation() {
		return skipRulesEvaluation;
	}

	public void setSkipRulesEvaluation(boolean skipRulesEvaluation) {
		this.skipRulesEvaluation = skipRulesEvaluation;
	}

	public String getOrderSubAction() {
		return orderSubAction;
	}

	public void setOrderSubAction(String orderSubAction) {
		this.orderSubAction = orderSubAction;
	}

    public String getIpId() {
        return ipId;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public void setIsMobilePackFirstSubscription(Boolean isMobilePackFirstSubscription) {
        this.isMobilePackFirstSubscription = isMobilePackFirstSubscription;
    }

    public Boolean getIsMobilePackFirstSubscription() {
        return isMobilePackFirstSubscription;
    }

    public List<AttributeDto> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeDto> attributes) {
        this.attributes = attributes;
    }

    public void setSkipRuleNames(String skipRuleNames) {
        this.skipRuleNames = skipRuleNames;
    }

    public String getSkipRuleNames() {
        return skipRuleNames;
    }

    public String getSapMaterialId() {
        return sapMaterialId;
    }
    public void setSapMaterialId(String sapMaterialId) {
        this.sapMaterialId = sapMaterialId;
    }

    public List<PromotionalHardwareDto> getPromotionalHardwares() {
		return promotionalHardwares;
	}

	public void setPromotionalHardwares(List<PromotionalHardwareDto> promotionalHardwares) {
		this.promotionalHardwares = promotionalHardwares;
	}

	public OrbitInfoDto getOrbitInfo() {
		return orbitInfo;
	}

	public void setOrbitInfo(OrbitInfoDto orbitInfo) {
		this.orbitInfo = orbitInfo;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseRequestDto baseRequestDto = (BaseRequestDto) o;

        if (!Objects.equals(this.skipRulesEvaluation, baseRequestDto.skipRulesEvaluation)) {
            log.debug("SkipRulesEvaluation is not equal.");
            return false;
        }
        if (!Objects.equals(this.errorCode, baseRequestDto.errorCode)) {
            log.debug("ErrorCode is not equal.");
            return false;
        }
        if (!Objects.equals(this.campaignName, baseRequestDto.campaignName)) {
            log.debug("CampaignName is not equal.");
            return false;
        }
        if (!Objects.equals(this.campaignType, baseRequestDto.campaignType)) {
            log.debug("CampaignType is not equal.");
            return false;
        }
        if (!Objects.equals(this.contractWishDate, baseRequestDto.contractWishDate)) {
            log.debug("ContractWishDate is not equal.");
            return false;
        }
        if (!Objects.equals(this.creditCheckId, baseRequestDto.creditCheckId)) {
            log.debug("CreditCheckId is not equal.");
            return false;
        }
        if (!Objects.equals(this.digitalOrder, baseRequestDto.digitalOrder)) {
            log.debug("DigitalOrder is not equal.");
            return false;
        }
        if (!Objects.equals(this.duration, baseRequestDto.duration)) {
            log.debug("Duration is not equal.");
            return false;
        }
        if (!Objects.equals(this.eSignature, baseRequestDto.eSignature)) {
            log.debug("eSignature is not equal.");
            return false;
        }
        if (!Objects.equals(this.onp, baseRequestDto.onp)) {
            log.debug("Onp is not equal.");
            return false;
        }
        if (!Objects.equals(this.productName, baseRequestDto.productName)) {
            log.debug("ProductName is not equal.");
            return false;
        }
        if (!Objects.equals(this.productSerial, baseRequestDto.productSerial)) {
            log.debug("ProductSerial is not equal.");
            return false;
        }
        if (!Objects.equals(this.orderType, baseRequestDto.orderType)) {
            log.debug("OrderType is not equal.");
            return false;
        }
        if (!Objects.equals(this.sapMaterialId, baseRequestDto.sapMaterialId)) {
            log.debug("SapMaterialId is not equal.");
            return false;
        }
        if (!Objects.equals(this.bindingPromoName, baseRequestDto.bindingPromoName)) {
            log.debug("BindingPromoName is not equal.");
            return false;
        }
        if (!Objects.equals(this.salesInfo, baseRequestDto.salesInfo)) {
            log.debug("SalesInfo is not equal.");
            return false;
        }
        if (!Objects.equals(this.orderIndex, baseRequestDto.orderIndex)) {
            log.debug("OrderIndex is not equal.");
            return false;
        }
        if (!Objects.equals(this.voucherCode, baseRequestDto.voucherCode)) {
            log.debug("VoucherCode is not equal.");
            return false;
        }
        if (!Objects.equals(this.verifyOffer, baseRequestDto.verifyOffer)) {
            log.debug("VerifyOffer is not equal.");
            return false;
        }
        if (!Objects.equals(this.baseItems, baseRequestDto.baseItems)) {
            log.debug("BaseItems are not equal.");
            return false;
        }
        if (!Objects.equals(this.orderSubAction, baseRequestDto.orderSubAction)) {
            log.debug("OrderSubAction is not equal.");
            return false;
        }
        if (!Objects.equals(this.attributes, baseRequestDto.attributes)) {
            log.debug("Attributes are not equal.");
            return false;
        }
        if (!Objects.equals(this.errorDescription, baseRequestDto.errorDescription)) {
            log.debug("ErrorDescription are not equal.");
            return false;
        }
        if (!Objects.equals(this.ipId, baseRequestDto.ipId)) {
            log.debug("IpId are not equal.");
            return false;
        }
        if (!Objects.equals(this.isMobilePackFirstSubscription, baseRequestDto.isMobilePackFirstSubscription)) {
            log.debug("IsMobilePackFirstSubscription are not equal.");
            return false;
        }
        if (!Objects.equals(this.skipRuleNames, baseRequestDto.skipRuleNames)) {
            log.debug("SkipRuleNames are not equal.");
            return false;
        }

        return true;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(skipRulesEvaluation, campaignName, campaignType
                , contractWishDate, creditCheckId, digitalOrder, duration
                , eSignature, onp, productName, productSerial
                , orderType, bindingPromoName, sapMaterialId
                , salesInfo, orderIndex, voucherCode, verifyOffer, baseItems
                , orderSubAction, attributes, errorCode, errorDescription, ipId
                , isMobilePackFirstSubscription, skipRuleNames);
    }
}
