package ch.sunrise.webservice;

import ch.sunrise.ws.tasks.WebServiceTaskAggregator;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Generic REST controller for CRM web service operations.
 * Provides read-only and read-write endpoints that delegate to web service tasks.
 */
@RestController
@RequestMapping("/api/ws")
public class CrmWebServiceController {

    private final WebServiceTaskAggregator taskAggregator;

    public CrmWebServiceController(WebServiceTaskAggregator taskAggregator) {
        this.taskAggregator = taskAggregator;
    }

    /**
     * Generic read-only endpoint (non-transactional).
     * Use this for queries, lookups, and other read operations.
     *
     * @param taskType The type of task to execute (e.g., "get-customer")
     * @param requestBody Request parameters as key-value pairs
     * @return Task execution result
     */
    @PostMapping("/readonly/{taskType}")
    public ResponseEntity<Map<String, Object>> executeReadOnlyTask(
            @PathVariable String taskType,
            @RequestBody Map<String, Object> requestBody) {

        try {
            Map<String, Object> result = taskAggregator.executeTask(taskType, requestBody);
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            Map<String, Object> error = new HashMap<>();
            error.put("error", "Task not found: " + taskType);
            error.put("availableTasks", taskAggregator.toString()); // In real impl, list available tasks
            return ResponseEntity.badRequest().body(error);
        } catch (Exception e) {
            Map<String, Object> error = new HashMap<>();
            error.put("error", "Task execution failed: " + e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }

    /**
     * Generic read-write endpoint (transactional).
     * Use this for create, update, delete operations that modify data.
     *
     * @param taskType The type of task to execute (e.g., "update-order")
     * @param requestBody Request parameters as key-value pairs
     * @return Task execution result
     */
    @PostMapping("/readwrite/{taskType}")
    @Transactional
    public ResponseEntity<Map<String, Object>> executeReadWriteTask(
            @PathVariable String taskType,
            @RequestBody Map<String, Object> requestBody) {

        try {
            Map<String, Object> result = taskAggregator.executeTask(taskType, requestBody);
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            Map<String, Object> error = new HashMap<>();
            error.put("error", "Task not found: " + taskType);
            return ResponseEntity.badRequest().body(error);
        } catch (Exception e) {
            // Transaction will be rolled back automatically on exception
            Map<String, Object> error = new HashMap<>();
            error.put("error", "Task execution failed: " + e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }

    /**
     * Health check endpoint to verify service availability.
     */
    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> health() {
        Map<String, Object> health = new HashMap<>();
        health.put("status", "UP");
        health.put("service", "crm-webservice");
        health.put("timestamp", System.currentTimeMillis());
        return ResponseEntity.ok(health);
    }
}