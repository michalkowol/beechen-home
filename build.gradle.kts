plugins {
    java
    id("org.springframework.boot") version "2.1.7.RELEASE"
}

apply(plugin = "io.spring.dependency-management")

group = "com.michalkowol"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    implementation("com.github.spotbugs:spotbugs-annotations:3.1.12")

    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.wrapper {
    gradleVersion = "5.6.2"
}
