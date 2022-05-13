package com.example.madlibs_storygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getStarted(view: View){
        val intent : Intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}