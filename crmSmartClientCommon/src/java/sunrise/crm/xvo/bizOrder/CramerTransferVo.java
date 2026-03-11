package sunrise.crm.xvo.bizOrder;

public class CramerTransferVo {

    private String caseId;      // case.id_number
    private String siteId;      // site.site_id
    private String serviceId;   // x_order.service_id

    // ************************************************************************
    // CONSTRUCTOR
    // ************************************************************************

    public CramerTransferVo(){}
        
    // ************************************************************************
    // SETTERS AND GETTERS 
    // ************************************************************************
        
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }
        
    public String getSiteId() {
       return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
