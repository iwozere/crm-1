package sunrise.crm.xvo.pack;

public class XPackPlanInfo {
	
	private String packLevelName;
	private String packProductName;
	
	public String getPackLevelName() {
		return packLevelName;
	}
	public void setPackLevelName(String packLevelName) {
		this.packLevelName = packLevelName;
	}
	public String getPackProductName() {
		return packProductName;
	}
	public void setPackProductName(String packProductName) {
		this.packProductName = packProductName;
	}
	
	
	@Override
	public String toString() {
		return "XPackPlanInfo [packLevelName=" + packLevelName + ", packProductName=" + packProductName + "]";
	}
	
	
}
