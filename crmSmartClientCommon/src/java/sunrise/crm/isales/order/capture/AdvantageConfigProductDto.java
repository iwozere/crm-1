package sunrise.crm.isales.order.capture;

public class AdvantageConfigProductDto {

    private String name;
    private String productType;
    private String categorization;


    public AdvantageConfigProductDto() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getCategorization() {
        return categorization;
    }

    public void setCategorization(String categorization) {
        this.categorization = categorization;
    }


    @Override
    public String toString() {
        return "AdvantageConfigDto{" +
                " name='" + name +
                ", productType='" + productType +
                ", categorization='" + categorization +
                '}';
    }
}
