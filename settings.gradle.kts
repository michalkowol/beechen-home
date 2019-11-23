pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            name = "mtvn-proximity"
            url = uri("https://nexus.mtvi.com/nexus/repository/releases")
            credentials {
                val nexusUser: String? by settings
                val nexusPassword: String? by settings
                username = System.getenv("NEXUS_USERNAME") ?: System.getenv("NEXUS_USER") ?: nexusUser
                password = System.getenv("NEXUS_PASSWORD") ?: System.getenv("NEXUS_PASS") ?: nexusPassword
            }
        }
    }
}

rootProject.name = "beechen-home"
