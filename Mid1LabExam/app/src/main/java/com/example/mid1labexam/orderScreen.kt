package com.example.mid1labexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class orderScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_screen)

        val orderDetails = findViewById<TextView>(R.id.textView9)
        val pricetxt = findViewById<TextView>(R.id.textView10)

        val intent = getIntent()

        var t = intent.getStringExtra("topping")
        var s = intent.getStringExtra("sauce")
        var c = intent.getStringExtra("crust")
        var q = intent.getStringExtra("quantity")

        var price = q?.toInt()?.times(800)

        var order = "Extra Topping : $t \nExtra Sauce: $s \nDouble Crust: $c \nPizza Quantity: $q"

        pricetxt.text = "Order Price is: $price"

        orderDetails.text = order
    }
}