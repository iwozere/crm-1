# CRM UI Tasks Module

## Overview

The `crm-ui-tasks` module contains pure Java implementations of UI tasks that can be invoked from web controllers. This module provides the business logic layer for web UI operations, maintaining clean separation between web concerns and business logic.

## Architecture

### UITaskBase

All UI tasks extend the `UITaskBase` abstract class, which provides:

- **Task Type Identification**: Each task declares its type via `getTaskType()`
- **Parameter Validation**: Abstract method for parameter validation
- **Execution Contract**: Standardized `executeTask()` method
- **Error Handling**: Consistent exception handling patterns

### UITaskAggregator

The `UITaskAggregator` is a Spring component that:

- **Task Registry**: Automatically discovers and registers all `UITaskBase` implementations
- **Task Execution**: Provides `executeTask(String taskType, Map<String, Object> parameters)` method
- **Error Handling**: Returns structured error responses for unknown tasks

## Current Task Implementations

### GetCustomerDashboardTask
- **Task Type**: `getCustomerDashboard`
- **Purpose**: Retrieve customer dashboard data for UI display
- **Parameters**: `customerId` (String)
- **Returns**: Dashboard data including recent orders, active orders, total spent, and last login

## Dependencies

- `crm-domain`: Business domain objects and interfaces
- `crm-dal`: Data access layer for database operations
- `spring-boot-starter`: Spring framework support

## Task Development Pattern

### Creating a New UI Task

1. **Extend UITaskBase**:
```java
@Component
public class MyCustomUITask extends UITaskBase {
    @Override
    public String getTaskType() {
        return "myCustomUITask";
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

2. **Automatic Registration**: The task is automatically discovered and registered by `UITaskAggregator`

3. **Controller Access**: Available via web controllers in `crm-frontend`

## Design Principles

### Pure Business Logic
- No web or HTTP framework dependencies
- No Thymeleaf or template dependencies
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

The `UITaskAggregator` catches these exceptions and converts them to structured error responses.

## Testing

Each task implementation should include:

- **Unit Tests**: Test business logic in isolation
- **Parameter Validation Tests**: Ensure proper validation
- **Error Scenario Tests**: Verify error handling
- **Integration Tests**: Test with actual data access layer

## Future Enhancements

- **Task Metadata**: Add descriptions, parameter schemas, and examples
- **Task Categories**: Group tasks by functional area
- **Caching**: Add caching support for frequently accessed data
- **Metrics**: Monitoring and performance tracking</content>
<parameter name="filePath">c:\dev\learn\crm\crm-ui-tasks\docs\project-specification.md