pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.google.com")
        maven("https://jitpack.io")
        jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.google.com")
        maven("https://jitpack.io")
        jcenter()
    }
}

rootProject.name = "basic_setup"
include(":app")




