package com.example.projectgeovani
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Response.ErrorListener
import com.android.volley.Response.Listener
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley


class SignUp : AppCompatActivity() {
    private lateinit var rectangle_1: EditText
    private lateinit var kotakemail : EditText
    private lateinit var rectangle_2: EditText
    private lateinit var kotakrepas: EditText
    private lateinit var _bg___frame_1_ek1 : View
    private var urlRegist : String ="https://nazara-nano.my.id/dbgeo/regist.php"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val myButton2: View = findViewById(R.id._bg___frame_1_ek1)
        myButton2.setOnClickListener {
            val intent: Intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        rectangle_1 = findViewById(R.id.rectangle_1)
        kotakemail = findViewById(R.id.kotakemail)
        rectangle_2 = findViewById(R.id.rectangle_2)
        kotakrepas = findViewById(R.id.kotakrepas)
        _bg___frame_1_ek1 = findViewById(R.id._bg___frame_1_ek1)

        _bg___frame_1_ek1.setOnClickListener(View.OnClickListener {
            val username: String = rectangle_1.text.toString()
            val email: String = kotakemail.text.toString()
            val password: String = rectangle_2.text.toString()
            val confirmPassword: String = kotakrepas.text.toString()

            if (!(username.isEmpty() || password.isEmpty() || email.isEmpty())) {
                if (password == confirmPassword) {
                    val stringRequest: StringRequest = object : StringRequest(
                        Method.POST,
                        urlRegist,
                        object : Listener<String?> {
                            override fun onResponse(response: String?) {
                                Toast.makeText(applicationContext, response, Toast.LENGTH_SHORT).show()
                                startActivity(Intent(applicationContext, SignUp::class.java))
                            }
                        },
                        object : ErrorListener {
                            override fun onErrorResponse(error: VolleyError) {
                                Toast.makeText(applicationContext, error.toString(), Toast.LENGTH_SHORT)
                                    .show()
                            }
                        }) {
                        @Throws(AuthFailureError::class)
                        override fun getParams(): HashMap<String, String>? {
                            val params = HashMap<String, String>()
                            params["post_username"] = username
                            params["post_email"] = email
                            params["post_password"] = password
                            return params
                        }
                    }
                    val requestQueue = Volley.newRequestQueue(
                        applicationContext
                    )
                    requestQueue.add(stringRequest)
                } else {
                    Toast.makeText(applicationContext, "Password dan Confirm Password tidak sama", Toast.LENGTH_SHORT).show()}
            } else {
                Toast.makeText(applicationContext, "Ada Data Yang Masih Kosong", Toast.LENGTH_SHORT)
                    .show()
            }
        })

        rectangle_1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().isNotEmpty()) {
                    // Jika ada teks, ubah warna teks menjadi merah
                    rectangle_1.setTextColor(Color.BLACK)
                } else {
                    // Jika tidak ada teks, kembalikan warna teks ke warna asli
                    rectangle_1.setTextColor(Color.WHITE)
                }
            }
        })
        kotakemail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().isNotEmpty()) {
                    // Jika ada teks, ubah warna teks menjadi merah
                    kotakemail.setTextColor(Color.BLACK)
                } else {
                    // Jika tidak ada teks, kembalikan warna teks ke warna asli
                    kotakemail.setTextColor(Color.WHITE)
                }
            }
        })
        rectangle_2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().isNotEmpty()) {
                    // Jika ada teks, ubah warna teks menjadi merah
                    rectangle_2.setTextColor(Color.BLACK)
                } else {
                    // Jika tidak ada teks, kembalikan warna teks ke warna asli
                    rectangle_2.setTextColor(Color.WHITE)
                }
            }
        })

        val button: TextView = findViewById(R.id.inisignup)
        button.setOnClickListener {
            val intent: Intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}
