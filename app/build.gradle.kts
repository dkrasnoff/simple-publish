plugins {
    id("java-library")
    `maven-publish`
}

group = "publish"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    api(project(":lib"))
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components.findByName("java"))
        artifactId = "app-publication"
    }
}
