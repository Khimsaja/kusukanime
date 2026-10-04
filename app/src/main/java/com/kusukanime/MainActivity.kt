package com.kusukanime

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.kusukanime.ui.nav.AppNav
import com.kusukanime.ui.theme.KusukanimeTheme

class MainActivity : ComponentActivity() {

    private var deepLinkSlug by mutableStateOf<String?>(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        deepLinkSlug = extractSlug(intent)

        val store = (application as KusuApp).libraryStore
        setContent {
            KusukanimeTheme {
                AppNav(initialSlug = deepLinkSlug, store = store)
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        deepLinkSlug = extractSlug(intent)
    }

    private fun extractSlug(intent: Intent?): String? {
        val uri = intent?.data ?: return null
        if (uri.scheme == "kusukanime" && uri.host == "anime") {
            return uri.lastPathSegment
        }
        return null
    }
}
