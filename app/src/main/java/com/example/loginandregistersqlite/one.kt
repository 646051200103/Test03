package com.example.loginandregistersqlite

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginandregistersqlite.quiz.Companion.num
import kotlinx.android.synthetic.main.activity_one.*

class one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        fun showDefaultDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)

            alertDialog.apply {
                setTitle("แจ้งเตือน")
                setMessage("คุณตอบผิด")
                setPositiveButton("ไปข้อถัดไป") { _: DialogInterface?, _: Int ->
                    val intent = Intent(this@one, two::class.java)
                    startActivity(intent)
                }
            }.create().show()
        }

        b1.setOnClickListener {
//        textView2.setText(names2.toString())
            showDefaultDialog(this)
        }
        b2.setOnClickListener {
            showDefaultDialog(this)
        }
        b3.setOnClickListener {
            showDefaultDialog(this)
        }
        b4.setOnClickListener {
            quiz.num++
            val intent = Intent(this@one, two::class.java)
            startActivity(intent)
        }
    }
}