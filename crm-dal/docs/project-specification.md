# CRM DAL Project Specification

## Purpose
The `crm-dal` module is the Data Access Layer parent. It is responsible for bridging the core Domain objects with the underlying database schema.

## Responsibilities
- **Mapping**: Using MapStruct to convert between database Entities and Domain Records.
- **Persistence**: Implementing the repository interfaces defined in `crm-domain`.
- **Generated Code**: Managing automated JPA entity generation from the DB schema (in `crm-dal-generated`).
- **Caching**: Providing caching mechanisms for frequently accessed data (in `crm-cache`).
- **Runtime**: Providing the Spring Data JPA implementation (in `crm-dal-runtime`).

## Dependencies
- `crm-domain`
- Spring Data JPA / Hibernate