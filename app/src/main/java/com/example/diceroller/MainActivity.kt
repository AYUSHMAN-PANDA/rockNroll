package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
//import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice1()
        }

        val rollButton2: Button = findViewById(R.id.button2)
        rollButton2.setOnClickListener {
            rollDice2()
        }

    }

    private fun rollDice1() {
        val dice1=Dice(6)

        val result1 = dice1.roll()

        val diceImage: ImageView = findViewById(R.id.imageView)
        var diceResult = when(result1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceResult)
        diceImage.contentDescription = result1.toString()

    }

    private fun rollDice2() {
        val dice=Dice(6)

        val result1 = dice.roll()

        val diceImage: ImageView = findViewById(R.id.imageView2)
        var diceResult = when(result1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceResult)
        diceImage.contentDescription = result1.toString()

    }

    class Dice(private val no_sides: Int){
        fun roll(): Int{
             return (1..no_sides).random()
        }
    }
}