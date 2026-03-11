package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;
import java.util.stream.Collectors;

public class OrderInfoDto {
    private static final String ATTR_CAMPAIGN_NAME = "Campaign Name";
	private String ineligibleReason;
    private List<AttributeDto> attributes = new ArrayList<>();
    private List<BaseItemDto> baseItems = new ArrayList<>();
    private String quotationId;
    private String orderIndex;
    private int errorCode;
    private String errorDescription;
    private String orderId;
    private boolean isChangeOwner;
    private boolean isOrderRemovesPromo;
    private boolean rateplanChange;
    private String orderAction;
    private boolean quotationOrder;
    private boolean closed;
    private boolean cancelled;
    private boolean clarifyOrder;
    private boolean orderEligible;
    private boolean isCease;
    private String ipId;
    private String newProduct;
    private boolean quotation;
    private String subjectObjid;
    private boolean transfer;
    private String ratePlanAction;
    private Date serviceChangeDate;
    private static Log log = LogFactory.getLog(OrderInfoDto.class);
    private static final List<String> SKIP_FOR_EQUALS = Arrays.asList(
            "Subscriber Info",
            "Shipping Info",
            "Address",
            "Contact Information",
            "PromoInnotixDocumentCode",
            "IFRS Type"
    );

    public AttributeDto getOrderAttribute(String attirbuteName) {
        return attributes.stream().filter(attributeDto -> attributeDto.getName().equals(attirbuteName)).findFirst().orElse(null);
    }

    public String getOrderAttributeValue(String attirbuteName) {
        return attributes.stream()
                .filter(attributeDto -> attributeDto.getName().equals(attirbuteName))
                .map(AttributeDto::getValue).findFirst().orElse(null);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    public List<AttributeDto> getAttributes() {
        return attributes;
    }

    public List<BaseItemDto> getBaseItems() {
        return baseItems;
    }

    public String getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(String quotationId) {
        this.quotationId = quotationId;
    }

    public void setOrderIndex(String orderIndex) {
        this.orderIndex = orderIndex;
    }

    public String getOrderIndex() {
        return orderIndex;
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

    public String getOrderAction() {
        return orderAction;
    }

    public void setOrderAction(String orderAction) {
        this.orderAction = orderAction;
    }

    public boolean isOrderRemovesPromo() {
        return isOrderRemovesPromo;
    }

    public void setOrderRemovesPromo(boolean orderRemovesPromo) {
        isOrderRemovesPromo = orderRemovesPromo;
    }

    public void setIsChangeOwner(boolean isChangeOwner) {
        this.isChangeOwner = isChangeOwner;
    }

    public boolean getIsChangeOwner() {
        return isChangeOwner;
    }

    public boolean hasItem(String partNumber, String... actions) {
        List<String> actionsList = Arrays.asList(actions);
        return baseItems.stream().anyMatch(item -> item.getName().equals(partNumber) && actionsList.contains(item.getAction()));
    }

    public boolean isRateplanChange() {
        return rateplanChange;
    }

    public void setRateplanChange(boolean rateplanChange) {
        this.rateplanChange = rateplanChange;
    }

    public boolean isQuotationOrder() {
        return quotationOrder;
    }

    public void setQuotationOrder(boolean quotationOrder) {
        this.quotationOrder = quotationOrder;
    }


    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isClarifyOrder() {
        return clarifyOrder;
    }

    public void setClarifyOrder(boolean clarifyOrder) {
        this.clarifyOrder = clarifyOrder;
    }

    public boolean isOrderEligible() {
        return orderEligible;
    }

    public void setOrderEligible(boolean orderEligible) {
        this.orderEligible = orderEligible;
    }

    public boolean isCease() {
        return isCease;
    }

    public void setCease(boolean cease) {
        isCease = cease;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public String getIpId() {
        return ipId;
    }

    public void setNewProduct(String newProduct) {
        this.newProduct = newProduct;
    }

    public String getNewProduct() {
        return newProduct;
    }

    public void setQuotation(boolean quotation) {
        this.quotation = quotation;
    }

    public boolean getQuotation() {
        return quotation;
    }

    public void setSubjectObjid(String subjectObjid) {
        this.subjectObjid = subjectObjid;
    }

    public String getSubjectObjid() {
        return subjectObjid;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public boolean getTransfer() {
        return transfer;
    }

    public String getIneligibleReason() {
        return ineligibleReason;
    }

    public void setIneligibleReason(String ineligibleReason) {
        this.ineligibleReason = ineligibleReason;
    }

    public String getRatePlanAction() {
		return ratePlanAction;
	}

	public void setRatePlanAction(String ratePlanAction) {
		this.ratePlanAction = ratePlanAction;
	}

	public Date getServiceChangeDate() {
		return serviceChangeDate;
	}

	public void setServiceChangeDate(Date serviceChangeDate) {
		this.serviceChangeDate = serviceChangeDate;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        OrderInfoDto orderInfoDto = (OrderInfoDto) o;

        if (!Objects.equals(this.ineligibleReason, orderInfoDto.ineligibleReason)) {
            log.debug("IneligibleReason is not equal.");
            return false;
        }
        if (!Objects.equals(this.quotationId, orderInfoDto.quotationId)) {
            log.debug("QuotationId is not equal.");
            return false;
        }
        if (!Objects.equals(this.orderIndex, orderInfoDto.orderIndex)) {
            log.debug("OrderIndex is not equal.");
            return false;
        }
        if (!Objects.equals(this.errorCode, orderInfoDto.errorCode)) {
            log.debug("ErrorCode is not equal.");
            return false;
        }
        if (!Objects.equals(this.errorDescription, orderInfoDto.errorDescription)) {
            log.debug("ErrorDescription is not equal.");
            return false;
        }
        if (!Objects.equals(this.orderId, orderInfoDto.orderId)) {
            log.debug("OrderId is not equal.");
            return false;
        }
        if (!Objects.equals(this.isChangeOwner, orderInfoDto.isChangeOwner)) {
            log.debug("IsChangeOwner is not equal.");
            return false;
        }
        if (!Objects.equals(this.isOrderRemovesPromo, orderInfoDto.isOrderRemovesPromo)) {
            log.debug("IsOrderRemovesPromo is not equal.");
            return false;
        }
        if (!Objects.equals(this.rateplanChange, orderInfoDto.rateplanChange)) {
            log.debug("RateplanChange is not equal.");
            return false;
        }
        if (!Objects.equals(this.orderAction, orderInfoDto.orderAction)) {
            log.debug("OrderAction is not equal.");
            return false;
        }
        if (!Objects.equals(this.quotationOrder, orderInfoDto.quotationOrder)) {
            log.debug("QuotationOrder is not equal.");
            return false;
        }
        if (!Objects.equals(this.closed, orderInfoDto.closed)) {
            log.debug("Closed is not equal.");
            return false;
        }
        if (!Objects.equals(this.cancelled, orderInfoDto.cancelled)) {
            log.debug("Cancelled is not equal.");
            return false;
        }
        if (!Objects.equals(this.clarifyOrder, orderInfoDto.clarifyOrder)) {
            log.debug("ClarifyOrder is not equal.");
            return false;
        }
        if (!Objects.equals(this.orderEligible, orderInfoDto.orderEligible)) {
            log.debug("OrderEligible is not equal.");
            return false;
        }
        if (!Objects.equals(this.isCease, orderInfoDto.isCease)) {
            log.debug("IsCease is not equal.");
            return false;
        }
        if (!Objects.equals(this.ipId, orderInfoDto.ipId)) {
            log.debug("IpId is not equal.");
            return false;
        }
        if (!Objects.equals(this.newProduct, orderInfoDto.newProduct)) {
            log.debug("NewProduct is not equal.");
            return false;
        }
        if (!Objects.equals(this.quotation, orderInfoDto.quotation)) {
            log.debug("Quotation is not equal.");
            return false;
        }
        if (!Objects.equals(this.subjectObjid, orderInfoDto.subjectObjid)) {
            log.debug("SubjectObjid is not equal.");
            return false;
        }
        if (!Objects.equals(this.transfer, orderInfoDto.transfer)) {
            log.debug("Transfer is not equal.");
            return false;
        }
        if (!Objects.equals(sortingAttributesByName(this.attributes), sortingAttributesByName(orderInfoDto.attributes))) {
            log.debug("Attributes are not equal.");
            return false;
        }
        if (!Objects.equals(sortingBaseItemsByName(this.baseItems, campaignFilter(orderInfoDto.baseItems)), sortingBaseItemsByName(orderInfoDto.baseItems, campaignFilter(this.baseItems)))) {
            log.debug("BaseItems are not equal.");
            return false;
        }

        return true;
    }

    private List<String> campaignFilter(List<BaseItemDto> orderInfoDto) {
        List<String> campaigns = new ArrayList<>();
        orderInfoDto.stream().filter(baseItemDto -> baseItemDto.getAttributeValue(ATTR_CAMPAIGN_NAME) != null)
                .filter(baseItemDto -> !campaigns.contains(baseItemDto.getAttributeValue(ATTR_CAMPAIGN_NAME)))
                .forEach(baseItemDto -> campaigns.add(baseItemDto.getAttributeValue(ATTR_CAMPAIGN_NAME)));
        return campaigns;
    }

    private List<BaseItemDto> sortingBaseItemsByName(List<BaseItemDto> orderInfoDto, List<String> campaigns) {
        return orderInfoDto.stream()
                .filter(baseItemDto -> ! SKIP_FOR_EQUALS.contains(baseItemDto.getName()) && campaigns.contains(baseItemDto.getAttributeValue(ATTR_CAMPAIGN_NAME)))
                .sorted(Comparator.comparing(BaseItemDto::getName, Comparator.nullsFirst(Comparator.naturalOrder()))
                .thenComparing(item -> item.getAttributeValue(ATTR_CAMPAIGN_NAME), Comparator.nullsFirst(Comparator.naturalOrder())))
                .collect(Collectors.toList());
    }

    private List<AttributeDto> sortingAttributesByName(List<AttributeDto> attributes) {
        return attributes.stream()
                .filter(attribute -> ! SKIP_FOR_EQUALS.contains(attribute.getName()))
                .sorted(Comparator.comparing(AttributeDto::getName, Comparator.nullsFirst(Comparator.naturalOrder())))
                .collect(Collectors.toList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ineligibleReason, sortingAttributesByName(attributes)
                , sortingBaseItemsByName(baseItems, campaignFilter(baseItems)), quotationId, orderIndex
                , errorCode, errorDescription, orderId, isChangeOwner, isOrderRemovesPromo
                , rateplanChange, orderAction, quotationOrder, closed, cancelled, clarifyOrder
                , orderEligible, isCease, ipId, newProduct, quotation, subjectObjid, transfer);
    }
}
