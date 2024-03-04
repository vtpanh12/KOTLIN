package com.example.testcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.testcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var lastNumberic: Boolean = false
    var lastDot: Boolean = false
    private var tvInput: TextView?= null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        var btnOne = findViewById<Button>(R.id.btnOne)
//        var btnTwo = findViewById<Button>(R.id.btnTwo)
//        var btnThree = findViewById<Button>(R.id.btnThree)
//        var btnFour = findViewById<Button>(R.id.btnFour)
//        var btnFive = findViewById<Button>(R.id.btnFive)
//        var btnSix = findViewById<Button>(R.id.btnSix)
//        var btnSeven = findViewById<Button>(R.id.btnSeven)
//        var btnEight = findViewById<Button>(R.id.btnEight)
//        var btnNine = findViewById<Button>(R.id.btnNine)
//        var btnZero= findViewById<Button>(R.id.btnZero)
//        var btnEqual = findViewById<Button>(R.id.btnEqual)
//        var btnAdd = findViewById<Button>(R.id.btnAdd)
//        var btnSubtract = findViewById<Button>(R.id.btnSubtract)
//        var btnDecimal = findViewById<Button>(R.id.btnDecimal)
//        var btnDivide = findViewById<Button>(R.id.btnDivide)
//        var btnClear = findViewById<Button>(R.id.btnClear)
//        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var tv = findViewById<TextView>(R.id.tvInput)
//        btnOne.setOnClickListener {
//            val btn = btnOne.text.toString()
//
//
//            tv.text = btn
//            Log.d("test", "sos")
//        }


    }
        fun onDigit(view: View) {
            if (view is Button) {
                tvInput?.append(view.text)
            }
        }

        fun onOperator(view: View) {}
        fun onDecimalPoint(view: View) {}
        fun onClear(view: View) {}
        fun onEqual(view: View) {}

}