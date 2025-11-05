package com.example.acteva1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPresentacion = findViewById<Button>(R.id.btnPresentacion)
        btnPresentacion.setOnClickListener {
            val intent = Intent(this, PresentacionActivity::class.java)
            startActivity(intent)
        }
    }
}