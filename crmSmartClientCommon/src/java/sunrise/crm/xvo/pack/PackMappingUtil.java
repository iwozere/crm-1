package sunrise.crm.xvo.pack;

import sunrise.crm.order.dto.AttributeDto;
import sunrise.crm.order.dto.BaseItemDto;
import sunrise.crm.order.dto.BaseRequestDto;
import sunrise.crm.order.dto.CaptureQuotationRequestDto;
import sunrise.crm.order.dto.ProcessingMode;
import sunrise.crm.order.dto.SalesInfoDto;
import sunrise.crm.xvo.order.XAttributeValueVo;
import sunrise.crm.xvo.order.XLineItemVo;
import sunrise.crm.xvo.product.ExecutionContext;

import java.util.ArrayList;
import java.util.List;

public class PackMappingUtil {

    public static CaptureQuotationRequestDto getRequest(ExecutionContext ec, String siteId, String customerSegment,
                                                        XProductInfoVo[] productsInfoVo, String partnerId,
                                                        String locationId) {

        CaptureQuotationRequestDto dto = new CaptureQuotationRequestDto();
        dto.setApplication("Clarify");

        dto.setSiteId(siteId);
        dto.setCustomerLanguage(null);
        dto.setCustomerSegment(customerSegment);
        dto.setSiteCategory(null);

        for (XProductInfoVo vo : productsInfoVo) {
            dto.getBaseRequest().add(mapBaseRequestToDto(vo, partnerId, locationId));
        }
        dto.setExecutionContext(ec);
        return dto;
    }

    public static List<CaptureQuotationRequestDto> getRequestForParallel(String siteId, String customerSegment,
                                                                   XProductInfoVo[] productsInfoVo, String partnerId,
                                                                   String locationId, String skipRuleNames,
                                                                   boolean skipPendingActivation,
                                                                   boolean completePendingOrders) {
        int index = 0;
        List<CaptureQuotationRequestDto> requests = new ArrayList<>();
        for (XProductInfoVo vo : productsInfoVo) {
            CaptureQuotationRequestDto request = new CaptureQuotationRequestDto();
            request.setApplication("Clarify");
            request.setMode(ProcessingMode.SEQUENTIAL);
            request.setSiteId(siteId);
            request.setCustomerLanguage(null);
            request.setCustomerSegment(customerSegment);
            request.setSiteCategory(null);

            String orderIndex = String.valueOf(index++);
            BaseRequestDto baseRequest = mapBaseRequestToDto(vo, partnerId, locationId, orderIndex,
                    skipRuleNames);
            request.getBaseRequest().add(baseRequest);
            request.setSkipPendingActivation(skipPendingActivation);
            request.setCompletePendingOrders(completePendingOrders);
            requests.add(request);
        }
        return requests;
    }

    public static BaseRequestDto mapBaseRequestToDto(XProductInfoVo productInfo, String partnerId, String locationId) {
        return mapBaseRequestToDto(productInfo, partnerId, locationId, null, null);
    }

    public static BaseRequestDto mapBaseRequestToDto(XProductInfoVo productInfo, String partnerId,
                                                     String locationId, String orderIndex, String skipRuleNames) {
        BaseRequestDto baseRequestDto = new BaseRequestDto();

        baseRequestDto.setProductName(productInfo.getProductName());
        baseRequestDto.setProductSerial(productInfo.getProductSerial());
        baseRequestDto.setBindingPromoName(null);
        baseRequestDto.setOrderType(productInfo.getOrderAction());
        baseRequestDto.setSalesInfo(mapSalesInfoToDto(partnerId, locationId));
        baseRequestDto.setVerifyOffer(productInfo.getVerifyOffer());
        baseRequestDto.setOrderSubAction(productInfo.getOrderSubAction());
        baseRequestDto.setIpId(productInfo.getIpId());
        baseRequestDto.setSkipRuleNames(skipRuleNames);
        baseRequestDto.setOrderIndex(orderIndex);

        XLineItemVo[] lineItems = productInfo.getLineItems();

        if (lineItems != null && lineItems.length > 0) {
            for (XLineItemVo item : lineItems) {
                baseRequestDto.getBaseItems().add(mapBaseItemToDto(item));
            }
        }
        return baseRequestDto;
    }

    public static BaseItemDto mapBaseItemToDto(XLineItemVo item) {
        BaseItemDto baseItemDto = new BaseItemDto(item.getPartNumber(), item.getAction());
        if (item.getAttributes() != null && item.getAttributes().length > 0) {
            for (XAttributeValueVo attribute : item.getAttributes()) {
                baseItemDto.getAttributes().add(
                        new AttributeDto(
                                attribute.getAttributeName(),
                                attribute.getAttributeValue()));
            }
        }
        return baseItemDto;
    }

    public static SalesInfoDto mapSalesInfoToDto(String partnerId, String locationId) {
        SalesInfoDto salesInfoDto = new SalesInfoDto();
        salesInfoDto.setSalesId(partnerId);
        salesInfoDto.setLocationId(locationId);
        return salesInfoDto;
    }
}
