package sunrise.crm.xvo.product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sunrise.crm.ProductAttribute;
import sunrise.crm.domain.enums.PartType;
import sunrise.crm.domain.enums.ProductType;
import sunrise.crm.util.CrmStringUtil;

/**
 * Class Product Info.
 *
 * TODO: When constructor with VO is used, collections will not appear in the Execution Context.
 * Needs to be fixed in the Execution Context explicitly.
 * Pending orders, installed options, attributes etc.
 */
public class ProductInfoVo {

    private static final String CAMPAIGN_NAME = "Campaign Name";

	private static Log LOG = LogFactory.getLog(ProductInfoVo.class);

    private String siteObjid;
    private String topSitePartObjid;
    private String topSitePartInstanceName;
    private String topSitePartStatus;
    private String topSitePartSubStatus;
	private String serialNo;
    private String ipObjid;
    private String ipId;
    private int ipDuration;
    private String partNumber;
    private String partDomain;
    private String productName;

	// These 3 values are only set on the child products.
	private String parentIpId;
	private String parentIpObjid;
    private String ipContractRole;

    private String orderIndex;
    private boolean markAsFirst;
    private boolean orderedAsFirst;
    private boolean basketProduct;

    private boolean isAnyToWeMobileMigration;
    private boolean isUpMultiMobileEnabler;

    private Calendar ipStartDate;
    private Calendar ipExpireDate;
    private Calendar installDate;
    private Calendar activationDate;


    private static final List<String> SKIP_FOR_EQUALS = Arrays.asList(
            "Subscriber Info",
            "Shipping Info",
            "Address",
            "Contact Information",
            "PromoInnotixDocumentCode",
            "IFRS Type"
    );

    /**
     * Product level attributes with values
     */
    private List<ProductAttributeInfoVo> attributes = new ArrayList<>();

    /**
     * Active options with level > 1 and < 999
     * Key - site part objid
     */
    private Map<String, ProductOptionInfoVo> optionsMap = new HashMap<>();

    /**
     * Key - order ID, Value - type of the pending order, like 'New', 'Modify', 'Conversion' etc. sunrise.crm.domain.enums.OrderType
     */
    private Map<String, OrderInfoVo> pendingOrders = new HashMap<>();
    private OrderInfoVo creationOrder = new OrderInfoVo();

    public ProductInfoVo() {
    }

    public ProductInfoVo(ProductInfoVo productInfoVo) {
        this.installDate = productInfoVo.installDate;
        this.ipId = productInfoVo.ipId;
        this.ipObjid = productInfoVo.ipObjid;
        this.ipStartDate = productInfoVo.ipStartDate;
        this.ipExpireDate = productInfoVo.ipExpireDate;
        this.ipDuration = productInfoVo.ipDuration;
        this.partDomain = productInfoVo.partDomain;
        this.partNumber = productInfoVo.partNumber;
        this.productName = productInfoVo.productName;
        this.serialNo = productInfoVo.serialNo;
        this.siteObjid = productInfoVo.siteObjid;
        this.topSitePartInstanceName = productInfoVo.topSitePartInstanceName;
        this.topSitePartObjid = productInfoVo.topSitePartObjid;
        this.topSitePartStatus = productInfoVo.topSitePartStatus;
        this.orderIndex = productInfoVo.orderIndex;
        this.markAsFirst = productInfoVo.markAsFirst;
        this.orderedAsFirst = productInfoVo.orderedAsFirst;
        this.basketProduct = productInfoVo.basketProduct;
        this.isUpMultiMobileEnabler = productInfoVo.isUpMultiMobileEnabler;
        this.parentIpObjid = productInfoVo.getParentIpObjid();
        this.ipContractRole = productInfoVo.getIpContractRole();
        this.activationDate = productInfoVo.getActivationDate();
        
        if (!productInfoVo.getAllOptions().isEmpty()){
        	productInfoVo.getAllOptions().entrySet().forEach(entry -> {
        		optionsMap.put(entry.getKey(), new ProductOptionInfoVo(entry.getValue()));
        	});
        }
    }

    /**
     * @param productInfoVo
     * @param deepCopy      when false, collections like attributes and options are not deep copied.
     */
    public ProductInfoVo(ProductInfoVo productInfoVo, boolean deepCopy) {
        this(productInfoVo);
        if (deepCopy) {
            productInfoVo.getAllOptions().forEach((s, optionInfoVo) -> this.getAllOptions().put(s, new ProductOptionInfoVo(optionInfoVo)));
            this.getAllOptions().forEach((s, productOptionInfoVo) -> productOptionInfoVo.clearChildOptions());
            productInfoVo.getAllOptions().forEach((s, optionInfoVo) -> optionInfoVo.getChildOptions().forEach(childOption -> {
                this.getAllOptions().get(optionInfoVo.getSitePartObjid()).addChildOption(this.getAllOptions().get(childOption.getSitePartObjid()));
            }));
            this.pendingOrders = productInfoVo.getPendingOrders() == null ? null : clonePendingOrders(productInfoVo.getPendingOrders());
            this.attributes = productInfoVo.attributes.stream().map(ProductAttributeInfoVo::new).collect(Collectors.toList());
            if (productInfoVo.getCreationOrder() == null) {
                this.creationOrder = new OrderInfoVo();
            } else {
                this.creationOrder = new OrderInfoVo(productInfoVo.getCreationOrder());
            }
        }
    }


    private Map<String, OrderInfoVo> clonePendingOrders(Map<String, OrderInfoVo> in) {
        Map<String, OrderInfoVo> ret = new HashMap<>();
        for (Entry<String, OrderInfoVo> entries : in.entrySet()) {
            ret.put(entries.getKey(), new OrderInfoVo(entries.getValue()));
        }
        return ret;
    }

    public boolean addOption(ProductOptionInfoVo option) {
        if (option == null || option.getParentSitePartObjid().isEmpty()) {
            return false;
        }

        optionsMap.putIfAbsent(option.getSitePartObjid(), option);

        if (option.getParentSitePartObjid().size() == 1) {
            String parentObjid = option.getParentSitePartObjid().get(0);
            ProductOptionInfoVo parent = optionsMap.get(parentObjid);
            if (parent != null && parent.getChildOptions().stream().noneMatch(child -> child.getSitePartObjid().equals(option.getSitePartObjid()))) {
                parent.addChildOption(option);
            }
        } else if (option.getParentSitePartObjid().size() > 1) {
            List<ProductOptionInfoVo> nonZeroCharges = optionsMap.values().stream()
                    .filter(opt -> option.getParentSitePartObjid().contains(opt.getSitePartObjid()))
                    //.filter(parentOption -> parentOption.getChildOptions().stream().noneMatch(child -> child.getSitePartObjid().equals(option.getSitePartObjid())))
                    //.filter(parentOption -> parentOption.getRecurringCharge().compareTo(BigDecimal.ZERO) > 0)
                    .collect(Collectors.toList());
            nonZeroCharges.forEach(charge -> {
                charge.addChildOption(splitDiscount(nonZeroCharges, charge, option));
            });
        }
        return true;
    }

    /**
     * Splits full amount of discount to parts corresponding to all charges it is related to
     * New options (parts) should not be CRM or billing provisioned
     * @param charges all non-zero charges
     * @param charge current charge
     * @param discount original discount
     * @return
     */
    public static ProductOptionInfoVo splitDiscount(List<ProductOptionInfoVo> charges, ProductOptionInfoVo charge, ProductOptionInfoVo discount) {
        if (charges.size() < 2) {
            return discount;
        } else {
            // If charge has empty action, then we should sum up the changes with empty actions and %Add.
            // If charge has Delete action, then we should sum up the changes with Delete actions only.
            boolean isAddAction = CrmStringUtil.isEmpty(charge.getActionType()) || charge.getActionType().endsWith("Add");

            ProductOptionInfoVo discountPart = new ProductOptionInfoVo(discount);
            if (charge.hasRecurringCharge()) {
                BigDecimal chargeTotal = BigDecimal.ZERO;
                for (ProductOptionInfoVo c : charges) {
                    boolean isAddActionC = CrmStringUtil.isEmpty(c.getActionType()) || c.getActionType().endsWith("Add");
                    if (isAddAction && isAddActionC || !isAddAction && !isAddActionC) {
                        chargeTotal = chargeTotal.add(c.getRecurringCharge());
                    }
                }
                if (chargeTotal.compareTo(BigDecimal.ZERO) > 0) {
                    // TODO: 99713 - this is a hack, which needs to be properly fixed. Issue is that pricing engine was not run yet, thus recurring price is not set.
                    if (discount.getRecurringCharge() != null) {
                        BigDecimal chargePart = (discount.getRecurringCharge().multiply(charge.getRecurringCharge()).divide(chargeTotal, 2, RoundingMode.HALF_UP));
                        discountPart.setRecurringCharge(chargePart);
                    }
                }
            }
            if (charge.hasOneTimeCharge()) {
                BigDecimal chargeTotal = BigDecimal.ZERO;
                for (ProductOptionInfoVo c : charges) {
                    boolean isAddActionC = CrmStringUtil.isEmpty(c.getActionType()) || c.getActionType().endsWith("Add");
                    if (isAddAction && isAddActionC || !isAddAction && !isAddActionC) {
                        chargeTotal = chargeTotal.add(c.getOneTimeCharge());
                    }
                }
                if (chargeTotal.compareTo(BigDecimal.ZERO) > 0) {
                    // TODO: 99713 - this is a hack, which needs to be properly fixed. Issue is that pricing engine was not run yet, thus recurring price is not set.
                    if (discount.getOneTimeCharge() != null) {
                        BigDecimal chargePart = (discount.getOneTimeCharge().multiply(charge.getOneTimeCharge()).divide(chargeTotal, 2, RoundingMode.HALF_UP));
                        discountPart.setOneTimeCharge(chargePart);
                    }
                }

            }

            return discountPart;
        }
    }

    public boolean addAttribute(ProductAttributeInfoVo attribute) {
        if (attribute == null || CrmStringUtil.isEmpty(attribute.getSitePartObjid())) {
            return false;
        }

        // add to product if it is product level attribute
        String sitePartObjid = attribute.getSitePartObjid();
        if (sitePartObjid.equals(topSitePartObjid)) {
            attributes.add(attribute);
            return true;
        }

        if (optionsMap.containsKey(sitePartObjid)) {
            optionsMap.get(sitePartObjid).addAttribute(attribute);
            return true;
        }
        return false;
    }

    public List<ProductAttributeInfoVo> getAttributes() {
        return attributes;
    }

    public boolean hasItem(String itemName) {
        return optionsMap.values().stream().anyMatch(vo -> itemName.equals(vo.getInstanceName()));
    }

    public boolean hasItem(String partName, String attrName, String... attrValues) {
        List<String> attrValuesList = Arrays.asList(attrValues);
        return optionsMap.values().stream()
                .filter(val -> partName.equals(val.getInstanceName()))
                .flatMap(val -> val.getAttributes().stream())
                .anyMatch(val -> attrName.equals(val.getAttributeName())
                        && attrValuesList.contains(val.getAttributeValue()));
    }

    public boolean hasItemWithSerial(String partName, String partSerialNumber) {
        return optionsMap.values().stream().anyMatch(p -> partSerialNumber.equals(p.getSerialNo()));
    }

    public ProductOptionInfoVo getItem(String itemName) {
        return optionsMap.values().stream().filter(vo -> itemName.equals(vo.getInstanceName())).findFirst().orElse(null);
    }

    public boolean hasItemWithoutAction(String itemName) {
        return optionsMap.values().stream().anyMatch(vo -> itemName.equals(vo.getInstanceName()) && CrmStringUtil.isEmpty(vo.getActionType()));
    }

    public ProductOptionInfoVo getItemWithoutAction(String itemName) {
        return optionsMap.values().stream().filter(vo -> itemName.equals(vo.getInstanceName()) && CrmStringUtil.isEmpty(vo.getActionType())).findFirst().orElse(null);
    }

    public String getItemAttribute(String itemName, String attributeName) {
        ProductOptionInfoVo vo = getItem(itemName);
        if (vo != null) {
            return vo.getAttributeValue(attributeName);
        }
        return null;
    }

    public String getProductAttribute(String attributeName) {
        ProductAttributeInfoVo attrVo = attributes.stream().filter(vo -> attributeName.equalsIgnoreCase(vo.getAttributeName())).findFirst().orElse(null);
        return attrVo == null ? null : attrVo.getAttributeValue();
    }

    public void setProductAttributeValue(String attributeName, String attributeValue) {
        ProductAttributeInfoVo attrVo = attributes.stream().filter(vo -> attributeName.equalsIgnoreCase(vo.getAttributeName())).findFirst().orElse(null);
        if (attrVo != null){
        	attrVo.setAttributeValue(attributeValue);
        }else{
        	ProductAttributeInfoVo attr = new ProductAttributeInfoVo();
        	attr.setAttributeName(attributeName);
        	attr.setAttributeValue(attributeValue);
        	attributes.add(attr);
        }
    }

    public List<ProductOptionInfoVo> getItems(String itemName) {
        return optionsMap.values().stream().filter(opt -> opt.getInstanceName().equals(itemName)).collect(Collectors.toList());
    }

    public final boolean hasPendingOrders(String excludeOrder, String orderType) {
        List<OrderInfoVo> pendOrders = pendingOrders.values().stream()
                .filter(val -> val.getType().equals(orderType))
                .collect(Collectors.toList());
        if (pendOrders.isEmpty()) {
            return false;
        }
        List<String> orderIds = pendOrders.stream()
                .map(OrderInfoVo::getOrderId)
                .collect(Collectors.toList());
        if (excludeOrder == null || !orderIds.contains(excludeOrder)) {
            // if no exclusion or if the list doesn't contain the exclusion that has pending.
            return true;
		}
		return pendOrders.size() > 1; // ToDo check
	}

	/**
	 * TODO: Move PartType enum from crmDataAccess to crmSmartClientCommon
	 * @param partTypes
	 * @return
	 */
    public List<ProductOptionInfoVo> getChildrenByPartTypes(String... partTypes) {
        if (partTypes == null || partTypes[0] == null) {
            return new ArrayList<>();
        }
        List<String> pt = Arrays.asList(partTypes);
        return optionsMap.values().stream().filter(opt -> pt.contains(opt.getPartType()) && (opt.getActionType() == null || !opt.getActionType().endsWith("Delete"))).collect(Collectors.toList());
    }

    /**
     * Key - site part objid, value - site part vo
     *
     * @return
     */
    public Map<String, ProductOptionInfoVo> getAllOptions() {
        return optionsMap;
    }

    public List<ProductOptionInfoVo> getActiveOptions() {
        return optionsMap.values().stream().filter(option -> option.getActionType() == null || !option.getActionType().endsWith("Delete"))
                .collect(Collectors.toList());
    }

    /**
     * It should return collection of charges, each of them should also have 0 or more child discounts.
     * @return
     */
    public List<ProductOptionInfoVo> getActiveBillableOptions() {
        return getActiveOptions().stream()
        		.filter(option -> PartType.RATE_PLAN.toString().equals(option.getPartType()) || PartType.OPTION.toString().equals(option.getPartType()))
                .collect(Collectors.toList());
    }

    /**
     * Key - site part objid, value - site part vo
     *
     * @param optionsMap
     */
    public void setOptionsMap(Map<String, ProductOptionInfoVo> optionsMap) {
        this.optionsMap = optionsMap;
    }

    public String getSiteObjid() {
        return siteObjid;
    }

    public void setSiteObjid(String siteObjid) {
        this.siteObjid = siteObjid;
    }

    public String getTopSitePartObjid() {
        return topSitePartObjid;
    }

    public void setTopSitePartObjid(String topSitePartObjid) {
        this.topSitePartObjid = topSitePartObjid;
    }

    public String getTopSitePartInstanceName() {
        return topSitePartInstanceName;
    }

    public void setTopSitePartInstanceName(String topSitePartInstanceName) {
        this.topSitePartInstanceName = topSitePartInstanceName;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getIpObjid() {
        return ipObjid;
    }

    public void setIpObjid(String ipObjid) {
        this.ipObjid = ipObjid;
    }

    public String getIpId() {
        return ipId;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public String getCreationOrderObjid() {
        return creationOrder.getObjid();
    }

    public void setCreationOrderObjid(String creationOrderObjid) {
        creationOrder.setObjid(creationOrderObjid);
    }

    public String getCreationOrderId() {
        return creationOrder.getOrderId();
    }

    public void setCreationOrderId(String creationOrderId) {
        creationOrder.setOrderId(creationOrderId);
    }

    public String getCreationOrderStatus() {
        return creationOrder.getStatus();
    }

    public void setCreationOrderStatus(String creationOrderStatus) {
        creationOrder.setStatus(creationOrderStatus);
    }

    public String getTopSitePartStatus() {
        return topSitePartStatus;
    }

    public void setTopSitePartStatus(String topSitePartStatus) {
        this.topSitePartStatus = topSitePartStatus;
    }

    public String getTopSitePartSubStatus() {
		return topSitePartSubStatus;
	}

	public void setTopSitePartSubStatus(String topSitePartSubStatus) {
		this.topSitePartSubStatus = topSitePartSubStatus;
	}

    public boolean hasIp() {
        return CrmStringUtil.isNotEmpty(ipId);
    }

    public ProductType getProductType() {
        try {
            return ProductType.fromDisplayValue(topSitePartInstanceName);
        } catch (Exception e) {
            return null;
        }
    }

    public String getCreationOrderType() {
        return creationOrder.getType();
    }

    public void setCreationOrderType(String creationOrderType) {
        creationOrder.setType(creationOrderType);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDomain() {
        return partDomain;
    }


    public void setPartDomain(String partDomain) {
        this.partDomain = partDomain;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public Calendar getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Calendar installDate) {
        this.installDate = installDate;
    }

    public Calendar getIpStartDate() {
        return ipStartDate;
    }

    public void setIpStartDate(Calendar ipStartDate) {
        this.ipStartDate = ipStartDate;
    }

    public Calendar getIpExpireDate() {
        return ipExpireDate;
    }

    public void setIpExpireDate(Calendar ipExpireDate) {
        this.ipExpireDate = ipExpireDate;
    }

    public int getIpDuration() {
        return ipDuration;
    }

    public void setIpDuration(int ipDuration) {
        this.ipDuration = ipDuration;
    }

    /**
     * Key - order ID, Value - OrderInfoVo, type of the pending order, like 'New', 'Modify', 'Conversion' etc. sunrise.crm.domain.enums.OrderType
     *
     * @return
     */
    public Map<String, OrderInfoVo> getPendingOrders() {
        return pendingOrders;
    }

    /**
     * Key - order ID, Value - OrderInfoVo, type of the pending order, like 'New', 'Modify', 'Conversion' etc. sunrise.crm.domain.enums.OrderType
     *
     * @param pendingOrders
     */
    public void setPendingOrders(Map<String, OrderInfoVo> pendingOrders) {
        this.pendingOrders = pendingOrders;
    }

    public String getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(String orderIndex) {
        this.orderIndex = orderIndex;
    }

    public void setMarkAsFirst(boolean markAsFirst) {
        this.markAsFirst = markAsFirst;
    }

    public boolean getMarkAsFirst() {
        return markAsFirst;
    }

    public boolean getOrderedAsFirst() {
        return orderedAsFirst;
    }

    public void setOrderedAsFirst(boolean orderedAsFirst) {
        this.orderedAsFirst = orderedAsFirst;
    }

    public List<ProductOptionInfoVo> getRemovedOptions() {
        return optionsMap.values().stream().filter(option -> CrmStringUtil.isNotEmpty(option.getActionType()) && option.getActionType().endsWith("Delete")).collect(Collectors.toList());
    }

    public boolean hasItem(String itemName, String action) {
        return optionsMap.values().stream().anyMatch(option -> Objects.equals(option.getInstanceName(), itemName) && Objects.equals(option.getActionType(), action));
    }

    public List<ProductOptionInfoVo> getItemsByPartNumAndAction(List<String> actions, List<String> promotionalDiscounts) {
        return optionsMap.values().stream().filter(option -> actions.contains(option.getActionType()) && promotionalDiscounts.contains(option.getInstanceName())).collect(Collectors.toList());
    }

    public List<ProductOptionInfoVo> getItemsByPartNumAndNotAction(List<String> partNums, List<String> actions) {
        return optionsMap.values().stream().filter(option -> !actions.contains(option.getActionType()) && partNums.contains(option.getInstanceName())).collect(Collectors.toList());
    }

    public boolean isBasketProduct() {
        return basketProduct;
    }

    public void setBasketProduct(boolean basketProduct) {
        this.basketProduct = basketProduct;
    }

    public boolean isNew() {
        return topSitePartObjid != null && topSitePartObjid.contains("NEW");
    }

    public OrderInfoVo getCreationOrder() {
        return creationOrder;
    }

    public void setCreationOrder(OrderInfoVo creationOrder) {
        if (creationOrder == null) {
            this.creationOrder = new OrderInfoVo();
        } else {
            this.creationOrder = creationOrder;
        }
    }

    public boolean isUpMultiMobileEnabler() {
        return isUpMultiMobileEnabler;
    }

    public void setUpMultiMobileEnabler(boolean upMultiMobileEnabler) {
        isUpMultiMobileEnabler = upMultiMobileEnabler;
    }

    public String getParentIpObjid() {
		return parentIpObjid;
	}

	public void setParentIpObjid(String parentIpObjid) {
		this.parentIpObjid = parentIpObjid;
	}

	public String getParentIpId() {
		return parentIpId;
	}

	public void setParentIpId(String parentIpId) {
		this.parentIpId = parentIpId;
	}

	public String getIpContractRole() {
		return ipContractRole;
	}

	public void setIpContractRole(String ipContractRole) {
		this.ipContractRole = ipContractRole;
	}

    public Calendar getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Calendar activationDate) {
		this.activationDate = activationDate;
	}

    @Override
    public String toString() {
        StringBuilder optionsMapString = new StringBuilder();
        for (ProductOptionInfoVo productOptionInfoVo: optionsMap.values())
        {
            optionsMapString.append(productOptionInfoVo).append("\n");
        }
        return
                new StringBuilder()
                        .append("ProductInfoVo [").append("\n")
                        .append("productName = ").append(productName).append("\n")
                        .append("serialNo = ").append(serialNo).append("\n")
                        .append("ipId = ").append(ipId).append("\n")
                        .append("topSitePartInstanceName = ").append(topSitePartInstanceName).append("\n")
                        .append("topSitePartObjid = ").append(topSitePartObjid).append("\n")
                        .append("optionsMap = ").append(optionsMapString)
                        .append("siteObjid = ").append(siteObjid).append("\n")
                        .append("topSitePartStatus = ").append(topSitePartStatus).append("\n")
                        .append("ipObjid = ").append(ipObjid).append("\n")
                        .append("ipStartDate = ").append(ipStartDate == null ? "null" : ipStartDate.getTime()).append("\n")
                        .append("ipExpireDate = ").append(ipExpireDate == null ? "null" : ipExpireDate.getTime()).append("\n")
                        .append("ipDuration = ").append(ipDuration).append("\n")
                        .append("partNumber = ").append(partNumber).append("\n")
                        .append("partDomain = ").append(partDomain).append("\n")
                        .append("installDate = ").append(installDate == null ? "null" : installDate.getTime()).append("\n")
                        .append("attributes = ").append(attributes).append("\n")
                        .append("orderIndex = ").append(orderIndex).append("\n")
                        .append("markAsFirst = ").append(markAsFirst).append("\n")
                        .append("orderedAsFirst = ").append(orderedAsFirst).append("\n")
                        .append("basketProduct = ").append(basketProduct).append("\n")
                        .append("pendingOrders = ").append(pendingOrders).append("\n")
                        .append("creationOrder = ").append(creationOrder).append("\n")
                        .append("]")
                        .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInfoVo productInfoVo = (ProductInfoVo) o;

        if (!Objects.equals(this.topSitePartObjid, productInfoVo.topSitePartObjid)) {
            return false;
        }
        return true;
    }

    private List<ProductOptionInfoVo> sortingOptionsMapByInstanceNameAndActionType(Map<String, ProductOptionInfoVo> optionsMap
            , List<String> campaigns ) {
        return optionsMap.values().stream()
                .filter(productOptionInfoVo -> ! SKIP_FOR_EQUALS.contains(productOptionInfoVo.getInstanceName())
                && campaigns.contains(productOptionInfoVo.getAttributeValue(CAMPAIGN_NAME)))
                .sorted(Comparator.comparing(ProductOptionInfoVo::getInstanceName, Comparator.nullsFirst(Comparator.naturalOrder()))
                        .thenComparing(ProductOptionInfoVo::getActionType, Comparator.nullsFirst(Comparator.naturalOrder()))
                        .thenComparing(productOptionInfoVo -> productOptionInfoVo.getAttributeValue(CAMPAIGN_NAME), Comparator.nullsFirst(Comparator.naturalOrder()))
                )
                .collect(Collectors.toList());
    }


    private List<ProductAttributeInfoVo> sortingAttributesByAttributeNameAndAttributeValue(List<ProductAttributeInfoVo> attributes){
        return attributes.stream()
                .filter(productAttributeInfoVo -> ! SKIP_FOR_EQUALS.contains(productAttributeInfoVo.getAttributeName()))
                .sorted(Comparator.comparing(ProductAttributeInfoVo::getAttributeName, Comparator.nullsFirst(Comparator.naturalOrder()))
                        .thenComparing(ProductAttributeInfoVo::getAttributeValue))
                .collect(Collectors.toList());
    }


    private List<String> campaignFilter(Map<String, ProductOptionInfoVo> optionsMap){
        List<String> campaigns = new ArrayList<>();
optionsMap.values().stream().filter(productOptionInfoVo -> productOptionInfoVo.getAttributeValue(CAMPAIGN_NAME) != null)
        .filter(productOptionInfoVo -> ! campaigns.contains(productOptionInfoVo.getAttributeValue(CAMPAIGN_NAME)))
        .forEach(productOptionInfoVo -> campaigns.add(productOptionInfoVo.getAttributeValue(CAMPAIGN_NAME)));
        return campaigns;
    }

    @Override
    public int hashCode() {
        return Objects.hash(topSitePartObjid);
    }

    public boolean isAnyToWeMobileMigration() {
        return isAnyToWeMobileMigration;
    }

    public void setAnyToWeMobileMigration(boolean anyToWeMobileMigration) {
        this.isAnyToWeMobileMigration = anyToWeMobileMigration;
    }

    public boolean hasRatePlanChangePendingOrder() {
        return pendingOrders.values().stream().anyMatch(pendingOrder ->
                ! pendingOrder.isBillingProvisioningDone() && pendingOrder.isRateplanChange());
    }

    public boolean hasActiveItem(String name) {
        return optionsMap.values().stream().anyMatch(option -> name.equals(option.getInstanceName()) && (option.getActionType() == null || !option.getActionType().endsWith("Delete")));
    }
    public ProductOptionInfoVo getActiveItem(String name) {
        return optionsMap.values().stream().filter(option -> name.equals(option.getInstanceName()) && (option.getActionType() == null || !option.getActionType().endsWith("Delete")))
                .findFirst().orElse(null);
    }

    /**
     * Part Type is mandatory
     * Part Classification is optional, can be empty
     */
    public List<ProductOptionInfoVo> getAllItemsByPartTypeAndClass(PartType partType, List<String> partClass) {
        return optionsMap.values().stream()
                .filter(opt -> partType.getDisplayValue().equals(opt.getPartType()))
                .filter(opt -> partClass == null || partClass.isEmpty() || partClass.contains(opt.getPartClassification()))
                .collect(Collectors.toList());
    }
    
    public boolean hasItem(List<String> itemNames) {
        return optionsMap.values().stream().anyMatch(vo -> itemNames.contains(vo.getInstanceName()));
    }

    public List<ProductOptionInfoVo> getItems(List<String> itemNames) {
        return optionsMap.values().stream().filter(vo -> itemNames.contains(vo.getInstanceName())).collect(Collectors.toList());
    }
    
    public String getAccessIdentifier() {
    	ProductOptionInfoVo talLine = getItem(ProductAttribute.PART_TAL_LINE);
    	if (talLine != null){
    		String nsn = talLine.getAttributeValue(ProductAttribute.ATTR_NSN);
    		if (CrmStringUtil.isNotBlank(nsn)){
    			return nsn;
    		}
    		String upk = talLine.getAttributeValue(ProductAttribute.ATTR_UPK);
    		if (CrmStringUtil.isNotBlank(upk)){
    			return upk;
    		}
    	}
    	return null;
    }
}
