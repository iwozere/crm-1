# Project Specification: crm-dal

## Purpose
The `crm-dal` project provides a unified, persistent storage abstraction for the Telecom Backend. It isolates the Domain Model from the Database Schema and Hibernate-specific lifecycle states.

## Tech Stack
- **Java:** 21 (LTS)
- **Framework:** Spring Data JPA / Hibernate
- **Mapping:** MapStruct (Compile-time code generation)
- **Database:** [Your DB, e.g., PostgreSQL/Oracle]
- **Generation:** QueryDSL or Hibernate Tools (for Entity generation)

## Architectural Constraints
1. **Domain Isolation:** No project outside of `crm-dal` should ever import an `*Entity` class.
2. **Transaction Management:** Supports both `REQUIRED` (for standard tasks) and `REQUIRES_NEW` (for audit logging).
3. **Immutability:** Converts mutable Hibernate Entities into immutable Domain Records for safe processing in `crm-be-tasks`.