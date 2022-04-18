package com.example.mid1labexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun pizzaDetail(view: View){
        val intent : Intent = Intent(this,pizzaDetails::class.java)
        startActivity(intent)
    }
}