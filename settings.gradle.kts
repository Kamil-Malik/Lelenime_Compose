pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Lelenime Compose"
include(":app")
include(":feature:explore")
include(":feature:collection")
include(":feature:more")
include(":core:common")
include(":core:data")
include(":core:domain")
include(":core:database")
include(":core:network")
include(":core:model")
include(":feature:detail")