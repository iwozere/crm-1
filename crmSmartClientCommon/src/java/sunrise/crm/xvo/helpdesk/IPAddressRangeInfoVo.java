package sunrise.crm.xvo.helpdesk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IPAddressRangeInfoVo {
    
    private static final Log LOG = LogFactory.getLog(IPAddressRangeInfoVo.class);

    private String baseAddress;
    private String baseAddressString;
    private String endAddress;
    private String endAddressString;
    private String cidrString;
    private String rangeSize; 
    private String freeAddr;
    private String reservedExtId;
    private String reservedExtSystem;
    private String reservedDate;
    private String releasedDate;
    private String productType;
    
    public String getBaseAddress() {
        return baseAddress;
    }
    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }
    public String getBaseAddressString() {
        return baseAddressString;
    }
    public void setBaseAddressString(String baseAddressString) {
        this.baseAddressString = baseAddressString;
    }
    public String getEndAddress() {
        return endAddress;
    }
    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }
    public String getEndAddressString() {
        return endAddressString;
    }
    public void setEndAddressString(String endAddressString) {
        this.endAddressString = endAddressString;
    }
    public String getCidrString() {
        return cidrString;
    }
    public void setCidrString(String cidrString) {
        this.cidrString = cidrString;
    }
    public String getRangeSize() {
        return rangeSize;
    }
    public void setRangeSize(String rangeSize) {
        this.rangeSize = rangeSize;
    }
    public String getFreeAddr() {
        return freeAddr;
    }
    public void setFreeAddr(String freeAddr) {
        this.freeAddr = freeAddr;
    }
    public String getReservedExtId() {
        return reservedExtId;
    }
    public void setReservedExtId(String reservedExtId) {
        this.reservedExtId = reservedExtId;
    }
    public String getReservedExtSystem() {
        return reservedExtSystem;
    }
    public void setReservedExtSystem(String reservedExtSystem) {
        this.reservedExtSystem = reservedExtSystem;
    }
    public String getReservedDate() {
        return reservedDate;
    }
    public void setReservedDate(String reservedDate) {
        this.reservedDate = reservedDate;
    }
    public String getReleasedDate() {
        return releasedDate;
    }
    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }

}
