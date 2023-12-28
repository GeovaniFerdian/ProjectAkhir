package com.example.projectgeovani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PrintPendaftaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_pendaftaran)

        val button: View = findViewById(R.id.backmenu)
        button.setOnClickListener {
            val intent: Intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
        }
    }
}