package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba5)
        //definicion variables xml
        val imvRegresar : ImageView = findViewById(R.id.imvRegresarDba5)
        val btnSapito :TextView = findViewById(R.id.btnBaileSapito)
        var txtResultadoDba5_1 : TextView = findViewById(R.id.txtRespuestaDba5_1)
        var txtResultadoDba5_2 : TextView = findViewById(R.id.txtRespuestaDba5_2)
        val btnRespuestaDba5_1 : TextView = findViewById(R.id.btnRespuestasDba5)
        var respuesta1=0
        var respuesta2=0
        val btnNoviembre : TextView = findViewById(R.id.btnNoviembreDba5)

        //navegación
        imvRegresar.setOnClickListener()
        {
            regresar()
        }
        btnNoviembre.setOnClickListener()
        {
            respuesta2=1
        }
        //operaciones
        btnSapito.setOnClickListener()
        {
            respuesta1=1
        }
        btnRespuestaDba5_1.setOnClickListener()
        {
            if(respuesta1==1)
            {
                txtResultadoDba5_1.setText("Correcto")
                txtResultadoDba5_1.setTextColor(Color.GREEN)
            }
            else
            {
                txtResultadoDba5_1.setText("Incorrecto")
                txtResultadoDba5_1.setTextColor(Color.RED)
            }
            if(respuesta2==1)
            {
                txtResultadoDba5_2.setText("Correcto")
                txtResultadoDba5_2.setTextColor(Color.GREEN)
            }
            else
            {
                txtResultadoDba5_2.setText("Incorrecto")
                txtResultadoDba5_2.setTextColor(Color.RED)
            }
        }
    }

    private fun regresar()
    {
        val i = Intent(this,MainPensamientoMetrico::class.java)
        startActivity(i)
    }
}