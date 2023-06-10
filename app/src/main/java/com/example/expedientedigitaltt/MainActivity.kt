package com.example.expedientedigitaltt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.buttonIniciarSesion)
        btn1.setOnClickListener {

            val intet: Intent = Intent(this, IniciarSesion:: class.java)
            startActivity(intet)
        }

        val btn2: Button = findViewById(R.id.buttonRegistrarse)
        btn2.setOnClickListener {

            val intet1: Intent = Intent(this, Registrarse:: class.java)
            startActivity(intet1)
        }
    }
}