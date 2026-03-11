package sunrise.crm.xvo.customer.upc;

/**
 * 
 * @author salgado
 *
 */
public class XBrandServiceInfo {
	
	private String serviceName;
	private int upcCount = 0;
	private int sunriseCount = 0;
	private int yolCount = 0;
	
	public XBrandServiceInfo() {}
	
	public XBrandServiceInfo(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public int getUpcCount() {
		return upcCount;
	}
	public void setUpcCount(int upcCount) {
		this.upcCount = upcCount;
	}
	public int getSunriseCount() {
		return sunriseCount;
	}
	public void setSunriseCount(int sunriseCount) {
		this.sunriseCount = sunriseCount;
	}
	public int getYolCount() {
		return yolCount;
	}
	public void setYolCount(int yolCount) {
		this.yolCount = yolCount;
	}
	
	

}
