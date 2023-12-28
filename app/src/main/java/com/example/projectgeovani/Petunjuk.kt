package com.example.projectgeovani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Petunjuk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_petunjuk)

        val button5: ImageView = findViewById(R.id.button_back1)
        button5.setOnClickListener {
            val intent: Intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
        }
    }
}
    
