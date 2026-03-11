package sunrise.crm.custom.step.product.dto;

import sunrise.crm.wemobile.dto.WeMobilePackLevel;

public class SiteProductsInfoResponse {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _siteId.
     */
    private java.lang.String siteId;

    /**
     * Field _productInfoList.
     */
    private java.util.List<ProductInfo> productInfoList;

    /**
     * if true, more products exist.
     */
    private boolean infoComplete;

    /**
     * keeps track of state for field: _infoComplete.
     */
    private boolean hasInfoComplete;
    
    private WeMobilePackLevel mobilePackLevel;
    
    //----------------/
    //- Constructors -/
    //----------------/

    public WeMobilePackLevel getMobilePackLevel() {
		return mobilePackLevel;
	}

	public void setMobilePackLevel(WeMobilePackLevel mobilePackLevel) {
		this.mobilePackLevel = mobilePackLevel;
	}

	public SiteProductsInfoResponse() {
        super();
        this.productInfoList = new java.util.ArrayList<ProductInfo>();
    }


    /**
     * Get the siteId.
     *
     * @return Returns the siteId.
     */
    public java.lang.String getSiteId() {
        return siteId;
    }


    /**
     * Set the siteId.
     *
     * @param siteId The siteId to set.
     */
    public void setSiteId(java.lang.String siteId) {
        this.siteId = siteId;
    }


    /**
     * Get the productInfoList.
     *
     * @return Returns the productInfoList.
     */
    public java.util.List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }


    /**
     * Set the productInfoList.
     *
     * @param productInfoList The productInfoList to set.
     */
    public void setProductInfoList(java.util.List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
    }


    /**
     * Get the infoComplete.
     *
     * @return Returns the infoComplete.
     */
    public boolean isInfoComplete() {
        return infoComplete;
    }


    /**
     * Set the infoComplete.
     *
     * @param infoComplete The infoComplete to set.
     */
    public void setInfoComplete(boolean infoComplete) {
        this.infoComplete = infoComplete;
    }


    /**
     * Get the hasInfoComplete.
     *
     * @return Returns the hasInfoComplete.
     */
    public boolean isHasInfoComplete() {
        return hasInfoComplete;
    }


    /**
     * Set the hasInfoComplete.
     *
     * @param hasInfoComplete The hasInfoComplete to set.
     */
    public void setHasInfoComplete(boolean hasInfoComplete) {
        this.hasInfoComplete = hasInfoComplete;
    }
}
