package sunrise.crm.xvo.product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.compress.utils.Lists;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

import sunrise.crm.domain.enums.CampaignSubType;
import sunrise.crm.domain.enums.CampaignType;
import sunrise.crm.util.CrmStringUtil;

public class CampaignInfoVo {

    public static final String ATTRIBUTE_NAME = "attribute_name";
    public static final String ATTRIBUTE_VALUE = "attribute_value";
    public static final String X_IS_UNIQUE_CAMPAIGN = "x_is_unique_campaign";
    public static final String X_IS_SUBSIDIZED_SERVICE = "x_is_subsidized_service";
    public static final String X_IS_IFRS_15 = "x_is_ifrs_15";
    public static final String X_IS_RERUNNABLE = "x_is_rerunnable";
    public static final String X_HAS_HARDWARE = "x_has_hardware";
    public static final String X_NEXT_PROMO_NAME = "x_next_promo_name";
    public static final String X_IS_VOUCHER_OPEN_FOR_ALL = "x_is_voucher_open_for_all";
    public static final String X_NOTICE_PERIOD = "x_notice_period";
    public static final String X_IS_DOWNGRADE_PROMO = "x_is_downgrade_promo";
    public static final String X_SUPPRESS_ETF = "x_suppress_etf";
    public static final String X_BINDING_PERIOD = "x_binding_period";
    public static final String X_DOWNGRADE_FEE = "x_downgrade_fee";
    public static final String X_INTERACTION_CONFIG_ID = "x_interaction_config_id";
    public static final String X_APPLICABLE_ON = "x_applicable_on";
    public static final String X_VOUCHER_VALIDITY = "x_voucher_validity";
    public static final String X_HW_DELIVER_TOGETHER = "x_hw_deliver_together";
    public static final String X_HW_DELIVERY_TYPE = "x_hw_delivery_type";
    public static final String X_SEND_EXTRA_SIM = "x_send_extra_sim";
    public static final String X_IS_VOUCHER_REQUIRED = "x_is_voucher_required";
    public static final String X_FLASH_MONTH_ACT = "x_flash_month_act";
    public static final String X_ADD_RELATED_OPTION = "x_add_related_option";
    public static final String NOTIFY_DAYS_BEFORE = "notify_days_before";
    public static final String X_CASHBACK_AMOUNT = "x_cashback_amount";
    public static final String X_CASHBACK_VAT_APPLICABLE = "x_cashback_vat_applicable";
    public static final String FA_CAMPAIGN_2_CAMPAIGN = "fa_campaign2campaign";
    public static final String FA_OBJID = "objid";
    public static final String X_ACTIVATION_MSGID = "x_activation_msgid";
    public static final String X_BILLING_MSGID = "x_billing_msgid";
    public static final String X_DEACTIVATION_MSGID = "x_deactivation_msgid";
    public static final String X_DESCR_MSGID = "x_descr_msgid";
    public static final String X_FLASH_MSGID = "x_flash_msgid";
    public static final String X_TERMS_CONDITIONS_ETF_MSGID = "x_terms_conditions_etf_msgid";
    public static final String X_TERMS_CONDITIONS_MSGID = "x_terms_conditions_msgid";
    public static final String X_ONLINE_DESCRIPTION_MSGID = "x_online_desc_msgid";
    public static final String X_ONLINE_MSGID = "x_online_msgid";
    public static final String X_IS_CROSS_SELL_PROMO = "x_is_cross_sell_promo";
    public static final String X_IS_PROMO_CUMULATIVE = "x_is_promo_cumulative";
    public static final String X_IS_ULTIMATE_BUNDLE_PROMO = "x_is_ultimate_bundle_promo";
    private static final String X_BASE_PRICE_PROMO = "x_base_price_promo";
    private static final String X_PROMO_SUBTYPE = "x_promo_subtype";
    public static final String ONE_STRING = "1";

    private static Log LOG = LogFactory.getLog(CampaignInfoVo.class);

    private String objid;
    private String camType;
    private Date startDate;
    private Date endDate;
    private String description;

    private String name;
    private String status;
    private String childRedmp2Campaign;
    private Integer precedence;
    private String smsKeyword;

    private String xDescription;
    private String discountCategoryCode;
    private String auditOperation;

    private Integer capacityAllowed;
    private String capacityPeriod;
    
    private boolean hasWhilteList = false;
    
    private String externalPromoCode;
	private Integer externalPromoVersion;
	
	private CampaignSubType subType;

	private List<XCampaignBenefitInfoVo> benefits = new ArrayList<>();
    private List<XCampaignRuleInfoVo> rules = new ArrayList<>();
    private List<XCampaignMigrInfoVo> eligibleTransitions = new ArrayList<>();
    private List<XCampaignPartnerInfoVo> partners = new ArrayList<>();
    private List<String> exclusiveCampaignObjid = new ArrayList<>();

    // Key is an attribute name, value - attribute value
	private Map<String, String> faAttributes = new HashMap<>();
	private List<MessageInfoVo> messages = new ArrayList<>();

	public CampaignInfoVo() {}

    public CampaignInfoVo(CampaignInfoVo vo) {
        updateFields(vo);

        vo.getBenefits().forEach(xCampaignBenefitInfoVo -> benefits.add(new XCampaignBenefitInfoVo(xCampaignBenefitInfoVo)));
        vo.getRules().forEach(xCampaignRuleInfoVo -> rules.add(new XCampaignRuleInfoVo(xCampaignRuleInfoVo)));
        vo.getEligibleTransitions().forEach(xCampaignMigrInfoVo -> eligibleTransitions.add(new XCampaignMigrInfoVo(xCampaignMigrInfoVo)));
        vo.getPartners().forEach(xCampaignPartnerInfoVo -> partners.add(new XCampaignPartnerInfoVo(xCampaignPartnerInfoVo)));
        exclusiveCampaignObjid.addAll(Optional.ofNullable(vo.getExclusiveCampaignObjid()).orElse(Lists.newArrayList()));
        faAttributes.putAll(vo.getFaAttributes());
        vo.getMessages().forEach(message -> this.messages.add(new MessageInfoVo(message)));
    }

    public void updateFields(CampaignInfoVo vo) {
        this.objid = vo.getObjid();
        this.camType = vo.getCamType();
        this.startDate = vo.getStartDate();
        this.endDate = vo.getEndDate();
        this.description = vo.getDescription();
        this.name = vo.getName();
        this.status = vo.getStatus();
        this.childRedmp2Campaign = vo.getChildRedmp2Campaign();
        this.smsKeyword = vo.getSmsKeyword();
        this.xDescription = vo.getxDescription();
        this.discountCategoryCode = vo.getDiscountCategoryCode();
        this.precedence = vo.getPrecedence();
        this.auditOperation = vo.getAuditOperation();
        this.hasWhilteList = vo.isHasWhilteList();
        this.capacityAllowed = vo.getCapacityAllowed();
        this.capacityPeriod = vo.getCapacityPeriod();
        this.externalPromoCode = vo.getExternalPromoCode();
        this.externalPromoVersion = vo.getExternalPromoVersion();
        this.subType = vo.getSubType();
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getCamType() {
        return camType;
    }

    public void setCamType(String camType) {
        this.camType = camType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChildRedmp2Campaign() {
        return childRedmp2Campaign;
    }

    public void setChildRedmp2Campaign(String childRedmp2Campaign) {
        this.childRedmp2Campaign = childRedmp2Campaign;
    }

    public Integer getPrecedence() {
        return precedence;
    }

    public void setPrecedence(Integer precedence) {
        this.precedence = precedence;
    }

    public String getSmsKeyword() {
        return smsKeyword;
    }

    public void setSmsKeyword(String smsKeyword) {
        this.smsKeyword = smsKeyword;
    }

    public String getxDescription() {
        return xDescription;
    }

    public void setxDescription(String xDescription) {
        this.xDescription = xDescription;
    }

    public String getDiscountCategoryCode() {
        return discountCategoryCode;
    }

    public void setDiscountCategoryCode(String discountCategoryCode) {
        this.discountCategoryCode = discountCategoryCode;
    }

    public List<XCampaignBenefitInfoVo> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<XCampaignBenefitInfoVo> benefits) {
        this.benefits = benefits;
    }

    public List<XCampaignRuleInfoVo> getRules() {
        return rules;
    }

    public void setRules(List<XCampaignRuleInfoVo> rules) {
        this.rules = rules;
    }

    public List<XCampaignMigrInfoVo> getEligibleTransitions() {
        return eligibleTransitions;
    }

    public void setEligibleTransitions(List<XCampaignMigrInfoVo> eligibleTransitions) {
        this.eligibleTransitions = eligibleTransitions;
    }

    public String getAuditOperation() {
        return auditOperation;
    }

    public void setAuditOperation(String auditOperation) {
        this.auditOperation = auditOperation;
    }

    public List<XCampaignPartnerInfoVo> getPartners() {
        return partners;
    }

    public void setPartners(List<XCampaignPartnerInfoVo> partners) {
        this.partners = partners;
    }

    public boolean isHasWhilteList() {
		return hasWhilteList;
	}

	public void setHasWhilteList(boolean hasWhilteList) {
		this.hasWhilteList = hasWhilteList;
	}

    public Integer getCapacityAllowed() {
        return capacityAllowed;
    }

    public void setCapacityAllowed(Integer capacityAllowed) {
        this.capacityAllowed = capacityAllowed;
    }

    public String getCapacityPeriod() {
        return capacityPeriod;
    }

    public void setCapacityPeriod(String capacityPeriod) {
        this.capacityPeriod = capacityPeriod;
    }

    public Map<String, String> getFaAttributes() {
        return faAttributes;
    }

    public void setFaAttributes(Map<String, String> faAttributes) {
        this.faAttributes = faAttributes;
    }

    public boolean getIsUniqueCampaign() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_IS_UNIQUE_CAMPAIGN, CrmStringUtil.EMPTY));
    }

    public boolean isSubsidizedService() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_IS_SUBSIDIZED_SERVICE, CrmStringUtil.EMPTY));
    }

    public boolean isifrs15() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_IS_IFRS_15, CrmStringUtil.EMPTY));
    }

    public boolean isRerunnable() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_IS_RERUNNABLE, CrmStringUtil.EMPTY));
    }
    public boolean isUltimateBundlePromo() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_IS_ULTIMATE_BUNDLE_PROMO, CrmStringUtil.EMPTY));
    }

    public String getBasePricePromo(){
        return faAttributes.getOrDefault(X_BASE_PRICE_PROMO, CrmStringUtil.EMPTY);
    }

    public boolean hasHardware() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_HAS_HARDWARE, CrmStringUtil.EMPTY));
    }
    
    public String getXNextPromoName() {
        return faAttributes.getOrDefault(X_NEXT_PROMO_NAME, CrmStringUtil.EMPTY);
    }

    public final int getActivationMessageId() {
        String field = faAttributes.getOrDefault(X_ACTIVATION_MSGID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public int getVoucherOpenFor(){
        String field = faAttributes.getOrDefault(X_IS_VOUCHER_OPEN_FOR_ALL, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public final int getXNoticePeriod() {
        String field = faAttributes.getOrDefault(X_NOTICE_PERIOD, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public boolean isDowngradePromo() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_IS_DOWNGRADE_PROMO, CrmStringUtil.EMPTY));
    }

    public boolean isSuppressEtf() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_SUPPRESS_ETF, CrmStringUtil.EMPTY));
    }

    public int getBindingPeriod() {
        String field = faAttributes.getOrDefault(X_BINDING_PERIOD, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public String getDowngradeFee() {
        return faAttributes.getOrDefault(X_DOWNGRADE_FEE, CrmStringUtil.EMPTY);
    }

    public int getInteractionConfigId() {
        String field = faAttributes.getOrDefault(X_INTERACTION_CONFIG_ID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public String getApplicableOn() {
        return faAttributes.getOrDefault(X_APPLICABLE_ON, CrmStringUtil.EMPTY);
    }

    public String getVoucherValidity() {
        return faAttributes.getOrDefault(X_VOUCHER_VALIDITY, CrmStringUtil.EMPTY);
    }

    public boolean isHwDeliverTogether() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_HW_DELIVER_TOGETHER, CrmStringUtil.EMPTY));
    }

    public String getHwDeliveryType() {
        return faAttributes.getOrDefault(X_HW_DELIVERY_TYPE, CrmStringUtil.EMPTY);
    }

    public final boolean shouldSendExtraSim() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_SEND_EXTRA_SIM, CrmStringUtil.EMPTY));
    }

    public final boolean isVoucherRequired() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_IS_VOUCHER_REQUIRED, CrmStringUtil.EMPTY));
    }

    public int getFlashMonthAct() {
        String field = faAttributes.getOrDefault(X_FLASH_MONTH_ACT, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public final int getBillingMessageId() {
        String field = faAttributes.getOrDefault(X_BILLING_MSGID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public int getDescriptionMsgId() {
        String field = faAttributes.getOrDefault(X_DESCR_MSGID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public int getEtfConditionsDescriptionMsgId() {
        String field = faAttributes.getOrDefault(X_TERMS_CONDITIONS_ETF_MSGID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public int getOnlineDescriptionMsgId() {
        String field = faAttributes.getOrDefault(X_ONLINE_DESCRIPTION_MSGID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public int getOnlineMsgId() {
        String field = faAttributes.getOrDefault(X_ONLINE_MSGID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public int getConditionsDescriptionMsgId() {
        String field = faAttributes.getOrDefault(X_TERMS_CONDITIONS_MSGID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }


    public boolean getAddRelatedOption() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_ADD_RELATED_OPTION, CrmStringUtil.EMPTY));
    }

    public int getDeinstallNotificationDays() {
        String field = faAttributes.getOrDefault(NOTIFY_DAYS_BEFORE, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public int getFlashMsgId() {
        String field = faAttributes.getOrDefault(X_FLASH_MSGID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public String getCashbackAmount() {
        return faAttributes.getOrDefault(X_CASHBACK_AMOUNT, CrmStringUtil.EMPTY);
    }

    public boolean getCashbackVatApplicable() {
        return ONE_STRING.equals(faAttributes.getOrDefault(X_CASHBACK_VAT_APPLICABLE, CrmStringUtil.EMPTY));
    }

    public final int getDeactivationMessageId() {
        String field = faAttributes.getOrDefault(X_DEACTIVATION_MSGID, CrmStringUtil.EMPTY);
        if (CrmStringUtil.isBlank(field)) {
            return 0;
        }
        return Integer.decode(field);
    }

    public List<String> getExclusiveCampaignObjid() {
        return exclusiveCampaignObjid;
    }

    public void setExclusiveCampaignObjid(List<String> exclusiveCampaignObjid) {
	    if(exclusiveCampaignObjid == null) {
            this.exclusiveCampaignObjid = new ArrayList<>();
        } else {
            this.exclusiveCampaignObjid = exclusiveCampaignObjid;
        }
    }

    /**
     * Checks whether current campaign (current row in campaignDa) is compatible with all already installed on the product campaigns.
     * @param installedCampaigns - list of campaign objids, installed on the product.
     * @return false, when campaign is Unique and there is at least one item in installedCampaigns
     * OR when current campaign is configured to be not compatible with one or more campaigns in provided list.
     * Otherwise - true is returned.
     */
    public final boolean isCompatibleWith(List<String> installedCampaigns){
        if (this.getIsUniqueCampaign()){
            return !(installedCampaigns != null && !installedCampaigns.isEmpty());
        }
        if (installedCampaigns == null || installedCampaigns.isEmpty()){
            return true;
        }
        if (this.exclusiveCampaignObjid != null) {
            for (String exclCampaign : this.exclusiveCampaignObjid) {
                if (installedCampaigns.contains(exclCampaign)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public boolean isSwissWide() {
        List<XCampaignPartnerInfoVo> p = getPartners();
        if (p != null) {
            for (XCampaignPartnerInfoVo partner : p) {
                if (!"Site Category".equals(partner.getType())) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<MessageInfoVo> getMessagesByName(String messageName) {
        return messages.stream().filter(message -> message.getMessageName().equals(messageName)).collect(Collectors.toList());
    }
    public MessageInfoVo getMessageByNameAndLanguage(String messageName, String language) {
        return messages.stream()
                .filter(message -> message.getMessageName().equals(messageName))
                .filter(message -> message.getLanguage().equals(language))
                .findFirst().orElse(null);
    }

    public List<MessageInfoVo> getMessages() {
        return messages;
    }

    public boolean ofType(CampaignType ... types) {
        return Stream.of(types).anyMatch(type -> type.getDisplayValue().equals(this.camType));
    }

    public boolean notOfType(CampaignType ... types) {
        return !ofType(types);
    }

    public boolean isCrossSellPromo() {
        Map<String, String> faAttributes = getFaAttributes();
        return ONE_STRING.equals(faAttributes.get(X_IS_CROSS_SELL_PROMO));
    }

    public boolean isPromoCumulative() {
        Map<String, String> faAttributes = getFaAttributes();
        return ONE_STRING.equals(faAttributes.get(X_IS_PROMO_CUMULATIVE));
    }
    
    public String getExternalPromoCode() {
		return externalPromoCode;
	}

	public void setExternalPromoCode(String externalPromoCode) {
		this.externalPromoCode = externalPromoCode;
	}

	public Integer getExternalPromoVersion() {
		return externalPromoVersion;
	}

	public void setExternalPromoVersion(Integer externalPromoVersion) {
		this.externalPromoVersion = externalPromoVersion;
	}

	public CampaignSubType getSubType() {
		if (subType != null){
			return subType;
		}
		String faSubType = faAttributes.getOrDefault(X_PROMO_SUBTYPE, CrmStringUtil.EMPTY);
		if (CrmStringUtil.isNotBlank(faSubType)){
			subType = CampaignSubType.fromDisplayValue(faSubType);
		}
		return subType;
	}

	public void setSubType(CampaignSubType subType) {
		this.subType = subType;
	}

	/**
     * Sorts all field lists in ascending objid order
     */
	public CampaignInfoVo normalize() {
        benefits.sort(Comparator.comparing(XCampaignBenefitInfoVo::getObjid));
        for (XCampaignBenefitInfoVo benefit : benefits) {
            benefit.normalize();
        }
        rules.sort(Comparator.comparing(XCampaignRuleInfoVo::getObjid));
        eligibleTransitions.sort(Comparator.comparing(XCampaignMigrInfoVo::getObjid));
        partners.sort(Comparator.comparing(XCampaignPartnerInfoVo::getObjid));
        if (exclusiveCampaignObjid != null) {
            exclusiveCampaignObjid.sort(Comparator.comparing(s -> s));
        }
        messages.sort(Comparator.comparing(MessageInfoVo::getMessageId).thenComparing(MessageInfoVo::getLanguage));
        return this;
    }

}
