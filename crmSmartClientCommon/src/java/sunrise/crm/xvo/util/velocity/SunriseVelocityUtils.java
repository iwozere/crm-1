/**
 * 
 */
package sunrise.crm.xvo.util.velocity;

import java.io.StringWriter;
import java.util.Map;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;

/**
 * This utility was created to replace VelocityEngineUtils, that was removed from Spring 5.
 * @author salgado
 *
 */
public class SunriseVelocityUtils {

    public static String mergeTemplateIntoString(VelocityEngine velocityEngine, String templateLocation, Map model) throws VelocityException {
        
        StringWriter stringWritter = new StringWriter();
        VelocityContext velocityContext = new VelocityContext(model);
        try {
            velocityEngine.mergeTemplate(templateLocation, velocityContext, stringWritter);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new VelocityException(e.getMessage());
        }

        return stringWritter.toString();
    }
    
    

}
