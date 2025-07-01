plugins {
    id("com.android.application")
}

import java.util.Properties

android {
    namespace = "com.talhaeens.ivyilachatirlatici"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.talhaeens.ivyilachatirlatici"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        
        // AdMob ID'lerini local.properties'ten oku
        val localProperties = Properties()
        val localPropertiesFile = rootProject.file("local.properties")
        if (localPropertiesFile.exists()) {
            localProperties.load(localPropertiesFile.inputStream())
        }
        
        buildConfigField("String", "ADMOB_APP_ID", "\"${localProperties.getProperty("ADMOB_APP_ID") ?: "ca-app-pub-3940256099942544~3347511713"}\"")
        buildConfigField("String", "ADMOB_BANNER_ID", "\"${localProperties.getProperty("ADMOB_BANNER_ID") ?: "ca-app-pub-3940256099942544/6300978111"}\"")
        buildConfigField("String", "ADMOB_INTERSTITIAL_ID", "\"${localProperties.getProperty("ADMOB_INTERSTITIAL_ID") ?: "ca-app-pub-3940256099942544/1033173712"}\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
            applicationIdSuffix = ".debug"
        }
    }
    
    buildFeatures {
        buildConfig = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.activity:activity:1.8.2")
    implementation(libs.constraintlayout)
    
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("androidx.core:core:1.9.0")
    
    // Android 8+ uyumluluk için
    implementation("androidx.work:work-runtime:2.8.1")
    implementation("androidx.lifecycle:lifecycle-service:2.6.2")
    implementation("androidx.lifecycle:lifecycle-process:2.6.2")
    
    // Google AdMob - güvenli entegrasyon
    implementation("com.google.android.gms:play-services-ads:23.0.0")
    implementation("com.google.android.gms:play-services-base:18.3.0")
    implementation("com.google.android.ump:user-messaging-platform:2.2.0")
    
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}