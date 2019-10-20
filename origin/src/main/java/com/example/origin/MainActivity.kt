package com.example.origin

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URLEncoder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simple_intent_btn.setOnClickListener {
            val phoneNumber = edt_phone.text.toString()
            val text = edt_message.text.toString()
            val textEncoded = URLEncoder.encode(text, "UTF-8")

            val uri = Uri.parse("franz://amazing?phone=$phoneNumber&text=$textEncoded")

            val intent = Intent(
                Intent.ACTION_VIEW,
                uri
            )

            // Without 3rd Party Library
//            intent.putExtra("phone", phoneNumber)
//            intent.putExtra("text", textEncoded)

            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                Log.d("DEEPMAIN", e.message!!)
            }

        }
    }
}
