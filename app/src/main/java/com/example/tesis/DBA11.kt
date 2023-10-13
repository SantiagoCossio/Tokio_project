package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba11)
        //definicion de variables xml
        val regresar : ImageView = findViewById(R.id.imvRegresarDba11)
        val btnRespuestasDba11 : TextView = findViewById(R.id.btnRespuestasDba11)
        val txtRespuestaDba11 : TextView = findViewById(R.id.txtRespuestaDba11)
        val btnAmericaDba11 : TextView = findViewById(R.id.btnAmericaDba11)
        val btnMedellinDba11 : TextView = findViewById(R.id.btnMedellinDba11)
        val btnNacionalDba11 : TextView = findViewById(R.id.btnNacionalDba11)
        var respuestaDba11=0

        //navegacion
        regresar.setOnClickListener()
        {
            regresar()
        }

        //operaciones

        btnNacionalDba11.setOnClickListener()
        {
            respuestaDba11=0
        }

        btnAmericaDba11.setOnClickListener()
        {
            respuestaDba11=0
        }

        btnMedellinDba11.setOnClickListener()
        {
            respuestaDba11=1
        }

        btnRespuestasDba11.setOnClickListener()
        {
            if(respuestaDba11==1)
            {
                txtRespuestaDba11.setText("Correcto")
                txtRespuestaDba11.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba11.setText("Incorrecto")
                txtRespuestaDba11.setTextColor(Color.RED)
            }

        }

    }

    private fun regresar()
    {
        val i = Intent(this,MainPensamientoAleatorio::class.java)
        startActivity(i)
    }
}