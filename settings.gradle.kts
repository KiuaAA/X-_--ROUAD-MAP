// settings.gradle.kts
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // For PojavLauncher/Amethyst core if you want to depend on it
        maven("https://jitpack.io")
    }
}

rootProject.name = "XhubLauncher"

include(":app")
// If you later add modules like :core, :lwjgl, etc.
// include(":core")
// include(":lwjgl")
