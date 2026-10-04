plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("KotlinHelloWorldKt")
}

tasks.register<JavaExec>("runLesson") {
    group = "application"
    description = "Run a lesson. Example: ./gradlew runLesson -Plesson=Degiskenler"
    val lessonName = providers.gradleProperty("lesson").orElse("KotlinHelloWorld")
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set(lessonName.map { "${it}Kt" })
    standardInput = System.`in`
}
