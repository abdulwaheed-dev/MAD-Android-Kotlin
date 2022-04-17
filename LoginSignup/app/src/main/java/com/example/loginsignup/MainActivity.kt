package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeScreen(view : View){
        val intent : Intent = Intent(this, Signup::class.java)
        startActivity(intent)
    }
    fun changeScreen4(view: View){
        val intent2 : Intent = Intent(this, WelcomScreen::class.java)
        startActivity(intent2)
    }
}