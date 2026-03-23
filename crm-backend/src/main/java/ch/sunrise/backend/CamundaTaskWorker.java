package ch.sunrise.backend;

import ch.sunrise.be.tasks.TaskWorkerAggregator;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.exception.ZeebeBpmnError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Zeebe job worker that delegates task processing to crm-be-tasks workers.
 * This bridges Camunda Zeebe jobs to pure Java business task implementations.
 */
@Component
public class CamundaTaskWorker {

    private static final Logger log = LoggerFactory.getLogger(CamundaTaskWorker.class);
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final TaskWorkerAggregator taskWorkerAggregator;

    public CamundaTaskWorker(TaskWorkerAggregator taskWorkerAggregator) {
        this.taskWorkerAggregator = taskWorkerAggregator;
    }

    /**
     * Generic job worker that handles all task types by delegating to crm-be-tasks.
     * The job type in Camunda should match the worker type registered in TaskWorkerAggregator.
     */
    @JobWorker(type = "crm-task")
    public void executeCrmTask(ActivatedJob job) {
        String jobType = job.getType();
        log.info("Processing Camunda job: {} with key: {}", jobType, job.getKey());

        try {
            // Parse job variables as input parameters
            Map<String, Object> inputParams = objectMapper.readValue(
                job.getVariables(),
                objectMapper.getTypeFactory().constructMapType(Map.class, String.class, Object.class)
            );

            // Extract the actual task type from variables (e.g., "check-credit", "send-email")
            String taskType = (String) inputParams.getOrDefault("taskType", jobType);

            log.debug("Executing task type: {} with params: {}", taskType, inputParams);

            // Delegate to crm-be-tasks worker
            Map<String, Object> result = taskWorkerAggregator.executeWorker(taskType, inputParams);

            // Complete the Camunda job with the result
            job.newCompleteCommand(job.getKey())
                .variables(objectMapper.writeValueAsString(result))
                .send()
                .join();

            log.info("Camunda job completed successfully: {}", job.getKey());

        } catch (IllegalArgumentException e) {
            // Unknown task type
            log.error("Unknown task type: {}", e.getMessage());
            throw new ZeebeBpmnError("UNKNOWN_TASK_TYPE", "Task type not supported: " + e.getMessage());
        } catch (Exception e) {
            log.error("Task execution failed for job {}: {}", job.getKey(), e.getMessage(), e);
            job.newFailCommand(job.getKey())
                .retries(3)
                .errorMessage("Task execution failed: " + e.getMessage())
                .send()
                .join();
        }
    }

    /**
     * Alternative: Specific job workers for each task type.
     * Uncomment and modify as needed for more explicit job type handling.
     */
    /*
    @JobWorker(type = "check-credit")
    public void executeCheckCredit(ActivatedJob job) {
        executeGenericTask(job, "check-credit");
    }

    @JobWorker(type = "send-email")
    public void executeSendEmail(ActivatedJob job) {
        executeGenericTask(job, "send-email");
    }

    private void executeGenericTask(ActivatedJob job, String taskType) {
        try {
            Map<String, Object> inputParams = objectMapper.readValue(
                job.getVariables(),
                objectMapper.getTypeFactory().constructMapType(Map.class, String.class, Object.class)
            );

            Map<String, Object> result = taskWorkerAggregator.executeWorker(taskType, inputParams);

            job.newCompleteCommand(job.getKey())
                .variables(objectMapper.writeValueAsString(result))
                .send()
                .join();

        } catch (Exception e) {
            job.newFailCommand(job.getKey())
                .retries(3)
                .errorMessage(e.getMessage())
                .send()
                .join();
        }
    }
    */
}