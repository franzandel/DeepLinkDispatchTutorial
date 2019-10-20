package com.example.deeplinkdispatchtutorial

import android.content.Context
import android.content.Intent
import com.airbnb.deeplinkdispatch.DeepLink
import com.airbnb.deeplinkdispatch.DeepLinkModule

/**
 * Created by Franz Andel on 2019-07-18.
 * Android Engineer
 */

@DeepLinkModule
class AppDeepLinkModule

@DeepLink("franz://amazing")
fun startActivity1(context: Context): Intent {
    return Intent(context, Activity1::class.java)
}