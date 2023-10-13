package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba7)
        //definicion de variables xml
        val regresar : ImageView = findViewById(R.id.imvRegresarDba7)
        val btnRespuestaDba7 : TextView = findViewById(R.id.btnRespuestasDba7)
        val btnParalelasDba7 : ImageView = findViewById(R.id.imvParalelasDba7)
        val btnRectaDba7 : ImageView = findViewById(R.id.imvRectaDba7)
        val btnCircularDba7 : ImageView = findViewById(R.id.imvCircularDba7)
        val txtRespuestaDba7 : TextView = findViewById(R.id.txtRespuestaDba7)
        var respuestaDba7 = 0

        //navegacion
        regresar.setOnClickListener()
        {
            regresar()
        }

        //operaciones

        btnParalelasDba7.setOnClickListener()
        {
            respuestaDba7=1
        }
        btnCircularDba7.setOnClickListener()
        {
            respuestaDba7=0
        }

        btnRectaDba7.setOnClickListener()
        {
            respuestaDba7=0
        }

        btnRespuestaDba7.setOnClickListener()
        {
            if(respuestaDba7==1)
            {
                txtRespuestaDba7.setText("Correcto")
                txtRespuestaDba7.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba7.setText("Incorrecto")
                txtRespuestaDba7.setTextColor(Color.RED)
            }
        }


    }

    private fun regresar()
    {
        val i = Intent(this,MainPensamientoMetrico::class.java)
        startActivity(i)
    }
}