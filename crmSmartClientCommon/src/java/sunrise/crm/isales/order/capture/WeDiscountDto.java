package sunrise.crm.isales.order.capture;

public class WeDiscountDto {
    private String discountName;
    private String uom;
    private String max;
    private String amount;

    public WeDiscountDto(String discountName, String uom, String max, String amount) {
        this.discountName = discountName;
        this.uom = uom;
        this.max = max;
        this.amount = amount;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "XWeDiscountDto{" +
                "discountName='" + discountName + '\'' +
                ", uom='" + uom + '\'' +
                ", max='" + max + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
