package com.example.diceroller

/*
    Dice Roller
    by Culaway, Rene Jotham C.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Integer.parseInt
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener   { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up)
        countUpButton.setOnClickListener   { countUp() }
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked",
        //   Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val txt = resultText.text.toString()
        try {
            var num = parseInt(txt) + 1
            if (num < 7) {
                resultText.text = num.toString()
            }
        } catch (e:NumberFormatException) {
            resultText.text = "1"
        }
    }
}
