package com.example.praktikum4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Latihan2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan2)

        val etUsername = findViewById<EditText>(R.id.etUsernameLatihan2)
        val etPassword = findViewById<EditText>(R.id.etPasswordLatihan2)
        val btnLogin = findViewById<Button>(R.id.btnLoginLatihan2)

        btnLogin.setOnClickListener {

            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username == "root" && password == "root") {

                Toast.makeText(
                    this,
                    "Login Berhasil",
                    Toast.LENGTH_SHORT
                ).show()

                val intent =
                    Intent(this, Latihan3::class.java)

                intent.putExtra(
                    "username",
                    username
                )

                startActivity(intent)
                finish()

            } else {

                Toast.makeText(
                    this,
                    "Username atau Password Salah",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }
}