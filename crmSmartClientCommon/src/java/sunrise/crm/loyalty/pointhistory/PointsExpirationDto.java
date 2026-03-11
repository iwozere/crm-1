package sunrise.crm.loyalty.pointhistory;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

public class PointsExpirationDto {
    private Date expirationDate;
    private int points;
    
    public Date getExpirationDate() {
        return expirationDate;
    }
    
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PointsExpirationDto that = (PointsExpirationDto) o;
        return getPoints() == that.getPoints() && Objects.equals(getExpirationDate(), that.getExpirationDate());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getExpirationDate(), getPoints());
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", PointsExpirationDto.class.getSimpleName() + "[", "]")
            .add("expirationDate=" + expirationDate)
            .add("points=" + points)
            .toString();
    }
}