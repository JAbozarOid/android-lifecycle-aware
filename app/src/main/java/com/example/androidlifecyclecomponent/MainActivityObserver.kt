package com.example.androidlifecyclecomponent

import android.nfc.Tag
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * the symbol : means extend in java
 */
class MainActivityObserver : LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateEvent() {
        Log.i(TAG,"Observer ON_CREATE")
    }

    companion object {
        private val TAG: String = MainActivityObserver::class.java.simpleName
    }
}