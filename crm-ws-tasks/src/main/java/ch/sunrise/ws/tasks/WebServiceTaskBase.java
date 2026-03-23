package ch.sunrise.ws.tasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Base class for web service tasks in crm-ws-tasks.
 *
 * This is pure Java, no web/transactional handling is included.
 */
public abstract class WebServiceTaskBase {

    /**
     * Task type name in service registry, e.g. "get-customer", "update-order".
     */
    public abstract String getTaskType();

    /**
     * Extract parameters from input, optionally validate.
     */
    public Map<String, Object> extractParameters(Map<String, Object> input) {
        return input != null ? new HashMap<>(input) : Collections.emptyMap();
    }

    /**
     * Execute the task and return result data.
     */
    public abstract Map<String, Object> execute(Map<String, Object> params);

    /**
     * Template method to run task from web service layer.
     */
    public final Map<String, Object> run(Map<String, Object> input) {
        Map<String, Object> params = extractParameters(input);
        return execute(params);
    }
}