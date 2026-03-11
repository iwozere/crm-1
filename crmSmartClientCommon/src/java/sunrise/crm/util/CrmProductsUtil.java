package sunrise.crm.util;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CrmProductsUtil {
	
	public static final String SMART_UPGRADE_RATE_PLAN = "Residual Rateplan";
		
	public static final List<String> HZN_TV_OTT_RP = Arrays.asList("Up TV M", "Basic TV", "Basic TV free", "Up TV M Home");
	// 3650 - CR 34091
	private static List<String> NEW_SELECTED_TV_OPTIONS = Arrays.asList("Up TV M", "TV M app", "TV M app Plus",
			"Up TV M Home", "Basic TV","Basic TV free"); 
	private static List<String> CURRENT_SELECTED_TV_OPTIONS = Arrays.asList("TV HZN", "We TV (HZN)",
			"Sunrise Home Unlimited HZN", "Up TV L", "Up TV L Home", "Up TV XL Netflix", "Up TV XL My Sports DE",
			"Up TV XL My Sports FR", "Up TV XL Premium DE", "Up TV XL Premium FR", "Up TV XL Premium IT",
			"Up TV XL Netflix Home+", "Up TV XL My Sports DE Home+", "Up TV XL My Sports FR Home+","WE TV HZN");

	public static final List<String> STELLA_FIXNET_PRODUCT_NAMES = Arrays.asList(
			"Sunrise Up",
			"Sunrise Up XXL",
			"Sunrise Up XXL Business"
	);
	public static final List<String> UP20_FIXNET_PRODUCT_NAMES = Arrays.asList(
			"Up Connect M",
			"Up Connect L",
			"Up Connect XL",
			"Up Home M",
			"Up Home L",
			"Up Home XL",
			"Up Home+ M",
			"Up Home+ L",
			"Up Home+ XL"
	);
	public static final List<String> INTERNET_EASY_FIXNET_PRODUCT_NAMES = Arrays.asList(
			"Easy Internet",
			"Easy Internet and TV"
	);
	public static final List<String> INTERNET_EASY_FIXNET_25_PRODUCT_NAMES = Arrays.asList(
			"Easy Internet 2.5 Giga",
			"Easy Internet 2.5 Giga and TV"
	);
	public static final List<String> SUNRISE_Q_FIXNET_PRODUCT_NAMES = Arrays.asList(
			"Sunrise Internet Q",
			"Sunrise Home Q"
	);
	public static final List<String> STELLA_MOBILE_PRODUCT_NAMES = Arrays.asList(
			"Up Mobile L",
			"Up Mobile M",
			"Up Mobile M Light",
			"Up Mobile S",
			"Up Mobile S Light",
			"Up Mobile Swiss 10",
			"Up Mobile Swiss 10 Light",
			"Up Mobile XL"
	);

	public static final List<String> STELLA_MOBILE_PRODUCT_NAMES_WITH_BENEFITS = Arrays.asList(
			"Up Mobile L",
			"Up Mobile M",
			"Up Mobile M Light",
			"Up Mobile XL",
			"Business Up Mobile M",
			"Business Up Mobile L",
			"Business Up Mobile XL"
	);

	public static final List<String> ONLINE_ONLY_SWISS_MOBILE_PRODUCTS_NAMES = Arrays.asList(
			"Swiss Travel",
			"Swiss Travel+",
			"Swiss Plus"
	);

	public static final List<String> ANTILOPE_MOBILE_PRODUCTS_NAMES = Arrays.asList(
			"Swiss Connect Lite",
			"Swiss Connect Neighbors",
			"Swiss Connect Europe+",
			"Swiss Connect Global",
			"Travel East",
			"Swiss Connect Neighbors Young",
			"Swiss Connect Europe+ Young",
			"Swiss Connect Global Young",
			"Iconic Mobile"
	);

	// Q9701 Stella Babsi
	public static final String STELLA_PRODUCT_FRESH_MOBILE_S = "Fresh Mobile S";
	public static final String STELLA_PRODUCT_FRESH_MOBILE_S_PLUS = "Fresh Mobile S+";
	public static final String STELLA_PRODUCT_FRESH_MOBILE_M = "Fresh Mobile M";
	public static final String STELLA_PRODUCT_FRESH_MOBILE_L = "Fresh Mobile L";
	public static final String STELLA_PRODUCT_FRESH_MOBILE_XL = "Fresh Mobile XL";
	public static final List<String> STELLA_MOBILE_YOUNG_PRODUCT_NAMES = Arrays.asList(STELLA_PRODUCT_FRESH_MOBILE_S, STELLA_PRODUCT_FRESH_MOBILE_S_PLUS, STELLA_PRODUCT_FRESH_MOBILE_M, STELLA_PRODUCT_FRESH_MOBILE_L, STELLA_PRODUCT_FRESH_MOBILE_XL);
	public static final List<String> STELLA_MOBILE_YOUNG_PRODUCT_NAMES_WITH_BENEFITS = Arrays.asList(STELLA_PRODUCT_FRESH_MOBILE_M, STELLA_PRODUCT_FRESH_MOBILE_L, STELLA_PRODUCT_FRESH_MOBILE_XL, "Up Mobile L Young", "Up Mobile XL Young", "Up Mobile M Young", "Up Mobile Swiss 10 Young", "Up Mobile S Young");
    public static final List<String> ALLOWED_SHIPPING_STATUS_FOR_RESHIPMENT = Arrays.asList("Failed Delivery");
    public static final List<String> ALLOWED_STATUS_FOR_HARDWARE_EXCHANGE = Arrays.asList("Delivered","UnexpectedReturn","", "HW delivered by Technician"); // remove In Shipment ASTRA goes commercially live
    public static final String WE_CONNECT_PROD_PREFIX = "We Connect";

    private static final List<String> BUSINESS_SEGMENTS = Arrays.asList("SoHo","Large Corporate","Medium Corporate");
    private static final List<String> PRODUCT_GROUPS = Arrays.asList("GSM Contract","ULL Contract","B2B Contract","Home Protect Contract","Mobile Coverage","Subscription Contract");

	public static boolean isHZNTvWithoutBox(String tvRPName) {
		return HZN_TV_OTT_RP.contains(tvRPName);
	}
	
	//CR 34091
	public static boolean isNewTvRPWithoutBox(String tvRPName) {
		return NEW_SELECTED_TV_OPTIONS.contains(tvRPName);
	}
	
	//CR 34091
	public static boolean isCurrentTvRPWithBox(String tvRPName) {
		return CURRENT_SELECTED_TV_OPTIONS.contains(tvRPName);
	}
	
	//Modem list stored as config item MODEMS_COMPATIBLE_WITH_SMART_WIFI is converted into a map
    public static Map<String, ModemDTO> convertToModemSAPMaterialMap(String sapMatIds) {
    	String[] modems = sapMatIds.split(",");
    	return Stream.of(modems).map(s->s.split(";")).map(a -> new ModemDTO(CrmStringUtil.PREFIX_ZEROES_SAP_MAT_NO + a[0],
    			a[1].equals("Y"), a[2])).collect(Collectors.toMap(ModemDTO::getSapMaterialId, Function.identity()));
     }
    
    public static List<String> extractPodSerials(String podSerials){
        podSerials = podSerials.replace(" ", "").replace("\t", "");
        
        String [] arr = podSerials.split(",");
        if(podSerials.contains("-")){
            arr = podSerials.split("-");
        } else if(podSerials.contains(".")){
            arr = podSerials.split(".");
        } else if(podSerials.contains(";")){
            arr = podSerials.split(";");
        }

        return Arrays.asList(arr);
    }

    /**
     * CR34331: Calculate the 'new' contract-end-date when the new roll-over conditions are met.
     *
     * @param contractEndDate    - the date as stored in the database.
     * @param productType        - the product type {GSM Contract, ULL Contract, etc.}.
     * @param segment            - the customer segment {Residential, SoHo, etc.}.
     * @param conditionsAccepted - flag {0/1} to indicate whether the new rollover conditions have been accepted [1 == YES].
     * @return the contract-end-date
     */
    public static java.util.Date getCalculatedContractEndDate(java.util.Date contractEndDate, String productType, String segment, int conditionsAccepted) {
        if (BUSINESS_SEGMENTS.contains(segment) && conditionsAccepted == 1) {
            // Only perform calculation if a business segment and new rollover conditions accepted!
            Calendar today = Calendar.getInstance(); 
            
            if (PRODUCT_GROUPS.contains(productType)) {

                // First, check whether contract-end-date is in the future
                if (CrmDateUtil.setTimeZero(contractEndDate).after(CrmDateUtil.setTimeZero(today.getTime()))) {
                    // If contract-end-date is at least 90 days in the future, then do nothing
                    if (CrmDateUtil.dateDiffInDays(new Date(), contractEndDate) >= 90) {
                        return contractEndDate;
                    } else {
                        // Add 12 months to the current contract-end-date
                        Calendar newContractEndDate = Calendar.getInstance(); 
                        newContractEndDate.setTime(contractEndDate);
                        newContractEndDate.add(Calendar.MONTH, 12);
                        return newContractEndDate.getTime();
                    }
                } else {
                    // We must add multiples of '12 months' to the database value of the contract-end-date
                    today.add(Calendar.HOUR, 24 * 90);
                    return calculateNewEndDate(contractEndDate, today);
                }
            } else {
                // Old contract conditions
                return contractEndDate;
            }
        }
        // Old contract conditions
        return contractEndDate;
    }

    private static java.util.Date calculateNewEndDate(java.util.Date contractEndDate, Calendar refDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(contractEndDate);
        if (cal.before(refDate)) {
            while (cal.before(refDate)) {
                cal.add(Calendar.MONTH, 12);
            }
        }
        return cal.getTime();
    }

}
