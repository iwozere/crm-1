# CRM Domain Specification

## Purpose
The `crm-domain` module is the core of the CRM system. It contains the fundamental business concepts and logic of the application.

## Responsibilities
- Define core domain objects (Records) like `Order`, `LineItem`, etc.
- Houses "Simple Services" (Domain Services) that operate on domain objects using pure business logic.
- Defines repository interfaces that the data access layer must implement.

## Constraints
- **Zero Dependencies**: This module must remain "Pure Java" and not depend on any external frameworks like Spring, Hibernate, or JPA.
- **Portability**: By keeping it pure, this module can be shared across different environments if needed.