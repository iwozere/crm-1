package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AttributeDto {
    private String name;
    private String value;
    private static Log log = LogFactory.getLog(AttributeDto.class);
    private static final List<String> SKIP_FOR_EQUALS = Arrays.asList(
            "TV Service ID",
            "HZN TV Service ID",
            "Sunrise Pay Limit"
    );

    public AttributeDto() {
    }

    public AttributeDto(AttributeDto dto) {
        if (dto == null) {
            return;
        }
        this.name = dto.getName();
        this.value = dto.getValue();
    }

    public AttributeDto(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AttributeDto{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        AttributeDto attributeDto = (AttributeDto) o;

        if (!Objects.equals(this.name, attributeDto.name)) {
            log.debug("Name is not equal.");
            return false;
        }
        if (! SKIP_FOR_EQUALS.contains(name)) {
            if (!Objects.equals(this.value, attributeDto.value)) {
                log.debug("Value is not equal.");
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (! SKIP_FOR_EQUALS.contains(name)) {
            return Objects.hash(name, value);
        } else {
            return Objects.hash(name);
        }
    }
}
