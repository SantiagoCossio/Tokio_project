package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba4)
        val imvRegresar: ImageView = findViewById(R.id.imvRegresarDba4)
        //Definicion de variables xml
        val txtRespuestaDba4_1 : TextView = findViewById(R.id.txtRespuestaDba4_1)
        val btnIgualLargosDba4 : TextView = findViewById(R.id.btnIgualLargosDba4_1)
        var respuesta1= 0
        val btnRespuestaDba4_1 : TextView = findViewById(R.id.btnRespuestasDba4)
        val txtRespuestaDba4_2 : TextView = findViewById(R.id.txtRespuestaDba4_2)
        val edtRespuestaDba4_2 : TextView = findViewById(R.id.edtRespuestaDba4_2)
        //operaciones

        btnIgualLargosDba4.setOnClickListener()
        {
            respuesta1=1
        }

        btnRespuestaDba4_1.setOnClickListener()
        {
            val edtRespuestaDba4_2=edtRespuestaDba4_2.text.toString()
            if(respuesta1==1)
            {
                txtRespuestaDba4_1.setText("Correcto")
                txtRespuestaDba4_1.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba4_1.setText("Incorrecto")
                txtRespuestaDba4_1.setTextColor(Color.RED)
            }
            if(edtRespuestaDba4_2=="4")
            {
                txtRespuestaDba4_2.setText("Correcto")
                txtRespuestaDba4_2.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba4_2.setText("Incorrecto")
                txtRespuestaDba4_2.setTextColor(Color.RED)
            }
        }
        //botones de navegacion
        imvRegresar.setOnClickListener()
        {
            regresar()
        }
    }

    //funciones
    private fun regresar()
    {
        val i = Intent(this,MainPensamientoMetrico::class.java)
        startActivity(i)
    }
}