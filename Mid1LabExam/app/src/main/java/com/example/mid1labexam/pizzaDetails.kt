package com.example.mid1labexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class pizzaDetails : AppCompatActivity() {

    var isTopping = "No Extra Topping"
    var isSauce = "No Extra Sauce"
    var isCrust = "No Double Crust"
    var quan = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_details)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.checkout){
            val intent : Intent = Intent(this,orderScreen::class.java)
            startActivity(intent)
        }
        return true
    }

    fun order(view: View){
        val quantity = findViewById<EditText>(R.id.editTextNumberSigned)
        quan = quantity.text.toString()
        Toast.makeText(this,"Added to Order", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,orderScreen::class.java)
        intent.putExtra("topping",isTopping)
        intent.putExtra("sauce",isSauce)
        intent.putExtra("crust",isCrust)
        intent.putExtra("quantity",quan)
        startActivity(intent)
    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            if(view.id == R.id.checkBox){
                isTopping = "Extra Toppings"
            }
            if(view.id == R.id.checkBox2){
                isSauce = "Extra Sause"
            }
            if(view.id == R.id.checkBox3){
                isCrust = "Double Crust"
            }
        }
    }
}