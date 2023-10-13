package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba3)
        //definicion de variables XML
        val imvRegresar: ImageView = findViewById(R.id.imvRegresarDba3)
        val ordenAscendenteDba3_1 : TextView = findViewById(R.id.btnordenAscendeteDba3_1_incorrecto)
        val ordenAscendenteDba3_2 : TextView = findViewById(R.id.btnordenAscendeteDba3_2_Correcto)
        val ordenAscendenteDba3_3 : TextView = findViewById(R.id.btnordenAscendeteDba3_3_incorrecto)
        var repuestaDba3_1 : TextView = findViewById(R.id.txtRespuestaDba3_1)
        var Respuesta ="3"
        val btnRespuestaDba3_1 : TextView = findViewById(R.id.btnRespuestasDba3)
        //botones de navegación
        imvRegresar.setOnClickListener(){
            regresar()
        }

        //guardado de la respuesta correcta
        ordenAscendenteDba3_1.setOnClickListener(){
            Respuesta="0"
        }

        ordenAscendenteDba3_2.setOnClickListener(){
            Respuesta="1"
        }

        ordenAscendenteDba3_3.setOnClickListener(){
            Respuesta="0"
        }

        //verificación respuesta correcta
        btnRespuestaDba3_1.setOnClickListener(){
            if (Respuesta=="1")
            {
                repuestaDba3_1.setText("Correcto")
                repuestaDba3_1.setTextColor(Color.GREEN)
            }
            else if (Respuesta=="0")
            {
                repuestaDba3_1.setText("Incorrecto")
                repuestaDba3_1.setTextColor(Color.RED)
            }
            else
            {
                repuestaDba3_1.setText("Ingrese su respuesta")
                repuestaDba3_1.setTextColor(Color.RED)
            }
        }
    }

    private fun regresar()
    {
        val i = Intent(this,MainPensamientoNumerico::class.java)
        startActivity(i)
    }
}