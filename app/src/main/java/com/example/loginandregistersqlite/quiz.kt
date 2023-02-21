package com.example.loginandregistersqlite

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quiz.*

class quiz : AppCompatActivity() {

    companion object {
        var num = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        fun showDefaultDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)

            alertDialog.apply {
                setTitle("แจ้งเตือน")
                setMessage("คุณตอบผิด")
                setPositiveButton("ไปข้อถัดไป") { _: DialogInterface?, _: Int ->
                    val intent = Intent(this@quiz, one::class.java)
                    startActivity(intent)
                }
            }.create().show()
        }

        b1.setOnClickListener {
            showDefaultDialog(this)
        }
        b2.setOnClickListener {
            num++
            val intent = Intent(this@quiz, one::class.java)
            startActivity(intent)
        }
        b3.setOnClickListener {
            showDefaultDialog(this)
        }
        b4.setOnClickListener {
            showDefaultDialog(this)
        }
    }
}