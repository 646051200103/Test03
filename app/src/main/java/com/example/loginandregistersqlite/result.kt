package com.example.loginandregistersqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var ans = quiz.num
        textView3.setText("คุณได้คะแนนทั้งหมด $ans คะแนน")
    }
}