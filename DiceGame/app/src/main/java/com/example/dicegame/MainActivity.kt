package com.example.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val imgLeftDice = findViewById<ImageView>(R.id.imgLeftDice)
        val imgRightDice = findViewById<ImageView>(R.id.imgRightDice)
        val lblLeftDice = findViewById<TextView>(R.id.lblLeftDice)
        val lblRightDice = findViewById<TextView>(R.id.lblRightDice)
        val lblWonStatus = findViewById<TextView>(R.id.lblWonStatus)

        val images = arrayOf(R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.dice)

        btnPlay.setOnClickListener(){
            val dice1 = (1..6).random()
            val dice2 = (1..6).random()

            imgLeftDice.setImageResource(images[dice1-1])
            imgRightDice.setImageResource(images[dice2-1])

            lblLeftDice.text = dice1.toString()
            lblRightDice.text = dice2.toString()

            if(dice1 === dice2){
                lblWonStatus.text = "You WON!"
            }
            else{
                lblWonStatus.text = "You LOSS!"
            }
        }
    }
}