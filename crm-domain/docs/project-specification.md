# Project Specification: crm-domain

## Purpose
The "Heart" of the system. Contains the business logic and data structures that define the Telecom Order lifecycle. It is designed to be side-effect free and highly testable.

## Tech Stack
- **Java:** 21 (LTS)
- **Dependencies:** None (Strictly prohibited: Spring, JPA, Hibernate, Jackson annotations).
- **Concurrency:** Thread-safe by design via effectively immutable Records.

## Architectural Constraints
1. **Purity:** Logic must not perform I/O (no DB, no API calls).
2. **Deterministic:** Given the same input Order and Context, the output must always be the same.
3. **Cross-Platform Readiness:** Must be compilable as a standalone JAR for use in non-server environments (e.g., CLI tools or potential future mobile integrations).