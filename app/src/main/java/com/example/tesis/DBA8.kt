package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba8)
        val imvRegresar: ImageView = findViewById(R.id.imvRegresarDba8)
        //definición variable xml
        val edtRespuestaDba8_1 :TextView = findViewById(R.id.edtRespuestaDba8_1)
        val edtRespuestaDba8_2 : TextView = findViewById(R.id.edtRespuestaDba8_2)
        val edtRespuestaDba8_3 : TextView = findViewById(R.id.edtRespuestaDba8_3)
        val btnRespuestaDba8_1 : TextView = findViewById(R.id.btnRespuestasDba8)
        var txtRespuestaDba8_1 :TextView = findViewById(R.id.txtRespuestaDba8_1)
        var txtRespuestaDba8_2 :TextView = findViewById(R.id.txtRespuestaDba8_2)
        var txtRespuestaDba8_3 :TextView = findViewById(R.id.txtRespuestaDba8_3)

        //botones de navegación
        imvRegresar.setOnClickListener(){
            regresar()
        }
        //verificación de resultados
        btnRespuestaDba8_1.setOnClickListener(){
            var respuesta1 = edtRespuestaDba8_1.text.toString()
            var respuesta2 = edtRespuestaDba8_2.text.toString()
            var respuesta3 = edtRespuestaDba8_3.text.toString()
            if (respuesta1=="12")
            {
                txtRespuestaDba8_1.setText("Correcto")
                txtRespuestaDba8_1.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba8_1.setText("Incorrecto")
                txtRespuestaDba8_1.setTextColor(Color.RED)
            }

            if (respuesta2=="60")
            {
                txtRespuestaDba8_2.setText("Correcto")
                txtRespuestaDba8_2.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba8_2.setText("Incorrecto")
                txtRespuestaDba8_2.setTextColor(Color.RED)
            }

            if (respuesta3=="2")
            {
                txtRespuestaDba8_3.setText("Correcto")
                txtRespuestaDba8_3.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba8_3.setText("Incorrecto")
                txtRespuestaDba8_3.setTextColor(Color.RED)
            }
        }
    }

    private fun regresar()
    {
        val i = Intent(this,MainPensamientoNumerico::class.java)
        startActivity(i)
    }
}