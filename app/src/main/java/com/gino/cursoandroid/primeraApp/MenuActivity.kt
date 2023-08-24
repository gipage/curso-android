package com.gino.cursoandroid.primeraApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.gino.cursoandroid.R
import com.gino.cursoandroid.indicemasacorp.IMCorpActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val botonSaludapp = findViewById<AppCompatButton>(R.id.botonSaludapp)
        val botonIMCapp = findViewById<AppCompatButton>(R.id.botonIMCapp)

        botonSaludapp.setOnClickListener{gotoApp("Saludapp")}
        botonIMCapp.setOnClickListener{gotoApp("IMCapp")}

    }

    private fun gotoApp(app: String){
        var intent:Intent
        if(app.equals("Saludapp")){
           intent= Intent(this,primeraAppActivity::class.java)
            startActivity(intent)
        }
        if(app.equals("IMCapp")){
            intent= Intent(this,IMCorpActivity::class.java)
            startActivity(intent)
        }


    }
}