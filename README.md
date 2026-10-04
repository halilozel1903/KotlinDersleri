# Kotlin Lessons (Kotlin Dersleri)

Beginner-friendly Kotlin programming lessons in Turkish, with runnable examples for each topic.

This project uses **Kotlin 2.4.20**, **Gradle 9.7.1** (wrapper included), the Gradle Kotlin DSL, and a **Java 21** toolchain.

## Requirements

- [JDK 21](https://adoptium.net/) or newer

## How to run the lessons

The Gradle Wrapper downloads Gradle for you.

```bash
# Compile every lesson
./gradlew compileKotlin

# Run the Hello World lesson (default)
./gradlew run

# Run any lesson by file name (without .kt)
./gradlew runLesson -Plesson=Variables
./gradlew runLesson -Plesson=WhenExpressions
./gradlew runLesson -Plesson=Ranges
./gradlew runLesson -Plesson=BasicCollections
```

You can also open the project in IntelliJ IDEA and run the `main()` function in any lesson file.

## Lessons

Lesson **file names** and Gradle `-Plesson=` keys are in **English**. Comments and sample output in the sources remain in Turkish for learners.

| Lesson | File | Topics |
|--------|------|--------|
| Hello World | [HelloWorld.kt](src/main/kotlin/HelloWorld.kt) | First program, `print` |
| Variables | [Variables.kt](src/main/kotlin/Variables.kt) | `var`, `val`, naming |
| Data types | [DataTypes.kt](src/main/kotlin/DataTypes.kt) | Numeric types, Boolean, Char, String, arrays |
| Null safety basics | [NullSafety.kt](src/main/kotlin/NullSafety.kt) | Nullable types, `?.`, `!!` |
| When expressions (2026) | [WhenExpressions.kt](src/main/kotlin/WhenExpressions.kt) | `when`, ranges in branches, expression form |
| Ranges (2026) | [Ranges.kt](src/main/kotlin/Ranges.kt) | `..`, `until`, `downTo`, `step`, loops |
| String templates (2026) | [StringTemplates.kt](src/main/kotlin/StringTemplates.kt) | `$`, `${}`, multiline strings |
| Basic collections (2026) | [BasicCollections.kt](src/main/kotlin/BasicCollections.kt) | `listOf`, `mutableListOf`, `setOf`, `mapOf` |

## Resources

- [Kotlin documentation](https://kotlinlang.org/docs/home.html)
- [Getting started with Kotlin](https://kotlinlang.org/docs/getting-started.html)
