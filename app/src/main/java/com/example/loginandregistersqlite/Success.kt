package com.example.loginandregistersqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_success.*

class Success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        button3.setOnClickListener {
            val intent = Intent(this, quiz::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this, CalculatorV2::class.java)
            startActivity(intent)
        }
    }
}