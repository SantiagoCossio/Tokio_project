package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba10)
        //definicion de variables xml
        val regresar :  ImageView =findViewById(R.id.imvRegresarDba10)
        val btnRespuestaDba10  : TextView = findViewById(R.id.btnRespuestasDba10)
        val btnMedellinDba10 : TextView = findViewById(R.id.btnMedellinDba10)
        val btnAmericaDba10 : TextView = findViewById(R.id.btnAmericaDba10)
        val btnNacionalDba10 : TextView = findViewById(R.id.btnNacionalDba10)
        val txtRespuestaDba10 : TextView = findViewById(R.id.txtRespuestaDba10)
        var respuestaDba10=0

        //navegacion
        regresar.setOnClickListener()
        {
            regresar()
        }

        //operaciones
        btnAmericaDba10.setOnClickListener()
        {
            respuestaDba10=0
        }

        btnMedellinDba10.setOnClickListener()
        {
            respuestaDba10=1
        }

        btnNacionalDba10.setOnClickListener()
        {
            respuestaDba10=0
        }

        btnRespuestaDba10.setOnClickListener()
        {
            if(respuestaDba10==1)
            {
                txtRespuestaDba10.setText("Correcto")
                txtRespuestaDba10.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba10.setText("Incorrecto")
                txtRespuestaDba10.setTextColor(Color.RED)
            }
        }

    }

    private fun regresar()
    {
        val i = Intent(this,MainPensamientoAleatorio::class.java)
        startActivity(i)
    }
}