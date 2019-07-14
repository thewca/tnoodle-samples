# TNoodle Samples

In this repository you will find numerous demonstrations which show you how to embed [TNoodle](https://github.com/thewca/tnoodle) into real-life projects.


## List of sample projects

TNoodle is itself written in Java, so to reuse the JAR artifacts all sample projects are Java-related.
As such, every folder is structured like a standard [Gradle](https://gradle.com) build. The build files are written in the type-safe `Kotlin` dialect.

Every sub-project has its individual artifact configuration and `build.gradle` file. Furthermore, there is a central `buildSrc` folder,
which is automatically sourced by Gradle. It contains common code and shared configuration setups.


### tnoodle-android

A sample Android app with a drawer that lets you choose between several puzzles and generates scrambles for them.

Note that in order for this setup to compile, you will have to **install the Android SDK** on your local machine.
Most notably, this will include setting an $ANDROID_HOME environment variable so that Gradle can find the SDK installation.

Detailed steps and instructions for this can be found at [https://developer.android.com/studio](https://developer.android.com/studio).
Scroll to the bottom of the page and opt for "Command line tools only" to avoid an overhead of several GB in IDE downloads.

Build an APK file by invoking `./gradlew :tnoodle-android:assemble`

### tnoodle-js

This package uses GWT to compile TNoodle into some JavaScript code such that all scrambling capabilities can be used in a browser.
The Gradle setup is supposed to compile the JS file -- details on how to actually *use* the produced `tnoodle.js` can be found in a separate README within `tnoodle-js`.

The compilation process is triggered by invoking `:tnoodle-js:compileGwt`, but due to limitations in GWT it **only works up to Java 8**!

After compiling successfully, you can find the result file at `tnoodle-js/build/gwt/out/tnoodlejs`.