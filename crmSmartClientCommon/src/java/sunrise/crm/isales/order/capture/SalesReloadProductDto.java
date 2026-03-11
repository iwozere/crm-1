package sunrise.crm.isales.order.capture;

import java.util.Arrays;

public class SalesReloadProductDto {
    private String productName;
    private String internetRpName;

    private String[] allowedPhoneRps;
    private String[] allowedTvRps;
    public SalesReloadProductDto() {

    }

    public SalesReloadProductDto(String productName, String internetRpName) {
        this.productName = productName;
        this.internetRpName = internetRpName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getInternetRpName() {
        return internetRpName;
    }

    public void setInternetRpName(String internetRpName) {
        this.internetRpName = internetRpName;
    }

    public String[] getAllowedPhoneRps() {
        return allowedPhoneRps;
    }

    public void setAllowedPhoneRps(String[] allowedPhoneRps) {
        this.allowedPhoneRps = allowedPhoneRps;
    }

    public String[] getAllowedTvRps() {
        return allowedTvRps;
    }

    public void setAllowedTvRps(String[] allowedTvRps) {
        this.allowedTvRps = allowedTvRps;
    }

    @Override
    public String toString() {
        return "SalesReloadProductDto{" +
                "productName='" + productName + '\'' +
                ", internetRpName='" + internetRpName + '\'' +
                ", allowedPhoneRps=" + Arrays.toString(allowedPhoneRps) +
                ", allowedTvRps=" + Arrays.toString(allowedTvRps) +
                '}';
    }
}
