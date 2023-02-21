package com.example.loginandregistersqlite

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_two.*

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        fun showDefaultDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)

            alertDialog.apply {
                setTitle("แจ้งเตือน")
                setMessage("คุณตอบผิด")
                setPositiveButton("ไปข้อถัดไป") { _: DialogInterface?, _: Int ->
                    val intent = Intent(this@two, result::class.java)
                    startActivity(intent)
                }
            }.create().show()
        }

        b1.setOnClickListener {
            showDefaultDialog(this)
        }
        b2.setOnClickListener {
            showDefaultDialog(this)
        }
        b3.setOnClickListener {
            quiz.num++
            val intent = Intent(this@two, result::class.java)
            startActivity(intent)
        }
        b4.setOnClickListener {
            showDefaultDialog(this)
        }
    }
}