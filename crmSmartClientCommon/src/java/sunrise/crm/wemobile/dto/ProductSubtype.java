package sunrise.crm.wemobile.dto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ProductSubtype {

    CLASSIC("Classic"),
    YOUNG("Young"),
    LIGHT("Light");

    private final String subType;

    ProductSubtype(String level) {
        this.subType = level;
    }

    public static ProductSubtype fromString(String subType) {
        return Arrays.stream(values()).filter(value -> value.getSubtype().equals(subType)).findFirst().orElseThrow(IllegalArgumentException::new);
    }

    public String getSubtype() {
        return subType;
    }
    public static List<String> levels() {
        return Arrays.stream(values()).map(ProductSubtype::getSubtype).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return this.subType;
    }
}
