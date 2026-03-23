# Technical Requirements

## Overview
The `crm-backend` module implements a Zeebe job worker that connects to Camunda 8 for processing CRM business tasks.

## Technical Stack (2026 Standards)

* **Framework:** Spring Boot 3.4+ with Java 21
* **Camunda Version:** Camunda 8.8.x (Self-Managed / C8 Run)
* **Protocol:** gRPC via `spring-zeebe-starter`
* **Architecture:** Remote Job Worker pattern

## Core Architecture

### Decoupled Execution
- **Zeebe Engine**: Holds process state and workflow definitions
- **crm-backend**: Holds business logic and job execution
- **crm-be-tasks**: Pure Java business task implementations

### Polling Mechanism
- Long-polling gRPC connection to `localhost:26500`
- Configurable thread pools and job batch sizes
- Automatic retry logic for transient failures

### Idempotency
All business operations must be idempotent since network failures can occur between task completion and Zeebe acknowledgment.

## Required Dependencies

```xml
<!-- Camunda Zeebe Integration -->
<dependency>
    <groupId>io.camunda</groupId>
    <artifactId>spring-zeebe-starter</artifactId>
    <version>8.8.11</version>
</dependency>

<!-- Business Tasks -->
<dependency>
    <groupId>ch.sunrise</groupId>
    <artifactId>crm-be-tasks</artifactId>
    <version>${project.version}</version>
</dependency>
```

## Application Configuration

### application.yaml
```yaml
camunda:
  zeebe:
    client:
      gateway-address: localhost:26500
      plaintext: true
      worker:
        max-jobs-active: 32  # Jobs fetched per poll
        threads: 8           # Parallel execution threads
zeebe:
  client:
    default-job-timeout: 1m
    default-job-retries: 3

server:
  port: 8082  # Avoid conflicts with C8 Run defaults
```

## Implementation Patterns

### Job Worker Implementation
```java
@Component
public class CamundaTaskWorker {

    @JobWorker(type = "crm-task")
    public void executeCrmTask(ActivatedJob job) {
        // Extract task type and parameters
        Map<String, Object> params = objectMapper.readValue(
            job.getVariables(),
            Map.class
        );

        String taskType = (String) params.get("taskType");

        // Delegate to business logic
        Map<String, Object> result = taskWorkerAggregator
            .executeWorker(taskType, params);

        // Complete job
        job.newCompleteCommand(job.getKey())
            .variables(objectMapper.writeValueAsString(result))
            .send().join();
    }
}
```

### Error Handling
- Use `ZeebeBpmnError` for business-level failures
- Automatic retries for transient infrastructure issues
- Comprehensive logging for debugging

## Development Workflow

1. **Local Setup**: Install and configure C8 Run
2. **Code Implementation**: Add new tasks to `crm-be-tasks`
3. **Testing**: Unit tests for business logic, integration tests for Zeebe
4. **Deployment**: Standalone Spring Boot application
5. **Monitoring**: Zeebe Operate UI for process monitoring

## Performance Considerations

- **Virtual Threads**: Consider enabling Spring's virtual threads for high-throughput scenarios
- **Connection Pooling**: Zeebe client handles connection management
- **Batch Processing**: Configure appropriate job batch sizes
- **Monitoring**: Implement health checks and metrics

## Security

- Local development uses plaintext connections
- Production deployments should configure TLS
- Authentication may be required for production Zeebe clusters