package sunrise.crm.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;



/**
 * @author goncalves
 *
 */
public class CrmNumberUtil {

    public static final int RND_DEFAULT_NUM = 10;

	private static final String PATTERN_MSISDN_SHORT = "07[5|6|7|8|9]\\d{7}";
	
	private static final String PATTERN_CURRENCY_NUMBER = "\\+?\\d+\\.?\\d?\\d?";

    private static final Pattern INTERNATIONAL_PHONE_PATTERN = Pattern.compile("^\\+[1-9]\\d{1,14}$");
    
    private static final Pattern SWISS_PHONE_PATTERN = Pattern.compile("^(07[5-9])\\d{7}$");
    
    private static final Pattern FIXNET_PHONE_PATTERN = Pattern.compile("^(0(21|22|24|26|27|31|32|33|34|41|43|44|51|52|55|56|58|61|62|71|81|91))\\d{7}$");
    
    private static Random rnd = new Random(System.currentTimeMillis());
        	
    /**
     * Checks if the input string has a valid numeric format.
	 * numbers like .11 are also allowed
     * 
     * @param input String to be checked for valid number format.
     * @return True, if string has a valid number format. False otherwise.
     * @author Paulo Correia
     * @since R31.0, CR1 for Q6337, 14.04.2011
     */
    public static boolean isNumeric(String input) {
        if (CrmStringUtil.isBlank(input)){
            return false;
        }
        return input.matches("(^(-|\\+)?[0-9]*(\\.[0-9]+)?)+");
    }
    
    /**
     * Check input string if only digits
     * 
     * @param input string which will be checked
     * @return true if only digits, otherwise false
     */
    public static boolean isOnlyDigits(String input) {
        int length = input.length();
        for (int j = 0; j < length; j++) {
            char sign = input.charAt(j);
            if (!Character.isDigit(sign)) {
                return false;
            }
        }
        return true;
    }
    

    /**
     * Convert a boolean to 1, 0 representation sometimes used to store in clarify.
     * 
     * @param value - the boolean value to be converted.
     * @return - 1 if value is true, 0 if false
     */
    public static int boolean2int(boolean value) {
        return value ? 1 : 0;
    }

    /**
     * Convert a int to 1, 0 representation sometimes used to store in clarify.
     * 
     * @param value - the boolean value to be converted.
     * @return - 1 if value is true, 0 if false
     */
    public static boolean int2boolean(int value) {
        return value == 1;
    }
    
    /**
     * If Integer is null make it empty string "".
     * 
     * @param input input Integer
     * @return formatted string
     */
    public static String null2empty(Integer input) {
        if (null == input) {
            return "";
        } else {
            return input.toString();
        }
    }
    
    /**
     * If BigDecimal is null make it 0.
     * 
     * @param input input BigDecimal
     * @return formatted BigDecimal
     */
    public static BigDecimal null2empty(BigDecimal input) {
        if (null == input) {
            return BigDecimal.ZERO;
        } else {
            return input;
        }
    }
    
    /**
     * If BigDecimal is null make it 0.
     *
     * @param input input BigDecimal
     * @return formatted BigDecimal
     */
    public static double null2empty(Double input) {
        if (null == input) {
            return 0;
        } else {
            return input;
        }
    }

    /**
     * Returns a copy of the string if not empty or the value passed as parameter is string is empty.
     * 
     * @param value to be checked
     * @param defaultInt the default int to return
     * @return value if > 0 or default otherwise
     */
    public static int defaultIfLowerOrEqualToZero(int value, int defaultInt) {
        return value > 0 ? value : defaultInt;
    }
    
    /**
     * Rounds the double number to noDecPlaces decimal places
     * @param dNumber number to be rounded
     * @param noDecPlaces number of decimal places
     * @return rounded double number
     */
    public static Double roundToDecimalPlaces(Double dNumber, int noDecPlaces) {                
        String format = "#.";
        if (noDecPlaces > 0) {
            char[] chars = new char[noDecPlaces];
            Arrays.fill(chars, '#');
            format += new String(chars); 
        }
        DecimalFormat df = new DecimalFormat(format);
        return Double.valueOf(df.format(dNumber));
    }
    
    /**
     * Rounds the BigDecimal number to 2 decimal places and returns as String
     * @param bd BigDecimal to be rounded
     * @return rounded String representation
     */
    public static String roundTo2DecimalPlaces(BigDecimal bd){
        return roundToDecimalPlaces( bd, 2 );
    }
    
    /**
     * Rounds the BigDecimal number to noDecPlaces decimal places and returns as String
     * @param bd BigDecimal to be rounded
     * @param noDecPlaces number of decimal places
     * @return rounded String representation
     */
    public static String roundToDecimalPlaces(BigDecimal bd, int noDecPlaces){
        DecimalFormat df = new DecimalFormat();
        bd = bd.setScale(noDecPlaces, BigDecimal.ROUND_DOWN);
        df.setMaximumFractionDigits(noDecPlaces);
        df.setMinimumFractionDigits(noDecPlaces);
        df.setGroupingUsed(false);
        return df.format(bd);
    }
    /**
     * Rounds the BigDecimal number to noDecPlaces decimal places and returns as String
     * @param bd BigDecimal to be rounded
     * @param noDecPlaces number of decimal places
     * @return rounded String representation
     */
    public static String roundToDecimalPlacesHalfUp(BigDecimal bd, int noDecPlaces){
        DecimalFormat df = new DecimalFormat();
        bd = bd.setScale(noDecPlaces, BigDecimal.ROUND_HALF_UP);
        df.setMaximumFractionDigits(noDecPlaces);
        df.setMinimumFractionDigits(noDecPlaces);
        df.setGroupingUsed(false);
        return df.format(bd);
    }

    /**
     * Convert MSISDN to international format.
     * 
     * @param msisdn national
     * @return international
     */
    public static String msisdnToInternational(String nationalMsisdn) {
        return "41" + nationalMsisdn.substring(1);
    }

    /**
     * Convert MSISDN to national format.
     * 
     * @param msisdn international
     * @return national
     */
    public static String msisdnToNational(String internationalMsisdn) {
        return "0" + internationalMsisdn.substring(2);
    }

    /**
     * Get random value from list.
     * 
     * @param lst list
     * @return random value
     */
    public static String getRandomValueFromList(List<String> values) {
        return values.get(CrmNumberUtil.getRandomNumber(values.size()));
    }

    /**
     * Get random number (int).
     * 
     * @param maxNum number
     * @return random number
     */
    public static int getRandomNumber(int maxNum) {
        int rndNum = CrmNumberUtil.rnd.nextInt(maxNum);
        // log.debug("testgen.number=" + rndNum);
        return rndNum;
    }

    /**
     * Get random number (int) 0..9.
     * 
     * @return random number between 0 and 9
     */
    public static int getRandomNumber() {
        return getRandomNumber(RND_DEFAULT_NUM);
    }    

    /**
     * Rounds big decimals to the currency precision - 2 digits after the decimal point, with rounding half_up
     * @param input
     * @return
     */
    public static BigDecimal roundToCurrency(BigDecimal input){
        return input.setScale(2, RoundingMode.HALF_UP);
    }
    
    /**
     * Strips a string of all non digits and returns it
     * @param input
     * @return input without any non digits
     */
    public static String removeNonDigits(String input) {
/*        if (!isNumeric(input)) {
            input =  input.replaceAll("^\\d]", "");
        } else {
           
        }
        return input;*/
        
        return input.replaceAll("[^\\d]", "");
    }
    
    /**
     * Indicates if the input string follows the short MSISDN format.
     * 
     * @param msisdn
     * @return <b>true</b> if the input string is a MSISDN in short format
     */
    public static boolean isMsisdnShort(String msisdn) {    	
        return msisdn != null && Pattern.compile(PATTERN_MSISDN_SHORT).matcher(msisdn).matches();
    }
    
    /**
     * Checks if the input string is a currency number (decimal value up to 2 decimal digits).
     * @param number
     * @return
     */
    public static boolean isCurrencyNumber(String number) {
    	return  number != null && Pattern.compile(PATTERN_CURRENCY_NUMBER).matcher(number).matches();
    }
    
    /**
     * Converts String to Integer without Exception
     * @param str
     * @return Integer or null if not convertible
     */
    public static Integer toInteger(String str) {
    	return toInteger(str, null);    	
    }
    
    /**
     * Converts String to Integer without Exception.
     * If value is unparsable, returns defaultValue
     * @param str
     * @return Integer or null if not convertible
     */
    public static Integer toInteger(String str, Integer defaultValue) {
    	try {
    		return Integer.valueOf(str);
    	} catch (Exception ex) {
    		return defaultValue;
    	}    	
    }
    
    public static Float toFloat(String str) {
    	return toFloat(str, null);    	
    }
      
    public static Float toFloat(String str, Float defaultValue) {
    	try {
    		return Float.valueOf(str);
    	} catch (Exception ex) {
    		return defaultValue;
    	}    	
    }

    /**
     * Checks if provided String is an Integer number
     * @param str input String
     * @return true if input String is an Integer else false
     */
    public static boolean isInteger(String str) {
    	return toInteger(str) != null;    	
    }
    
    /**
     * Checks if provided String is a positive Integer number
     * @param str input String
     * @return true if input String is a positive Integer else false
     */
    public static boolean isPositiveInteger(String str) {
    	Integer num = toInteger(str);
    	return num != null && num > 0;    	
    }
    
    public static boolean isDecimalNumber(String str) {
    	BigDecimal num = toBigDecimal(str);
    	return num != null && num.compareTo(BigDecimal.ZERO) > 0;    	
    }
    
    /**
     * Checks if provided String is a negative Integer number
     * @param str input String
     * @return true if input String is a negative Integer else false
     */
    public static boolean isNegativeInteger(String str) {
    	Integer num = toInteger(str);
    	return num != null && num < 0;    	
    }
    
    /**
     * Converts String to Double without Exception
     * @param str
     * @return Double or null if not convertible
     */
    public static Double toDouble(String str) {
		if (str == null) {
			return null;
		}
    	try {
    		return Double.valueOf(str);
    	} catch (Exception ex) {
    		return null;
    	}    	
    }
    
    /**
     * Converts String to Double without Exception
     * @param str
     * @return Double or defaultValue if not convertible
     */
    public static Double toDouble(String str, double defaultValue) {
    	try {
    		return Double.valueOf(str);
    	} catch (Exception ex) {
    		return defaultValue;
    	}
    }
    
    public static Double toDouble(String str, Double defaultValue) {
    	try {
    		return Double.valueOf(str);
    	} catch (Exception ex) {
    		return defaultValue;
    	}
    }

    /**
     * Converts String to BigDecimal without Exception
     * @param val
     * @return Double or null if not convertible
     */
    public static BigDecimal toBigDecimal(Object val) {
        if (val == null) {
            return null;
        } else if (val instanceof BigDecimal) {
        	return (BigDecimal) val;
		} else if (val instanceof String) {
        	if (CrmNumberUtil.isNumeric((String) val)) {
				return new BigDecimal((String) val);
			} else {
        		return null;
			}
		} else if (val instanceof Double) {
			return BigDecimal.valueOf((Double) val);
		} else if (val instanceof Float) {
			return BigDecimal.valueOf((Float) val);
		} else if (val instanceof Long) {
			return BigDecimal.valueOf((Long) val);
		} else if (val instanceof Integer) {
			return BigDecimal.valueOf((Integer) val);
		} else {
			throw new IllegalArgumentException("Value " + val + " is not a valid number.");
		}
    }
    
    /**
     * Converts String to BigDecimal without Exception
     * @param str input
     * @param defaultValue default
     * @return Double or null if not convertible
     */
    public static BigDecimal toBigDecimal(String str, BigDecimal defaultValue) {
    	try {
    		return new BigDecimal(str);
    	} catch (Exception ex) {
    		return defaultValue;
    	}
    }

    /**
     * Converts to Long
     * @param str
     * @return
     */
    public static Long toLong(String str) {
    	return toLong(str, null);    	
    }
	
    /**
     * Converts to Long
     * @param str
     * @param defaultValue
     * @return
     */
	public static Long toLong(String str, Long defaultValue) {
    	try {
    		return Long.valueOf(str);
    	} catch (Exception ex) {
    		return defaultValue;
    	}    	
    }
    
    public static String bigDecimalToString(Object obj){
        if (obj == null) return null;
        if (!(obj instanceof BigDecimal)) return null;
        BigDecimal bd = (BigDecimal)obj;
        return bd.toString();
    }
    
    public static String bigDecimalToString(Object obj, String defaultValue){
        if (obj == null) return defaultValue;
        if (!(obj instanceof BigDecimal)) return defaultValue;
        BigDecimal bd = (BigDecimal)obj;
        return bd.toString();
    }
    
    public static Date convertTimestampToDate(Object object) {
        if (object == null) return null;
        if (!(object instanceof Timestamp)) return null;
        Timestamp ts = (Timestamp) object;
        return new Date(ts.getTime());
    }

	public static int bigDecimalToInt(Object obj){
		if (obj == null) return 0;
		if (!(obj instanceof BigDecimal)) return 0;
		BigDecimal bd = (BigDecimal)obj;
		return bd.intValue();
	}
	
	/**
	 * Value 1 -> TRUE
	 * Any other value -> FALSE
	 * @param obj
	 * @return
	 */
	public static boolean bigDecimalToBoolean(Object obj){
		if (obj == null) return false;
		if (!(obj instanceof BigDecimal)) return false;
		BigDecimal bd = (BigDecimal)obj;
		return bd.intValue() == 1;
	}

    public static BigDecimal toBigDecimalOrZero(Object obj) {
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof String) {
            return toBigDecimal((String) obj);
        }
        return BigDecimal.ZERO;
    }

	public static boolean isNegativeBigDecimal(BigDecimal discount) {
		if(discount!=null && discount.compareTo(BigDecimal.ZERO) < 0){
			return true;
		}
		return false;
	}
	
	public static BigDecimal toPercentage(BigDecimal part, BigDecimal total) {
		if (part==null || total==null) return null;
		return new BigDecimal(part.doubleValue()/total.doubleValue()*100);		
	}

	public static boolean equals(BigDecimal bd1, BigDecimal bd2) {
		if (bd1 == null && bd2 == null) return true;
		if (bd1 == null || bd2 == null) return false;
		return bd1.compareTo(bd2) == 0;
	}

	public static boolean isInternationalNo(String msisdn) {
        return INTERNATIONAL_PHONE_PATTERN.matcher(msisdn).matches() && !msisdn.startsWith("+41");
	}
	
	public static boolean isFixlineNo(String msisdn) {
        return FIXNET_PHONE_PATTERN.matcher(CrmNumberUtil.replacePlus41With0(msisdn)).matches();
	}
	
	public static boolean isSwissPhoneNo(String msisdn) {
        return SWISS_PHONE_PATTERN.matcher(CrmNumberUtil.replacePlus41With0(msisdn)).matches();
	}
	
	public static String replacePlus41With0(String msisdn) {
		
		msisdn = msisdn.replaceFirst("^0041", "0");
		msisdn = msisdn.replaceFirst("^\\+410", "0");		
		msisdn = msisdn.replaceFirst("^\\+41", "0");
		msisdn = msisdn.replaceAll("[^0-9]", "");
	    return CrmStringUtil.empty2null(msisdn);
    }
    
}

