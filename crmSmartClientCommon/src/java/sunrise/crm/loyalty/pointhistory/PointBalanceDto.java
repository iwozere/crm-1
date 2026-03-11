package sunrise.crm.loyalty.pointhistory;

import java.util.StringJoiner;

public class PointBalanceDto {
    private Integer newPointBalance;
    private Integer oldPointBalance;
    private PointActionDto pointAction;
    private Integer pointEarn;
    private Integer points;
    private Integer pointsBurn;
    private Boolean pointsRedeemed;
    private Boolean pointsReset;
    private Boolean pointsRewarded;
    
    public PointActionDto getPointAction() {
        return pointAction;
    }
    
    public void setPointAction(PointActionDto pointAction) {
        this.pointAction = pointAction;
    }
    
    public Boolean getPointsRewarded() {
        return pointsRewarded;
    }
    
    public void setPointsRewarded(Boolean pointsRewarded) {
        this.pointsRewarded = pointsRewarded;
    }
    
    public Boolean getPointsRedeemed() {
        return pointsRedeemed;
    }
    
    public void setPointsRedeemed(Boolean pointsRedeemed) {
        this.pointsRedeemed = pointsRedeemed;
    }
    
    public Boolean getPointsReset() {
        return pointsReset;
    }
    
    public void setPointsReset(Boolean pointsReset) {
        this.pointsReset = pointsReset;
    }
    
    public Integer getPoints() {
        return points;
    }
    
    public void setPoints(Integer points) {
        this.points = points;
    }
    
    
    public Integer getPointsBurn() {
        return pointsBurn;
    }
    
    public void setPointsBurn(Integer pointsBurn) {
        this.pointsBurn = pointsBurn;
    }
    
    public Integer getPointEarn() {
        return pointEarn;
    }
    
    public void setPointEarn(Integer pointEarn) {
        this.pointEarn = pointEarn;
    }
    
        public Integer getNewPointBalance() {
        return newPointBalance;
    }
    
    public void setNewPointBalance(Integer newPointBalance) {
        this.newPointBalance = newPointBalance;
    }
    
    public Integer getOldPointBalance() {
        return oldPointBalance;
    }
    
    public void setOldPointBalance(Integer oldPointBalance) {
        this.oldPointBalance = oldPointBalance;
    }
    
    
    @Override
    public String toString() {
        return new StringJoiner(", ", PointBalanceDto.class.getSimpleName() + "[", "]")
            .add("newPointBalance=" + newPointBalance)
            .add("oldPointBalance=" + oldPointBalance)
            .add("pointAction=" + pointAction)
            .add("pointEarn=" + pointEarn)
            .add("points=" + points)
            .add("pointsBurn=" + pointsBurn)
            .add("pointsRedeemed=" + pointsRedeemed)
            .add("pointsReset=" + pointsReset)
            .add("pointsRewarded=" + pointsRewarded)
            .toString();
    }
}