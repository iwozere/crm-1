package sunrise.crm.xvo.m4mdc;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class M4mdcMigrationLineItemDto {

    private String objid;
    private String name;
    private List<M4mdcMigrationAttributeDto> attributes = new ArrayList<>();

    public void addAttribute(M4mdcMigrationAttributeDto attribute) {
        attributes.add(attribute);
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<M4mdcMigrationAttributeDto> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<M4mdcMigrationAttributeDto> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
