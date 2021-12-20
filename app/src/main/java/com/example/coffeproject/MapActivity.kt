package com.example.coffeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map)

        val Aldo = findViewById<ImageView>(R.id.Aldo)

        Aldo.setOnClickListener {
            startActivity(Intent(this,ExpressoActivity::class.java))
        }
    }
}