# Module Requirements: crm-domain

## 1. Domain Model (Records)
- **Immutability:** All domain objects (Order, LineItem, etc.) must be implemented as Java Records.
- **Deep Copying:** Methods that "modify" the state (e.g., `withNewAttribute`) must return a new instance of the Record.
- **Validation:** Records should perform basic structural validation in their compact constructors (e.g., checking for null IDs).

## 2. Domain Services ("Simple Services")
- **Business Invariants:** Implementation of telecom rules (e.g., "A 'Fiber' item must have a 'Router' attribute").
- **State Transitions:** Logic that determines if an Order can move from 'Draft' to 'Submitted'.
- **Enrichment Logic:** Pure functions that take a 'ProductDefinition' (from the cache) and apply its values to a 'LineItem'.

## 3. Provider Interfaces
- **Abstraction:** Defines interfaces for external data (Caches, Repositories) so the Domain can stay decoupled from the actual implementation.