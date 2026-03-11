package sunrise.crm.custom.step.product.dto;

import java.util.List;

public class SiteProductInfo {
    
  //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * The site id .
     *  
     */
    private java.lang.String siteId;

    /**
     * The product category.
     *  
     */
    private java.lang.String customerType;

    /**
     * Field product info list.
     */
    private List<ProductInfo> prodInfoList;

    public java.lang.String getSiteId() {
        return siteId;
    }

    public void setSiteId(java.lang.String siteId) {
        this.siteId = siteId;
    }

    public java.lang.String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(java.lang.String customerType) {
        this.customerType = customerType;
    }

    public List<ProductInfo> getProdInfoList() {
        return prodInfoList;
    }

    public void setProdInfoList(List<ProductInfo> prodInfoList) {
        this.prodInfoList = prodInfoList;
    }

}
