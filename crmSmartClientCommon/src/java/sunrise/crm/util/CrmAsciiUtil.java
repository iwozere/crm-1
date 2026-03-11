/**
 * Sunrise Communications AG, Copyright © 2010
 * 
 * Created in: 07.12.2010
 * 
 */
package sunrise.crm.util;

/**
 * Auxiliary class to replace all accented vowels and consonants characters with with the ASCII equivalent.
 * 
 * @author Correia
 * @since R30, Q6354, 07.12.2010
 */
public class CrmAsciiUtil {
    /**
     * Plain text ASCII characters for replacement.
     */
    private static final String PLAIN_ASCII = "AaEeIiOoUu" // Grave.
            + "AaEeIiOoUuYy" // Acute.
            + "AaEeIiOoUuYy" // Circumflex.
            + "AaOoNn" // Tilde.
            + "AaEeIiOoUuYy" // Umlaut.
            + "Aa" // Ring.
            + "Cc" // Cedilla.
            + "OoUu"; // Double acute.

    /**
     * UNICODE of accented characters.
     */
    private static final String UNICODE = "\u00C0\u00E0\u00C8\u00E8\u00CC\u00EC\u00D2\u00F2\u00D9\u00F9"
            + "\u00C1\u00E1\u00C9\u00E9\u00CD\u00ED\u00D3\u00F3\u00DA\u00FA\u00DD\u00FD"
            + "\u00C2\u00E2\u00CA\u00EA\u00CE\u00EE\u00D4\u00F4\u00DB\u00FB\u0176\u0177"
            + "\u00C3\u00E3\u00D5\u00F5\u00D1\u00F1"
            + "\u00C4\u00E4\u00CB\u00EB\u00CF\u00EF\u00D6\u00F6\u00DC\u00FC\u0178\u00FF" + "\u00C5\u00E5"
            + "\u00C7\u00E7" + "\u0150\u0151\u0170\u0171";

    /**
     * Plain text upper case ASCII characters for replacement.
     */
    private static final String UPPERCASE_ASCII = "AEIOU" // Grave.
            + "AEIOUY" // Acute.
            + "AEIOUY" // Circumflex.
            + "AON" // Tilde.
            + "AEIOUY" // Umlaut.
            + "A" // Ring.
            + "C" // Cedilla.
            + "OU"; // Double acute.

    /**
     * UNICODE of accented upper case characters.
     */
    private static final String UPPERCASE_UNICODE = "\u00C0\u00C8\u00CC\u00D2\u00D9"
            + "\u00C1\u00C9\u00CD\u00D3\u00DA\u00DD" + "\u00C2\u00CA\u00CE\u00D4\u00DB\u0176"
            + "\u00C3\u00D5\u00D1" + "\u00C4\u00CB\u00CF\u00D6\u00DC\u0178" + "\u00C5" + "\u00C7"
            + "\u0150\u0170";

    /**
     * Replace vowels and consonants to their equivalent in upper case.
     * 
     * @param stringToConvert String to be converted.
     * @return Converted string.
     */
    public static String toUpperCaseWithoutAccent(String stringToConvert) {

        // Return immediately if null.
        if (stringToConvert == null) {
            return null;
        }

        char c;
        int position;

        String txtUpper = stringToConvert.toUpperCase();
        StringBuilder convertedString = new StringBuilder();

        int txtLen = txtUpper.length();

        // Check all characters for their equivalent in ASCII.
        for (int i = 0; i < txtLen; i++) {
            // Get char and its position in UNICODE reference string.
            c = txtUpper.charAt(i);
            position = UPPERCASE_UNICODE.indexOf(c);

            // Replace by upper case ASCII equivalent.
            if (position > -1) {
                convertedString.append(UPPERCASE_ASCII.charAt(position));
            } else {
                convertedString.append(c);
            }
        }

        return convertedString.toString();
    }

    /**
     * Remove accented vowels and consonants from a string and replace them with ASCII equivalent.
     * 
     * @param stringToConvert String containing accented characters.
     * @return Converted string.
     */
    public static String convertToNonAscii(String stringToConvert) {

        // Return immediately if null.
        if (stringToConvert == null)
            return null;

        char c;
        int position;

        StringBuilder convertedString = new StringBuilder();
        int txtLen = stringToConvert.length();

        // Check all characters for their equivalent in ASCII.
        for (int i = 0; i < txtLen; i++) {
            // Get char and its position in UNICODE reference string.
            c = stringToConvert.charAt(i);
            position = UNICODE.indexOf(c);

            // Replace by ASCII equivalent.
            if (position > -1) {
                convertedString.append(PLAIN_ASCII.charAt(position));
            } else {
                convertedString.append(c);
            }
        }

        return convertedString.toString();
    }
}
