package com.example.assaludo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val tvGreeting:TextView = findViewById(R.id.tvGreeting)
        val name:String =
            intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvGreeting.text = "Hola $name"
    }
}