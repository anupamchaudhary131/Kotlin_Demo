package com.example.kotlin_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val no1 = edtNo1.text.toString().toInt()
        val no2 = edtNo1.text.toString().toInt()

        val output = no1 + no2

        txtOutput.text = "The Sum is : $output"

    }
}