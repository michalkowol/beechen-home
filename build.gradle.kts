plugins {
    java
    id("tech.viacom.neutron.neutron-java") version "0.0.1_build21"
    id("tech.viacom.neutron.neutron-spring-boot") version "0.0.1_build21"
}

group = "com.michalkowol"
version = "0.0.1-SNAPSHOT"

dependencies {
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    implementation("com.github.spotbugs:spotbugs-annotations")

    implementation("org.springframework.boot:spring-boot-starter-web")
}
