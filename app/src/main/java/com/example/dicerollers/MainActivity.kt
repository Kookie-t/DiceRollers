package com.example.dicerollers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

   lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var  diceImage3 : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice(); /*rollDice1(); rollDice2()*/ }

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)

        /*val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { countUp() }*/
    }

    private fun rollDice() {
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()

        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        diceImage3.setImageResource(getRandomDiceImage())
    }


    private fun getRandomDiceImage() : Int {
        val randomInt = Random().nextInt(6) + 1

        return when (randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }

    }


    /*private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)


        if (resultText.text == "Hello World!")
        {
            resultText.text = "1"
        }
        else
        {

            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6)
            {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
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

    }*/

}