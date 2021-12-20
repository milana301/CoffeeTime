package com.example.coffeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ExpressoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expresso)

        val cappuccino = findViewById<Button>(R.id.cappuccino)

        cappuccino.setOnClickListener {
            startActivity(Intent(this,CappuccinoActivity::class.java))
        }

        val latte = findViewById<Button>(R.id.latte)

        latte.setOnClickListener {
            startActivity(Intent(this,LatteActivity::class.java))
        }

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener {
            startActivity(Intent(this, HomepageActivity::class.java))
        }
    }
}