package sunrise.crm.isales.order.capture;

public class FixnetTransitionDto {

    private String orderType;
    private int isContractGenerated;
    private int isDurationUpdated;
    private int isIdCheckRequired;
    private String xPPFromName;
    private String xPPToName;
    private String inetRpFromName;
    private String inetRpToName;

    public FixnetTransitionDto() {
    }

    public FixnetTransitionDto(String orderType, int isContractGenerated, int isDurationUpdated, int isIdCheckRequired, String xPPFromName, String xPPToName, String inetRpFromName, String inetRpToName) {
        this.orderType = orderType;
        this.isContractGenerated = isContractGenerated;
        this.isDurationUpdated = isDurationUpdated;
        this.isIdCheckRequired = isIdCheckRequired;
        this.xPPFromName = xPPFromName;
        this.xPPToName = xPPToName;
        this.inetRpFromName = inetRpFromName;
        this.inetRpToName = inetRpToName;
    }

    public String getOrderType() {
        return orderType;
    }

    public int getIsContractGenerated() {
        return isContractGenerated;
    }

    public int getIsDurationUpdated() {
        return isDurationUpdated;
    }

    public int getIsIdCheckRequired() {
        return isIdCheckRequired;
    }

    public String getxPPFromName() {
        return xPPFromName;
    }

    public String getxPPToName() {
        return xPPToName;
    }

    public String getInetRpFromName() {
        return inetRpFromName;
    }

    public String getInetRpToName() {
        return inetRpToName;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setIsContractGenerated(int isContractGenerated) {
        this.isContractGenerated = isContractGenerated;
    }

    public void setIsDurationUpdated(int isDurationUpdated) {
        this.isDurationUpdated = isDurationUpdated;
    }

    public void setIsIdCheckRequired(int isIdCheckRequired) {
        this.isIdCheckRequired = isIdCheckRequired;
    }

    public void setxPPFromName(String xPPFromName) {
        this.xPPFromName = xPPFromName;
    }

    public void setxPPToName(String xPPToName) {
        this.xPPToName = xPPToName;
    }

    public void setInetRpFromName(String inetRpFromName) {
        this.inetRpFromName = inetRpFromName;
    }

    public void setInetRpToName(String inetRpToName) {
        this.inetRpToName = inetRpToName;
    }

    @Override
    public String toString() {
        return "FixnetTransitionDto{" +
                "orderType='" + orderType + '\'' +
                ", isContractGenerated='" + isContractGenerated + '\'' +
                ", isDurationUpdated='" + isDurationUpdated + '\'' +
                ", isIdCheckRequired='" + isIdCheckRequired + '\'' +
                ", xPPFromName='" + xPPFromName + '\'' +
                ", xPPToName='" + xPPToName + '\'' +
                ", inetRpFromName='" + inetRpFromName + '\'' +
                ", inetRpToName='" + inetRpToName + '\'' +
                '}';
    }
}
