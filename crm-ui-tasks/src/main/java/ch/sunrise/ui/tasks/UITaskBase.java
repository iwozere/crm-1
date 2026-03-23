package ch.sunrise.ui.tasks;

import java.util.Map;

/**
 * Base class for UI task implementations.
 * UI tasks are pure Java implementations that can be invoked from UI controllers.
 */
public abstract class UITaskBase {

    /**
     * Get the task type identifier.
     * @return the task type string
     */
    public abstract String getTaskType();

    /**
     * Validate the input parameters for this task.
     * @param parameters the input parameters
     * @throws IllegalArgumentException if parameters are invalid
     */
    protected abstract void validateParameters(Map<String, Object> parameters);

    /**
     * Execute the task with the given parameters.
     * @param parameters the input parameters
     * @return the task result
     */
    public abstract Map<String, Object> executeTask(Map<String, Object> parameters);
}