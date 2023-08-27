package com.gino.cursoandroid.indicemasacorp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.gino.cursoandroid.R

class IMCorpActivity : AppCompatActivity() {
    private var seleccionadoH: Boolean = true
    private var seleccionadoM: Boolean = false

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcorp)
        initComponets()
        initListeners()
        cambiarColorGenero()
    }

    private fun initComponets() {
        viewMale = findViewById(R.id.viewHombre)
        viewFemale = findViewById(R.id.viewMujer)
    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            cambiarColorGenero()
            seleccionadoH = !seleccionadoH
        }
        viewFemale.setOnClickListener {
            cambiarColorGenero()
            seleccionadoM = !seleccionadoM
        }
    }

    private fun cambiarColorGenero() {
        viewMale.setCardBackgroundColor(getColor(seleccionadoH))
        viewFemale.setCardBackgroundColor(getColor(seleccionadoM))

    }

    private fun getColor(seleccionado: Boolean): Int {
        val colorReference = if (seleccionado) {
            R.color.background_component_selected
        } else {
            R.color.background_component

        }
        return ContextCompat.getColor(this, colorReference)

    }
}