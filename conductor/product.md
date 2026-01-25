# Initial Concept
The project is Circuit, a simple and reactive architectural framework for building Jetpack Compose-based applications across multiple platforms (Android, iOS, Desktop, Web, and Terminal).

# Product Definition

## Target Audience
Circuit is primarily built for Android and Multiplatform Kotlin developers who are looking for a robust, reactive architecture to build Compose-based user interfaces.

## Core Goals
- **Consistent UI Patterns:** Establish a clear and predictable Presenter + UI pattern for all Compose screens.
- **State & Navigation Management:** Simplify the complexities of state management and navigation in large-scale applications.
- **Multiplatform Synergy:** Enable seamless code sharing across Android, iOS, Desktop, Web, and Terminal environments via Kotlin Multiplatform.

## Key Features
- **Separation of Concerns:** Strict decoupling between business logic (Presenters) and visual representation (UI).
- **DI Integration:** Deep support for popular dependency injection frameworks like Dagger, Anvil, and Kotlin-Inject to facilitate modularity.
- **Flexible Navigation:** A built-in navigation system that integrates naturally with backstacks and screen transitions.

## Value Proposition
Circuit stands out by explicitly modeling UIs as functions of State and Events, utilizing Molecule for highly reactive presenters. It provides a unified, "out-of-the-box" solution for handling overlays, backstacks, and transitions that are often manual and error-prone in standard MVVM or MVI implementations.

## Mosaic Integration
Mosaic is a first-class citizen in the Circuit ecosystem, enabling the development of complex, stateful terminal interfaces. By using the same Circuit patterns, developers can build reactive CLI tools and reuse business logic across terminal and mobile/web environments.
