package ch.sunrise.backend;

import ch.sunrise.be.tasks.TaskWorkerAggregator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestPropertySource(properties = {
    "camunda.zeebe.client.gateway-address=localhost:26500",
    "zeebe.client.worker.enabled=false"  // Disable Zeebe workers for unit test
})
class CamundaTaskWorkerIntegrationTest {

    @Autowired
    private TaskWorkerAggregator taskWorkerAggregator;

    @Test
    void taskWorkerAggregatorIsAvailable() {
        assertNotNull(taskWorkerAggregator, "TaskWorkerAggregator should be injected");
    }

    @Test
    void canExecuteCheckCreditTask() {
        Map<String, Object> input = new HashMap<>();
        input.put("customerId", "test-customer");
        input.put("amount", 1500.0);

        Map<String, Object> result = taskWorkerAggregator.executeWorker("check-credit", input);

        assertNotNull(result);
        assertEquals("test-customer", result.get("customerId"));
        assertEquals(1500.0, result.get("amount"));
        assertNotNull(result.get("creditScore"));
        assertNotNull(result.get("status"));
    }

    @Test
    void canExecuteSendEmailTask() {
        Map<String, Object> input = new HashMap<>();
        input.put("customerId", "test-customer");
        input.put("creditScore", 750);

        Map<String, Object> result = taskWorkerAggregator.executeWorker("send-email", input);

        assertNotNull(result);
        assertEquals("test-customer", result.get("customerId"));
        assertEquals(750, result.get("creditScore"));
        assertEquals(true, result.get("emailSent"));
        assertEquals("APPROVED", result.get("status"));
    }
}