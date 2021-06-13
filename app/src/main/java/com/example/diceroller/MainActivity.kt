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
        val dice1=Dice(6)
        val dice2=Dice(6)

        val result1 = dice1.roll()
        val result2 = dice2.roll()

        val resultText1 : TextView = findViewById(R.id.textView)
        val resultText2 : TextView = findViewById(R.id.textView3)

        resultText1.text = result1.toString()
        resultText2.text = result2.toString()

    }

    class Dice(private val no_sides: Int){
        fun roll(): Int{
             return (1..no_sides).random()
        }
    }
}