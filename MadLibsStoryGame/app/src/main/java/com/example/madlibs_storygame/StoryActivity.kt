package com.example.madlibs_storygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)
    }

    fun makeAnotherStory(view: View){
        val intent : Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}