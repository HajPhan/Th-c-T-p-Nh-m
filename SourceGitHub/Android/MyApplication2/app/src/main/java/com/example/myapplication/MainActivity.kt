package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcSum(): Int {
        val value1 = edt_num1.text.toString()
        val value2 = edt_num2.text.toString()

        val num1 = Integer.parseInt(value1)
        val num2 = Integer.parseInt(value2)
        return num1 + num2
    }

    fun calcSub(): Int {
        val value1 = edt_num1.text.toString()
        val value2 = edt_num2.text.toString()

        val num1 = Integer.parseInt(value1)
        val num2 = Integer.parseInt(value2)
        return num1 - num2
    }

    fun calcMul(): Int {
        val value1 = edt_num1.text.toString()
        val value2 = edt_num2.text.toString()

        val num1 = Integer.parseInt(value1)
        val num2 = Integer.parseInt(value2)
        return num1 * num1
    }

    fun calcDiv(): Double {
        val value1 = edt_num1.text.toString()
        val value2 = edt_num2.text.toString()

        val num1 = Integer.parseInt(value1)
        val num2 = Integer.parseInt(value2)
        return java.lang.Double.valueOf((num1 / num2).toDouble())
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btn_sum ->
                //do something here
                Toast.makeText(applicationContext, calcSum().toString(), Toast.LENGTH_SHORT).show()
            R.id.btn_sub ->
                //do something here
                Toast.makeText(applicationContext, calcSub().toString(), Toast.LENGTH_SHORT).show()
            R.id.btn_mul ->
                //do something here
                Toast.makeText(applicationContext, calcMul().toString(), Toast.LENGTH_SHORT).show()
            R.id.btn_div ->
                //do something here
                Toast.makeText(applicationContext, calcDiv().toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
