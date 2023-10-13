package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba2)
        //Declaración variables desde xml
        val imvRegresar: ImageView = findViewById(R.id.imvRegresarDba2)
        val totalRespuestaDba2_1 : TextView = findViewById(R.id.edtRespuestaDba2_1)
        val btnRespuestasDba2 : TextView =findViewById(R.id.btnRespuestasDba2)
        var repuestaDba2_1 : TextView = findViewById(R.id.txtxRespuestaDba2_1)
        var totalRespuestaDba2_2 : TextView = findViewById(R.id.edtRespuestaDba2_2)
        var repuestaDba2_2 : TextView = findViewById(R.id.txtRespuestaDba2_2)
        //botones de navegación
        imvRegresar.setOnClickListener(){
            regresar()
        }

        btnRespuestasDba2.setOnClickListener(){
            var totalRespuestaDba2_1var = totalRespuestaDba2_1.text.toString()
            var totalRespuestaDba2_2var = totalRespuestaDba2_2.text.toString()

            if (totalRespuestaDba2_1var=="4")
            {
                repuestaDba2_1.setText("Correcto")
                repuestaDba2_1.setTextColor(Color.GREEN)
            }
            else
            {
                repuestaDba2_1.setText("Incorrecto")
                repuestaDba2_1.setTextColor(Color.RED)
            }

            if (totalRespuestaDba2_2var=="5")
            {
                repuestaDba2_2.setText("Correcto")
                repuestaDba2_2.setTextColor(Color.GREEN)
            }
            else
            {
                repuestaDba2_2.setText("Incorrecto")
                repuestaDba2_2.setTextColor(Color.RED)
            }

        }
    }

    private fun regresar()
    {
        val i = Intent(this,MainPensamientoNumerico::class.java)
        startActivity(i)
    }
}