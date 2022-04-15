package com.example.musicmusic

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var mp : MediaPlayer
    lateinit var tts : TextToSpeech
    var isSpeechReady : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this,TextToSpeech.OnInitListener {
//            fun (status: Int){
//
//            }
            isSpeechReady = true
        })

    }

    //method for menus
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater : MenuInflater = getMenuInflater()
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    //method for implementing onClick on menuOption selected
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.speakHelloWorld){
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                tts.speak("Avengers. Assemble! Hold on. I'm Groot.",
                    TextToSpeech.QUEUE_FLUSH,
                    null,
                    "")
            }
        }
        Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show()
        return true
    }


    fun play(view: View){
        mp = MediaPlayer.create(this,R.raw.sample)
        mp.start()
    }

    fun pause(view: View){
        mp.pause()
    }

    fun resume(view:View){
        //resume
    }
}