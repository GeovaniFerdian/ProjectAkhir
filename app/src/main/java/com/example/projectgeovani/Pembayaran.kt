package com.example.projectgeovani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Pembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        val button: View = findViewById(R.id.kirim)
        button.setOnClickListener {
            val intent: Intent = Intent(this, PrintPembayaran::class.java)
            startActivity(intent)
        }
    }
}