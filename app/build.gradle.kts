plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.kusukanime"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.kusukanime"
        minSdk = 24
        targetSdk = 35
        versionCode = 31
        versionName = "0.1.0"

        // Public Supabase anon key (client-safe; access control lives in RLS).
        buildConfigField("String", "SUPABASE_URL", "\"https://auteuspvcgrrbygtuvro.supabase.co\"")
        buildConfigField("String", "SUPABASE_ANON_KEY", "\"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImF1dGV1c3B2Y2dycmJ5Z3R1dnJvIiwicm9sZSI6ImFub24iLCJpYXQiOjE3ODk2MzI1NjgsImV4cCI6MjEwNTIwODU2OH0.EoTj3FwfHVt1s_7CypoWIwqyifMXnJicGTKaAkfOZF0\"")
        buildConfigField("String", "API_BASE_URL", "\"https://api.kusukanime.id/\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.navigation.compose)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material.icons)
    debugImplementation(libs.androidx.compose.ui.tooling)

    implementation(libs.retrofit)
    implementation(libs.retrofit.kotlinx.serialization)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.coroutines.android)

    implementation(libs.coil.compose)

    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.exoplayer.hls)
    implementation(libs.androidx.media3.ui)

    implementation(libs.androidx.datastore.preferences)
}
