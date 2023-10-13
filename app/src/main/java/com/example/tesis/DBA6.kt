package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba6)
        //definicion de variables xml
        val imvRegresarDba6: ImageView = findViewById(R.id.imvRegresarDba6)
        val btnCuboDba6: ImageView = findViewById(R.id.imvCuboDba6)
        val btnCuadradoDba6 : ImageView = findViewById(R.id.imvCuadradoDBA6)
        val btnRectanguloDba6 : ImageView = findViewById(R.id.imvRectanguloDba6)
        val btnRespuestaDba6: TextView = findViewById(R.id.btnRespuestasDba6)
        val txtRespuestaDba6: TextView = findViewById(R .id.txtRespuestaDba6)
        var respuestaDba6=0

        //navegacion

        imvRegresarDba6.setOnClickListener(){
            regresar()
        }

        //operaciones

        btnCuboDba6.setOnClickListener(){
            respuestaDba6=1
        }

        btnRectanguloDba6.setOnClickListener(){
            respuestaDba6=0
        }

        btnCuadradoDba6.setOnClickListener(){
            respuestaDba6=0
        }

        btnRespuestaDba6.setOnClickListener(){
            if(respuestaDba6==1)
            {
                txtRespuestaDba6.setText("Correcto")
                txtRespuestaDba6.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba6.setText("Incorrecto")
                txtRespuestaDba6.setTextColor(Color.RED)
            }
        }
    }

    private fun regresar()
    {
        val i = Intent(this,MainPensamientoMetrico::class.java)
        startActivity(i)
    }
}