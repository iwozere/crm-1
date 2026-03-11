package sunrise.crm.util;

/**
 * @author goncalves
 *
 */
public class CrmStackUtil {
    
    /**
     * get the class name (without path!).
     * 
     * @param className full name
     * @return the class name
     */
    public static String getClassNameNoPackage(Class javaClass) {
        // lastIndexOf returns -1 if the char is not there -> substring(0) will be returned
        String className = javaClass.getName();
        return className.substring(className.lastIndexOf('.') + 1);
    }

    public static String getCurrentStackTrace() {
        StringBuilder trace = new StringBuilder();
        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            trace.append(ste).append(CrmStringUtil.LINE_SEPARATOR);
        }
        return trace.toString();
    }
    public static String getCurrentSunriseStackTrace() {
        StringBuilder trace = new StringBuilder();
        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            if (String.valueOf(ste).startsWith("sunrise")) {
                trace.append(ste).append(CrmStringUtil.LINE_SEPARATOR);
            }
        }
        return trace.toString();
    }

}
