package ch.sunrise.ws.tasks.example;

import ch.sunrise.ws.tasks.WebServiceTaskBase;

import java.util.HashMap;
import java.util.Map;

/**
 * Read-only task: Get customer information.
 * This is a read-only operation that doesn't modify data.
 */
public class GetCustomerTask extends WebServiceTaskBase {

    @Override
    public String getTaskType() {
        return "get-customer";
    }

    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        String customerId = String.valueOf(params.getOrDefault("customerId", "N/A"));

        // Simulate customer lookup (in real implementation, this would query the database)
        Map<String, Object> customer = new HashMap<>();
        customer.put("customerId", customerId);
        customer.put("name", "John Doe");
        customer.put("email", "john.doe@example.com");
        customer.put("status", "ACTIVE");
        customer.put("createdAt", System.currentTimeMillis());

        Map<String, Object> result = new HashMap<>();
        result.put("customer", customer);
        result.put("found", true);
        return result;
    }
}