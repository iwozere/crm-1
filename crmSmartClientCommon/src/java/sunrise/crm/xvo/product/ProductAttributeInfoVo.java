package sunrise.crm.xvo.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class ProductAttributeInfoVo {
    private String sitePartObjid;
    private String attributeDefObjid;
    private String attributeValueObjid;
    private String attributeName;
    private String attributeValue;
    private String uom;
    private String uomType;
    private static Log log = LogFactory.getLog(ProductAttributeInfoVo.class);

    private static final List<String> SKIP_FOR_EQUALS = Arrays.asList(
            "TV Service ID",
            "HZN TV Service ID",
            "Sunrise Pay Limit"
    );

    public ProductAttributeInfoVo() {
    }

    public ProductAttributeInfoVo(String attributeName, String attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    public ProductAttributeInfoVo(ProductAttributeInfoVo productAttributeInfoVo) {
        this.sitePartObjid = productAttributeInfoVo.sitePartObjid;
        this.attributeDefObjid = productAttributeInfoVo.attributeDefObjid;
        this.attributeValueObjid = productAttributeInfoVo.attributeValueObjid;
        this.attributeName = productAttributeInfoVo.attributeName;
        this.attributeValue = productAttributeInfoVo.attributeValue;
        this.uom = productAttributeInfoVo.getUom();
        this.uomType = productAttributeInfoVo.getUomType();
    }

    public String getAttributeValueObjid() {
        return attributeValueObjid;
    }

    public void setAttributeValueObjid(String attributeValueObjid) {
        this.attributeValueObjid = attributeValueObjid;
    }

    public String getSitePartObjid() {
        return sitePartObjid;
    }

    public void setSitePartObjid(String sitePartObjid) {
        this.sitePartObjid = sitePartObjid;
    }

    public String getAttributeDefObjid() {
        return attributeDefObjid;
    }

    public void setAttributeDefObjid(String attributeDefObjid) {
        this.attributeDefObjid = attributeDefObjid;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getUomType() {
        return uomType;
    }

    public void setUomType(String uomType) {
        this.uomType = uomType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductAttributeInfoVo productAttributeInfoVo = (ProductAttributeInfoVo) o;

        if (!Objects.equals(this.sitePartObjid, productAttributeInfoVo.sitePartObjid)) {
            //log.debug("SitePartObjid is not equal.");
            return false;
        }
        if (!Objects.equals(this.attributeValueObjid, productAttributeInfoVo.attributeValueObjid)) {
            //log.debug("AttributeValueObjid is not equal.");
            return false;
        }
        if (!Objects.equals(this.attributeName, productAttributeInfoVo.attributeName)) {
            //log.debug("AttributeName is not equal.");
            return false;
        }
        if (! SKIP_FOR_EQUALS.contains(attributeName)) {
            if (!Objects.equals(this.attributeValue, productAttributeInfoVo.attributeValue)) {
                //log.debug("AttributeValue is not equal: " + attributeName + ", this: " + this.attributeValue + ", vo: " + productAttributeInfoVo.attributeValue);
                return false;
            }
        }
        if (!Objects.equals(this.uom, productAttributeInfoVo.uom)) {
            //log.debug("Uom is not equal.");
            return false;
        }
        if (!Objects.equals(this.uomType, productAttributeInfoVo.uomType)) {
            //log.debug("UomType is not equal.");
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if (! SKIP_FOR_EQUALS.contains(attributeName)) {
            return Objects.hash(sitePartObjid, attributeValueObjid
                    , attributeName, attributeValue, uom, uomType);
        } else {
            return Objects.hash(sitePartObjid, attributeValueObjid
                    , attributeName, uom, uomType);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ProductAttributeInfoVo.class.getSimpleName() + "[", "]")
                .add("sitePartObjid='" + sitePartObjid + "'")
                .add("attributeDefObjid='" + attributeDefObjid + "'")
                .add("attributeValueObjid='" + attributeValueObjid + "'")
                .add("attributeName='" + attributeName + "'")
                .add("attributeValue='" + attributeValue + "'")
                .add("uom='" + uom + "'")
                .add("uomType='" + uomType + "'")
                .toString();
    }

}
