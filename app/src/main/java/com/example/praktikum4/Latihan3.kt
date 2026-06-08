package com.example.praktikum4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Latihan3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan3)

        val btnBeranda =
            findViewById<Button>(R.id.btnBerandaLatihan3)

        val btnTentang =
            findViewById<Button>(R.id.btnTentangLatihan3)

        tampilBeranda()

        btnBeranda.setOnClickListener {
            tampilBeranda()
        }

        btnTentang.setOnClickListener {
            tampilTentang()
        }
    }

    private fun tampilBeranda() {

        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.fragmentContainerLatihan3,
                BerandaFragment()
            )
            .commit()
    }

    private fun tampilTentang() {

        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.fragmentContainerLatihan3,
                TentangFragment()
            )
            .commit()
    }

    fun bukaLatihan4() {

        val intent =
            Intent(this, Latihan4::class.java)

        startActivity(intent)
    }
}