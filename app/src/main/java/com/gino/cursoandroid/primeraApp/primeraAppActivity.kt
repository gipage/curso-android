package com.gino.cursoandroid.primeraApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gino.cursoandroid.R
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText


class primeraAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primera_app)
        //Al arrancar la pantalla
        val buton = findViewById<AppCompatButton>(R.id.boton)
        val edText = findViewById<AppCompatEditText>(R.id.editText)
        buton.setOnClickListener {
            val nombre=edText.text.toString()
            if(nombre.isNotEmpty()){
                val intent = Intent(this,ResultadoActivity::class.java)
                intent.putExtra("nombreExtra",nombre)
                startActivity(intent)

            }
        }


    }
}