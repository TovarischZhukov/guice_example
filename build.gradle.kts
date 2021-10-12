plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("com.google.inject:guice:5.0.1")

        implementation("org.jetbrains:annotations:13.0")
    }
}