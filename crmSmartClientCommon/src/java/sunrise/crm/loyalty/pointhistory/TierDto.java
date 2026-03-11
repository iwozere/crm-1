package sunrise.crm.loyalty.pointhistory;

import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

public class TierDto {
    private Date endDate;
    private Date startDate;
    private String type;
    private String code;
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public Date getEndDate() {
        return endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
        TierDto tierDto = (TierDto) o;
        return Objects.equals(getEndDate(), tierDto.getEndDate()) &&
            Objects.equals(getStartDate(), tierDto.getStartDate()) && Objects.equals(getType(), tierDto.getType()) &&
            Objects.equals(getCode(), tierDto.getCode());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getEndDate(), getStartDate(), getType(), getCode());
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", TierDto.class.getSimpleName() + "[", "]")
            .add("endDate=" + endDate)
            .add("startDate=" + startDate)
            .add("type='" + type + "'")
            .add("code='" + code + "'")
            .toString();
    }
}