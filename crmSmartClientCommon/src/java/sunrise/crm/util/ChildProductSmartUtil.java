package sunrise.crm.util;

import java.util.ArrayList;
import java.util.List;

public class ChildProductSmartUtil {
    
    public static final int ALLOWED_CHILD_PRODUCTS = 5 ;
    
    public static final String PART_PARENT_PRODUCT = "ParentProduct";
    public static final String ATTR_PARENT_SERIAL = "Parent Serial";
    
    // old child product List
    public static final String EXTRA_SIM_BUSINESS = "extra SIM Business";
    public static final String EXTRA_SIM_WATCH = "extra SIM watch";
    public static final String EXTRA_SIM_SURF_TALK = "extra SIM surf & talk";
    public static final String FREEDOM_SHARE_DATA = "Freedom share data";
    
    //672157
    public static final String EXTRA_SIM_SURF_TALK_PLUS = "extra SIM surf & talk plus";
    
    // New child products - 9457 - ROBIN
    public static final String WE_CONNECT_EXTRA_SIM_SURF = "We Connect extra SIM surf";
    public static final String WE_CONNECT_EXTRA_SIM_TRACK = "We Connect extra SIM track";
    public static final String WE_CONNECT_EXTRA_SIM_WATCH = "We Connect extra SIM watch";

    // RIGI
    public static final String WE_CONNECT_WATCH = "We Connect watch";
    public static final String BUS_WE_CONNECT_WATCH = "Business We Connect watch";
    
    private static final List<String> DATA_SHARING_PRODUCTS = new ArrayList<>();
    private static final List<String> DATA_VOICE_SHARING_PRODUCTS = new ArrayList<>();
    private static final List<String> ESIM_CHILD_PRODUCTS = new ArrayList<>();
    static {
    	DATA_SHARING_PRODUCTS.add(FREEDOM_SHARE_DATA);
    	DATA_SHARING_PRODUCTS.add(EXTRA_SIM_BUSINESS);
    	DATA_SHARING_PRODUCTS.add(WE_CONNECT_EXTRA_SIM_SURF);
    	DATA_SHARING_PRODUCTS.add(WE_CONNECT_EXTRA_SIM_TRACK);
    	
    	DATA_VOICE_SHARING_PRODUCTS.add(EXTRA_SIM_SURF_TALK);
    	DATA_VOICE_SHARING_PRODUCTS.add(EXTRA_SIM_WATCH);
    	DATA_VOICE_SHARING_PRODUCTS.add(WE_CONNECT_EXTRA_SIM_WATCH);
    	
    	ESIM_CHILD_PRODUCTS.add(EXTRA_SIM_WATCH);
    	ESIM_CHILD_PRODUCTS.add(WE_CONNECT_EXTRA_SIM_WATCH);
    }
    
    public static final String PLASTIC_ESIM_MATERIAL = "000000000000017708";
    public static final String WATCH_SIM_MATERIAL = "000000000000017806";
    
    public static final List<String> ESIM_VOUCHER = new ArrayList<>();
	static {
		ESIM_VOUCHER.add("000000000000017708"); // Printed eSIM Voucher - Postpaid
		ESIM_VOUCHER.add("000000000000019961"); // Digital eSIM Voucher - Postpaid
		ESIM_VOUCHER.add("000000000000019963"); // Digital eSIM Voucher - SIM change - Postpaid
		ESIM_VOUCHER.add("000000000000019962"); // Digital eSIM Voucher - Prepaid
	}
	
	public static final List<String> DIGITAL_ESIM_VOUCHER = new ArrayList<>();
	static {
		DIGITAL_ESIM_VOUCHER.add("000000000000019961"); // Digital eSIM Voucher - Postpaid
		DIGITAL_ESIM_VOUCHER.add("000000000000019963"); // Digital eSIM Voucher - SIM change - Postpaid
		DIGITAL_ESIM_VOUCHER.add("000000000000019962"); // Digital eSIM Voucher - Prepaid
	}	
	
	public static final List<String> MOBILE_ID_SUPPORTED_SIM  = new ArrayList<>();
	static {
		MOBILE_ID_SUPPORTED_SIM.add("000000000000015867");
		MOBILE_ID_SUPPORTED_SIM.add("000000000000015917");
		MOBILE_ID_SUPPORTED_SIM.add("000000000000016055");
		MOBILE_ID_SUPPORTED_SIM.add("000000000000017956");
		MOBILE_ID_SUPPORTED_SIM.add("000000000000017704");
	}
    
    /**************************************************************************************************
     * PUBLIC METHODS
     **************************************************************************************************/
   
    public static boolean isChildProduct(String productName) {

        if (DATA_VOICE_SHARING_PRODUCTS.contains(productName) || DATA_SHARING_PRODUCTS.contains(productName)) {
            return true;
        }
        return false;
    }
    
    public static List<String> getDataSharingProducts(){
        return DATA_SHARING_PRODUCTS;
    }
    
    public static List<String> getDataVoiceSharingProducts(){
        return DATA_VOICE_SHARING_PRODUCTS;
    }
    
    public static List<String> getChildProductWithESim(){
        return ESIM_CHILD_PRODUCTS;
    }
    
    public static boolean isDataSharingProduct(String productName){
        return DATA_SHARING_PRODUCTS.contains(productName);
    }
    
    public static boolean isDataVoiceSharingProduct(String productName){
        return DATA_VOICE_SHARING_PRODUCTS.contains(productName);
    }
    
    public static boolean isWatchChildProduct(String productName){
        return ESIM_CHILD_PRODUCTS.contains(productName);
    }
    
    public static boolean isDataSmsSharingProduct(String productName) {
        return EXTRA_SIM_BUSINESS.equals(productName)
                || WE_CONNECT_EXTRA_SIM_SURF.equals(productName)
                || WE_CONNECT_EXTRA_SIM_TRACK.equals(productName);
    }
    
    public static boolean isNewDataSharingProduct(String productName) {
        return WE_CONNECT_EXTRA_SIM_SURF.equals(productName) || WE_CONNECT_EXTRA_SIM_TRACK.equals(productName);
    }
    
    public static boolean isProductWithDeviceDependentSim(String productName){
       return WE_CONNECT_WATCH.equals(productName) || BUS_WE_CONNECT_WATCH.equals(productName);
    }
}
