package com.example.projectgeovani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PrintPembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_pembayaran)

        val button: View = findViewById(R.id.daftar)
        button.setOnClickListener {
            val intent: Intent = Intent(this, Pendaftaran::class.java)
            startActivity(intent)
        }
    }
}