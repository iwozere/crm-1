package sunrise.crm.xvo.util.velocity;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.log.LogSystem;
import org.springframework.beans.factory.FactoryBean;

/**
 * Class created to replace Spring VelocityEngineFactoryBean, that is not anymore available on Spring 5.
 * @author salgado
 *
 */
public class SunriseVelocityEngineFactoryBean implements FactoryBean<VelocityEngine>  {
    

    private Properties velocityProperties;

    private VelocityEngine velocityEngine;
    
    public VelocityEngine getEngine() {
        if (velocityEngine == null) {
            velocityEngine = createVelocityEngine();
        }
        return velocityEngine;
    }
    
    private VelocityEngine createVelocityEngine() {
        
        VelocityEngine vEngine = new VelocityEngine();
        
        
        
        vEngine.setProperty(RuntimeConstants.RUNTIME_LOG_LOGSYSTEM, new VelocityLoggingSystem());
        
        if (velocityProperties != null) {
            // Apply properties to VelocityEngine.
            for (Iterator<?> it = velocityProperties.entrySet().iterator(); it.hasNext();) {
                Map.Entry<?, ?> entry = (Map.Entry<?, ?>) it.next();
                if (!(entry.getKey() instanceof String)) {
                    throw new IllegalArgumentException(
                            "Illegal property key [" + entry.getKey() + "]: only Strings allowed");
                }
                vEngine.setProperty((String) entry.getKey(), entry.getValue());
            }
        }
        
        
        return vEngine;
    }
    
    public void setVelocityProperties(Properties velocityProperties) {
        this.velocityProperties = velocityProperties;
    }

    
    /**
     * Created to keep original behavior of VelocityEngineFactoryBean
     * @author salgado
     *
     */
    private static final class VelocityLoggingSystem implements LogSystem {
        private static final Log velocityLogger = LogFactory.getLog(VelocityEngine.class);

        @Override
        public void logVelocityMessage(int type, String msg) {
                switch (type) {
                case ERROR_ID:
                    velocityLogger.error(msg);
                    break;
                case WARN_ID:
                    velocityLogger.warn(msg);
                    break;
                case INFO_ID:
                    velocityLogger.info(msg);
                    break;
                case DEBUG_ID:
                    velocityLogger.debug(msg);
                    break;
            }
   
        }

        @Override
        public void init(RuntimeServices arg0) throws Exception {}
    }


	@Override
	public VelocityEngine getObject() throws Exception {
		return velocityEngine;
	}

	@Override
	public Class<VelocityEngine> getObjectType() {
		return VelocityEngine.class;
	}

}
