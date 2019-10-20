package com.example.deeplinkdispatchtutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.deeplinkdispatch.DeepLinkHandler

/**
 * Created by Franz Andel on 2019-07-18.
 * Android Engineer
 */

@DeepLinkHandler(AppDeepLinkModule::class)
class DeepLinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val deepLinkDelegate = DeepLinkDelegate(AppDeepLinkModuleLoader())

        deepLinkDelegate.dispatchFrom(this)

        finish()
    }
}