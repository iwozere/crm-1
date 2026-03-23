package ch.sunrise.be.tasks;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Example task worker registry for crm-be-tasks.
 *
 * This class provides a small pure-java dispatch layer for workers.
 */
@Component
public class TaskWorkerAggregator {

    private final Map<String, JobWorkerServiceBase> workers = new HashMap<>();

    public TaskWorkerAggregator() {
        // choose tasks that you'd like to register to this module
        registerWorker(new ch.sunrise.be.tasks.example.CheckCredit());
        registerWorker(new ch.sunrise.be.tasks.example.SendEmail());
    }

    public void registerWorker(JobWorkerServiceBase worker) {
        workers.put(worker.getWorkerType(), worker);
    }

    public Map<String, Object> executeWorker(String workerType, Map<String, Object> input) {
        JobWorkerServiceBase worker = workers.get(workerType);
        if (worker == null) {
            throw new IllegalArgumentException("Worker not found: " + workerType);
        }
        return worker.run(input);
    }
}
