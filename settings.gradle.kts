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

include("java-mvp")
include("tnoodle-android")
include("tnoodlejs-compiler")
