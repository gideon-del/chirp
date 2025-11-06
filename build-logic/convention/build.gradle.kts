import org.jetbrains.kotlin.gradle.dsl.JvmTarget


plugins {
    `kotlin-dsl`
}

group = "org.gideon.convention.buildlogic"
dependencies {

    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin)
    compileOnly(libs.androidx.room.gradle.plugin)
    implementation(libs.buildkonfig.gradlePlugin)
    implementation(libs.buildkonfig.compiler)

}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget  = JvmTarget.JVM_17
    }
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
 plugins {
     register("andriodApplication") {
         id = "com.gideon.chirp.convention.android.application"
         implementationClass = "AndroidApplicationConventionPlugin"
     }
     register("andriodComposeApplication") {
         id = "com.gideon.chirp.convention.android.application.compose"
         implementationClass = "AndroidApplicationComposeConventionPlugin"
     }
     register("cmpApplication") {
         id = "com.gideon.chirp.convention.cmp.application"
         implementationClass = "CmpApplicationConventionPlugin"
     }
     register("kmpLibrary") {
         id = "com.gideon.chirp.convention.kmp.library"
         implementationClass = "KmpLibraryConventionPlugin"
     }
     register("cmpLibrary") {
         id = "com.gideon.chirp.convention.cmp.library"
         implementationClass = "CmpLibraryConventionPlugin"
     }
     register("cmpFeature") {
         id = "com.gideon.chirp.convention.cmp.feature"
         implementationClass = "CmpFeatureConventionPlugin"
     }
     register("buildKofig") {
         id = "com.gideon.chirp.convention.buildkonfig"
         implementationClass = "BuildKonfigConventionPlugin"
     }
     register("room") {
         id = "com.gideon.chirp.convention.room"
         implementationClass = "RoomConventionPlugin"
     }
 }
}