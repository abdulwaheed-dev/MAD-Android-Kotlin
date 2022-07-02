package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View){
        var username : String = ""
        var password : String = ""

        val txtuser : EditText = findViewById(R.id.txtusername)
        val txtpass : EditText  = findViewById(R.id.txtpassword)
        username = txtuser.text.toString()
        password = txtpass.text.toString()

        if(username == "waheed"){
            if(password == "12345"){
                val intent : Intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("username",username)
                startActivity(intent)
            }
        }
        else{
            Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show()
        }
    }
}