package sunrise.crm.product;

import com.google.gson.Gson;

import java.util.Date;

public class XBundleProductDto {

    private String type;
    private String product;
    private String serialNo;
    private String partStatus;
    private String technology;
    private String contractStartDate;
    private String duration;
    private String contractEndDate;
    private String partnerName;
    private String ipContract;
    private String status;
    private boolean isMain;
    private boolean isOrderedAsMain;
    private String bundlingStartDate;
    private String bundlingEndDate;
    private String activationDate;

    public String getx_ip_contract(){
        return ipContract;
    }

    public String getx_serial_no(){
        return serialNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getPartStatus() {
        return partStatus;
    }

    public void setPartStatus(String partStatus) {
        this.partStatus = partStatus;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getIpContract() {
        return ipContract;
    }

    public void setIpContract(String ipContract) {
        this.ipContract = ipContract;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(boolean main) {
        isMain = main;
    }

    public boolean getIsOrderedAsMain() {
        return isOrderedAsMain;
    }

    public void setIsOrderedAsMain(boolean orderedAsMain) {
        isOrderedAsMain = orderedAsMain;
    }

    public String getBundlingStartDate() {
        return bundlingStartDate;
    }

    public void setBundlingStartDate(String bundlingStartDate) {
        this.bundlingStartDate = bundlingStartDate;
    }

    public String getBundlingEndDate() {
        return bundlingEndDate;
    }

    public void setBundlingEndDate(String bundlingEndDate) {
        this.bundlingEndDate = bundlingEndDate;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
