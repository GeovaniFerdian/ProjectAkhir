package com.example.projectgeovani

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject


class Login : AppCompatActivity() {
    private lateinit var kolomusername: EditText
    private lateinit var pw : EditText
    private lateinit var btnlogin: View

    private var urlLogin : String ="https://nazara-nano.my.id/dbgeo/login.php"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        kolomusername = findViewById(R.id.kolomusername)
        pw = findViewById(R.id.pw)
        btnlogin = findViewById(R.id.btnlogin)

        val btlogin: View = findViewById(R.id.btnlogin)
        btlogin.setOnClickListener {
            val intent: Intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
            Toast.makeText(
                applicationContext,
                "Selamat datang",
                Toast.LENGTH_SHORT
            ).show()
        }

        val button: TextView = findViewById(R.id.inilogin)
        button.setOnClickListener {
            val intent: Intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

    }
}



