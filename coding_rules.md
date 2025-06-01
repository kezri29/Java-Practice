# Java Coding Standards and Best Practices

## 🔤 1. Naming Conventions
- Class names: `PascalCase` (e.g., `OrderService`)
- Method names: `camelCase` (e.g., `placeOrder`)
- Constants: `ALL_CAPS_WITH_UNDERSCORES`
- Packages: `lowercase` and reverse domain style (`com.example.service`)
- Interfaces should be nouns or adjectives (e.g., `Runnable`, `Serializable`)

## 🔒 2. Access Modifiers
- **Minimize visibility**: Use `private` unless access from outside is required.
- Avoid `public` fields — use getters/setters.
- Use `final` for constants or objects not meant to be reassigned.

## 🔄 3. Immutability and Encapsulation
- Always make a defensive copy when returning internal lists/maps.
- Avoid exposing mutable state.
- Use `final` for class members unless mutation is necessary.

## 📦 4. Code Organization
- One top-level class per file.
- Group related classes into meaningful packages (e.g., `controller`, `service`, `model`, `util`)
- Keep each class focused on a single responsibility (SRP - SOLID principle)

## 🔁 5. Control Structures
- Always use braces `{}` even for single-line `if/else/for` blocks.
- Avoid deeply nested `if` statements. Prefer early returns.

## ⚠️ 6. Exception Handling
- Never catch generic `Exception` or `Throwable`
- Use specific exceptions (`IllegalArgumentException`, `IOException`)
- Log or handle all exceptions gracefully — never silently ignore them.
- Do not use exceptions for control flow.

## 🧪 7. Testing & Validation
- Validate method inputs using guards
- Use `assert` or unit tests to cover edge cases
- Prefer `Optional` instead of returning `null`

## 📝 8. Documentation & Comments
- Every public class and method should have Javadoc
- Use inline comments only when logic is not obvious
- Avoid redundant comments like `// getter method`

## 🧹 9. Clean Code Practices
- Remove unused imports and dead code
- Limit method length to ~30 lines
- Prefer descriptive variable names (`customerName` over `cn`)
- Do not repeat yourself (DRY principle)

## 📏 10. Formatting
- Use 4 spaces for indentation (never tabs)
- Keep lines ≤ 100 characters
- Add one blank line between methods
- Do not leave trailing whitespace

## 💡 11. Design Principles
- Follow SOLID principles (Single Responsibility, Open/Closed, etc.)
- Favor composition over inheritance
- Program to interfaces, not implementations
- Keep constructors lightweight

## 🔐 12. Security
- Never log sensitive info (e.g., passwords, tokens)
- Sanitize all input data before processing or persisting
- Avoid SQL injection by using prepared statements

## 🔄 13. Logging
- Use a logging framework (e.g., SLF4J, Log4j)
- Do not use `System.out.println` in production code
- Log at appropriate levels: `error`, `warn`, `info`, `debug`

## 🧼 14. Dependency Management
- Use dependency injection (e.g., Spring) where possible
- Avoid tight coupling between classes

## 🧵 15. Thread Safety (if applicable)
- Use synchronization or concurrent collections where needed
- Avoid shared mutable state unless synchronized

## 📊 16. Metrics & Monitoring
- Expose basic metrics via APIs (if applicable)
- Instrument long-running or critical paths
