plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
    application
}

group = "com.spaced.out"
version = "1.0.0"
application {
    mainClass.set("com.spaced.out.ApplicationKt")
    
    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

dependencies {
    implementation(projects.shared)
    implementation(libs.logback)
    implementation(libs.ktor.serverCore)
    implementation(libs.ktor.serverNetty)
    implementation(libs.exposed.core)
    implementation(libs.exposed.jdbc)
    implementation(libs.exposed.java.time)
    implementation(libs.postgresql)

    testImplementation(libs.ktor.serverTestHost)
    testImplementation(libs.kotlin.testJunit)
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
    archiveFileName.set("app.jar")
    mergeServiceFiles()
    manifest {
        attributes["Main-Class"] = "com.spaced_out.ApplicationKt"
    }
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    // Make other dist tasks depend on shadowJar to avoid Gradle warnings
    distZip {
        dependsOn(shadowJar)
    }
    distTar {
        dependsOn(shadowJar)
    }
    startScripts {
        dependsOn(shadowJar)
    }

    jar {
        enabled = false // Don't need regular JAR if using fat JAR
    }
}