# CRM Business Tasks Specification

## Purpose
The `crm-be-tasks` module provides a collection of pure Java business task implementations. It contains the actual business logic for CRM operations without any Camunda/Zeebe infrastructure dependencies.

## Responsibilities
- Implementing business task logic as pure Java classes
- Providing a registry (`TaskWorkerAggregator`) for task discovery
- Defining the `JobWorkerServiceBase` contract for consistent task implementation
- Coordinating between domain services and data access layers
- Managing transactional boundaries for complex business operations
- Fetching data from external APIs if needed to enrich domain objects

## Architecture

### Pure Java Design
- **Zero Camunda Dependencies**: No Zeebe, Spring Zeebe, or Camunda imports
- **Testable**: Easy unit testing without infrastructure setup
- **Reusable**: Business logic can be used in any context (REST, batch, etc.)

### Task Implementation Pattern
```java
public class MyTask extends JobWorkerServiceBase {
    @Override
    public String getWorkerType() {
        return "my-task-type";
    }

    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        // Pure business logic here
        return result;
    }
}
```

## Key Components

### JobWorkerServiceBase
- Abstract base class defining the task contract
- Template method pattern: `getWorkerType()` + `execute()`
- Optional parameter extraction and validation
- Pure Java with no framework dependencies

### TaskWorkerAggregator
- Spring `@Component` that registers available task workers
- Routes execution requests by task type
- Provides clean API for task discovery and execution
- Can be extended to support dynamic task registration

### Example Tasks
Located in `src/main/java/ch/sunrise/be/tasks/example/`:
- **CheckCredit**: Credit score calculation and approval logic
- **SendEmail**: Email notification based on business rules

## Task Registration

Tasks are registered in `TaskWorkerAggregator` constructor:
```java
public TaskWorkerAggregator() {
    registerWorker(new CheckCredit());
    registerWorker(new SendEmail());
    // Add new tasks here
}
```

## Usage

### From Camunda (via crm-backend)
- Tasks are invoked through `TaskWorkerAggregator.executeWorker(taskType, params)`
- Parameters passed as `Map<String, Object>`
- Results returned as `Map<String, Object>`

### Direct Usage
```java
@Autowired
TaskWorkerAggregator aggregator;

Map<String, Object> result = aggregator.executeWorker("check-credit", params);
```

## Dependencies
- `crm-domain`: Business domain objects and interfaces
- `crm-dal`: Data access layer for persistence
- No Camunda/Zeebe dependencies (pure business logic)

## Testing
- Unit tests for individual task implementations
- Integration tests for `TaskWorkerAggregator`
- Mock domain and DAL layers for isolated testing
- Easy to test business logic without Camunda setup

## Adding New Tasks

1. **Create Task Class**:
   ```java
   package ch.sunrise.be.tasks.example;

   public class MyNewTask extends JobWorkerServiceBase {
       @Override
       public String getWorkerType() {
           return "my-new-task";
       }

       @Override
       public Map<String, Object> execute(Map<String, Object> params) {
           // Implement business logic
           return Map.of("result", "success");
       }
   }
   ```

2. **Register in TaskWorkerAggregator**:
   ```java
   registerWorker(new MyNewTask());
   ```

3. **Use in BPMN**:
   - Job Type: `crm-task`
   - Variables: `{"taskType": "my-new-task", ...}`

## Benefits

### Clean Architecture
- Business logic separated from workflow infrastructure
- Easy to test and maintain
- Framework-agnostic implementation

### Flexibility
- Tasks can be reused in different contexts (REST APIs, batch jobs, etc.)
- Easy to add new business operations
- No coupling to specific workflow engine

### Scalability
- Tasks can be deployed and scaled independently
- Business logic can evolve without workflow changes
- Clear boundaries enable microservices evolution
