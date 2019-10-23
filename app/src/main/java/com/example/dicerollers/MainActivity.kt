package com.example.dicerollers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice(); rollDice1(); rollDice2() }
    }

    private fun rollDice(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

    }
    private fun rollDice1(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text1)
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

    }
    private fun rollDice2(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text2)
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

    }

}