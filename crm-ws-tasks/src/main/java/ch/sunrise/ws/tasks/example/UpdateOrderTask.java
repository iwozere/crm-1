package ch.sunrise.ws.tasks.example;

import ch.sunrise.ws.tasks.WebServiceTaskBase;

import java.util.HashMap;
import java.util.Map;

/**
 * Read-write task: Update order information.
 * This is a read-write operation that modifies data and should be transactional.
 */
public class UpdateOrderTask extends WebServiceTaskBase {

    @Override
    public String getTaskType() {
        return "update-order";
    }

    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        String orderId = String.valueOf(params.getOrDefault("orderId", "N/A"));
        String status = String.valueOf(params.getOrDefault("status", "PENDING"));

        // Validate status
        if (!isValidStatus(status)) {
            throw new IllegalArgumentException("Invalid status: " + status);
        }

        // Simulate order update (in real implementation, this would update the database)
        Map<String, Object> order = new HashMap<>();
        order.put("orderId", orderId);
        order.put("status", status);
        order.put("updatedAt", System.currentTimeMillis());
        order.put("updatedBy", "webservice");

        Map<String, Object> result = new HashMap<>();
        result.put("order", order);
        result.put("updated", true);
        result.put("previousStatus", "PENDING");
        return result;
    }

    private boolean isValidStatus(String status) {
        return "PENDING".equals(status) ||
               "CONFIRMED".equals(status) ||
               "SHIPPED".equals(status) ||
               "DELIVERED".equals(status) ||
               "CANCELLED".equals(status);
    }
}