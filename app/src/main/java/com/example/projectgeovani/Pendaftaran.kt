package com.example.projectgeovani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Pendaftaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pendaftaran)
        val button: View = findViewById(R.id.senddaftar)
        button.setOnClickListener {
            val intent: Intent = Intent(this, PrintPendaftaran::class.java)
            startActivity(intent)
        }
    }
}