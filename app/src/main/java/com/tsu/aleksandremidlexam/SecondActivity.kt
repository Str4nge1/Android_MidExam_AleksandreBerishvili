package com.tsu.aleksandremidlexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var txtName:TextView
    lateinit var btnback:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        txtName=findViewById(R.id.personname)
        btnback=findViewById(R.id.move_back)

        val name = this.getSharedPreferences("preff",MODE_PRIVATE).getString("name", "")
        txtName.text = "Hello $name!"
            btnback.setOnClickListener{
                val i = Intent(applicationContext, MainActivity::class.java)
                startActivity(i)
            }
    }
}