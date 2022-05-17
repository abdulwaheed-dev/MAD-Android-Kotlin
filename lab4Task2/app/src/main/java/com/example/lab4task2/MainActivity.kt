package com.example.lab4task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img : ImageView = findViewById(R.id.imageView2)
        registerForContextMenu(img)

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.option_1 -> {
                Toast.makeText(this,"option1 selected",Toast.LENGTH_SHORT).show()
            }
            R.id.option_2 -> {
                Toast.makeText(this,"option2 selected",Toast.LENGTH_SHORT).show()
            }
            R.id.option_3 -> {
                Toast.makeText(this,"option3 selected",Toast.LENGTH_SHORT).show()
            }
            R.id.option_4 -> {
                Toast.makeText(this,"option4 selected",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onContextItemSelected(item)
    }
    fun changeActivity(view:View){
        val intent : Intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}