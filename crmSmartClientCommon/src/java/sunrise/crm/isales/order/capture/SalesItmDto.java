package sunrise.crm.isales.order.capture;

import java.util.Arrays;
import java.util.Date;

public class SalesItmDto {

    private String objid;
    private String name;
    private String partNumObjid;
    private String partNum;
    private Date startDate;
    private Date endDate;
    private SalesAttrValueDto[] attributes;

    public SalesItmDto() {
    }

    public SalesItmDto(String objid, String name, String partNumObjid) {
        this.objid = objid;
        this.name = name;
        this.partNumObjid = partNumObjid;
    }


    public SalesItmDto(String objid, String name, String partNumObjid, String partNum, Date startDate, Date endDate) {
        this.objid = objid;
        this.name = name;
        this.partNumObjid = partNumObjid;
        this.partNum = partNum;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public SalesItmDto(String objid, String name, String partNumObjid, SalesAttrValueDto[] attributes) {
        this.objid = objid;
        this.name = name;
        this.partNumObjid = partNumObjid;
        this.attributes = attributes;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPartNumObjid(String partNumObjid) {
        this.partNumObjid = partNumObjid;
    }

    public void setAttributes(SalesAttrValueDto[] attributes) {
        this.attributes = attributes;
    }

    public String getObjid() {
        return this.objid;
    }

    public String getName() {
        return this.name;
    }

    public String getPartNumObjid() {
        return this.partNumObjid;
    }

    public SalesAttrValueDto[] getAttributes() {
        return attributes;
    }

    public String getPartNum(){
        return partNum;
    }

    public Date getStartDate(){
        return startDate;
    }

    public Date getEndDate(){
        return endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "SalesItmDto{" +
                "objid='" + objid + '\'' +
                ", name='" + name + '\'' +
                ", partNumObjid='" + partNumObjid + '\'' +
                ", partNum='" + partNum + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", attributes=" + Arrays.toString(attributes) +
                '}';
    }
}
