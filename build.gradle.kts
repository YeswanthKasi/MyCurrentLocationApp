// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

ext {
    // Define kotlin_version here
    val kotlin_version = "1.6.0" // or the version you're using
}
