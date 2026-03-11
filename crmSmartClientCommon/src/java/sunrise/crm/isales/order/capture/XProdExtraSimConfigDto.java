package sunrise.crm.isales.order.capture;

import java.util.Map;

import com.google.gson.Gson;

import sunrise.crm.util.CrmNumberUtil;

public class XProdExtraSimConfigDto {
	
    public static final String OBJID = "objid";
    public static final String X_PRODUCT_NAME = "X_PRODUCT_NAME";
    public static final String X_PRODUCT_TYPE = "X_PRODUCT_TYPE";
    public static final String X_PRODUCT_STATUS = "X_PRODUCT_STATUS";
    public static final String X_NUM_FREE_BIZ_SIM = "X_NUM_FREE_BIZ_SIM";
    public static final String X_NUM_MAX_BIZ_SIM = "X_NUM_MAX_BIZ_SIM";
    public static final String X_NUM_FREE_WE_CONNECT_SIM = "X_NUM_FREE_WE_CONNECT_SIM";
    public static final String X_NUM_FREE_READY_MOBILE_SIM = "X_NUM_FREE_READY_MOBILE_SIM";
    public static final String X_CONFIG_OVERRIDE = "X_CONFIG_OVERRIDE";

	private String objid;
	private String productName;
	private String productType;
	private String productStatus;
	private int numFreeBizSim;
	private int numMaxBizSim;
	private boolean configOverride;
	private int numFreeWeConnectSim;
	private int numFreeReadyMobileSim;	
	
	public XProdExtraSimConfigDto(XProdExtraSimConfigDto dto){
		this.objid = dto.getObjid();
		this.productName = dto.getProductName();
		this.productType = dto.getProductType();
		this.productStatus = dto.getProductStatus();
		this.numFreeBizSim = dto.getNumFreeBizSim();
		this.numMaxBizSim = dto.getNumMaxBizSim();
		this.numFreeWeConnectSim = dto.getNumFreeWeConnectSim();
		this.numFreeReadyMobileSim = dto.getNumFreeReadyMobileSim();
		this.configOverride = dto.isConfigOverride();
	}

	public XProdExtraSimConfigDto(Map<String, Object> map) {
		this.objid = CrmNumberUtil.bigDecimalToString(map.get(OBJID));
		this.productName = (String) map.get(X_PRODUCT_NAME);
		this.productType = (String) map.get(X_PRODUCT_TYPE);
		this.productStatus = (String) map.get(X_PRODUCT_STATUS);
		this.numFreeBizSim = CrmNumberUtil.toInteger((String) map.get(X_NUM_FREE_BIZ_SIM), 0);
		this.numMaxBizSim = CrmNumberUtil.toInteger((String) map.get(X_NUM_MAX_BIZ_SIM), 0);
		this.numFreeWeConnectSim = CrmNumberUtil.toInteger((String) map.get(X_NUM_FREE_WE_CONNECT_SIM), 0);
		this.numFreeReadyMobileSim = CrmNumberUtil.toInteger((String) map.get(X_NUM_FREE_READY_MOBILE_SIM), 0);
		this.configOverride = "yes".equalsIgnoreCase((String) map.get(X_CONFIG_OVERRIDE));
	}

	public String getObjid() {
		return objid;
	}

	public void setObjid(String objid) {
		this.objid = objid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public int getNumFreeBizSim() {
		return numFreeBizSim;
	}

	public void setNumFreeBizSim(int numFreeBizSim) {
		this.numFreeBizSim = numFreeBizSim;
	}

	public int getNumMaxBizSim() {
		return numMaxBizSim;
	}

	public void setNumMaxBizSim(int numMaxBizSim) {
		this.numMaxBizSim = numMaxBizSim;
	}

	public boolean isConfigOverride() {
		return configOverride;
	}

	public void setConfigOverride(boolean configOverride) {
		this.configOverride = configOverride;
	}

	public int getNumFreeWeConnectSim() {
		return numFreeWeConnectSim;
	}

	public void setNumFreeWeConnectSim(int numFreeWeConnectSim) {
		this.numFreeWeConnectSim = numFreeWeConnectSim;
	}

	public int getNumFreeReadyMobileSim() {
		return numFreeReadyMobileSim;
	}

	public void setNumFreeReadyMobileSim(int numFreeReadyMobileSim) {
		this.numFreeReadyMobileSim = numFreeReadyMobileSim;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
