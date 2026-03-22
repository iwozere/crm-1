package ch.sunrise.be.tasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Base class for job workers in crm-be-tasks.
 *
 * This is pure Java, no transactional commit/rollback handling is included.
 */
public abstract class JobWorkerServiceBase {

    /**
     * Worker type name in service registry, e.g. "check-credit".
     */
    public abstract String getWorkerType();

    /**
     * Extract parameters from input, optionally validate.
     */
    public Map<String, Object> extractParameters(Map<String, Object> input) {
        return input == null ? Collections.emptyMap() : new HashMap<>(input);
    }

    /**
     * Execute the task and return result variables.
     */
    public abstract Map<String, Object> execute(Map<String, Object> params);

    /**
     * Template method to run worker from orchestration layer.
     */
    public final Map<String, Object> run(Map<String, Object> input) {
        Map<String, Object> params = extractParameters(input);
        return execute(params);
    }
}
