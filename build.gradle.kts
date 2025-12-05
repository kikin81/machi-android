// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.spotless)
    alias(libs.plugins.dependencies.sorter) apply false
}

subprojects {
    apply(plugin = "com.squareup.sort-dependencies")
}

spotless {
    kotlin {
        target("**/*.kt")
        targetExclude("**/build/**/*.kt")
        ktlint(libs.versions.ktlint.get())
            .customRuleSets(
                listOf(
                    libs.compose.rules.ktlint.get().toString()
                )
            )
            .editorConfigOverride(
                mapOf(
                    "ktlint_standard_no-wildcard-imports" to "disabled",
                    "ktlint_standard_filename" to "disabled",
                    "ktlint_standard_function-naming" to "disabled"
                )
            )
            .setEditorConfigPath("$rootDir/.editorconfig")
    }
    kotlinGradle {
        target("**/*.gradle.kts")
        ktlint(libs.versions.ktlint.get())
    }
}
