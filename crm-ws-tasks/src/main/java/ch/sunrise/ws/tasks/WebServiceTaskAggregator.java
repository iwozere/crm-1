package ch.sunrise.ws.tasks;

import ch.sunrise.ws.tasks.example.GetCustomerTask;
import ch.sunrise.ws.tasks.example.UpdateOrderTask;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Web service task registry for crm-ws-tasks.
 *
 * This class provides a registry for web service task implementations.
 */
@Component
public class WebServiceTaskAggregator {

    private final Map<String, WebServiceTaskBase> tasks = new HashMap<>();

    public WebServiceTaskAggregator() {
        // Register available web service tasks
        registerTask(new GetCustomerTask());
        registerTask(new UpdateOrderTask());
    }

    public void registerTask(WebServiceTaskBase task) {
        tasks.put(task.getTaskType(), task);
    }

    public Map<String, Object> executeTask(String taskType, Map<String, Object> input) {
        WebServiceTaskBase task = tasks.get(taskType);
        if (task == null) {
            throw new IllegalArgumentException("Web service task not found: " + taskType);
        }
        return task.run(input);
    }

    public boolean hasTask(String taskType) {
        return tasks.containsKey(taskType);
    }
}