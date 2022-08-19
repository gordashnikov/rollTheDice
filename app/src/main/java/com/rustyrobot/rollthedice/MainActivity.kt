package com.rustyrobot.rollthedice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rustyrobot.rollthedice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonRollDice.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        binding.diceLeft.setImageResource(getRandomDice())
        binding.diceRight.setImageResource(getRandomDice())
    }

    private fun getRandomDice() = when ((1..6).random()) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        6 -> R.drawable.dice_6
        else -> R.drawable.dice_0
    }
}