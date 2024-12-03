/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.10.2/userguide/building_java_projects.html in the Gradle documentation.
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    id("application")
    id("java")
    id("nu.studer.jooq") version "8.2"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // OpenAI Java client library for API interaction.
    implementation("io.github.stefanbratanov:jvm-openai:0.11.0")

    // PostgreSQL Driver
    implementation("org.postgresql:postgresql:42.6.0")

    // JOOQ runtime dependency for querying
    implementation("org.jooq:jooq:3.18.0")

    // PostgreSQL Driver for JOOQ code generation
    jooqGenerator("org.postgresql:postgresql:42.6.0")

    testing {
        suites {
            // Configure the built-in test suite
            val test by getting(JvmTestSuite::class) {
                // Use JUnit Jupiter test framework
                useJUnitJupiter("5.10.3")
            }
        }
    }

// Apply a specific Java toolchain to ease working on different environments.
    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    application {
        // Define the main class for the application.
        mainClass.set("org.example.App")
    }
}
