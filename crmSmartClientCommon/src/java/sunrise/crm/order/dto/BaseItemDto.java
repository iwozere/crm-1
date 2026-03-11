package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sunrise.crm.PromoAttribute;
import sunrise.crm.util.CrmStringUtil;

import java.util.*;
import java.util.stream.Collectors;

public class BaseItemDto {
    private String name;
    private String action;
    private String flexBenefitObjid;
    private String sitePartObjid;
    private List<AttributeDto> attributes = new ArrayList<>();
    private static Log log = LogFactory.getLog(BaseItemDto.class);
    private static final List<String> SKIP_FOR_EQUALS = Arrays.asList(
            "Parental Consent",
            "Language",
            "Password"
    );

    public BaseItemDto(BaseItemDto dto) {
        if (dto == null) {
            return;
        }
        this.name = dto.getName();
        this.action = dto.getAction();
        this.flexBenefitObjid = dto.getFlexBenefitObjid();
        this.sitePartObjid = dto.getSitePartObjid();
        for (AttributeDto att : dto.getAttributes()) {
            this.attributes.add(new AttributeDto(att));
        }
    }

    public BaseItemDto(String name, String action, List<AttributeDto> attributes) {
        this.name = name;
        this.action = action;
        this.attributes = attributes;
    }

    public BaseItemDto(String name, String action, String sitePartObjid, List<AttributeDto> attributes) {
        this.name = name;
        this.action = action;
        this.sitePartObjid = sitePartObjid;
        this.attributes = attributes;
    }

    public BaseItemDto(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<AttributeDto> getAttributes() {
        return attributes;
    }


    public String getFlexBenefitObjid() {
        return flexBenefitObjid;
    }

    public void setFlexBenefitObjid(String flexBenefitObjid) {
        this.flexBenefitObjid = flexBenefitObjid;
    }

    public String getAttributeValue(String attrName) {
        if (CrmStringUtil.isEmpty(attrName)) {
            return null;
        }
        for (AttributeDto attr : attributes) {
            if (attrName.equals(attr.getName())) {
                return attr.getValue();
            }
        }
        return null;
    }

    public void setAttribute(String name, String value) {
        for (AttributeDto attribute : getAttributes()) {
            if (name.equals(attribute.getName())) {
                attribute.setValue(value);
                return;
            }
        }
        getAttributes().add(new AttributeDto(name, value));
    }

    public String getSitePartObjid() {
        return sitePartObjid;
    }

    public void setSitePartObjid(String sitePartObjid) {
        this.sitePartObjid = sitePartObjid;
    }

    @Override
    public String toString() {
        return "BaseItemDto [name=" + name + ", action=" + action
                + ", flexBenefitObjid=" + flexBenefitObjid + ", sitePartObjid="
                + sitePartObjid + ", attributes=" + attributes + "]";
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

        BaseItemDto baseItemDto = (BaseItemDto) o;

        if (!Objects.equals(this.name, baseItemDto.name)) {
            log.debug("Name is not equal.");
            return false;
        }
        if (!Objects.equals(this.action, baseItemDto.action)) {
            log.debug("Action is not equal.");
            return false;
        }
        boolean thisFlexBenefitObjid = this.flexBenefitObjid == null;
        boolean thatFlexBenefitObjid = baseItemDto.flexBenefitObjid == null;
        if (!Objects.equals(thisFlexBenefitObjid, thatFlexBenefitObjid)) {
            log.debug("FlexBenefitObjid is not equal.");
            return false;
        }

    if (!Objects.equals(sortingAttributesByName(this.attributes), sortingAttributesByName(baseItemDto.attributes))) {
        log.debug("Attributes are not equal.");
        return false;
    }

        return true;
    }

    private List<AttributeDto> sortingAttributesByName(List<AttributeDto> attributes) {
            return attributes.stream()
                    .filter(attributeDto -> !SKIP_FOR_EQUALS.contains(attributeDto.getName()))
                    .sorted(Comparator.comparing(AttributeDto::getName, Comparator.nullsFirst(Comparator.naturalOrder())))
                    .collect(Collectors.toList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, action, flexBenefitObjid, sortingAttributesByName(attributes));
    }

	public String getCampaignName() {
		if (attributes == null || attributes.isEmpty()){
			return null;
		}
		AttributeDto attrCampName = attributes.stream().filter(attr -> PromoAttribute.ATTR_CAMPAIGN_NAME.equals(attr.getName())).findAny().orElse(null);
		if (attrCampName != null){
			return attrCampName.getValue();
		}
		return null;
	}
}
