# Product Guidelines

## Documentation & Communication
- **Tone:** Professional and Precise. Documentation should prioritize technical accuracy, clarity, and conciseness to serve as a reliable reference for developers.
- **Audience:** Assumes a solid understanding of Kotlin, Jetpack Compose, and reactive programming principles.
- **Clarity:** Use clear, unambiguous language. When introducing new concepts, provide brief rationales and cross-reference related parts of the framework.

## Architectural Principles
- **Explicit State & Events:** All UI should be modeled as a pure function of `State`, with `Events` being the only mechanism for state modification.
- **Reactive Presenters:** Presenters must be reactive (typically using `Molecule`) and lifecycle-aware, ensuring they don't leak resources or emit state into inactive UIs.
- **Strict Decoupling:** Keep `Presenter` logic entirely free of UI-specific dependencies (e.g., no `Modifier` or `Color` in a `Presenter`).

## Code Standards
- **Naming Conventions:** Follow standard Kotlin and Compose naming conventions (e.g., PascalCase for Composables, camelCase for functions and variables).
- **Immutability:** State objects must be immutable. Use Kotlin data classes with `val` properties for all state representations.
- **Composition over Inheritance:** Prefer functional composition and delegation over complex class hierarchies.

## Multiplatform Best Practices
- **Common-First Logic:** Business logic, state models, and presenters should reside in the `commonMain` source set whenever possible.
- **Platform Abstraction:** Use the `expect`/`actual` pattern sparingly. Prefer defining interfaces in `commonMain` and providing platform-specific implementations via dependency injection.

## Testing Standards
- **Presenter Testing:** Every presenter should have a corresponding test suite that verifies state transitions in response to events (using `Turbine`).
- **UI Testing:** Focus UI tests on interaction logic and visual consistency across different configurations.
- **Coverage:** Aim for high coverage of business logic and state transition paths.
