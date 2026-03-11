package sunrise.crm.custom.step.product.dto;

/**
 * SiteProductsInfo request.
 * @author arthur
 *
 */
public class SiteProductsInfoRequest {

    /**
     * Field siteId.
     */
    private java.lang.String siteId;

    /**
     * Field productGroup.
     */
    private ProductGroup productGroup;

    /**
     * Return results quickly by limiting number of products to 100.
     */
    private boolean fastReply;

    /**
     * Whether to show only installed products or also products.
     * deinstalled up to 3 months
     */
    private boolean onlyInstalled;

    /**
     * keeps track of state for field: _onlyInstalled.
     */
    private boolean hasOnlyInstalled;
    
    
    /**
     * get result on product serial no: productSerialNo.
     */
   private String productSerialNo;
   
   /**
    * if request is only for product serail no: singleProduct.
    */
    
    private boolean singleProduct;
    
    /**
     * if request is only for single product with serial and mobile and requires children
     */
    private boolean hasChildren;


    public boolean isSingleProduct() {
		return singleProduct;
	}

	public void setSingleProduct(boolean singleProduct) {
		this.singleProduct = singleProduct;
	}

	public String getProductSerialNo() {
		return productSerialNo;
	}

	public void setProductSerialNo(String productSerialNo) {
		this.productSerialNo = productSerialNo;
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
     * Public constructor.
     */
    public SiteProductsInfoRequest() {
        
    }
    
    /**
     * Get the productGroup.
     *
     * @return Returns the productGroup.
     */
    public ProductGroup getProductGroup() {
        return productGroup;
    }

    /**
     * Set the productGroup.
     *
     * @param productGroup The productGroup to set.
     */
    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    /**
     * Get the fastReply.
     *
     * @return Returns the fastReply.
     */
    public boolean isFastReply() {
        return fastReply;
    }

    /**
     * Set the fastReply.
     *
     * @param fastReply The fastReply to set.
     */
    public void setFastReply(boolean fastReply) {
        this.fastReply = fastReply;
    }

    /**
     * Get the onlyInstalled.
     *
     * @return Returns the onlyInstalled.
     */
    public boolean isOnlyInstalled() {
        return onlyInstalled;
    }

    /**
     * Set the onlyInstalled.
     *
     * @param onlyInstalled The onlyInstalled to set.
     */
    public void setOnlyInstalled(boolean onlyInstalled) {
        this.onlyInstalled = onlyInstalled;
    }

    /**
     * Get the hasOnlyInstalled.
     *
     * @return Returns the hasOnlyInstalled.
     */
    public boolean isHasOnlyInstalled() {
        return hasOnlyInstalled;
    }

    /**
     * Set the hasOnlyInstalled.
     *
     * @param hasOnlyInstalled The hasOnlyInstalled to set.
     */
    public void setHasOnlyInstalled(boolean hasOnlyInstalled) {
        this.hasOnlyInstalled = hasOnlyInstalled;
    }

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
}
