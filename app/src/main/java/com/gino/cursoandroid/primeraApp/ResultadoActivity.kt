package com.gino.cursoandroid.primeraApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.gino.cursoandroid.R

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val TVresultado = findViewById<TextView>(R.id.TVresultado)
        val nombre:String = intent.extras?.getString("nombreExtra").orEmpty()
        TVresultado.text = "¡Hola $nombre!"

    }
}