plugins {
    id("java-library")
    `maven-publish`
}

group = "test"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components.findByName("java"))
        artifactId = "custom-lib"
    }
}