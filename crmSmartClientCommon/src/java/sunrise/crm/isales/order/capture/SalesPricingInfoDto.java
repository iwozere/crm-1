package sunrise.crm.isales.order.capture;

import sunrise.crm.xvo.order.XAttributeValueVo;
import sunrise.crm.xvo.order.XLineItemVo;

import java.util.Arrays;
import java.util.StringJoiner;

public class SalesPricingInfoDto {
    private String productDefName;
    private XLineItemVo[] itemsVo;
    private XAttributeValueVo[] orderAttributesVo;
    private String orderType;
    private String promoName;
    private String access;
    private String ipContractId;

    public String getProductDefName() {
        return productDefName;
    }

    public void setProductDefName(String productDefName) {
        this.productDefName = productDefName;
    }

    public XLineItemVo[] getItemsVo() {
        return itemsVo;
    }

    public void setItemsVo(XLineItemVo[] itemsVo) {
        this.itemsVo = itemsVo;
    }

    public XAttributeValueVo[] getOrderAttributesVo() {
        return orderAttributesVo;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public void setOrderAttributesVo(XAttributeValueVo[] orderAttributesVo) {
        this.orderAttributesVo = orderAttributesVo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getIpContractId() {
        return ipContractId;
    }

    public void setIpContractId(String ipContractId) {
        this.ipContractId = ipContractId;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SalesPricingInfoDto.class.getSimpleName() + "[", "]")
                .add("productDefName='" + productDefName + "'")
                .add("itemsVo=" + Arrays.toString(itemsVo))
                .add("orderAttributesVo=" + Arrays.toString(orderAttributesVo))
                .add("orderType='" + orderType + "'")
                .add("promoName='" + promoName + "'")
                .add("access='" + access + "'")
                .add("ipContractId='" + ipContractId + "'")
                .toString();
    }
}
