package sunrise.crm.loyalty.pointhistory;

import java.util.StringJoiner;

public class PointBucketType {
    
    private String value;
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", PointBucketType.class.getSimpleName() + "[", "]")
            .add("value='" + value + "'")
            .toString();
    }
}