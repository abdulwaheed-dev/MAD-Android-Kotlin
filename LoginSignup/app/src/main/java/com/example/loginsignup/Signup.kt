package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    fun signup(view: View){

        val txtUsernameSignup = findViewById<EditText>(R.id.TextUsernameSignup)
        val txtPassSignup = findViewById<EditText>(R.id.TextPasswordSignup)
        val txtNameSignup = findViewById<EditText>(R.id.TextNameSignup)

        val user = txtUsernameSignup.text.toString()
        val pass = txtPassSignup.text.toString()
        val name = txtNameSignup.text.toString()

        Toast.makeText(this,"Signup Successful",Toast.LENGTH_SHORT).show()

        val intent : Intent = Intent(this,MainActivity::class.java)
        intent.putExtra("username",user)
        intent.putExtra("password",pass)
        intent.putExtra("name",name)
        startActivity(intent)
    }

//    fun changeScreen2(view: View){
//        val intent : Intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//    }
}