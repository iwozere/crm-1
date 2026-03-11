package sunrise.crm.util;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Exception util class.
 * 
 * @see org.apache.commons.lang.exception.ExceptionUtils
 * 
 * @author borojevic
 * */
public class CrmExceptionUtils {
    
    /**
     * Method for retrieving exception trace (includes message)
     * 
     * @param throwable Throwable
     * 
     * @return String representation of the given throwable
     * */
    public static String getStackTrace(Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }
    
    public static String getCurrentStackTraceAsString() {
        return Arrays.stream(Thread.currentThread().getStackTrace())
             .skip(2) // skip getStackTrace() and this method itself
             .map(StackTraceElement::toString)
             .collect(Collectors.joining("\n"));
    }
    
}
