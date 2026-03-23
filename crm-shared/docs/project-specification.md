# CRM Common Specification

## Purpose
The `crm-common` module is the transport layer and the primary entry point for external consumers of the CRM system.

## Responsibilities
- Defining REST Controllers and gRPC stubs.
- Handling DTO (Data Transfer Object) mapping for API requests and responses.
- Routing incoming requests to the appropriate Business Tasks in `crm-be-tasks`.

## Dependencies
- `crm-be-tasks`
