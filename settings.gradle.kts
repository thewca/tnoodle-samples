rootProject.name = "tnoodle-samples"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "gwt") {
                useModule("org.wisepersist:gwt-gradle-plugin:${requested.version}")
            }
        }
    }
}

include("tnoodle-android")
include("tnoodle-js")
