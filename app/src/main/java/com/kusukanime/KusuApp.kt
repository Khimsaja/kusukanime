package com.kusukanime

import android.app.Application
import com.kusukanime.data.LibraryStore

class KusuApp : Application() {
    lateinit var libraryStore: LibraryStore
        private set

    override fun onCreate() {
        super.onCreate()
        libraryStore = LibraryStore(this)
    }
}
