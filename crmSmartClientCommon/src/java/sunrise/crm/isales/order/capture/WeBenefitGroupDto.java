package sunrise.crm.isales.order.capture;

import java.util.Map;

public class WeBenefitGroupDto {
    public static final String OBJID = "objid";
    public static final String NAME = "name";
    public static final String GROUP_NAME = "x_group_name";

    private String objid;
    private String name;
    private String groupName;

    public WeBenefitGroupDto(Map<String, Object> map) {
        this.objid = map.get(OBJID).toString();
        this.name = map.get(NAME) == null ? null : map.get(NAME).toString();
        this.groupName = map.get(GROUP_NAME).toString();
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getPartNum() {
        return name;
    }

    public void setPartNum(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "XWeBenefitGroupDto{" +
                "objid='" + objid + '\'' +
                ", name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
