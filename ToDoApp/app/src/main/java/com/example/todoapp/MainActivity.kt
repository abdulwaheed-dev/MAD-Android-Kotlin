package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    var todoArray = arrayListOf<String>("Pakistan","Bangladesh","Afghanistan","Norway","Italy","Spain","Iraq","Iran","Tehran","Dubai","Saudi Arabia","India")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddNewItem = findViewById<Button>(R.id.btnAddItem)
        var listView : ListView = findViewById(R.id.listView)
        //type mismatch with data, so using adapters
        var adapter : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1, todoArray)
        listView.adapter = adapter

//        btnAddNewItem.setOnClickListener(){
//            val item = (findViewById<EditText>(R.id.txtToDo).text.toString())
//            todoArray.add(item)
//            listView.adapter
//            Toast.makeText(this,"ToDo Added!",Toast.LENGTH_SHORT).show()
//        }
    }
//    fun addNewItem(view: View){
//        val item = (findViewById<EditText>(R.id.txtToDo).text.toString())
//        todoArray.add(item)
//        Toast.makeText(this,"ToDo Added!",Toast.LENGTH_SHORT).show()
//    }
}