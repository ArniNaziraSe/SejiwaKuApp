plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.msv.sejiwaku"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.msv.sejiwaku"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
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
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.firestore)
    implementation(libs.androidx.runtime.livedata)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //Api Splass
    implementation("androidx.core:core-splashscreen:1.0.1")
    // Navigation
    implementation("androidx.navigation:navigation-compose:2.7.7")
    // Icon lebih
    implementation("androidx.compose.material:material-icons-extended:1.6.7")
    // Data-Store
    implementation("androidx.datastore:datastore-preferences:1.1.1")

    // Navigation Compose
    implementation("androidx.navigation:navigation-compose:2.5.0-rc01")

    // Font
    implementation("androidx.compose.ui:ui-text-google-fonts:1.6.7")

    // Navigation Compose
    implementation("androidx.navigation:navigation-compose:2.5.0-rc01")

    // BottomNavigation
    implementation ("androidx.compose.material:material:1.4.2")

    // coil
    implementation ("io.coil-kt:coil-compose:2.0.0-rc01")

    // lainya
    implementation ("androidx.compose.ui:ui:1.4.3")
    implementation ("androidx.compose.material3:material3:1.1.1")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.4.3")
    implementation ("androidx.activity:activity-compose:1.7.1")

    // viewmodel
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
}