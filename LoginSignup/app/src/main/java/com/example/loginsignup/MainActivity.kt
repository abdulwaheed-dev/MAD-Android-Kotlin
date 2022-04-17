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

    fun signup(view : View){
        val intent2 : Intent = Intent(this, Signup::class.java)
        startActivity(intent2)

    }
    fun login(view: View){
        val txtUsername = findViewById<EditText>(R.id.editTextUsername)
        val txtPassword = findViewById<EditText>(R.id.editTextPassword)

        val username = txtUsername.text.toString()
        val password = txtPassword.text.toString()

        if(username == "waheed" && password == "abc123"){
            val intent : Intent = Intent(this, WelcomScreen::class.java)
            intent.putExtra("name",username)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Incorrect Username or Password",Toast.LENGTH_SHORT).show()
        }
    }
}