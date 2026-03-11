package sunrise.crm.loyalty.pointhistory;

import java.util.Date;
import java.util.StringJoiner;

public class PointStatementDto {
    
    private int newPointBalance;
    private int oldPointBalance;
    private String pointAction;
    private int pointEarn;
    private int points;
    private String pointsWithSign;
    private int pointsBurn;
    private boolean pointsRedeemed;
    private boolean pointsReset;
    private boolean pointsRewarded;
    private String productCategory;
    private String productCode;
    private String productName;
    private String productOffering;
    private Date transactionDate;
    private String bitType;
    private String bitTypeName;
    private String orderId;
    private String info;
    private String action;
    private String transactionType;
    private String reason;
    
    
    public int getNewPointBalance() {
        return newPointBalance;
    }
    
    public void setNewPointBalance(int newPointBalance) {
        this.newPointBalance = newPointBalance;
    }
    
    public int getOldPointBalance() {
        return oldPointBalance;
    }
    
    public void setOldPointBalance(int oldPointBalance) {
        this.oldPointBalance = oldPointBalance;
    }
    
    public String getPointAction() {
        return pointAction;
    }
    
    public void setPointAction(String pointAction) {
        this.pointAction = pointAction;
    }
    
    public int getPointEarn() {
        return pointEarn;
    }
    
    public void setPointEarn(int pointEarn) {
        this.pointEarn = pointEarn;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    
    public int getPointsBurn() {
        return pointsBurn;
    }
    
    public void setPointsBurn(int pointsBurn) {
        this.pointsBurn = pointsBurn;
    }
    
    public boolean isPointsRedeemed() {
        return pointsRedeemed;
    }
    
    public void setPointsRedeemed(boolean pointsRedeemed) {
        this.pointsRedeemed = pointsRedeemed;
    }
    
    public boolean isPointsReset() {
        return pointsReset;
    }
    
    public void setPointsReset(boolean pointsReset) {
        this.pointsReset = pointsReset;
    }
    
    public boolean isPointsRewarded() {
        return pointsRewarded;
    }
    
    public void setPointsRewarded(boolean pointsRewarded) {
        this.pointsRewarded = pointsRewarded;
    }
    
    public String getProductCategory() {
        return productCategory;
    }
    
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    
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
    
    public String getProductOffering() {
        return productOffering;
    }
    
    public void setProductOffering(String productOffering) {
        this.productOffering = productOffering;
    }
    
    public Date getTransactionDate() {
        return transactionDate;
    }
    
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    public String getPointsWithSign() {
        return pointsWithSign;
    }
    
    public void setPointsWithSign(String pointsWithSign) {
        this.pointsWithSign = pointsWithSign;
    }
    
    public String getBitType() {
        return bitType;
    }
    
    public void setBitType(String bitType) {
        this.bitType = bitType;
    }
    
    public String getBitTypeName() {
        return bitTypeName;
    }
    
    public void setBitTypeName(String bitTypeName) {
        this.bitTypeName = bitTypeName;
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public String getInfo() {
        return info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
    
    public String getAction() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    
    public String getTransactionType() {
        return transactionType;
    }
    
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    
    public String getReason() {
        return reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    
    @Override
    public String toString() {
        return new StringJoiner(", ", PointStatementDto.class.getSimpleName() + "[", "]")
            .add("newPointBalance=" + newPointBalance)
            .add("oldPointBalance=" + oldPointBalance)
            .add("pointAction='" + pointAction + "'")
            .add("pointEarn=" + pointEarn)
            .add("points=" + points)
            .add("pointsWithSign='" + pointsWithSign + "'")
            .add("pointsBurn=" + pointsBurn)
            .add("pointsRedeemed=" + pointsRedeemed)
            .add("pointsReset=" + pointsReset)
            .add("pointsRewarded=" + pointsRewarded)
            .add("productCategory='" + productCategory + "'")
            .add("productCode='" + productCode + "'")
            .add("productName='" + productName + "'")
            .add("productOffering='" + productOffering + "'")
            .add("transactionDate=" + transactionDate)
            .add("bitType='" + bitType + "'")
            .add("bitTypeName='" + bitTypeName + "'")
            .add("orderId='" + orderId + "'")
            .add("info='" + info + "'")
            .add("action='" + action + "'")
            .add("transactionType='" + transactionType + "'")
            .add("reason='" + reason + "'")
            .toString();
    }
}