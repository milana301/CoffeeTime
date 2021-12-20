package com.example.coffeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LatteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.latte)

        val blackcoffee = findViewById<Button>(R.id.blackcoffee)

        blackcoffee.setOnClickListener {
            startActivity(Intent(this,ExpressoActivity::class.java))
        }

        val cappuccino = findViewById<Button>(R.id.cappuccino)

        cappuccino.setOnClickListener {
            startActivity(Intent(this,CappuccinoActivity::class.java))
        }

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener {
            startActivity(Intent(this, CappuccinoActivity::class.java))
        }
    }
}