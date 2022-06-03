package com.example.volleyapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getData(view: View){

        val textView : TextView = findViewById(R.id.textView)

        //Instantiate the RequestQueue
        val queue = Volley.newRequestQueue(this)

        //Passing a string response from provided url.
        val stringRequest = StringRequest(
            Request.Method.GET,
            "https://www.w3schools.com/Jquery/demo_test.asp",
            Response.Listener <String> {
                //Display at textView
                textView.text = it
        },
        Response.ErrorListener {
            Toast.makeText(this,"Error"+it,Toast.LENGTH_LONG).show()
        })

        queue.add(stringRequest)
    }
}