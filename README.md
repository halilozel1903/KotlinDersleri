# Kotlin Lessons (Kotlin Dersleri)

Sample Kotlin programs for introductory lessons: Hello World, variables, data types, and null safety. Each file is a standalone script with its own `main()` entry point.

The project builds with **Gradle 9.7.1** (wrapper included), **Kotlin 2.4.20**, and a **Java 21** toolchain.

## Requirements

- [JDK 21](https://adoptium.net/) or newer

## Build

```bash
./gradlew compileKotlin
```

## Run lessons

Default entry point is the Hello World lesson:

```bash
./gradlew run
```

Run any lesson by Kotlin file name (without the `.kt` extension):

```bash
./gradlew runLesson -Plesson=Degiskenler
./gradlew runLesson -Plesson=VeriTipleri
./gradlew runLesson -Plesson=NullKavrami
./gradlew runLesson -Plesson=KotlinHelloWorld
```

You can also open the repository in IntelliJ IDEA or Android Studio and run `main()` from a lesson file.

## Project layout

| File | Topic |
|------|--------|
| [KotlinHelloWorld.kt](src/main/kotlin/KotlinHelloWorld.kt) | First program, basic output |
| [Degiskenler.kt](src/main/kotlin/Degiskenler.kt) | `var` vs `val`, naming notes (Turkish comments) |
| [VeriTipleri.kt](src/main/kotlin/VeriTipleri.kt) | Numeric types, Boolean, Char, String, arrays |
| [NullKavrami.kt](src/main/kotlin/NullKavrami.kt) | Nullable types, safe call, non-null assertion |

Lesson comments and variable names are in Turkish; this README is in English for tooling and onboarding.

## Resources

- [Kotlin documentation](https://kotlinlang.org/docs/home.html)
- [Getting started with Kotlin](https://kotlinlang.org/docs/getting-started.html)
