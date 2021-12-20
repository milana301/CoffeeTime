package com.example.coffeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Instructions2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.instructions_2)

        val dalee2 = findViewById<Button>(R.id.dalee2)

        dalee2.setOnClickListener {
            startActivity(Intent(this,Instructions3Activity::class.java))
        }
    }
}