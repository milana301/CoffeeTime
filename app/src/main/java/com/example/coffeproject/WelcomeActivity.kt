package com.example.coffeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        val welcome = findViewById<Button>(R.id.welcome)

        welcome.setOnClickListener {
            startActivity(Intent(this,Instructions1Activity::class.java))
        }
    }
}