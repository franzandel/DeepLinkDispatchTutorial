package com.example.deeplinkdispatchtutorial

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.deeplinkdispatch.DeepLink
import kotlinx.android.synthetic.main.activity_1.*
import java.net.URLDecoder

class Activity1 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        if (intent.getBooleanExtra(DeepLink.IS_DEEP_LINK, false)) {
            val parameters = intent.extras
            val phone = parameters?.getString("phone")
            val message = parameters?.getString("text")

            tv1.text = "Phone: $phone \n" +
                       "Message: $message"
        }

//        // Without 3rd Party Library
//        val extras = intent.extras
//        if (extras != null) {
//            val phone = extras["phone"]
//            val message = extras["text"].toString()
//            val messageDecoded = URLDecoder.decode(message, "UTF-8")
//
//            tv1.text = "Phone: $phone \n" +
//                    "Message: $messageDecoded"
//        }
    }

}
