package com.example.coffeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Instructions1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.instructions_1)

        val dalee1 = findViewById<Button>(R.id.dalee1)

       dalee1.setOnClickListener {
            startActivity(Intent(this,Instructions2Activity::class.java))
        }
    }
}