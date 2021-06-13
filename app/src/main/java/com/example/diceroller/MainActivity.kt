package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled !", Toast.LENGTH_SHORT)
            toast.show()

            rollDice()
        }
    }

    private fun rollDice() {
        val dice=Dice(6)
        val result = dice.roll()

        val resultText : TextView = findViewById(R.id.textView)
        resultText.text = result.toString()
    }

    class Dice(private val no_sides: Int){
        fun roll(): Int{
             return (1..no_sides).random()
        }
    }
}