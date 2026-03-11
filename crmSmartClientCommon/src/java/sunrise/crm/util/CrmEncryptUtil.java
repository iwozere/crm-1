package sunrise.crm.util;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.CharEncoding;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.ClassPathResource;

import sunrise.crm.domain.exceptions.CrmEncryptionException;


/**
 * @author kosyrev
 */
public final class CrmEncryptUtil {
    
    private static Log log = LogFactory.getLog(CrmEncryptUtil.class);
    
    
    /**
     * Gets the md5 digest.
     *
     * @param md5 the md5
     * @return the m d5
     */
    public static String getMD5(String md5){
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
              sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
           }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            //LOG.error("getMD5", e);
        }
        return null;
    }
    
    public static String encryptToHmacMD5(String message, String keyString) {
        return encryptMessage(message, keyString, "HmacMD5");
    }

    public static String encryptMessage(String message, String keyString, String algorithm) {
        String encrMessage = null;
        try {
            SecretKeySpec key = new SecretKeySpec((keyString).getBytes("UTF-8"), algorithm);
            Mac mac = Mac.getInstance(algorithm);
            mac.init(key);

            byte[] bytes = mac.doFinal(message.getBytes("ASCII"));

            StringBuffer hashStr = new StringBuffer();
            for (int i = 0; i < bytes.length; i++) {
                String hex = Integer.toHexString(0xFF & bytes[i]);
                if (hex.length() == 1) {
                    hashStr.append('0');
                }
                hashStr.append(hex);
            }
            encrMessage = hashStr.toString();
        } catch (Exception e) {
            log.error("ERROR in encrypting message/key " + message + " / " + keyString + " via " + algorithm, e);
        }
        return encrMessage;
    }


    private static final String HASH_ALGORITHM_SHA1 = "SHA1";

    /**
     * Generates a salted string made up of the Order ID and the secret key
     * 
     * @param orderID Order ID to hash
     * @param secretKey Secret key used to generate the SHA1 hash
     * @return Returns a Base64 encoded hashed string
     */
    @SuppressWarnings("restriction")
    public static String generateSaltedSha1OrderID(String orderID, String secretKey) {

        StringBuilder saltedString = new StringBuilder();
        saltedString.append(orderID);
        saltedString.append("-");
        saltedString.append(secretKey);

        try {
            MessageDigest md = MessageDigest.getInstance(HASH_ALGORITHM_SHA1);
            md.update(saltedString.toString().getBytes());

            byte[] digestedBytes = md.digest();

            String hashedString = byteArrayToHexString(digestedBytes);

            String shortString = hashedString.substring(0, 8);

            StringBuilder orderIDAndHash = new StringBuilder();
            orderIDAndHash.append(orderID);
            orderIDAndHash.append("|");
            orderIDAndHash.append(shortString);

            String base64String = java.util.Base64.getEncoder().encodeToString(orderIDAndHash.toString().getBytes());

            return base64String;

        } catch (Exception e) {
            log.error("Error occured while trying to encrypt message", e);
            throw new CrmEncryptionException("Failed to encrypt order id with '" + HASH_ALGORITHM_SHA1 + "'.");
        }
    }

    /**
     * Generates a hashed salted string from the supplied salt, string and algorithm
     * 
     * @param salt The salt to use
     * @param stringToHash The string to hash
     * @param hashAlgorithm The algorithm used to hash the string
     * @return Returns the salted hashed string
     * @throws Exception
     */
    public static String generateSaltedHashedString(String salt, String stringToHash,
            HashAlgorithm hashAlgorithm) throws Exception {

        StringBuilder saltedString = new StringBuilder();
        saltedString.append(salt);
        saltedString.append(stringToHash);

        try {
            MessageDigest md = MessageDigest.getInstance(hashAlgorithm.getDisplayValue());
            md.update(saltedString.toString().getBytes());

            byte[] digestedBytes = md.digest();

            return byteArrayToHexString(digestedBytes);

        } catch (Exception e) {
            log.error("Error occured while trying to hash string", e);
            throw new CrmEncryptionException("Failed to hash sunrise personal code with algorithm '"
                    + hashAlgorithm.getDisplayValue() + "'.");
        }
    }

    /**
     * Generates the Hmac Hashed string
     * 
     * @param secretKeyFile The secret key file
     * @param stringToHash The string to hash
     * @param hashAlgorithm The algorithm to use
     * @return Returns a hashed string using hmac sha 256
     * @throws Exception
     */
    public static String generateHmacHashedString(String secretKeyFile, String stringToHash,
            HashAlgorithm hashAlgorithm) throws Exception {

        try {
            checkForStrongSecurity();

            Mac mac = Mac.getInstance(hashAlgorithm.getDisplayValue());

            SecretKeySpec skey = getSecretKeyFromFile(secretKeyFile);
            mac.init(skey);

            byte[] utf8 = stringToHash.getBytes(CharEncoding.UTF_8);
            log.debug("Plain: " + new String(utf8, CharEncoding.UTF_8));
            byte[] digest = mac.doFinal(utf8);
            String base64 = Base64.encodeBase64String(digest);
            log.debug("Hashed+Base64: " + base64);
            return base64;
        } catch (Exception e) {
            log.error("Error occured while trying to generate Hmac Hashed String");
            throw new CrmEncryptionException("Failed to generate Hmac Hash with algorithm '"
                    + hashAlgorithm.getDisplayValue() + "'.");
        }

    }

    /**
     * Loads the secret file
     * 
     * @param keyFile The secret file to load
     * @return Returns the {@link SecretKeySpec} file containing the key
     * @throws Exception
     */
    private static SecretKeySpec getSecretKeyFromFile(String keyFile) throws Exception {

        log.info(String.format("Attempting to locate key file: %s", keyFile));

        try {
            InputStream key = new ClassPathResource(keyFile).getInputStream();
            // try to load the key from the input stream
            ObjectInputStream in = new ObjectInputStream(key);
            SecretKeySpec sk = (SecretKeySpec) in.readObject();
            in.close();
            return sk;
        } catch (Exception e) {
            log.error(String.format("Error locating key file: %s (%s)", keyFile, e.getMessage()));

            // "Failed locate secret key file. " + e.getMessage()
            throw new CrmEncryptionException(String.format("Failed locate secret key file: (%s) .",
                    e.getMessage()));
        }

    }

    /**
     * Converts the passed byte[] to a hex string
     * 
     * @param b byte[] to convert
     * @return Returns a hex string representation of the passed byte[]
     */
    private static String byteArrayToHexString(byte[] b) {
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }

    /**
     * Checks the security restrictions
     * 
     * @throws NoSuchAlgorithmException
     */
    private static void checkForStrongSecurity() throws NoSuchAlgorithmException {
        int maxKeyLen = Cipher.getMaxAllowedKeyLength("SHA-2");
        if (maxKeyLen < 256) {
            log.warn("********************************************************************************************************************");
            log.warn("****** Max key length is only [" + maxKeyLen + "] Bit, but [256] Bit is required!!!");
            log.warn("****** Have you installed the Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files?");
            log.warn("********************************************************************************************************************");
        }
    }
    
    public static String toBase64String(byte[] base64BinaryData){
    	return DatatypeConverter.printBase64Binary(base64BinaryData);
    }

    public static String toBase64String(String planText){
    	if (planText == null){
    		return null;
    	}
        try {
            byte[] array = planText.getBytes("UTF-8");
            return DatatypeConverter.printBase64Binary(array);
        } catch (UnsupportedEncodingException e) {
            log.error("toBase64String: UnsupportedEncoding", e);
            return null;
        }
    }

    public static byte[] fromBase64String(String base64String){
    	return DatatypeConverter.parseBase64Binary(base64String);
    }

    public static String fromBase64StringToString(String base64String) {
        try {
            return new String(fromBase64String(base64String), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            log.error("toBase64String: UnsupportedEncoding", e);
            return null;
        }
    }
    
   /* *//**
     * 
     * @param key - value from config item DMS_WS_WEBCUBE_KEY
     * @param text - the audit token to be encrypted
     * @return
     *//*
    public static byte[] encryptAuditToken(String key, String text){
    	// Create key and cipher
    	Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
    	Cipher cipher;
		try {
			cipher = Cipher.getInstance("AES");
	    	// encrypt the text
	    	cipher.init(Cipher.ENCRYPT_MODE, aesKey);
	    	return cipher.doFinal(text.getBytes());
		} catch (NoSuchAlgorithmException e) {
			log.error("encryptAuditToken", e);
		} catch (NoSuchPaddingException e) {
			log.error("encryptAuditToken", e);
		} catch (InvalidKeyException e) {
			log.error("encryptAuditToken", e);
		} catch (IllegalBlockSizeException e) {
			log.error("encryptAuditToken", e);
		} catch (BadPaddingException e) {
			log.error("encryptAuditToken", e);
		}
		return null;
    }

    *//**
     * Base 64 encoded byte array. Generates AES token using key and text.
     * @param key - value from config item DMS_WS_WEBCUBE_KEY
     * @param text - the audit token to be encrypted
     * @return
     *//*
    public static String encryptAuditTokenAsString(String key, String text){
    	byte[] bytes = encryptAuditToken(key, text);
    	return toBase64String(bytes);
    }*/
}
