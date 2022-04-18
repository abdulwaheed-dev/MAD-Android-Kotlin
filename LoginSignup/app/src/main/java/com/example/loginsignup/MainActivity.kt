package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }

    fun signupScreen(view : View){
        val intent2 : Intent = Intent(this, Signup::class.java)
        startActivity(intent2)

    }
    fun login(view: View){
        val txtUsername = findViewById<EditText>(R.id.editTextUsername)
        val txtPassword = findViewById<EditText>(R.id.editTextPassword)

        val username = txtUsername.text.toString()
        val password = txtPassword.text.toString()

        val intent = getIntent()
        val user = intent.getStringExtra("username")
        val pass = intent.getStringExtra("password")
        val name = intent.getStringExtra("name")

        if(username == user && password == pass){
            val intent : Intent = Intent(this, WelcomScreen::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Incorrect Username or Password",Toast.LENGTH_SHORT).show()
        }
    }
}