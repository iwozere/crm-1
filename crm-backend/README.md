# CRM Backend - Camunda Task Processing

## Overview

The `crm-backend` module provides a generalized Camunda task processing framework that connects Zeebe job workers to pure Java business task implementations in `crm-be-tasks`.

## Architecture

```
Camunda Zeebe → CamundaTaskWorker → TaskWorkerAggregator → JobWorkerServiceBase implementations
```

### Components

1. **CamundaTaskWorker** (`crm-backend`)
   - Zeebe job worker that receives tasks from Camunda
   - Delegates processing to `TaskWorkerAggregator`
   - Handles Zeebe-specific concerns (job completion, retries, errors)

2. **TaskWorkerAggregator** (`crm-be-tasks`)
   - Registry of available task workers
   - Routes tasks to appropriate `JobWorkerServiceBase` implementations
   - Pure Java, no Zeebe dependencies

3. **JobWorkerServiceBase** (`crm-be-tasks`)
   - Abstract base class for business task implementations
   - Pure Java business logic, no infrastructure concerns

## Usage

### Adding a New Task

1. **Create task implementation** in `crm-be-tasks/src/main/java/ch/sunrise/be/tasks/example/`:
   ```java
   public class MyTask extends JobWorkerServiceBase {
       @Override
       public String getWorkerType() {
           return "my-task";
       }

       @Override
       public Map<String, Object> execute(Map<String, Object> params) {
           // Business logic here
           return result;
       }
   }
   ```

2. **Register in TaskWorkerAggregator**:
   ```java
   registerWorker(new MyTask());
   ```

3. **Call from Camunda BPMN**:
   - Service Task with Job Type: `crm-task`
   - Task variables: `{"taskType": "my-task", "param1": "value1"}`

### Job Variables Format

Camunda job variables should include:
- `taskType`: The worker type to execute (e.g., "check-credit", "send-email")
- Additional parameters specific to the task

Example:
```json
{
  "taskType": "check-credit",
  "customerId": "cust-123",
  "amount": 1500.00
}
```

## Configuration

### Zeebe Client (application.yaml)
```yaml
camunda:
  zeebe:
    client:
      gateway-address: localhost:26500
      plaintext: true
      worker:
        max-jobs-active: 32
        threads: 8
zeebe:
  client:
    default-job-timeout: 1m
    default-job-retries: 3
```

### Available Tasks

- `check-credit`: Credit score calculation
- `send-email`: Email notification based on credit score

## Error Handling

- Unknown task types throw `ZeebeBpmnError` with code `UNKNOWN_TASK_TYPE`
- Business logic exceptions are retried up to 3 times
- All errors are logged with job context

## Testing

Run integration tests:
```bash
mvn -pl crm-backend test
```

Tests verify:
- TaskWorkerAggregator injection
- Task execution with sample data
- Result validation