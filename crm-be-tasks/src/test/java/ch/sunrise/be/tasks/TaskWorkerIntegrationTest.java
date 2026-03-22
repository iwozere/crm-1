package ch.sunrise.be.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TaskWorkerIntegrationTest {

    @Test
    void checkCreditWorkerHappyPath() {
        TaskWorkerAggregator aggregator = new TaskWorkerAggregator();

        Map<String, Object> input = new HashMap<>();
        input.put("customerId", "cust-1");
        input.put("amount", 1500);

        Map<String, Object> result = aggregator.executeWorker("check-credit", input);

        Assertions.assertEquals("cust-1", result.get("customerId"));
        Assertions.assertEquals(1500.0, result.get("amount"));
        Assertions.assertTrue((Integer) result.get("creditScore") >= 600);
        Assertions.assertNotNull(result.get("status"));
    }

    @Test
    void sendEmailWorkerHappyPath() {
        TaskWorkerAggregator aggregator = new TaskWorkerAggregator();

        Map<String, Object> input = new HashMap<>();
        input.put("customerId", "cust-1");
        input.put("creditScore", 720);

        Map<String, Object> result = aggregator.executeWorker("send-email", input);

        Assertions.assertEquals("cust-1", result.get("customerId"));
        Assertions.assertEquals(720, result.get("creditScore"));
        Assertions.assertEquals(true, result.get("emailSent"));
        Assertions.assertEquals("APPROVED", result.get("status"));
    }
}
