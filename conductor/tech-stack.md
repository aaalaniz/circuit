# Tech Stack

## Core Technologies
- **Language:** [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
- **UI Framework:** [Jetpack Compose](https://developer.android.com/jetpack/compose) / [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)
- **Terminal UI:** [Mosaic](https://github.com/JakeWharton/mosaic)

## Architecture & State Management
- **Presenter Logic:** [Molecule](https://github.com/cashapp/molecule) for reactive state generation.
- **Pattern:** Circuit (Presenter + UI) with explicit State and Event modeling.

## Dependency Injection
- **Android/JVM:** [Dagger](https://dagger.dev/) & [Anvil](https://github.com/square/anvil)
- **Multiplatform:** [kotlin-inject](https://github.com/evant/kotlin-inject)

## Data & Networking
- **Persistence:** [SQLDelight](https://github.com/cashapp/sqldelight) for type-safe multiplatform database access.
- **Networking:** [Ktor Client](https://ktor.io/docs/client-dependencies.html) and [OkHttp](https://square.github.io/okhttp/) (platform-specific engines).

## Testing
- **State Testing:** [Turbine](https://github.com/cashapp/turbine) for testing Coroutines Flows.
- **Assertions:** [AssertK](https://github.com/willowtreeapps/assertk)
- **Framework:** [JUnit 4](https://junit.org/junit4/)
