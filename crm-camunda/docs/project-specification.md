# CRM Camunda Runtime Specification

## Purpose
The `crm-camunda` module is the Spring Boot "wrapper" that brings the entire application together.

## Responsibilities
- Bootstrapping the application via `@SpringBootApplication`.
- Hosting and managing the Camunda Process Engine.
- Configuring shared infrastructure like the database connection pool and security.

## Dependencies
- `crm-be-tasks`
- Camunda BPM Spring Boot Starter
