package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class WelcomScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom_screen)

        val lblUsername = findViewById<TextView>(R.id.lblUsername)
        val intent : Intent = getIntent()
        val name = intent.getStringExtra("name")
        lblUsername.text = "Mr. $name"
    }

    fun logout(view: View){
        val intent : Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}