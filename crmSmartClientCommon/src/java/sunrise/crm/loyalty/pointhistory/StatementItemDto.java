package sunrise.crm.loyalty.pointhistory;

import java.time.LocalDate;
import java.util.StringJoiner;


public class StatementItemDto {
    private PointBalanceDto pointBalance;
    private ProductDetailsDto productDetails;
    private LocalDate transactionDate;
    
    public LocalDate getTransactionDate() {
        return transactionDate;
    }
    
    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    public PointBalanceDto getPointBalance() {
        return pointBalance;
    }
    
    public void setPointBalance(PointBalanceDto pointBalance) {
        this.pointBalance = pointBalance;
    }
    
    public ProductDetailsDto getProductDetails() {
        return productDetails;
    }
    
    public void setProductDetails(ProductDetailsDto productDetails) {
        this.productDetails = productDetails;
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", StatementItemDto.class.getSimpleName() + "[", "]")
            .add("pointBalance=" + pointBalance)
            .add("productDetails=" + productDetails)
            .add("transactionDate=" + transactionDate)
            .toString();
    }
}