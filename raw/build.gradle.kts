plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.10")
    id("com.github.johnrengelman.shadow") version "5.0.0"
    application
}

group = "com.raywenderlich"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "com.raywenderlich.AppKt"
}
