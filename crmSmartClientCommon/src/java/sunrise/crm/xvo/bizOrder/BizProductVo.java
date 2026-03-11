package sunrise.crm.xvo.bizOrder;

public class BizProductVo {

    private String partNumber;         // part_num.part_number
    private String servicePrefix;      // part_num.x_part_nb_short
    private String grpName;            // part_num.x_srvc_grp_name

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

    public BizProductVo(){}
        
    // ***************************
    // *** Setters and getters ***
    // ***************************
        
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
        
    public String getServicePrefix() {
       return servicePrefix;
    }

    public void setServicePrefix(String servicePrefix) {
        this.servicePrefix = servicePrefix;
    }

    public String getGrpName() {
        return grpName;
    }

    public void setGrpName(String grpName) {
        this.grpName = grpName;
    }
}
