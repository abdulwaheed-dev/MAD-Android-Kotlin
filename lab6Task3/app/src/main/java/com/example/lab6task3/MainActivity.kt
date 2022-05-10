package com.example.lab6task3

import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.typeOf


class MainActivity : AppCompatActivity() {

    val data : Array<Numbers> = arrayOf(
            Numbers(R.drawable.one, "One", "1"),
            Numbers(R.drawable.two, "Two", "2"),
            Numbers(R.drawable.three, "Three", "3"),
            Numbers(R.drawable.four, "Four", "4"),
            Numbers(R.drawable.five, "Five", "5"),
            Numbers(R.drawable.six, "Six", "6"),
            Numbers(R.drawable.seven, "Seven", "7"),
            Numbers(R.drawable.eight, "Eight", "8"),
            Numbers(R.drawable.nine, "Nine", "9"),
    )

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list : ListView = findViewById(R.id.list)
        val adapter : MyAdapter = MyAdapter(this, R.layout.row, data)
        list.adapter = adapter

        list.setOnItemClickListener { parent, _, position, _ ->

            val selectedItem = parent.getItemAtPosition(position)
            //val tt : String = selectedItem::class.java.typeName

            val tt = selectedItem.toString()
            val list = tt.split("=",",")
            val numbr = (list[3]).toString().toLowerCase()

            when(numbr){
                "one" -> {
                    var mp = MediaPlayer.create(this,R.raw.one)
                    mp.start()
                }
                "two" -> {
                    var mp = MediaPlayer.create(this,R.raw.two)
                    mp.start()
                }
                "three" -> {
                    var mp = MediaPlayer.create(this,R.raw.three)
                    mp.start()
                }
                "four" -> {
                    var mp = MediaPlayer.create(this,R.raw.four)
                    mp.start()
                }
                "five" -> {
                    var mp = MediaPlayer.create(this,R.raw.five)
                    mp.start()
                }
                "six" -> {
                    var mp = MediaPlayer.create(this,R.raw.six)
                    mp.start()
                }
                "seven" -> {
                    var mp = MediaPlayer.create(this,R.raw.seven)
                    mp.start()
                }
                "eight" -> {
                    var mp = MediaPlayer.create(this,R.raw.eight)
                    mp.start()
                }
                "nine" -> {
                    var mp = MediaPlayer.create(this,R.raw.nine)
                    mp.start()
                }
            }

            Toast.makeText(this, numbr, Toast.LENGTH_SHORT).show()

        }
    }
}

data class Numbers(val img: Int, val num: String, val number: String)