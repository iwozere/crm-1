package ch.sunrise.ui.tasks;

import ch.sunrise.ui.tasks.example.GetCustomerDashboardTask;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * UI task registry for crm-ui-tasks.
 *
 * This class provides a registry for UI task implementations.
 */
@Component
public class UITaskAggregator {

    private final Map<String, UITaskBase> tasks = new HashMap<>();

    public UITaskAggregator() {
        // Register available UI tasks
        registerTask(new GetCustomerDashboardTask());
    }

    public void registerTask(UITaskBase task) {
        tasks.put(task.getTaskType(), task);
    }

    public Map<String, Object> executeTask(String taskType, Map<String, Object> parameters) {
        UITaskBase task = tasks.get(taskType);
        if (task == null) {
            throw new IllegalArgumentException("Unknown UI task: " + taskType);
        }

        task.validateParameters(parameters);
        return task.executeTask(parameters);
    }

    @Override
    public String toString() {
        return "Available UI tasks: " + tasks.keySet();
    }
}