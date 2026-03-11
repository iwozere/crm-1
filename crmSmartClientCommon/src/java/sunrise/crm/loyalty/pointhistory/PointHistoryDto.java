package sunrise.crm.loyalty.pointhistory;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class PointHistoryDto {
    private int points;
    private List<PointsExpirationDto> pointsExpiration;
    private String type;
    
    public int getPoints() {
        return points;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    
    public List<PointsExpirationDto> getPointsExpiration() {
        return pointsExpiration;
    }
    
    public void setPointsExpiration(List<PointsExpirationDto> pointsExpiration) {
        this.pointsExpiration = pointsExpiration;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PointHistoryDto that = (PointHistoryDto) o;
        return getPoints() == that.getPoints() && Objects.equals(getPointsExpiration(), that.getPointsExpiration()) &&
            Objects.equals(getType(), that.getType());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getPoints(), getPointsExpiration(), getType());
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", PointHistoryDto.class.getSimpleName() + "[", "]")
            .add("points=" + points)
            .add("pointsExpiration=" + pointsExpiration)
            .add("type='" + type + "'")
            .toString();
    }
}