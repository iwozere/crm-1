# CRM Web Service Module

## Overview

The `crm-webservice` module provides a REST API interface for the CRM system, offering generic endpoints that delegate to web service task implementations. This module serves as the HTTP entry point for external clients that need to interact with CRM business logic without using Camunda workflows.

## Architecture

### Generic REST Controller Pattern

The module implements a generic REST controller (`CrmWebServiceController`) that provides two main endpoints:

1. **Read-Only Endpoint** (`POST /api/ws/readonly/{taskType}`)
   - Non-transactional operations
   - Suitable for queries, lookups, and read operations
   - No database modifications

2. **Read-Write Endpoint** (`POST /api/ws/readwrite/{taskType}`)
   - Transactional operations
   - Suitable for create, update, and delete operations
   - Database modifications wrapped in transactions

### Task Delegation

The controller delegates business logic execution to the `WebServiceTaskAggregator`, which manages a registry of `WebServiceTaskBase` implementations. This pattern allows:

- Dynamic task discovery and execution
- Clean separation between HTTP concerns and business logic
- Easy addition of new web service operations

## Dependencies

- `crm-ws-tasks`: Provides the web service task implementations
- `spring-boot-starter-web`: HTTP server and REST support
- `spring-boot-starter-data-jpa`: Transaction management

## Configuration

The module runs as a standalone Spring Boot application on port 8083 (configured in `application.yaml`).

## API Usage Examples

### Get Customer Information
```bash
POST /api/ws/readonly/getCustomer
Content-Type: application/json

{
  "customerId": "123"
}
```

### Update Order Status
```bash
POST /api/ws/readwrite/updateOrder
Content-Type: application/json

{
  "orderId": "456",
  "status": "SHIPPED"
}
```

## Error Handling

The controller provides structured error responses:

- **400 Bad Request**: Task not found or invalid parameters
- **500 Internal Server Error**: Task execution failures

Error responses include:
- `error`: Description of the error
- `availableTasks`: List of available task types (for debugging)

## Testing

The module includes integration tests using Spring Boot Test framework:

- `CrmWebServiceControllerTest`: Validates REST endpoint behavior
- Mocked `WebServiceTaskAggregator` for isolated testing

## Development

### Adding New Web Service Tasks

1. Create a new class extending `WebServiceTaskBase` in `crm-ws-tasks`
2. Implement the `executeTask` method with business logic
3. The task will be automatically registered by `WebServiceTaskAggregator`
4. Access via REST: `POST /api/ws/readonly/{taskType}` or `POST /api/ws/readwrite/{taskType}`

### Running the Application

```bash
cd crm-webservice
mvn spring-boot:run
```

The application will start on `http://localhost:8083`</content>
<parameter name="filePath">c:\dev\learn\crm\crm-webservice\docs\project-specification.md