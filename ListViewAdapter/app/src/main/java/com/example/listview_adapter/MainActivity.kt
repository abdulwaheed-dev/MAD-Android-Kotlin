package com.example.listview_adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var countries = arrayOf("Pakistan","Bangladesh","Afghanistan","Iraq","Iran","Tehran","Dubai","Saudi Arabia","India")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView : ListView = findViewById(R.id.listView)
        //type mismatch with data, so using adapters
        var adapter : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1, countries)
        listView.adapter = adapter
    }
}