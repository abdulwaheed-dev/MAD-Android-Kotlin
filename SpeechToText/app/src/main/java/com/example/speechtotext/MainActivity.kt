package com.example.speechtotext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.RecognizerIntent
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun speak(view: View){
        //intent for speech recoginition
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        //detecting language
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault())

        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)

        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"You can Speak now...")

        startActivityForResult(intent,1234)

    }

    //receiving speech results
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val txt = findViewById<TextView>(R.id.textView2)

        super.onActivityResult(requestCode, resultCode, data)

        val res = data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)

        val words : String = res?.get(0).toString()

        txt.text = words
    }
}