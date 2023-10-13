package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba1)
        //definiendo variables xml
        val imvRegresar: ImageView = findViewById(R.id.imvRegresarDba1)
        val pesoMascotas :TextView = findViewById(R.id.edtPesoCerdito)
        val btnRespuestasDba1 :TextView =findViewById(R.id.btnRespuestasDba1)
        var repuestaDba1_1 : TextView = findViewById(R.id.txtRespuestaDba1_1)
        var totalPagarDba1_2 : TextView = findViewById(R.id.edtRespuestaDba1_2)
        var repuestaDba1_2 :TextView = findViewById(R.id.txtRespuestaDba1_2)
        //Botones navegación app
        imvRegresar.setOnClickListener(){
            regresar()
        }
        //Operaciones logicas
        btnRespuestasDba1.setOnClickListener(){
            var pesoCerdito = pesoMascotas.text.toString()
            var pagoMascotas = totalPagarDba1_2.text.toString()

            if (pesoCerdito=="8")
            {
                repuestaDba1_1.setText("Correcto")
                repuestaDba1_1.setTextColor(Color.GREEN)
            }
            else
            {
                repuestaDba1_1.setText("Incorrecto")
                repuestaDba1_1.setTextColor(Color.RED)
            }

            if (pagoMascotas=="8")
            {
                repuestaDba1_2.setText("Correcto")
                repuestaDba1_2.setTextColor(Color.GREEN)
            }
            else
            {
                repuestaDba1_2.setText("Incorrecto")
                repuestaDba1_2.setTextColor(Color.RED)
            }

        }

    }

    private fun regresar()
    {
        val i = Intent(this,MainPensamientoNumerico::class.java)
        startActivity(i)
    }


}