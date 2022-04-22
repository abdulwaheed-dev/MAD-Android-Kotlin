package com.example.databaseexample

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var database : SQLiteDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = openOrCreateDatabase("Studnets", MODE_PRIVATE,null)

        createTable()
        insertLoginData()
        getAllLoginDetails()
    }
    fun createTable(){
        val table = "CREATE TABLE IF NOT EXISTS login(id INT, username TEXT, password TEXT)"
        database.execSQL(table)
    }
    fun insertLoginData(){
        var insertData : ContentValues = ContentValues()
        insertData.put("id",1)
        insertData.put("username","waheed")
        insertData.put("password","123")

        database.insert("login",null, insertData)

    }
    fun getAllLoginDetails(){
        val query = "SELECT * FROM login"
        val cursor : Cursor = database.rawQuery(query,null)

        /*
        cursor.moveToFirst()

        do{

            val id = cursor.getInt(0)
            val username = cursor.getString(1)
            val password = cursor.getString(2)

        }while (cursor.moveToNext())
         */

        Toast.makeText(this,"Total Rows: "+cursor.count,Toast.LENGTH_LONG).show()

    }
}