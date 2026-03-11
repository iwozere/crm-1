package sunrise.crm.custom.step.product.dto;

import sunrise.crm.persistence.dao.dto.ProductBenefitItem;
import sunrise.crm.persistence.dao.dto.ProductInstalledOption;
import sunrise.crm.util.CrmStringUtil;

import java.util.Date;

/**
 * Class Product Info.
 * @author arthur 
 */
public class ProductInfo {

    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * The site id
     */
    private java.lang.String siteId; 
    /**
     * The product's commercial name.
     *  
     */
    private java.lang.String businessName;

    /**
     * The product category.
     *  
     */
    private ProductCategory category;

    /**
     * Field group.
     */
    private ProductGroup group;

    /**
     * The product installation status.
     *  
     */
    private ProductStatus status;
    /**
     * The product installation productSubStatus.
     *  
     */
    private ProductSubStatus productSubStatus;
    /**
     * The product serial number.
     *  
     */
    private java.lang.String serial;

    /**
     * The associated phone numbers of the product.
     *  
     */
    private java.util.List<java.lang.String> phoneNumbersList;
    
    private java.util.List<java.lang.String> sipPhoneNumbersList;
    
    private java.util.List<java.lang.String> voipNumberRange;

    /**
     * The associated email address to the product.
     *  
     */
    private java.util.List<java.lang.String> emailList;
    
    /**
     * The below list contains products top site-part objid's for which there are pending orders plus other
     * site-part objid's which are not extensible like prepaid contracts, hence it should be used carefully.
     */
    private java.util.List<java.lang.String> pendingOrderOfProducts;

    /**
     * The product's installation date. 
     *  
     */
    private java.util.Date installationDate;

    /**
     * The contract duration.
     *  
     */
    private int contractDuration;

    /**
     * keeps track of state for field: contractDuration.
     */
    private boolean hasContractDuration;

    /**
     * The product's contract end date.
     *  
     */
    private java.util.Date contractEndDate;

    /**
     * Whether the contract is extensible or not.
     *  
     */
    private java.util.Date contractExtensionDate;

    /**
     * List of installed service options.
     *  
     */
    private java.util.List<ProductInstalledOption> installedOptionsList;
    
    /**
     * List of installed benefit items.
     *  
     */
    private java.util.List<ProductBenefitItem> benefitItemsList;
    
    /**
     * The parent product serial number.
     *  
     */
    private java.lang.String parentProductSerial;
    
    /**
     * The parent product role.
     *  
     */    
    private java.lang.String parentProductRole;
    
    /**
     * The product access descriptor.
     *  
     */
    private java.lang.String productAccess;
    
    /**
     * 
     */
    private java.util.Date ceaseDateWithoutETF;

    private String topPartObjid;
    
    /**
     * 
     */
    private java.lang.String siteaId;

    /**
     * 
     */
    private java.lang.String companyName;

    /**
     * 
     */
    private java.lang.String address;

    /**
     * 
     */
    private java.lang.String address2;

    /**
     * 
     */
    private java.lang.String city;

    /**
     * 
     */
    private java.lang.String state;

    /**
     * 
     */
    private java.lang.String zipCode;

    /**
     * 
     */
    private java.lang.String country;
    
    private String desciption;
    private String salesId;
    private String productCategory;
    
    private long hwCount;
    
    private String hwOptionName;
    
    private String ipContract;

    private String bindingPromoName;
    private Date bindingPromoEndDate;
    private boolean isMobilePackFirstSubscription;
    private boolean isUpMultiMobileEnabler;

    /**
     * Flag for mobile hardware subsidy.
     */
    private boolean hasHardwareSubsidy;
    
    private String pendingOrderType;

    
	public java.lang.String getCity() {
        return city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }

    public java.lang.String getState() {
        return state;
    }

    public void setState(java.lang.String state) {
        this.state = state;
    }

    public java.lang.String getZipCode() {
        return zipCode;
    }

    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    public java.lang.String getCountry() {
        return country;
    }

    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    public java.lang.String getSiteId() {
        return siteId;
    }

    public void setSiteId(java.lang.String siteId) {
        this.siteId = siteId;
    }

    public java.lang.String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }

    public java.lang.String getAddress() {
        return address;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public java.lang.String getAddress2() {
        return address2;
    }

    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }

    public java.lang.String getSiteaId() {
        return siteaId;
    }

    public void setSiteaId(java.lang.String siteaId) {
        this.siteaId = siteaId;
    }

    //----------------/
    //- Constructors -/
    //----------------/

    /**
     * Get cease date without paying ETF
     */
    public java.util.Date getCeaseDateWithoutETF() {
        return ceaseDateWithoutETF;
    }

    /**
     * Set cease date without paying ETF
     * 
     * @param ceaseDateWithoutETF
     */
    public void setCeaseDateWithoutETF(java.util.Date ceaseDateWithoutETF) {
        this.ceaseDateWithoutETF = ceaseDateWithoutETF;
    }


    /**
     * Get the productAccess.
     *
     * @return Returns the productAccess.
     */
    public java.lang.String getProductAccess() {
        return productAccess;
    }


    /**
     * Set the productAccess.
     *
     * @param productAccess The productAccess to set.
     */
    public void setProductAccess(java.lang.String productAccess) {
        this.productAccess = productAccess;
    }


    public ProductInfo() {
        super();
        this.phoneNumbersList = new java.util.ArrayList<java.lang.String>();
        this.emailList = new java.util.ArrayList<java.lang.String>();
        this.installedOptionsList = new java.util.ArrayList<ProductInstalledOption>();
        this.voipNumberRange= new java.util.ArrayList<java.lang.String>();
    }


    /**
     * Get the businessName.
     *
     * @return Returns the businessName.
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Set the businessName.
     *
     * @param businessName The businessName to set.
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Get the category.
     *
     * @return Returns the category.
     */
    public ProductCategory getCategory() {
        return category;
    }


    /**
     * Set the category.
     *
     * @param category The category to set.
     */
    public void setCategory(ProductCategory category) {
        this.category = category;
    }


    /**
     * Get the group.
     *
     * @return Returns the group.
     */
    public ProductGroup getGroup() {
        return group;
    }


    /**
     * Set the group.
     *
     * @param group The group to set.
     */
    public void setGroup(ProductGroup group) {
        this.group = group;
    }


    /**
     * Get the status.
     *
     * @return Returns the status.
     */
    public ProductStatus getStatus() {
        return status;
    }


    /**
     * Set the status.
     *
     * @param status The status to set.
     */
    public void setStatus(ProductStatus status) {
        this.status = status;
    }


	public ProductSubStatus getProductSubStatus() {
		return productSubStatus;
	}

	public void setProductSubStatus(ProductSubStatus productSubStatus) {
		this.productSubStatus = productSubStatus;
	}
    /**
     * Get the serial.
     *
     * @return Returns the serial.
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Set the serial.
     *
     * @param serial The serial to set.
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Get the phoneNumbersList.
     *
     * @return Returns the phoneNumbersList.
     */
    public java.util.List<java.lang.String> getPhoneNumbersList() {
        return phoneNumbersList;
    }


    /**
     * Set the phoneNumbersList.
     *
     * @param phoneNumbersList The phoneNumbersList to set.
     */
    public void setPhoneNumbersList(java.util.List<java.lang.String> phoneNumbersList) {
        this.phoneNumbersList = phoneNumbersList;
    }

    /**
     * Get the list of SIP phone numbers.
     */
    public java.util.List<java.lang.String> getSipPhoneNumbersList() {
		return sipPhoneNumbersList;
	}

    /**
     * Set the list of SIP phone numbers.
     */
	public void setSipPhoneNumbersList(java.util.List<java.lang.String> sipPhoneNumbersList) {
		this.sipPhoneNumbersList = sipPhoneNumbersList;
	}

    /**
     * Get the emailList.
     *
     * @return Returns the emailList.
     */
    public java.util.List<java.lang.String> getEmailList() {
        return emailList;
    }


    /**
     * Set the emailList.
     *
     * @param emailList The emailList to set.
     */
    public void setEmailList(java.util.List<java.lang.String> emailList) {
        this.emailList = emailList;
    }


    /**
     * Get the installationDate.
     *
     * @return Returns the installationDate.
     */
    public java.util.Date getInstallationDate() {
        return installationDate;
    }


    public java.util.List<java.lang.String> getVoipNumberRange() {
        return voipNumberRange;
    }


    public void setVoipNumberRange(java.util.List<java.lang.String> voipNumberRange) {
        this.voipNumberRange = voipNumberRange;
    }


    /**
     * Set the installationDate.
     *
     * @param installationDate The installationDate to set.
     */
    public void setInstallationDate(java.util.Date installationDate) {
        this.installationDate = installationDate;
    }


    /**
     * Get the contractDuration.
     *
     * @return Returns the contractDuration.
     */
    public int getContractDuration() {
        return contractDuration;
    }


    /**
     * Set the contractDuration.
     *
     * @param contractDuration The contractDuration to set.
     */
    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }


    /**
     * Get the hasContractDuration.
     *
     * @return Returns the hasContractDuration.
     */
    public boolean isHasContractDuration() {
        return hasContractDuration;
    }


    /**
     * Set the hasContractDuration.
     *
     * @param hasContractDuration The hasContractDuration to set.
     */
    public void setHasContractDuration(boolean hasContractDuration) {
        this.hasContractDuration = hasContractDuration;
    }


    /**
     * Get the contractEndDate.
     *
     * @return Returns the contractEndDate.
     */
    public java.util.Date getContractEndDate() {
        return contractEndDate;
    }


    /**
     * Set the contractEndDate.
     *
     * @param contractEndDate The contractEndDate to set.
     */
    public void setContractEndDate(java.util.Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }


    /**
     * Get the contractExtensionDate.
     *
     * @return Returns the contractExtensionDate.
     */
    public java.util.Date getContractExtensionDate() {
        return contractExtensionDate;
    }


    /**
     * Set the contractExtensionDate.
     *
     * @param contractExtensionDate The contractExtensionDate to set.
     */
    public void setContractExtensionDate(java.util.Date contractExtensionDate) {
        this.contractExtensionDate = contractExtensionDate;
    }


    /**
     * Get the installedOptionsList.
     *
     * @return Returns the installedOptionsList.
     */
    public java.util.List<ProductInstalledOption> getInstalledOptionsList() {
        return installedOptionsList;
    }


    /**
     * Set the installedOptionsList.
     *
     * @param installedOptionsList The installedOptionsList to set.
     */
    public void setInstalledOptionsList(java.util.List<ProductInstalledOption> installedOptionsList) {
        this.installedOptionsList = installedOptionsList;
    }
    

    public java.util.List<ProductBenefitItem> getBenefitItemsList() {
		return benefitItemsList;
	}

	public void setBenefitItemsList(
			java.util.List<ProductBenefitItem> benefitItemsList) {
		this.benefitItemsList = benefitItemsList;
	}

	/**
     * Get the parent product serial.
     *
     * @return Returns the parentProductSerial.
     */
    public java.lang.String getParentProductSerial() {
        return parentProductSerial;
    }

    /**
     * Set the parent product serial.
     *
     * @param serial The parent product serial to set.
     */
    public void setParentProductSerial(java.lang.String parentProductSerial) {
        this.parentProductSerial = parentProductSerial;
    }

    /**
     * Get the role of the parent product.
     *
     *  @return Returns the parentProductRole.
     */
    public java.lang.String getParentProductRole() {
        return parentProductRole;
    }

    /**
     * Set the role of the parent product.
     *
     * @param parentProductRole The parent product role to set.
     */
    public void setParentProductRole(java.lang.String parentProductRole) {
        this.parentProductRole = parentProductRole;
    }
    
    public void setTopPartObjid(String topPartObjid) {        
        this.topPartObjid = topPartObjid;
    }
    
    public String getTopPartObjid() {
        return topPartObjid;
    }
    
    public java.util.List<java.lang.String> getPendingOrderOfContracts() {
        return pendingOrderOfProducts;
    }

    public void setPendingOrderOfContracts(java.util.List<java.lang.String> pendingOrderOfContracts) {
        this.pendingOrderOfProducts = pendingOrderOfContracts;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public long getHwCount() {
        return hwCount;
    }

    public void setHwCount(long hwCount) {
        this.hwCount = hwCount;
    }

    public String getHwOptionName() {
        return hwOptionName;
    }

    public void setHwOptionName(String hwOptionName) {
        this.hwOptionName = hwOptionName;
    }

	public String getIpContract() {
		return ipContract;
	}

	public void setIpContract(String ipContract) {
		this.ipContract = ipContract;
	}

	public boolean hasIp(){
		return CrmStringUtil.isNotEmpty(ipContract);
	}

    public String getBindingPromoName() {
        return bindingPromoName;
    }

    public void setBindingPromoName(String bindingPromoName) {
        this.bindingPromoName = bindingPromoName;
    }

    public Date getBindingPromoEndDate() {
        return bindingPromoEndDate;
    }

    public void setBindingPromoEndDate(Date bindingPromoEndDate) {
        this.bindingPromoEndDate = bindingPromoEndDate;
    }

    public boolean isMobilePackFirstSubscription() {
		return isMobilePackFirstSubscription;
	}

	public void setMobilePackFirstSubscription(boolean isMobilePackFirstSubscription) {
		this.isMobilePackFirstSubscription = isMobilePackFirstSubscription;
	}

    public boolean isUpMultiMobileEnabler() {
        return isUpMultiMobileEnabler;
    }

    public void setUpMultiMobileEnabler(boolean upMultiMobileEnabler) {
        isUpMultiMobileEnabler = upMultiMobileEnabler;
    }

	public boolean isHasHardwareSubsidy() {
		return hasHardwareSubsidy;
	}

	public void setHasHardwareSubsidy(boolean hasHardwareSubsidy) {
		this.hasHardwareSubsidy = hasHardwareSubsidy;
	}

	public String getPendingOrderType() {
		return pendingOrderType;
	}

	public void setPendingOrderType(String pendingOrderType) {
		this.pendingOrderType = pendingOrderType;
	}

}
