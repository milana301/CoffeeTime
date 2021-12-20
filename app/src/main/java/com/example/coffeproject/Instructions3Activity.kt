package com.example.coffeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Instructions3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.instructions_3)

        val dalee3 = findViewById<Button>(R.id.dalee3)

        dalee3.setOnClickListener {
            startActivity(Intent(this,HomepageActivity::class.java))
        }
    }
}