package com.example.projectgeovani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class InformasiClub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_club)

        val button4: ImageView = findViewById(R.id.button_back)
        button4.setOnClickListener {
            val intent: Intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
        }
    }
}