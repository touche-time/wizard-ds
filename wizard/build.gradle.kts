import org.gradle.api.publish.maven.MavenPublication
import java.io.FileInputStream
import java.util.Properties

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.touchetime.wizard"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")

    implementation("androidx.compose.material3:material3:1.1.2")

    // Android Studio Preview support
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

val githubProperties = Properties()
githubProperties.load(FileInputStream(rootProject.file("github.properties")))

val getVersionName = { "1.0.0" } // Replace with version Name
val getArtifactId = { "wizardds" } // Replace with library name ID

publishing {
    publications {
        create<MavenPublication>("bar") {
            groupId = "com.touchetime.wizard" // Replace with group ID
            artifactId = getArtifactId()
            version = getVersionName()
            artifact("$buildDir/outputs/aar/${getArtifactId()}-release.aar")
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/GITHUB_USERID/REPOSITORY")

            credentials {
                username = (githubProperties["gpr.usr"] ?: System.getenv("GPR_USER")).toString()
                password = (githubProperties["gpr.key"] ?: System.getenv("GPR_API_KEY")).toString()
            }
        }
    }
}
