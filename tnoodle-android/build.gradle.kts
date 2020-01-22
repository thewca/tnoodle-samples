import com.android.build.gradle.AppExtension
import configurations.Languages.attachRemoteRepositories
import dependencies.Libraries.ANDROIDSVG
import dependencies.Libraries.ANDROID_APPCOMPAT_V7
import dependencies.Libraries.ANDROID_SUPPORT_V4
import dependencies.Libraries.TNOODLE_SCRAMBLES

import dependencies.Versions.ANDROID_SDK
import dependencies.Versions.ANDROID_SDK_MIN
import dependencies.Versions.ANDROID_BUILD_LIB

plugins {
    ANDROID_APP
}

configure<AppExtension> {
    buildToolsVersion(ANDROID_BUILD_LIB)
    compileSdkVersion(ANDROID_SDK)

    defaultConfig {
        minSdkVersion(ANDROID_SDK_MIN)
        targetSdkVersion(ANDROID_SDK)
    }
}

repositories {
    jcenter()
    google()
}

attachRemoteRepositories()

dependencies {
    implementation(ANDROID_APPCOMPAT_V7)
    implementation(ANDROID_SUPPORT_V4)

    implementation(ANDROIDSVG)

    implementation(TNOODLE_SCRAMBLES)
}
