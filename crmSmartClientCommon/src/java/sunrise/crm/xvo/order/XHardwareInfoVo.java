package sunrise.crm.xvo.order;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class XHardwareInfoVo {

    private static Log LOG = LogFactory.getLog(XHardwareInfoVo.class);

    private String description;
    private String sapMaterialId;
    private BigDecimal price;

    public XHardwareInfoVo() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSapMaterialId() {
        return sapMaterialId;
    }

    public void setSapMaterialId(String sapMaterialId) {
        this.sapMaterialId = sapMaterialId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", XHardwareInfoVo.class.getSimpleName() + "[", "]")
                .add("description='" + description + "'")
                .add("sapMaterialId='" + sapMaterialId + "'")
                .add("price=" + price)
                .toString();
    }
}
