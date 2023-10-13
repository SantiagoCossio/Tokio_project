package com.example.tesis

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainPensamientoAleatorio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pensamiento_aleatorio)
        //definicion de variables xml
        val imvRegresar: ImageView = findViewById(R.id.imvRegresarPensamientoAleatorio)
        val btnDba10 : TextView = findViewById(R.id.btnDba10)
        val btnDba11 : TextView = findViewById(R.id.btnDba11)
        //navegacion
        imvRegresar.setOnClickListener(){
            regresar()
        }

        btnDba10.setOnClickListener()
        {
            dba10()
        }

        btnDba11.setOnClickListener()
        {
            dba11()
        }
    }

    private fun dba10()
    {
        val i = Intent(this,DBA10::class.java)
        startActivity(i)
    }

    private fun dba11()
    {
        val i = Intent(this,DBA11::class.java)
        startActivity(i)
    }

    private fun regresar()
    {
        val i = Intent(this,MainEstudiantes::class.java)
        startActivity(i)
    }
}