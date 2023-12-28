package com.example.projectgeovani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MenuUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)

        val button1: ImageView = findViewById(R.id._rectangle_informasiclub)
        button1.setOnClickListener {
            val intent: Intent = Intent(this, InformasiClub::class.java)
            startActivity(intent)
        }
        val button2: ImageView = findViewById(R.id._rectangle_petunjuk)
        button2.setOnClickListener {
            val intent: Intent = Intent(this, Petunjuk::class.java)
            startActivity(intent)
        }
        val button3: ImageView = findViewById(R.id._rectangle_pendaftaran)
        button3.setOnClickListener {
            val intent: Intent = Intent(this, Pembayaran::class.java)
            startActivity(intent)
        }
    }
}