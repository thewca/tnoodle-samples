package dependencies

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Plugins {
    inline val PluginDependenciesSpec.GWT_ACTUAL: PluginDependencySpec
        get() = id("gwt").version(Versions.Plugins.GWT)

    inline val PluginDependenciesSpec.ANDROID_APP_ACTUAL: PluginDependencySpec
        get() = id("com.android.application")
}
