# CRM Backend Specification

## Purpose
The `crm-backend` module provides a Zeebe job worker bridge that connects Camunda BPMN processes to pure Java business task implementations. It acts as the integration layer between Camunda infrastructure and business logic.

## Responsibilities
- Connecting to Zeebe broker and receiving job tasks
- Delegating job execution to appropriate business task workers in `crm-be-tasks`
- Handling Zeebe-specific concerns (job completion, retries, error handling)
- Serializing/deserializing job variables to/from JSON
- Managing Zeebe client configuration and connection pooling

## Architecture

### Clean Separation
- **Infrastructure Layer**: Zeebe client, job handling, Spring Boot
- **Business Layer**: Pure Java task implementations in `crm-be-tasks`
- **Bridge Pattern**: `CamundaTaskWorker` delegates to `TaskWorkerAggregator`

### Job Processing Flow
```
Camunda BPMN → Zeebe Job → CamundaTaskWorker → TaskWorkerAggregator → JobWorkerServiceBase → Result → Job Complete
```

## Key Components

### CamundaTaskWorker
- `@JobWorker(type = "crm-task")` - Generic job worker for all CRM tasks
- Parses job variables to extract `taskType` and parameters
- Delegates execution to `TaskWorkerAggregator`
- Handles completion, retries, and BPMN errors

### TaskWorkerAggregator (from crm-be-tasks)
- Registry of available `JobWorkerServiceBase` implementations
- Routes jobs by `taskType` (e.g., "check-credit", "send-email")
- Pure Java with no Zeebe dependencies

## Configuration

### Zeebe Client (application.yaml)
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
  port: 8082  # Avoid c8run default ports
```

## Usage in BPMN

### Service Task Configuration
- **Job Type**: `crm-task`
- **Task Variables** (JSON):
  ```json
  {
    "taskType": "check-credit",
    "customerId": "customer-123",
    "amount": 1500.00
  }
  ```

### Available Task Types
- `check-credit`: Credit score calculation and approval decision
- `send-email`: Email notification based on credit score

## Error Handling

### BPMN Errors
- `UNKNOWN_TASK_TYPE`: When requested task type is not registered
- Automatic retries (up to 3) for business logic failures
- Detailed error messages in Zeebe job logs

### Logging
- Job receipt and completion events
- Task execution parameters and results
- Error details with full stack traces

## Dependencies
- `crm-be-tasks`: Business task implementations
- `spring-boot-starter-web`: REST endpoints (future use)
- `io.camunda:spring-zeebe-starter`: Zeebe client integration
- `com.fasterxml.jackson.core:jackson-databind`: JSON processing

## Testing
- Unit tests for job worker logic
- Integration tests for task delegation
- Spring context loading verification
- Mock Zeebe client for isolated testing

## Deployment
- Standalone Spring Boot application
- Can run independently of `crm-camunda`
- Connects to same Zeebe broker
- Scales horizontally for high-throughput job processing