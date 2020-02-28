package configurations

import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginConvention
import org.gradle.api.plugins.quality.Checkstyle
import org.gradle.api.tasks.testing.Test

import org.gradle.kotlin.dsl.*

object Languages {
    fun Project.attachLocalRepositories() {
        repositories {
            mavenLocal()
        }
    }

    fun Project.attachRemoteRepositories() {
        repositories {
            mavenCentral()
            maven(url = "https://dl.bintray.com/thewca/tnoodle-lib")
        }
    }

    fun Project.configureJava() {
        configure<JavaPluginConvention> {
            sourceCompatibility = JavaVersion.VERSION_1_8
        }
    }
}
