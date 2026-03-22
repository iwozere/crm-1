# CRM Web Service Tasks Module

## Overview

The `crm-ws-tasks` module contains pure Java implementations of web service tasks that can be invoked via REST API calls. This module provides the business logic layer for web service operations, maintaining clean separation between HTTP concerns and business logic.

## Architecture

### WebServiceTaskBase

All web service tasks extend the `WebServiceTaskBase` abstract class, which provides:

- **Task Type Identification**: Each task declares its type via `getTaskType()`
- **Parameter Validation**: Abstract method for parameter validation
- **Execution Contract**: Standardized `executeTask()` method
- **Error Handling**: Consistent exception handling patterns

### WebServiceTaskAggregator

The `WebServiceTaskAggregator` is a Spring component that:

- **Task Registry**: Automatically discovers and registers all `WebServiceTaskBase` implementations
- **Task Execution**: Provides `executeTask(String taskType, Map<String, Object> parameters)` method
- **Error Handling**: Returns structured error responses for unknown tasks

## Current Task Implementations

### GetCustomerTask
- **Task Type**: `getCustomer`
- **Purpose**: Retrieve customer information by ID
- **Parameters**: `customerId` (String)
- **Returns**: Customer details including name, contact info, and account status

### UpdateOrderTask
- **Task Type**: `updateOrder`
- **Purpose**: Update order status and related information
- **Parameters**:
  - `orderId` (String): Order identifier
  - `status` (String): New order status
- **Returns**: Updated order information

## Dependencies

- `crm-domain`: Business domain objects and interfaces
- `crm-dal`: Data access layer for database operations
- `spring-boot-starter`: Spring framework support

## Task Development Pattern

### Creating a New Web Service Task

1. **Extend WebServiceTaskBase**:
```java
@Component
public class MyCustomTask extends WebServiceTaskBase {
    @Override
    public String getTaskType() {
        return "myCustomTask";
    }

    @Override
    protected void validateParameters(Map<String, Object> parameters) {
        // Validate required parameters
        if (!parameters.containsKey("requiredParam")) {
            throw new IllegalArgumentException("requiredParam is required");
        }
    }

    @Override
    public Map<String, Object> executeTask(Map<String, Object> parameters) {
        // Business logic implementation
        String param = (String) parameters.get("requiredParam");
        // ... perform business operations ...

        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }
}
```

2. **Automatic Registration**: The task is automatically discovered and registered by `WebServiceTaskAggregator`

3. **REST Access**: Available via:
   - Read-only: `POST /api/ws/readonly/myCustomTask`
   - Read-write: `POST /api/ws/readwrite/myCustomTask`

## Design Principles

### Pure Business Logic
- No HTTP or web framework dependencies
- No Camunda/Zeebe integration
- Focus solely on business operations

### Testability
- Each task can be unit tested in isolation
- Mock dependencies for comprehensive testing
- Clear input/output contracts

### Extensibility
- Easy to add new tasks without modifying existing code
- Registry pattern allows dynamic task discovery
- Consistent error handling across all tasks

## Error Handling

Tasks should throw appropriate exceptions:

- `IllegalArgumentException`: Invalid parameters
- `RuntimeException`: Business logic errors
- Custom exceptions for specific error conditions

The `WebServiceTaskAggregator` catches these exceptions and converts them to structured error responses.

## Testing

Each task implementation should include:

- **Unit Tests**: Test business logic in isolation
- **Parameter Validation Tests**: Ensure proper validation
- **Error Scenario Tests**: Verify error handling
- **Integration Tests**: Test with actual data access layer

## Future Enhancements

- **Task Metadata**: Add descriptions, parameter schemas, and examples
- **Task Categories**: Group tasks by functional area
- **Asynchronous Tasks**: Support for long-running operations
- **Task Metrics**: Monitoring and performance tracking</content>
<parameter name="filePath">c:\dev\learn\crm\crm-ws-tasks\docs\project-specification.md