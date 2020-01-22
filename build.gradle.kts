import dependencies.Libraries.ANDROID_BUILD_TOOLS

buildscript {
    repositories {
        mavenCentral()
        google()
    }

    dependencies {
        classpath(ANDROID_BUILD_TOOLS)
    }
}

allprojects {
    group = "org.worldcubeassociation.tnoodle-samples"
    version = "0.1.0"
}
