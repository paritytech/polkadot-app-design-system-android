plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    `maven-publish`
}

group = "com.github.paritytech"
// JitPack passes the git tag/commit being built via the VERSION env var.
// Fall back to a local placeholder for local publishToMavenLocal runs.
version = System.getenv("VERSION") ?: "0.0.1-local"

android {
    namespace = "io.paritytech.polkadotapp.designsystem"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

dependencies {
    api(platform(libs.androidx.compose.bom))
    api(libs.androidx.compose.ui)
    api(libs.androidx.compose.foundation)
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = project.group.toString()
            artifactId = "polkadot-app-design-system-android"
            version = project.version.toString()

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}
