package sunrise.crm.util;

import org.apache.commons.lang.ArrayUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * @author Goncalves
 */
public final class CrmStringUtil {
    
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final String OTO_ID_FORMAT = "([A-B]\\.\\d{3}\\.\\d{3}\\.\\d{3}\\.[0-9X]\\.[1-4])|(A\\.\\d{3}\\.\\d{3}\\.\\d{3}\\.[1-4])";
    public static final String OTO_ID_FORMAT_NO_PLUG = "([A-B]\\.\\d{3}\\.\\d{3}\\.\\d{3}\\.[0-9X])|(A\\.\\d{3}\\.\\d{3}\\.\\d{3})";
    public static final String EMAIL_FORMAT  = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";    
    public static final String MSISDN_FORMAT  = "^07+[5-9]+\\d{7}";
    public static final String IBAN_FORMAT = "[A-Z]{2}[0-9]{2}[0-9a-zA-Z]{1,30}";
    public static final String INTL_MSISDN_FORMAT = "^00(?:[0-9] ?){6,14}[0-9]$";
    public static final String MAC_ADDRESS_FORMAT = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})|([0-9a-fA-F]{4}\\.[0-9a-fA-F]{4}\\.[0-9a-fA-F]{4})$";
      
    public static final String INDEXED_ATTRIBUTE_FORMAT = "%s(%s)";
    
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static final int IMEI_LENGTH = 15;
    public static final String PREFIX_ZEROES_SAP_MAT_NO = "000000000000";
    
   public static final String DEFAULT = "Default";
    /**
     * The empty String <code>""</code>.
     * 
     * @since 2.0
     */
    public static final String EMPTY = "";
    
    private static String toString(Object obj) {
        return obj == null ? "" : obj.toString();
    }
    
    private static String toString(Object obj, String nullStr) {
        return obj == null ? nullStr : obj.toString();
    }

    /**
     * @param elements
     * @param separator
     * @param addQuotes
     * @return
     */
    public static String join(List<String> elements, String separator, boolean addQuotes) {

        if (!addQuotes) {
            return join(elements, separator);
        }

        List<String> preparedList = new LinkedList<String>();

        for (String element : elements) {
            preparedList.add("'" + element + "'");
        }

        return join(preparedList, separator);
    }
    
    /**
     * @param elements
     * @param separator
     * @param lastElementSeparator
     * @param addQuotes
     * @return
     */
	public static String join(List<String> elements, String separator, String lastElementSeparator, boolean addQuotes) {

		int last = elements.size() - 1;
		if (!addQuotes) {
			return join(lastElementSeparator, String.join(separator, elements.subList(0, last)), elements.get(last));
		}

		List<String> preparedList = new LinkedList<String>();

		for (String element : elements) {
			preparedList.add("'" + element + "'");
		}

		return join(lastElementSeparator, String.join(separator, preparedList.subList(0, last)),
				preparedList.get(last));
	}

    /**
     * @param array
     * @param separator
     * @param addQuotes
     * @return
     */
    public static String join(Object[] array, String separator, boolean addQuotes) {

        if (!addQuotes) {
            return join(array, separator);
        }

        List<String> preparedList = new LinkedList<String>();

        for (int i = 0; i < array.length; i++) {
            preparedList.add("'" + array[i] + "'");
        }

        return join(preparedList, separator);
    }
    
    /**
     * @param array
     * @param separator
     * @param addQuotes
     * @return
     */
    public static String prefixZeroesAndJoin(Object[] array, String separator, boolean addQuotes) {

        if (!addQuotes) {
            return join(array, separator);
        }

        List<String> preparedList = new LinkedList<String>();

        for (int i = 0; i < array.length; i++) {
            preparedList.add("'" + PREFIX_ZEROES_SAP_MAT_NO + array[i] + "'");
        }

        return join(preparedList, separator);
     }
    
    
    public static String join(String separator, String... elements) {
        if (elements == null || elements.length == 0) {
        	return "";
        }        
        StringBuffer result = new StringBuffer();
        for (int i=0; i < elements.length; i++) {
        	result.append(null2empty(elements[i]));
        	if (i != elements.length-1) {
        		result.append(separator);
        	}
		}
        return result.toString();
    }

    // THE FOLLOWING METHODS WERE COPIED FROM CLASS org.apache.commons.lang.StringUtils
    // WHICH IS PART OF commons-lang-2.3.jar
    // SINCE CURRENTLY WE ONLY SUPPORT commons-lang-2.1.jar

    /**
     * @param str
     * @return true if (str == null || str.length() == 0)
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * @param str
     * @return true if (str == null || str.length() == 0 || str.equals("."))
     */
    public static boolean isEmptyOrDot(String str) {
        return str == null || str.length() == 0 || str.equals(".");
    }
    
    /**
     * Returns true if input string is either empty or dot or TBD
     * @param str input String
     * @return true/false
     */
    public static boolean isEmptyOrDotOrTBD(String str) {
        return isEmpty(str) || ".".equals(str) || "TBD".equals(str);
    }

    /**
     * Returns true if string is empty or N/A
     * @param string
     * @return true/flase
     */
    public static boolean isEmptyOrNA(String string){
        return isEmpty(string) || "N/A".equalsIgnoreCase(string);
    }

    public static boolean isNotEmptyOrNA(String string) {
        return !isEmptyOrNA(string);
    }
    
    /**
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
    
    /**
     * @param str
     * @return
     */
    public static boolean isNotNull(String str) {
        return isNotEmpty(str) && !str.equalsIgnoreCase("null");
    }

    /**
     * @param str
     * @return
     */
    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(String str) {
    	return !isBlank(str);
    }

    public static boolean isTrimmedEmpty(String s) {
        return s == null || s.trim().length() == 0;
    }
    
    public static boolean isNotTrimmedEmpty(String s) {
        return !isTrimmedEmpty(s);
    }
    
    public static boolean isTrimmedEmpty(Object s) {
        return s == null || s.toString().trim().length() == 0;
    }
    
    public static boolean isNotTrimmedEmpty(Object stringObject) {
        //return (stringObject != null ) && !isTrimmedEmpty(stringObject.toString());
    	return !isTrimmedEmpty(stringObject);
    }
    
    public static boolean isAnyEmpty(String ... strings){
    	 if (strings != null) {
             for (String string : strings) {
                 if (CrmStringUtil.isBlank(string)) return true;
             }
             return false;
         }
         return true;
    	
    }

    /**
     * @param str
     * @param separatorChars
     * @return
     */
    public static String[] split(String str, String separatorChars) {
        return splitWorker(str, separatorChars, -1, false);
    }

    /**
     * @param str
     * @param separatorChars
     * @param max
     * @param preserveAllTokens
     * @return
     */
    private static String[] splitWorker(String str, String separatorChars, int max, boolean preserveAllTokens) {
        // Performance tuned for 2.0 (JDK1.4)
        // Direct code is quicker than StringTokenizer.
        // Also, StringTokenizer uses isSpace() not isWhitespace()

        if (str == null) {
            return null;
        }
        int len = str.length();
        if (len == 0) {
            return EMPTY_STRING_ARRAY;
        }
        List list = new ArrayList();
        int sizePlus1 = 1;
        int i = 0, start = 0;
        boolean match = false;
        boolean lastMatch = false;
        if (separatorChars == null) {
            // Null separator means use whitespace
            while (i < len) {
                if (Character.isWhitespace(str.charAt(i))) {
                    if (match || preserveAllTokens) {
                        lastMatch = true;
                        if (sizePlus1++ == max) {
                            i = len;
                            lastMatch = false;
                        }
                        list.add(str.substring(start, i));
                        match = false;
                    }
                    start = ++i;
                    continue;
                } else {
                    lastMatch = false;
                }
                match = true;
                i++;
            }
        } else if (separatorChars.length() == 1) {
            // Optimise 1 character case
            char sep = separatorChars.charAt(0);
            while (i < len) {
                if (str.charAt(i) == sep) {
                    if (match || preserveAllTokens) {
                        lastMatch = true;
                        if (sizePlus1++ == max) {
                            i = len;
                            lastMatch = false;
                        }
                        list.add(str.substring(start, i));
                        match = false;
                    }
                    start = ++i;
                    continue;
                } else {
                    lastMatch = false;
                }
                match = true;
                i++;
            }
        } else {
            // standard case
            while (i < len) {
                if (separatorChars.indexOf(str.charAt(i)) >= 0) {
                    if (match || preserveAllTokens) {
                        lastMatch = true;
                        if (sizePlus1++ == max) {
                            i = len;
                            lastMatch = false;
                        }
                        list.add(str.substring(start, i));
                        match = false;
                    }
                    start = ++i;
                    continue;
                } else {
                    lastMatch = false;
                }
                match = true;
                i++;
            }
        }
        if (match || (preserveAllTokens && lastMatch)) {
            list.add(str.substring(start, i));
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    // Joining
    // -----------------------------------------------------------------------
    /**
     * <p>
     * Concatenates elements of an array into a single String. Null objects or empty strings within the array
     * are represented by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.concatenate(null)            = null
     * StringUtils.concatenate([])              = ""
     * StringUtils.concatenate([null])          = ""
     * StringUtils.concatenate(["a", "b", "c"]) = "abc"
     * StringUtils.concatenate([null, "", "a"]) = "a"
     * </pre>
     * 
     * @param array the array of values to concatenate, may be null
     * @return the concatenated String, <code>null</code> if null array input
     */
    /*
     * public static String concatenate(Object[] array) { return join(array, null); }
     */

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * <p>
     * No separator is added to the joined String. Null objects or empty strings within the array are
     * represented by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null)            = null
     * StringUtils.join([])              = ""
     * StringUtils.join([null])          = ""
     * StringUtils.join(["a", "b", "c"]) = "abc"
     * StringUtils.join([null, "", "a"]) = "a"
     * </pre>
     * 
     * @param array the array of values to join together, may be null
     * @return the joined String, <code>null</code> if null array input
     * @since 2.0
     */
    public static String join(Object[] array) {
        return join(array, null);
    }

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are
     * represented by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join(["a", "b", "c"], ';')  = "a;b;c"
     * StringUtils.join(["a", "b", "c"], null) = "abc"
     * StringUtils.join([null, "", "a"], ';')  = ";;a"
     * </pre>
     * 
     * @param array the array of values to join together, may be null
     * @param separator the separator character to use
     * @return the joined String, <code>null</code> if null array input
     * @since 2.0
     */
    public static String join(Object[] array, char separator) {
        if (array == null) {
            return null;
        }

        return join(array, separator, 0, array.length);
    }

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are
     * represented by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join(["a", "b", "c"], ';')  = "a;b;c"
     * StringUtils.join(["a", "b", "c"], null) = "abc"
     * StringUtils.join([null, "", "a"], ';')  = ";;a"
     * </pre>
     * 
     * @param array the array of values to join together, may be null
     * @param separator the separator character to use
     * @param startIndex the first index to start joining from. It is an error to pass in an end index past
     *            the end of the array
     * @param endIndex the index to stop joining from (exclusive). It is an error to pass in an end index past
     *            the end of the array
     * @return the joined String, <code>null</code> if null array input
     * @since 2.0
     */
    public static String join(Object[] array, char separator, int startIndex, int endIndex) {
        if (array == null) {
            return null;
        }
        int bufSize = (endIndex - startIndex);
        if (bufSize <= 0) {
            return EMPTY;
        }

        bufSize *= ((array[startIndex] == null ? 16 : array[startIndex].toString().length()) + 1);
        StringBuffer buf = new StringBuffer(bufSize);

        for (int i = startIndex; i < endIndex; i++) {
            if (i > startIndex) {
                buf.append(separator);
            }
            if (array[i] != null) {
                buf.append(array[i]);
            }
        }
        return buf.toString();
    }

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * <p>
     * No delimiter is added before or after the list. A <code>null</code> separator is the same as an empty
     * String (""). Null objects or empty strings within the array are represented by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)                = null
     * StringUtils.join([], *)                  = ""
     * StringUtils.join([null], *)              = ""
     * StringUtils.join(["a", "b", "c"], "--")  = "a--b--c"
     * StringUtils.join(["a", "b", "c"], null)  = "abc"
     * StringUtils.join(["a", "b", "c"], "")    = "abc"
     * StringUtils.join([null, "", "a"], ',')   = ",,a"
     * </pre>
     * 
     * @param array the array of values to join together, may be null
     * @param separator the separator character to use, null treated as ""
     * @return the joined String, <code>null</code> if null array input
     */
    public static String join(Object[] array, String separator) {
        if (array == null) {
            return null;
        }
        return join(array, separator, 0, array.length);
    }

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * <p>
     * No delimiter is added before or after the list. A <code>null</code> separator is the same as an empty
     * String (""). Null objects or empty strings within the array are represented by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)                = null
     * StringUtils.join([], *)                  = ""
     * StringUtils.join([null], *)              = ""
     * StringUtils.join(["a", "b", "c"], "--")  = "a--b--c"
     * StringUtils.join(["a", "b", "c"], null)  = "abc"
     * StringUtils.join(["a", "b", "c"], "")    = "abc"
     * StringUtils.join([null, "", "a"], ',')   = ",,a"
     * </pre>
     * 
     * @param array the array of values to join together, may be null
     * @param separator the separator character to use, null treated as ""
     * @param startIndex the first index to start joining from. It is an error to pass in an end index past
     *            the end of the array
     * @param endIndex the index to stop joining from (exclusive). It is an error to pass in an end index past
     *            the end of the array
     * @return the joined String, <code>null</code> if null array input
     */
    public static String join(Object[] array, String separator, int startIndex, int endIndex) {
        if (array == null) {
            return null;
        }
        if (separator == null) {
            separator = EMPTY;
        }

        // endIndex - startIndex > 0: Len = NofStrings *(len(firstString) + len(separator))
        // (Assuming that all Strings are roughly equally long)
        int bufSize = (endIndex - startIndex);
        if (bufSize <= 0) {
            return EMPTY;
        }

        bufSize *= ((array[startIndex] == null ? 16 : array[startIndex].toString().length()) + separator
                .length());

        StringBuffer buf = new StringBuffer(bufSize);

        for (int i = startIndex; i < endIndex; i++) {
            if (i > startIndex) {
                buf.append(separator);
            }
            if (array[i] != null) {
                buf.append(array[i]);
            }
        }
        return buf.toString();
    }

    /**
     * <p>
     * Joins the elements of the provided <code>Iterator</code> into a single String containing the provided
     * elements.
     * </p>
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the iteration are
     * represented by empty strings.
     * </p>
     * <p>
     * See the examples here: {@link #join(Object[],char)}.
     * </p>
     * 
     * @param iterator the <code>Iterator</code> of values to join together, may be null
     * @param separator the separator character to use
     * @return the joined String, <code>null</code> if null iterator input
     * @since 2.0
     */
    public static String join(Iterator iterator, char separator) {

        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return EMPTY;
        }
        Object first = iterator.next();
        if (!iterator.hasNext()) {
            return toString(first);
        }

        // two or more elements
        StringBuffer buf = new StringBuffer(256); // Java default is 16, probably too small
        if (first != null) {
            buf.append(first);
        }

        while (iterator.hasNext()) {
            buf.append(separator);
            Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            }
        }

        return buf.toString();
    }

    /**
     * <p>
     * Joins the elements of the provided <code>Iterator</code> into a single String containing the provided
     * elements.
     * </p>
     * <p>
     * No delimiter is added before or after the list. A <code>null</code> separator is the same as an empty
     * String ("").
     * </p>
     * <p>
     * See the examples here: {@link #join(Object[],String)}.
     * </p>
     * 
     * @param iterator the <code>Iterator</code> of values to join together, may be null
     * @param separator the separator character to use, null treated as ""
     * @return the joined String, <code>null</code> if null iterator input
     */
    public static String join(Iterator iterator, String separator) {

        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return EMPTY;
        }
        Object first = iterator.next();
        if (!iterator.hasNext()) {
            return toString(first);
        }

        // two or more elements
        StringBuffer buf = new StringBuffer(256); // Java default is 16, probably too small
        if (first != null) {
            buf.append(first);
        }

        while (iterator.hasNext()) {
            if (separator != null) {
                buf.append(separator);
            }
            Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            }
        }
        return buf.toString();
    }

    /**
     * <p>
     * Joins the elements of the provided <code>Collection</code> into a single String containing the provided
     * elements.
     * </p>
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the iteration are
     * represented by empty strings.
     * </p>
     * <p>
     * See the examples here: {@link #join(Object[],char)}.
     * </p>
     * 
     * @param collection the <code>Collection</code> of values to join together, may be null
     * @param separator the separator character to use
     * @return the joined String, <code>null</code> if null iterator input
     * @since 2.3
     */
    public static String join(Collection collection, char separator) {
        if (collection == null) {
            return null;
        }
        return join(collection.iterator(), separator);
    }

    /**
     * <p>
     * Joins the elements of the provided <code>Collection</code> into a single String containing the provided
     * elements.
     * </p>
     * <p>
     * No delimiter is added before or after the list. A <code>null</code> separator is the same as an empty
     * String ("").
     * </p>
     * <p>
     * See the examples here: {@link #join(Object[],String)}.
     * </p>
     * 
     * @param collection the <code>Collection</code> of values to join together, may be null
     * @param separator the separator character to use, null treated as ""
     * @return the joined String, <code>null</code> if null iterator input
     * @since 2.3
     */
    public static String join(Collection collection, String separator) {
        if (collection == null) {
            return null;
        }
        return join(collection.iterator(), separator);
    }

    /**
     * <p>
     * Replaces all occurrences of a String within another String.
     * </p>
     * <p>
     * A <code>null</code> reference passed to this method is a no-op.
     * </p>
     * 
     * <pre>
     * StringUtils.replace(null, *, *)        = null
     * StringUtils.replace("", *, *)          = ""
     * StringUtils.replace("any", null, *)    = "any"
     * StringUtils.replace("any", *, null)    = "any"
     * StringUtils.replace("any", "", *)      = "any"
     * StringUtils.replace("aba", "a", null)  = "aba"
     * StringUtils.replace("aba", "a", "")    = "b"
     * StringUtils.replace("aba", "a", "z")   = "zbz"
     * </pre>
     * 
     * @see #replace(String text, String repl, String with, int max)
     * @param text text to search and replace in, may be null
     * @param repl the String to search for, may be null
     * @param with the String to replace with, may be null
     * @return the text with any replacements processed, <code>null</code> if null String input
     */
    public static String replace(String text, String repl, String with) {
        return replace(text, repl, with, -1);
    }

    /**
     * <p>
     * Replaces a String with another String inside a larger String, for the first <code>max</code> values of
     * the search String.
     * </p>
     * <p>
     * A <code>null</code> reference passed to this method is a no-op.
     * </p>
     * 
     * <pre>
     * StringUtils.replace(null, *, *, *)         = null
     * StringUtils.replace("", *, *, *)           = ""
     * StringUtils.replace("any", null, *, *)     = "any"
     * StringUtils.replace("any", *, null, *)     = "any"
     * StringUtils.replace("any", "", *, *)       = "any"
     * StringUtils.replace("any", *, *, 0)        = "any"
     * StringUtils.replace("abaa", "a", null, -1) = "abaa"
     * StringUtils.replace("abaa", "a", "", -1)   = "b"
     * StringUtils.replace("abaa", "a", "z", 0)   = "abaa"
     * StringUtils.replace("abaa", "a", "z", 1)   = "zbaa"
     * StringUtils.replace("abaa", "a", "z", 2)   = "zbza"
     * StringUtils.replace("abaa", "a", "z", -1)  = "zbzz"
     * </pre>
     * 
     * @param text text to search and replace in, may be null
     * @param repl the String to search for, may be null
     * @param with the String to replace with, may be null
     * @param max maximum number of values to replace, or <code>-1</code> if no maximum
     * @return the text with any replacements processed, <code>null</code> if null String input
     */
    public static String replace(String text, String repl, String with, int max) {
        if (isEmpty(text) || isEmpty(repl) || with == null || max == 0) {
            return text;
        }
        int start = 0;
        int end = text.indexOf(repl, start);
        if (end == -1) {
            return text;
        }
        int replLength = repl.length();
        int increase = with.length() - replLength;
        increase = (increase < 0 ? 0 : increase);
        increase *= (max < 0 ? 16 : (max > 64 ? 64 : max));
        StringBuffer buf = new StringBuffer(text.length() + increase);
        while (end != -1) {
            buf.append(text.substring(start, end)).append(with);
            start = end + replLength;
            if (--max == 0) {
                break;
            }
            end = text.indexOf(repl, start);
        }
        buf.append(text.substring(start));
        return buf.toString();
    }

    /**
     * <p>
     * Removes control characters (char &lt;= 32) from both ends of this String, handling <code>null</code> by
     * returning <code>null</code>.
     * </p>
     * <p>
     * The String is trimmed using {@link String#trim()}. Trim removes start and end characters &lt;= 32. To
     * strip whitespace use {@link #strip(String)}.
     * </p>
     * <p>
     * To trim your choice of characters, use the {@link #strip(String, String)} methods.
     * </p>
     * 
     * <pre>
     * StringUtils.trim(null)          = null
     * StringUtils.trim("")            = ""
     * StringUtils.trim("     ")       = ""
     * StringUtils.trim("abc")         = "abc"
     * StringUtils.trim("    abc    ") = "abc"
     * </pre>
     * 
     * @param str the String to be trimmed, may be null
     * @return the trimmed string, <code>null</code> if null String input
     */
    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

    /**
     * <p>
     * Removes control characters (char &lt;= 32) from both ends of this String returning <code>null</code> if
     * the String is empty ("") after the trim or if it is <code>null</code>.
     * <p>
     * The String is trimmed using {@link String#trim()}. Trim removes start and end characters &lt;= 32. To
     * strip whitespace use {@link #stripToNull(String)}.
     * </p>
     * 
     * <pre>
     * StringUtils.trimToNull(null)          = null
     * StringUtils.trimToNull("")            = null
     * StringUtils.trimToNull("     ")       = null
     * StringUtils.trimToNull("abc")         = "abc"
     * StringUtils.trimToNull("    abc    ") = "abc"
     * </pre>
     * 
     * @param str the String to be trimmed, may be null
     * @return the trimmed String, <code>null</code> if only chars &lt;= 32, empty or null String input
     * @since 2.0
     */
    public static String trimToNull(String str) {
        String ts = trim(str);
        return isEmpty(ts) ? null : ts;
    }

    /**
     * <p>
     * Removes control characters (char &lt;= 32) from both ends of this String returning an empty String ("")
     * if the String is empty ("") after the trim or if it is <code>null</code>.
     * <p>
     * The String is trimmed using {@link String#trim()}. Trim removes start and end characters &lt;= 32. To
     * strip whitespace use {@link #stripToEmpty(String)}.
     * </p>
     * 
     * <pre>
     * StringUtils.trimToEmpty(null)          = ""
     * StringUtils.trimToEmpty("")            = ""
     * StringUtils.trimToEmpty("     ")       = ""
     * StringUtils.trimToEmpty("abc")         = "abc"
     * StringUtils.trimToEmpty("    abc    ") = "abc"
     * </pre>
     * 
     * @param str the String to be trimmed, may be null
     * @return the trimmed String, or an empty String if <code>null</code> input
     * @since 2.0
     */
    public static String trimToEmpty(String str) {
        return str == null ? EMPTY : str.trim();
    }

    // More customised methods below

    /**
     * <p>
     * Returns either the passed in String, or if the String is <code>null</code>, an empty String ("").
     * </p>
     * 
     * <pre>
     * StringUtils.defaultString(null)  = ""
     * StringUtils.defaultString("")    = ""
     * StringUtils.defaultString("bat") = "bat"
     * </pre>
     * 
     * @see ObjectUtils#toString(Object)
     * @see String#valueOf(Object)
     * @param str the String to check, may be null
     * @return the passed in String, or the empty String if it was <code>null</code>
     */
    public static String defaultString(String str) {
        return str == null ? EMPTY : str;
    }

    /**
     * Capitalizes first letter of a string. Other characters are lower case.
     * 
     * @param str string
     * @return
     */
    public static String capitalizeFirstLetter(String str) {

        if (isBlank(str)) {
            return str;
        }

        StringBuilder builder = new StringBuilder(str.length());
        builder.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            builder.append(Character.toLowerCase(str.charAt(i)));
        }

        return builder.toString();
    }

    /**
     * <p>
     * Returns either the passed in String, or if the String is empty or <code>null</code>, the value of
     * <code>defaultStr</code>.
     * </p>
     * 
     * <pre>
     * StringUtils.defaultIfEmpty(null, "NULL")  = "NULL"
     * StringUtils.defaultIfEmpty("", "NULL")    = "NULL"
     * StringUtils.defaultIfEmpty("bat", "NULL") = "bat"
     * </pre>
     * 
     * @param str the String to check, may be null
     * @param defaultStr the default String to return if the input is empty ("") or <code>null</code>, may be
     *            null
     * @return the passed in String, or the default
     */
    public static String defaultIfEmpty(String str, String defaultStr) {
        return isEmpty(str) ? defaultStr : str;
    }

    /**
     * Turns a string value to camel case.
     * <p>
     * Camel case strings are characterised by spaces being removed and letters immediately following a space
     * being made upper-case. <br>
     * e.g. "hi mum" -> "hiMum"
     * </p>
     * <p>
     * Upper-case letters in the input string will not be made lower-case. This includes upper-case letters at
     * the very start of the string. <br>
     * e.g. "my SMS" -> "mySMS", "Hi Mum" -> "HiMum"
     * </p>
     * <p>
     * Will remove all leading and trailing spaces.
     * </p>
     * <p>
     * Has primitive handling for special characters.
     * </p>
     * <p>
     * Will throw NullPointerException if null is passed as the input parameter.
     * </p>
     * 
     * @param str String to be converted to camel case
     * @return converted string
     */
    public static String toCamelCase(String str) {
        final char space = ' ';
        final char tab = '\t';
        // Remove lead/trailing spaces and put in a char array
        char[] from = str.trim().toCharArray();
        char[] to = new char[from.length];
        boolean spaceLastFound = false;
        for (int i = 0, j = 0; i < from.length; i++) {
            if (from[i] == space || from[i] == tab) {
                spaceLastFound = true;
                continue;
            } else {
                if (spaceLastFound) {
                    // Use the java String utility to upper-case
                    // the letter as it is hoped it will handle
                    // unicode and special chars appropriately.
                    to[j] = String.valueOf(from[i]).toUpperCase().charAt(0);
                } else {
                    to[j] = from[i];
                }
                j++;
                spaceLastFound = false;
            }
        }
        String toReturn = String.valueOf(to).trim();
        return toReturn;
    }

    /**
     * Turns a String value to lower camel case.
     * <p>
     * Lower camel case is characterised by the first letter being lower-case, spaces being removed and
     * letters immediately following a space being made upper-case. <br>
     * e.g. "hi mum" -> "hiMum"
     * </p>
     * <p>
     * Upper-case letters in the input string will not be made lower-case, except where they are at the very
     * start of the input string. <br>
     * e.g. "my SMS" -> "mySMS", "Hi Mum" -> "hiMum", "HELLO" -> hELLO"
     * </p>
     * <p>
     * Will remove all leading and trailing spaces.
     * </p>
     * <p>
     * Has primitive handling for special characters.
     * </p>
     * <p>
     * Will throw NullPointerException if null is passed as the input parameter.
     * </p>
     * 
     * @param str String to be converted to lower camel case
     * @return converted string
     */
    public static String toLowerCamelCase(String str) {
        String toReturn = new String();
        // Camel case the string.
        String camel = toCamelCase(str);
        if (camel.length() > 0) {
            // Now ensure the first letter is lower-case.
            toReturn = camel.substring(0, 1).toLowerCase() + camel.substring(1);
        }
        return toReturn;
    }

    /**
     * Turns a String value to upper camel case.
     * <p>
     * Upper camel case is characterised by the first letter being upper-case, spaces being removed and
     * letters immediately following a space being made upper-case. <br>
     * e.g. "hi mum" -> "HiMum"
     * </p>
     * <p>
     * Upper-case letters in the input string will not be made lower-case. <br>
     * e.g. "my SMS" -> "MySMS", "Hi Mum" -> "HiMum", "HELLO" -> HELLO"
     * </p>
     * <p>
     * Will remove all leading and trailing spaces.
     * </p>
     * <p>
     * Has primitive handling for special characters.
     * </p>
     * <p>
     * Will throw NullPointerException if null is passed as the input parameter.
     * </p>
     * 
     * @param str String to be converted to upper camel case
     * @return converted string
     */
    public static String toUpperCamelCase(String str) {
        String toReturn = new String();
        // Camel case the string.
        String camel = toCamelCase(str);
        if (camel.length() > 0) {
            // Now ensure the first letter is upper-case.
            toReturn = camel.substring(0, 1).toUpperCase() + camel.substring(1);
        }
        return toReturn;
    }
    
    /**
     * Converts list of string to the list of upper case representation 
     * @param lst
     * @return upper case list of String
     */
    public static List<String> toUpper(List<String> lst) {
        List<String> result = new ArrayList<String>();
        for (String elm : lst) {
            result.add(elm.toUpperCase());
        }
        return result;
    }

    /**
     * Cut given string to max length.
     * 
     * @param val Some string value.
     * @param max Max length.
     * @return The string reduced to max length.
     */
    public static String truncate(String val, int max) {
        return val == null ? null : val.length() > max ? val.substring(0, max) : val;
    }

    /**
     * Integer (int) padding.
     * 
     * @param input input integer
     * @param len padding length
     * @param pad padding character
     * @param paddingLeft pad left or right?
     * @return padded String
     */
    public static final String pad(int input, int len, char pad, boolean paddingLeft) {
        return pad(String.valueOf(input), len ,pad, paddingLeft);
    }

    public static final String pad(String input, int len, char pad, boolean paddingLeft) {
        StringBuffer str = new StringBuffer("" + input);
        int length = str.length();
        if (len > 0 && len > length) {
            for (int i = 0; i <= len; i++) {
                if (paddingLeft) {
                    if (i < len - length) {
                        str.insert(0, pad);
                    }
                } else {
                    if (i > length) {
                        str.append(pad);
                    }
                }
            }
        }
        return str.toString();
    }

    /**
     * Unpad string. Removes leading characters.
     * 
     * @param paddingChar padding characters
     * @param sourceString source string
     * @return unpaddded string
     */
    public static String unpad(char paddingChar, String sourceString) {
        for (int i = 0; i < sourceString.length(); i++) {
            if (sourceString.charAt(i) != paddingChar) {
                return sourceString.substring(i);
            }
        }
        return "";
    }

    public static boolean areEmpty(String... strs) {
        for (String str : strs) {
            if (isNotEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    /**
     * If String is null make it empty string "".
     * 
     * @param input input string
     * @return formatted string
     */
    public static String null2empty(String input) {
        return Objects.toString(input, "");
    }
    
    
    /**
     * If String is null make it empty string "".
     * 
     * @param input input string
     * @return formatted string
     */
    public static String[] null2empty(String[] input) {
        if (input == null) {
            return new String[0];
        }
        String[] result = new String[input.length];
        for (int i = 0 ; i < input.length ; i++) {
            result[i] = null2empty(input[i]); 
        }
        return result;
    }

    /**
     * If String is empty make it null. if null return also null.
     * 
     * @param input - the String to nullify
     * @return null or original non empty String.
     */
    public static String empty2null(String input) {
        if (null != input && input.trim().length() == 0) {
            return null;
        } else {
            return input;
        }
    }
    
    /**
     * If String is null make it dot ".".
     * 
     * @param input input string
     * @return formatted string
     */
    public static String null2dot(String input) {
        if (null == input || isBlank(input)) {
            return ".";
        } else {
            return input;
        }
    }

    /**
     * Nullify blank getter/setter accessible string fields.
     * @param obj some object
     * @throws Exception if anything goes wrong
     */
    public static void nullifyBlanks(Object obj) {
        if (obj == null) {
            return;
        }
        Class<?> c = obj.getClass();
        Method[] methods = c.getMethods();
        for (int i = 0; i < methods.length; i++) {
            Method getter = methods[i];
            if (getter.getName().startsWith("get") 
            		&& getter.getParameterTypes().length == 0
                    && getter.getReturnType().equals(String.class)) {
            	try {
                    String s = (String) getter.invoke(obj);
                    if (s != null && s.trim().length() == 0) {
                        String name = getter.getName();
                        name = name.replaceFirst("get", "set");
                        Method setter = c.getMethod(name, String.class);
                        setter.invoke(obj, new Object[] {null });
                    }
                } catch (Exception e) {
                	// do nothing
            	}
            }
        }
    }
    
    public static String nullifyEmptyDotOrTBD(String str) {
    	if (isEmptyOrDotOrTBD(str)) {
    		return null;
    	}
    	return str;
    }
    

    /**
     * returns substitute if obj is null
     */
    public static <T> T nvl(T obj, T substitute) {
        return obj != null ? obj : substitute;
    }

    /**
     * returns first not null value
     */
    public static <T> T nvl(T... list) {
        if (!ArrayUtils.isEmpty(list)) {
            for (T t : list) {
                if (t != null) {
                    return t;
                }
            }
        }
        return null;
    }

    /**
     * returns substitute if value is blank
     * (has precedence over {@link #nvl(T, T)})
     */
    public static String nvl(String value, String substitute) {
        return isNotBlank(value) ? value : substitute;
    }
    
    /**
     * get the class name (without path!).
     * @param className full name
     * @return the class name
     */
    public static String getClassNameNoPackage(String className) {
        // lastIndexOf returns -1 if the char is not there -> substring(0) will be returned
        return className.substring(className.lastIndexOf('.') + 1);
    }
    
    /**
     * Trims the string to the maximum string size passed through in the
     * input trimSize field.
     * <p>
     * Example:
     * <code>
     * trimToSize("hamburgers", 9) returns "hamburger"
     * </code>
     * 
     * @param valueToTrim the string to be trimmed
     * @param trimSize the size to which the string will be trimmed
     * @return the truncated substring.
     */
    public static String trimToSize(String valueToTrim, int trimSize) {
        if (valueToTrim != null && valueToTrim.length() > trimSize) {
            return valueToTrim.substring(0, trimSize);
        } else {
            return valueToTrim;
        }
    }    
    
    /**
     * Cleans CSV string from unnecessary commas
     * 
     * @param csvInput comma-separated string
     * @return
     */
    public static String reformCSVString(String csvInput) {
    	String reformedCSV = csvInput;
    	
    	if(isBlank(csvInput)){
    		return csvInput;
    	}
    	
    	// Replace multiple consecutive occurrences of comma with single comma.
    	reformedCSV = reformedCSV.replaceAll("[,\\s*]{2,}", ",");
    	
    	// Replace unnecessary comma from the front
    	if(reformedCSV.startsWith(",")){
    		reformedCSV = reformedCSV.replaceFirst(",", "");
    	}
    	
    	// Replace unnecessary comma from the last
    	if(reformedCSV.endsWith(",")){
    		reformedCSV = reformedCSV.substring(0, reformedCSV.length()-1);
    	}
    	
    	return reformedCSV;
    }

    /**
     * Extract comma-separated list (element order is preserved).
     * 
     * @param val comma-separated string
     * @return elements
     */
    public static List<String> extractCommaSeparatedList(String csvInput) {
        String[] arr = csvInput.split("\\s*,\\s*");
        return new LinkedList<String>(Arrays.asList(arr));
    }
    
    /**
     * Get comma seperated string from the list of strings.
     * @param list
     * @return
     */
    public static String getCommaSeperatedStringFromList(List<String> list){
        StringBuilder sb = new StringBuilder();
        for(String str:list){
            if(sb.length() != 0){
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }
    
    
    /**
     * It checks if the given parameter is a hexadecimal numeric value.
     * 
     * @param input
     * @return boolean (true: if it is Hex Numeric, false:otehrwise)
     */
    public static boolean isHexNumeric(String input) {
        try {
            Integer.parseInt(input, 16);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    /**
     * It checks if the given parameter is a numeric value.
     * 
     * @param input
     * @return boolean (true: if it is Numeric, false:otehrwise)
     */
    public static boolean isNumeric(String input) {
    	 if (CrmStringUtil.isBlank(input)){
             return false;
         }
         return input.matches("(^(-|\\+)?[0-9]+(\\.[0-9]+)?)+");
    }
    
    /**
     * Checks if input is double number
     * @param input
     * @return
     */
    public static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    /**
     * Find first String in collection of Strings containing substring.
     * @param collection collection to look in
     * @param key substring to look for. Must be upper case
     * @return first String in collection containing substring.
     */
    public static String findSubstring(Collection<String> collection, String key) {
        for (Iterator<String> i = collection.iterator(); i.hasNext();) {
            String attrName = i.next();
            if (attrName.toUpperCase().indexOf(key) >= 0) {
                return attrName;
            }
        }
        return null;
    }
    
    /**
     * 
     * @param match
     * @param possibilities
     * @return
     */
    public static boolean in(String match, String... possibilities) {
        if (isEmpty(match) || possibilities == null || possibilities.length == 0) {
            return false;
        }
        for (String possibility : possibilities) {
            if (isNotEmpty(possibility)) {
                if (match.equals(possibility)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Q8154, adds one or more string to a string array
     * @param String[] list
     * @param String... values
     * @return
     */
    public static String[] addElementToArray(String[] list, String... values) {
        if (list==null) {
            list = new String[0];
        }
        if ( values == null || values.length == 0) {
            return list;
        }
        List<String> lst = new ArrayList<String>(Arrays.asList(list));
        for (String value : values) {
            lst.add(value);
        }
        return  lst.toArray(new String[0]);
    }
    
    /**
     * Converts array of any enum type to the string array 
     * @param e
     * @return
     */
    public static String[] enumToStringValues(Enum<?> ...e) {
        if (e == null) {
            return null;
        }
        return Arrays.toString(e).replaceAll("^.|.$", "").split(", ");
    }
    
    /**
     * Conversion of amount of different unit types - used in Manual Billing 
     * 
     * @param amount
     * @param unitType
     * @param smallUnits
     * @return converted units string
     */
    public static BigDecimal convertAmountToUnits(String amount, String unitType, Boolean smallUnits) {
    	if (CrmStringUtil.isEmpty(amount)) {
    		return null;
    	}
        return convertAmountToUnits(new BigDecimal(amount), unitType, smallUnits);
    }    
    
    /**
     * Conversion of amount of different unit types - used in Manual Billing 
     * 
     * @param amount
     * @param unitType
     * @param smallUnits
     * @return converted units string
     */
    public static BigDecimal convertAmountToUnits(BigDecimal amount, String unitType, Boolean smallUnits) {
    	BigDecimal factor = null;    	
        if ("Free Minutes".equals(unitType)) {
        	factor = new BigDecimal(60);
        } else if ("Free Megabytes".equals(unitType)) {
        	factor = new BigDecimal(1024);
        } 
        if (factor != null) {
        	return smallUnits ? amount.multiply(factor) : amount.divide(factor);
        }            
        return amount;
    }
    
    public static boolean isOtoId(String lineIdentifier){
    	if (isEmpty(lineIdentifier)){
    		return false;
    	}
    	return lineIdentifier.matches(OTO_ID_FORMAT_NO_PLUG) || lineIdentifier.matches(OTO_ID_FORMAT);
    }

    /**
     * Split CIC param string in format varName1=varValue1^varName2=varValue2^varName3=varValue3
     * @param cicParamsString
     * @return
     */
    public static Map<String, String> splitCICParams(String  cicParamsString)  {
        Map<String, String> cicParamMap = new HashMap<String, String>();
        if (isEmpty(cicParamsString)){
        	return cicParamMap;
        }
        String[] pairs = cicParamsString.split("\\^");
        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            if (idx > -1) cicParamMap.put(pair.substring(0, idx), pair.substring(idx + 1));
        }
        return cicParamMap;
    }
    
    /** @author Upadhyay
     * Check if IP address is valid
     * @param ip address
     * @return true/false
     */
    public static boolean isValidIPAddress(String ipAddress){
       try {
	    	String[] tokens = ipAddress.split("\\.");
	    	
	    	if (tokens.length != 4) {
	    		return false;
	    	}
	    	
	    	for (String str : tokens) {
	    		int i = Integer.parseInt(str);
	    		if (i < 0 || i > 255){
	    			return false;
	    		}
	    	}
	    	
	        if (ipAddress.endsWith(".") ) {
	            return false;
	        }
	    	
	    	return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
    
    /** @author Upadhyay
     * Convert ip address to numeric value, make sure to validate ip address before calling this method
     * @param ip address
     * @return numeric ip address value
     */
    public static long convertIPAddressToNumerical(String ipAddress){
    	long lngIpAddress;
    	
    	String[] tokens = ipAddress.split("\\.");
    	
    	long lngClassA = Long.parseLong(tokens[0]);
    	long lngClassB = Long.parseLong(tokens[1]);
    	long lngClassC = Long.parseLong(tokens[2]);
    	long lngClassD = Long.parseLong(tokens[3]);
    	
    	lngIpAddress = (lngClassA * (256*256*256) + lngClassB * (256*256) + lngClassC * 256 + lngClassD) ;
    	
    	return lngIpAddress;
    }

    /**
     * 19-ICCID converts to 20-ICCID using luhn algorithm
     * @param iccid incoming ICCID
     * @return extended ICCID
     */
    public static String extendIccId(String iccid) {
        return iccid + calculateCheckDigit(iccid);
    }

    private static final Pattern SUNRISE_ICCID_PATTERN = Pattern.compile("^(894102)\\d{13,14}$");
    private static final Pattern UPC_ICCID_PATTERN = Pattern.compile("^(894125)\\d{13,14}$");

    public static boolean isValidLuhn(String num) {

        final int[][] sumTable = {{0,1,2,3,4,5,6,7,8,9},{0,2,4,6,8,1,3,5,7,9}};
        int sum = 0, flip = 0;

        for (int i = num.length() - 1; i >= 0; i--, flip++)
            sum += sumTable[flip & 0x1][num.charAt(i) - '0'];
        return sum % 10 == 0;
    }
    /**
     * Calculates the last digits for the iccid number received as parameter
     *
     * @param iccid
     *           {@link String} number
     * @return {@link String} the check digit
     */
    public static String calculateCheckDigit(String iccid) {
        if (iccid == null)
            return null;
        String digit;
        /* convert to array of int for simplicity */
        int[] digits = new int[iccid.length()];
        for (int i = 0; i < iccid.length(); i++) {
            digits[i] = Character.getNumericValue(iccid.charAt(i));
        }

        /* double every other starting from right - jumping from 2 in 2 */
        for (int i = digits.length - 1; i >= 0; i -= 2)     {
            digits[i] += digits[i];

            /* taking the sum of digits grater than 10 - simple trick by substract 9 */
            if (digits[i] >= 10) {
                digits[i] = digits[i] - 9;
            }
        }
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        /* multiply by 9 step */
        sum = sum * 9;

        /* convert to string to be easier to take the last digit */
        digit = sum + "";
        return digit.substring(digit.length() - 1);
    }



    /**
     * Checks if provided input string has an email format
     * @param inputStr input string to be validated
     * @return true/false
     */
    public static boolean isValidEmail(String inputStr) {
        //InternetAddress internetAddress = new InternetAddress(eMail);
        //internetAddress.validate();
    	return inputStr != null &&  Pattern.compile(EMAIL_FORMAT).matcher(inputStr).matches();        
    }
    
    
    /**
     * Checks if provided input string has an valid msisdn format
     * @param inputStr input string to be validated
     * @return true/false
     */
    public static boolean isValidMsisdn(String inputStr) {
    	return inputStr != null &&  Pattern.compile(MSISDN_FORMAT).matcher(inputStr).matches();        
    }
    
    public static boolean isValidMACAddress(String inputStr) {
    	return inputStr != null && Pattern.compile(MAC_ADDRESS_FORMAT).matcher(inputStr).matches(); 
    }
    
    public static String macToSerial(String modemMACaddress) {
    	if (modemMACaddress == null) return null;
		return modemMACaddress.replace(":", "");
    }

    /**
     * Checks if provided input string has an valid International msisdn format
     * @param inputStr input string to be validated
     * @return true/false
     */
    public static boolean isValidIntlMsisdn(String inputStr) {
    	return inputStr != null &&  Pattern.compile(INTL_MSISDN_FORMAT).matcher(inputStr).matches();        
    }
    
    /**
     * Checks if provided input string has an valid IBAN format
     * @param inputStr input string to be validated
     * @return true/false
     */
    public static boolean isValidIBAN(String inputStr) {
    	return inputStr != null &&  Pattern.compile(IBAN_FORMAT).matcher(inputStr).matches();        
    }
    
	/**
	 * Check IMEI format as per LUHN's algorithm:
	 * Calculate sum of all digits.
	 * For odd placed digits, add as it is, e.g. add '7' as 7.
	 * For even placed digits, add sum of tenth and unit digits after doubling the number, e.g. add '7' as 5 (7*2=14, 1+4=5).
	 * Format is correct if the sum is a multiple of 10.
	 * 
	 * @param imei
	 * @return
	 */
	public static boolean isValidImeiFormat(String imei) {
		
		if (imei == null || imei.length() != IMEI_LENGTH) {
			return false;
		}
		
		//Check valid format using LUHN's algorithm
		char[] digits = imei.toCharArray();
		int digit;
		int sumOfDigits = 0;

		for (int i=1; i<=(IMEI_LENGTH); i++) {
			digit = Integer.parseInt(String.valueOf(digits[i-1]));
			if(i%2==0)
				digit = (digit*2)/10 + (digit*2)%10;
			sumOfDigits = sumOfDigits + digit;
		}
		return (sumOfDigits%10 == 0);
	}

    /**
     * 
     * @param string - input string
     * @param length - how many charachters from the left should be returned
     * @return
     */
    public static String left(String string, int length){
    	if (CrmStringUtil.isEmpty(string) || string.length() <= length){
    		return string;
    	}
    	return string.substring(0, length);
    }

    /** @author Mishraa
     * Convert Special characters from to original form.
     * @param text
     * @return
     */

    public static String updateSpecialCharacter(String text){
		if (CrmStringUtil.isEmpty(text)){
    		return null;
    	}
    	byte[] bytes = text.getBytes();
		for(int i=0;i<bytes.length;i++){
			if(bytes[i]==-108||bytes[i]==-109){
				bytes[i] = 34;
			}
		}
		String xAnswer = new String(bytes);
		return xAnswer;
    }

    /*public static String convertSpecialCharacters(String text){
    	String[] charsetsToBeTested = {"UTF-8", "windows-1253", "ISO-8859-7"};

        Charset charset = detectCharset(text, charsetsToBeTested);
        try {
        	 byte[] bytes = text.getBytes("UTF-8");
			text = new String(bytes,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			
		}
    	return text;
    }

        public static Charset detectCharset(String text, String[] charsets) {

            Charset charset = null;

            for (String charsetName : charsets) {
                charset = detectCharset(text, Charset.forName(charsetName));
                if (charset != null) {
                    break;
                }
            }

            return charset;
        }

        private static Charset detectCharset(String text, Charset charset) {
            try {


                CharsetDecoder decoder = charset.newDecoder();
                decoder.reset();

                byte[] buffer = new byte[512];
                boolean identified = false;
                while ((!identified)) {
                    identified = identify(buffer, decoder);
                }
                if (identified) {
                    return charset;
                } else {
                    return null;
                }

            } catch (Exception e) {
                return null;
            }
        }

        private static boolean identify(byte[] bytes, CharsetDecoder decoder) {
            try {
                decoder.decode(ByteBuffer.wrap(bytes));
            } catch (CharacterCodingException e) {
                return false;
            }
            return true;
        }*/

    /**
     * Probably we should consider converting char into Integer and having Map of replacements, based on Integer Unicode.
     * @param str
     * @return
     */
    public static String convertUnallowedCharacters(String str) {
    	if (CrmStringUtil.isBlank(str)) {
    		return str;
    	}
    	char [] buffer = new char[str.length()];
    	for (int i = 0; i < str.length(); ++i) {
    		char c = str.charAt(i);
    		if (c == '\u0141') c = 'L';
    		if (c == 'Ú') c = 'U';
    		if (c == 'ú') c = 'u';
    		if (c == '\u0147') c = 'N';
    		if (c == '\u0148') c = 'n';
    		if (c == '\u013D') c = 'L';
    		if (c == '\u013E') c = 'l';
    		if (c == '\u0160') c = 'S';
    		if (c == '\u0161') c = 's';
    		if (c == '\u010C') c = 'C';
    		if (c == '\u010D') c = 'c';
    		if (c == '\u0164') c = 'T';
    		if (c == '\u0165') c = 't';
    		if (c == '\u017D') c = 'Z';
    		if (c == '\u017E') c = 'z';
    		if (c == 'Ý') c = 'Y';
    		if (c == 'ý') c = 'y';
    		if (c == 'Á') c = 'A';
    		if (c == 'á') c = 'a';
    		if (c == 'â') c = 'a';
    		if (c == 'Â') c = 'A';
    		if (c == 'Í') c = 'I';
    		if (c == 'í') c = 'i';
    		if (c == 'ó') c = 'o';
    		if (c == 'Ó') c = 'O';
    		//if (c == 'Ö') c = 'O';
    		//if (c == 'ü') c = 'u';
            if (c == '\u0092') c = '´';
            if (c == '\u0096') c = '-';
            if (c == '\u2013') c = '-';
            if (c == '\u2018') c = '´';
            if (c == '\u2019') c = '´';
            buffer[i] = c;
    	}
    	return new String(buffer);
    }

    public static String stripAccents(final String input) {
        if(input == null) {
            return null;
        }
        final Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");//$NON-NLS-1$
        final StringBuilder decomposed = new StringBuilder(Normalizer.normalize(input, Normalizer.Form.NFD));
        convertRemainingAccentCharacters(decomposed);
        // Note that this doesn't correctly remove ligatures...
        return pattern.matcher(decomposed).replaceAll("");
    }
    private static void convertRemainingAccentCharacters(final StringBuilder decomposed) {
        for (int i = 0; i < decomposed.length(); i++) {
            if (decomposed.charAt(i) == '\u0141') {
                decomposed.deleteCharAt(i);
                decomposed.insert(i, 'L');
            } else if (decomposed.charAt(i) == '\u0142') {
                decomposed.deleteCharAt(i);
                decomposed.insert(i, 'l');
            }
        }
    }

	public static String[] substringsBetween(String str, String open,
			String close) {
		if ((str == null) || (isEmpty(open)) || (isEmpty(close))) {
			return null;
		}
		int strLen = str.length();
		if (strLen == 0) {
			return ArrayUtils.EMPTY_STRING_ARRAY;
		}
		int closeLen = close.length();
		int openLen = open.length();
		List<String> list = new ArrayList<String>();
		int pos = 0;
		while (pos < strLen - closeLen) {
			int start = str.indexOf(open, pos);
			if (start < 0) {
				break;
			}
			start += openLen;
			int end = str.indexOf(close, start);
			if (end < 0) {
				break;
			}
			list.add(str.substring(start, end));
			pos = end + closeLen;
		}
		if (list.size() > 0) {
			return ((String[]) list.toArray(new String[list.size()]));
		}
		return null;
	}

	/**
	 * Unescapes a string that contains standard Java escape sequences. 
	 * @param  string optionally containing standard java escape sequences.
	 * @return The translated string.
	 */
	public static String unescapeJavaString(String st) {
	 
	    StringBuilder sb = new StringBuilder(st.length());
	 
	    for (int i = 0; i < st.length(); i++) {
	        char ch = st.charAt(i);
	        if (ch == '\\') {
	            char nextChar = (i == st.length() - 1) ? '\\' : st
	                    .charAt(i + 1);
	            // Octal escape?
	            if (nextChar >= '0' && nextChar <= '7') {
	                String code = "" + nextChar;
	                i++;
	                if ((i < st.length() - 1) && st.charAt(i + 1) >= '0'
	                        && st.charAt(i + 1) <= '7') {
	                    code += st.charAt(i + 1);
	                    i++;
	                    if ((i < st.length() - 1) && st.charAt(i + 1) >= '0'
	                            && st.charAt(i + 1) <= '7') {
	                        code += st.charAt(i + 1);
	                        i++;
	                    }
	                }
	                sb.append((char) Integer.parseInt(code, 8));
	                continue;
	            }
	            switch (nextChar) {
	            case '\\':
	                ch = '\\';
	                break;
	            case 'b':
	                ch = '\b';
	                break;
	            case 'f':
	                ch = '\f';
	                break;
	            case 'n':
	                ch = '\n';
	                break;
	            case 'r':
	                ch = '\r';
	                break;
	            case 't':
	                ch = '\t';
	                break;
	            case '\"':
	                ch = '\"';
	                break;
	            case '\'':
	                ch = '\'';
	                break;
	            // Hex Unicode: u????
	            case 'u':
	                if (i >= st.length() - 5) {
	                    ch = 'u';
	                    break;
	                }
	                int code = Integer.parseInt(
	                        "" + st.charAt(i + 2) + st.charAt(i + 3)
	                                + st.charAt(i + 4) + st.charAt(i + 5), 16);
	                sb.append(Character.toChars(code));
	                i += 5;
	                continue;
	            }
	            i++;
	        }
	        sb.append(ch);
	    }
	    return sb.toString();
	}
	
	/**
	 * Returns formatted String representation of indexed attribute
	 * @param attributeName
	 * @param index
	 * @return indexed attribute 
	 */
	public static <E> String toIndexedAttribute(String attributeName, E index) {
		if (index != null) {
			if (isNotEmpty(index.toString())){
				return String.format(INDEXED_ATTRIBUTE_FORMAT, attributeName, index.toString());
			}
		}
		return attributeName;		
	}
	
    public static String generateCorrelationId(String siteId) {
        return "CLARIFY:" + new SimpleDateFormat("yyyyMMdd-HHmmss.SSS").format(new Date()) + ":" + siteId + ":" + UUID.randomUUID().toString();
    }
    
    public static String toSpeedProfile(String downloadSpeed, String uploadSpeed) {
    	if (CrmStringUtil.isNotEmpty(downloadSpeed) && CrmStringUtil.isNotEmpty(uploadSpeed)) {
    		return downloadSpeed + "_" + uploadSpeed;
    	}
    	return "N/A_N/A";
    }
    
    public static <T> T json2Object(String strObject, Class<T> objClass) {		
		try {
			ObjectMapper mapper = new ObjectMapper();
			T result = mapper.readValue(strObject, objClass);
			return result;			
		} catch (Exception e) {
			return null;
		}
	}
    
    
    public static boolean isTrue(Object objValue) {
    	if (objValue != null) {
    		return Boolean.valueOf(objValue.toString());
    	}
    	return false;
    }
    
    public static String lookup(String commaSepArr1, String commaSepArr2, String lookupStr) {
        String[] arr1 = commaSepArr1.split(",");
        String[] arr2 = commaSepArr2.split(",");

        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("S1 and S2 must have the same size!");
        }

        return IntStream.range(0, arr1.length)
                        .filter(i -> arr1[i].trim().equals(lookupStr))
                        .mapToObj(i -> arr2[i].trim())
                        .findFirst()
                        .orElse(null); 
    }
    
    
	
}
