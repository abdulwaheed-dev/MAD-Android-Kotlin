package com.example.hangmangame_assignment01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.util.HashMap
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private val words = arrayOf("ball", "account", "goggles", "noodles", "follower", "bitter", "egg", "been", "cool", "chess", "comma", "funny","hurry","press","rupee","yahoo","common","indeed","killed")
    var guessedWord : String = ""
    var won : Boolean = false
    var finalMessage : String = "you have guessed: -word- (x guesses left)"
    var guessLeft : Int = 0
    val images = arrayOf(R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven)
    private var character : Char = ' '

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtGuess = findViewById<EditText>(R.id.txtEnterGuessWord)
        val btnGuess = findViewById<Button>(R.id.btnGuess)
        val btnNew = findViewById<Button>(R.id.btnNew)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val txtViewDescription = findViewById<TextView>(R.id.txtViewDescription)
        val txtViewGuess = findViewById<TextView>(R.id.txtViewGuessWord)

        val convertedWord = convertWord()
        txtViewGuess.text = convertedWord

        btnGuess.setOnClickListener(){
            val guessedChar : Char = txtGuess.text.toString()[0]
            if(character === guessedChar){
                txtViewDescription.text =
                        "Wow! you guessed right.\nYou have guessed: $guessedChar (x guesses left)"
            }
        }
        btnNew.setOnClickListener(){
            txtGuess.text.clear()
            val convertedWord = convertWord()
            txtViewGuess.text = convertedWord
        }
    }

    private fun convertWord(): String {
        val randomIndex = (words.indices).random()
        var word = words[randomIndex]
        var converting=""

        var flag = false

        word = word.toLowerCase()
        val map = HashMap<Any, Any>()
        for(i in word.toCharArray()){
            if (map.keys.contains(i)) {
                var x = map[i]
                map[i] = 1+x!! as Int
            } else {
                map[i] = 1
            }
        }
        for (c in map.keys) {
            if(map[c] as Int > 1){
                flag=true
                character = c as Char
            }
        }

        if(flag===true){
            for(c in word){
                if(c==character){
                    converting+='?'
                    continue
                }
                converting+=c as Char
            }
        }
        return converting
    }
}