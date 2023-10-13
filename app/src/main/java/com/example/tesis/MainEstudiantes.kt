package com.example.tesis

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainEstudiantes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_estudiantes)
        val btnPensamientoNumerico : TextView = findViewById(R.id.btnPensamientoNumerico)
        val btnPensamientoMetrico : TextView = findViewById(R.id.btnPensamientoMetrico)
        val btnPensamientoAleatorio : TextView = findViewById(R.id.btnPensamientoAleatorio)
        val imvRegresar: ImageView = findViewById(R.id.imvRegresar)

        //Botones que envian a los menus de los modulos
        btnPensamientoNumerico.setOnClickListener(){
            pensamientoNumerico()
        }

        btnPensamientoMetrico.setOnClickListener(){
            pensamientoMetrico()
        }

        btnPensamientoAleatorio.setOnClickListener(){
            pensamientoAleatorio()
        }

        imvRegresar.setOnClickListener(){
            regresar()
        }


    }

    private fun pensamientoNumerico()
    {
        Toast.makeText(baseContext,"Aprendamos de numeros", Toast.LENGTH_SHORT).show()
        val i = Intent(this,MainPensamientoNumerico::class.java)
        startActivity(i)
    }

    private fun pensamientoMetrico()
    {
        Toast.makeText(baseContext,"Aprendamos de metricas", Toast.LENGTH_SHORT).show()
        val i = Intent(this,MainPensamientoMetrico::class.java)
        startActivity(i)
    }

    private fun pensamientoAleatorio()
    {
        Toast.makeText(baseContext,"Aprendamos de aleatoriedad", Toast.LENGTH_SHORT).show()
        val i = Intent(this,MainPensamientoAleatorio::class.java)
        startActivity(i)
    }

    private fun regresar()
    {
        val i = Intent(this,MainActivity2::class.java)
        startActivity(i)
    }
}