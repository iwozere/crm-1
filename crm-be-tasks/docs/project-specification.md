# CRM Business Tasks Specification

## Purpose
The `crm-be-tasks` module handles the business orchestration and "Unit of Work" logic. It acts as the "conductor" for complex operations.

## Responsibilities
- Coordinating between multiple domain services and repositories.
- Implementing Camunda Task listeners or Service tasks.
- Managing transactional boundaries for complex business processes.
- Fetching data from external APIs if needed to enrich domain objects.

## Dependencies
- `crm-domain`
- `crm-dal`
