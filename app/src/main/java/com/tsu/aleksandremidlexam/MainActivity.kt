package com.tsu.aleksandremidlexam

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    lateinit var edtname:EditText
    lateinit var savebtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtname=findViewById(R.id.edit_text_username)
        savebtn=findViewById(R.id.savebtn)
        btnNext=findViewById(R.id.move_next_btn)

        savebtn.setOnClickListener{
            val i = Intent(applicationContext, SecondActivity::class.java)
            var personname=edtname.text.toString()
                val sharedPref = this.getSharedPreferences("preff", Context.MODE_PRIVATE)
                val editor = sharedPref.edit()

                editor.putString("name", personname).apply()
                startActivity(i)

        }
        btnNext.setOnClickListener{
            val i = Intent(applicationContext, SecondActivity::class.java)
            startActivity(i)
        }

    }
}