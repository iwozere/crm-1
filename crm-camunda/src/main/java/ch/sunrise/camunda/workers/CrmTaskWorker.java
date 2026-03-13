package ch.sunrise.camunda.workers;

import io.camunda.client.api.response.ActivatedJob;
import io.camunda.client.annotation.JobWorker;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.Map;

@Component
public class CrmTaskWorker {

    @JobWorker(type = "process-crm-task")
    @Transactional
    public Map<String, Object> execute(final ActivatedJob job) {
        var variables = job.getVariablesAsMap();
        String accountId = (String) variables.get("accountId");

        // Logic here would call services from crm-be-tasks
        System.out.println("[WORKER] Processing account: " + accountId);

        return Map.of(
            "processedAt", System.currentTimeMillis(),
            "status", "COMPLETE",
            "worker", "sunrise-crm-worker"
        );
    }
}
