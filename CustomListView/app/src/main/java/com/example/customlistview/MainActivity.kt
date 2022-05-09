package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val data : Array<User> = arrayOf(
        User(R.drawable.bajwa,"Qamar Javed Bajwa","abc@hotmail.com","123 456 789"),
        User(R.drawable.edhi,"Abdul Sattar Edhi","abc@hotmail.com","123 456 789"),
        User(R.drawable.jinnah,"Muhammad Ali Jinnah","abc@hotmail.com","123 456 789"),
        User(R.drawable.iqbal,"Allama Iqbal","abc@hotmail.com","123 456 789"),
        User(R.drawable.img,"Piyare Bhai","abc@hotmail.com","123 456 789")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list : ListView = findViewById(R.id.list)
        val adapter : MyAdapter = MyAdapter(this,R.layout.row,data)
        list.adapter = adapter
    }
}

data class User(val img:Int,val name:String,val email:String,val contact:String)
