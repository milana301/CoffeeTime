package com.example.coffeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class CappuccinoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cappuccino)

        val blackcoffee = findViewById<Button>(R.id.blackcoffee)

        blackcoffee.setOnClickListener {
            startActivity(Intent(this,ExpressoActivity::class.java))
        }

        val latte = findViewById<Button>(R.id.latte)

        latte.setOnClickListener {
            startActivity(Intent(this,LatteActivity::class.java))
        }

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener {
            startActivity(Intent(this, ExpressoActivity::class.java))
        }
    }
}