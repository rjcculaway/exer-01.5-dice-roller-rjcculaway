package com.example.diceroller

/*
    Exercise 01: Your First Interactive UI
    by Culaway, Rene Jotham C.

    This mobile app is a "dice roller" that can also count up.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener   { rollDice() }

//        val countUpButton: Button = findViewById(R.id.count_up)
//        countUpButton.setOnClickListener   { countUp() }
    }

    private fun rollDice() {
        // Randomize a number
        val randomInt = (1..6).random()

        val resultImage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultImage.setImageResource(drawableResource)
    }

//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        val txt = resultText.text.toString()
//
//        // Try and increment the number on the dice.
//        try {
//            var num = txt.toInt() + 1
//            if (num < 7) {
//                resultText.text = num.toString()
//            }
//        } catch (e:NumberFormatException) {
//            resultText.text = "1"
//        }
//    }
}
