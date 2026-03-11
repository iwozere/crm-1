package sunrise.crm.dto.dp;

public class SapDPDetails {

	private Float openamount;
	private Integer remaininginstallments;
	private Integer totalinstallments;
	private String dpid;
	private String siteid;
	private String relatedSerialNo;
	private String sapMaterialId;
	
	public SapDPDetails() {
    }

    public SapDPDetails(SapDPDetails dto) {
        if (dto == null) {
            return;
        }
        this.openamount = dto.getOpenamount();
        this.remaininginstallments = dto.getRemaininginstallments();
        this.totalinstallments = dto.getTotalinstallments();
        this.dpid = dto.getDpid();
        this.siteid = dto.getSiteid();
        this.relatedSerialNo = dto.getRelatedSerialNo(); 
        this.sapMaterialId = dto.getSapMaterialId();
    }

	public SapDPDetails(Float openamount, Integer remaininginstallments, Integer totalinstallments, String dpid, 
    		String siteid ,String relatedSerialNo, String sapMaterialId) {
        this.openamount = openamount;
        this.remaininginstallments = remaininginstallments;
        this.totalinstallments = totalinstallments;
        this.dpid = dpid;
        this.siteid = siteid;
        this.relatedSerialNo = relatedSerialNo;
        this.sapMaterialId = sapMaterialId;
    }
	
    public Float getOpenamount() {
		return openamount;
	}
	public void setOpenamount(Float openamount) {
		this.openamount = openamount;
	}
	public Integer getRemaininginstallments() {
		return remaininginstallments;
	}
	public void setRemaininginstallments(Integer remaininginstallments) {
		this.remaininginstallments = remaininginstallments;
	}
	public Integer getTotalinstallments() {
		return totalinstallments;
	}
	public void setTotalinstallments(Integer totalinstallments) {
		this.totalinstallments = totalinstallments;
	}
	public String getDpid() {
		return dpid;
	}
	public void setDpid(String dpid) {
		this.dpid = dpid;
	}
	public String getSiteid() {
		return siteid;
	}
	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}
	public String getRelatedSerialNo() {
		return relatedSerialNo;
	}
	public void setRelatedSerialNo(String relatedSerialNo) {
		this.relatedSerialNo = relatedSerialNo;
	}
	public String getSapMaterialId() {
		return sapMaterialId;
	}
	public void setSapMaterialId(String sapMaterialId) {
		this.sapMaterialId = sapMaterialId;
	}
	
	

}
