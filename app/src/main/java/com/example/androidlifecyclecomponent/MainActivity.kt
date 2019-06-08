package com.example.androidlifecyclecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


/**
 * we must attach this class to this own observer
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG,"Owner onCreate")

        lifecycle.addObserver(MainActivityObserver())
    }

    companion object {
        private val TAG: String = MainActivityObserver::class.java.simpleName

    }

    /**
     * the sequence of a activity lifecycle is
     * onCreate
     * onStart
     * onResume
     * onPause
     * onStop
     * onDestroy
     */
}
