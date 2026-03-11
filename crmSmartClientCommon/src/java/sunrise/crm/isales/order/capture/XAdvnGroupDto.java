package sunrise.crm.isales.order.capture;

import java.util.Map;

public class XAdvnGroupDto {
    public static final String OBJID = "objid";
    public static final String NAME = "name";

    private String objid;
    private String name;

    public XAdvnGroupDto(Map<String, Object> map) {
        this.objid = map.get(OBJID).toString();
        this.name = (map.get(NAME).toString());
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

    @Override
    public String toString() {
        return "XAivnDiscDto{" +
                "objid='" + objid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
