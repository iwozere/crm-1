package sunrise.crm.util;

import java.util.Arrays;

import org.apache.commons.beanutils.PropertyUtils;

import sunrise.crm.domain.exceptions.CrmProcessingException;
import sunrise.crm.domain.exceptions.CrmProcessingException.ProcessingIssue;
import sunrise.crm.domain.exceptions.CrmValidationException;

/**
 * @author goncalves
 */
public class CrmValidationUtil {

    public static final String LETTERS_A_Z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String LETTERS_a_z = "abcdefghijklmnopqrstuvwxyz";

    public static final String LETTERS_CAPITAL_UMLAUT = "\u00C4\u00CB\u00CF\u00D6\u00DC\u0178";

    public static final String LETTERS_LOWER_CASE_UMLAUT = "\u00E4\u00EB\u00EF\u00F6\u00FC\u00FF";

    public static final String LETTERS_ALL = LETTERS_CAPITAL_UMLAUT + LETTERS_LOWER_CASE_UMLAUT + LETTERS_A_Z
            + LETTERS_a_z;

    public static final String DIGITS = "0123456789";

    // This validates a number from 000 to 255 (with or without leading zeros)
    // Valid values: 0, 000, 10, 010, 100, 200, 255
    // Unvalid values: 256, 330, 500 and (number with more than 3 digits)
    public static final String OCTET = "([01]?[0-9]{1,2}|2([0-4][0-9]|5[0-5]))";

    /** The Constant PHONE_REGEX. */
	public static final String PHONE_REGEX = "\\+?[0-9]+";

    public static final String PATTERN = "^[" + LETTERS_ALL + DIGITS + "_\\$-][" + LETTERS_ALL + DIGITS + "_\\.&\\$-]*@" + "(("
			+ OCTET + "\\.){3}" + OCTET + "|([" + LETTERS_ALL + DIGITS + "][" + LETTERS_ALL + DIGITS
			+ "-]*\\.)+[A-za-z]{2,6}\\.?)$";
    
    public static final String SERVICE_REGEX = "^[0][0-9]{9}$";

    /**
     * Validate if an object property is empty.
     * 
     * @param obj The object to validate.
     * @param name The property path.
     * @return <code>true</code> if not empty, <code>false</code> otherwise.
     */
    public static boolean isPropertyNotEmpty(Object obj, String name) {
        try {
            if ((obj == null)) {
                return false;
            }
            Object val = PropertyUtils.getProperty(obj, name);
            if (val instanceof String) {
                return CrmStringUtil.isNotEmpty((String) val);
            }
            return val != null;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * An email address is defined as following: user@host The user is a string starting with an alphanumeric
     * char followed by any number of alphanumeric char + allowed symbols. Valid users: john, john.doe,
     * john_doe, john.doe, john..doe Unvalid users: john doe (space is not allowed), _jdoe (the first char can
     * not be a symbol) The host is either an IP address (four octets separated by dots) or a DNS domain name
     * composed of letters, digits, dashes ('-') ending with a "valid" first level domain. Valid IP hosts:
     * 192.168.1.0, 192.168.001.000 Unvalid IP hosts: 300.168.1.0, 192.168.0 Valid DNS host: sunrise.net,
     * my-mobile.com, domain-domain.com. (with an ending dot) Unvalid hosts: -sunrise.net (starts with a
     * dash), sun rise.com (spaces are not allowed) sun..rise.com (two dots in a row are not allowed)
     * 
     * @param email email to be validated
     * @return true if the email is valid, false otherwise
     */
    public static boolean isValidEmailAddress(String email) {

        if (CrmStringUtil.isEmpty(email)) {
            return false;
        }

        //96747 - add + symbol to email validation before @ symbol
        String pattern = "^[" + LETTERS_ALL + DIGITS + "_\\$-][" + LETTERS_ALL + DIGITS + "_\\.+&\\$-]*@" + "(("
                + OCTET + "\\.){3}" + OCTET + "|([" + LETTERS_ALL + DIGITS + "][" + LETTERS_ALL + DIGITS
                + "-]*\\.)+[A-za-z]{2,15}\\.?)$";

        return email.matches(pattern);
    }
    
    public static void assertNotEmpty(String paramValue, String paramName) {
        if (CrmStringUtil.isEmpty(paramValue)) {
            throw new CrmValidationException(paramName);
        }
    }
    
    public static void assertNotNull(Object instance, String description) {
        if (instance instanceof String) {
            throw new CrmProcessingException(ProcessingIssue.METHOD_CALLER_NOT_ALLOWED,
                    "assertNotEmpty should be used instead with String types");
        } else if (instance == null) {
            throw new CrmValidationException(description);
        }
    }
    
    public static void assertContains(String paramValue, String [] expectedValues, String paramName) {
        if (!Arrays.asList(expectedValues).contains(paramValue)) {
            throw new CrmValidationException(paramName, paramValue, CrmStringUtil.join(expectedValues));
        }
    }
    
    public static boolean isValidServiceId(String serviceId) {

        if (CrmStringUtil.isEmpty(serviceId)) {
            return false;
        }

        String pattern = "^[0][0-9]{9}$";

        return serviceId.matches(pattern);
    }
    
}
