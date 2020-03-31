plugins {
    // alternatively "java" will also work
    application
}

repositories {
    mavenCentral()
    maven(url = "https://dl.bintray.com/thewca/tnoodle-lib")
}

dependencies {
    implementation("org.worldcubeassociation.tnoodle:lib-scrambles:0.18.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

// REMOVE the following block if you're using "java" plugin instead of "application" plugin above!
application {
    mainClassName = "com.foobar.mvp.ScrambleProvider"
}