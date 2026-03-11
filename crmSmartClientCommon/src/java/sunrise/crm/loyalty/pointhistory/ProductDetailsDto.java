package sunrise.crm.loyalty.pointhistory;

import java.util.StringJoiner;

public class ProductDetailsDto {
    private String productCategory;
    private String productCode;
    private String productName;
    private String productOffering;
    
    public String getProductCode() {
        return productCode;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public String getProductCategory() {
        return productCategory;
    }
    
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    
    public String getProductOffering() {
        return productOffering;
    }
    
    public void setProductOffering(String productOffering) {
        this.productOffering = productOffering;
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", ProductDetailsDto.class.getSimpleName() + "[", "]")
            .add("productCode='" + productCode + "'")
            .add("productName='" + productName + "'")
            .add("productCategory='" + productCategory + "'")
            .add("productOffering='" + productOffering + "'")
            .toString();
    }
}