package dependencies

object Libraries {
    val ANDROID_APPCOMPAT_V7 = "com.android.support:appcompat-v7:${Versions.ANDROID_APPCOMPAT_V7}"
    val ANDROID_SUPPORT_V4 = "com.android.support:support-v4:${Versions.ANDROID_SUPPORT_V4}"
    val ANDROIDSVG = "com.caverock:androidsvg:${Versions.ANDROIDSVG}"

    val ANDROID_BUILD_TOOLS = "com.android.tools.build:gradle:${Versions.ANDROID_BUILD_TOOLS}"

    val TNOODLE_SCRAMBLES = "org.worldcubeassociation.tnoodle:tnoodle-scrambles:${Versions.TNOODLE_SCRAMBLES}"
    val TNOODLE_UTILS = "org.worldcubeassociation.tnoodle:tnoodle-utils:${Versions.TNOODLE_UTILS}"

    object Buildscript {
        val ANDROID_BUILD_TOOLS_ACTUAL = ANDROID_BUILD_TOOLS
    }
}
