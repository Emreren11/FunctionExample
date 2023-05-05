package com.emre.functions

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    //lateinit -> tanımlamayı sonra yapılacağında kullanılır
    lateinit var number1 : EditText
    lateinit var number2 : EditText
    lateinit var myTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myTextView = findViewById(R.id.text)
        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
    }


    fun sumNumbers(a: Int, b: Int) : Int {

        return a + b
    }

    fun sum(view : View) {
        var no1 = (number1.text.toString()).toInt()
        var no2 = (number2.text.toString()).toInt()
        myTextView.text = "Result: ${sumNumbers(no1, no2)}"
    }

}