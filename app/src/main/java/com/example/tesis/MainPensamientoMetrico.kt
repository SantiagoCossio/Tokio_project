package com.example.tesis

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainPensamientoMetrico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pensamiento_metrico)
        val imvRegresar: ImageView = findViewById(R.id.imvRegresarPensamientoMetrico)
        val btnDba4 : TextView = findViewById(R.id.btnDba4)
        val btnDba5 : TextView = findViewById(R.id.btnDba5)
        val btnDba6 : TextView = findViewById(R.id.btnDba6)
        val btnDba7 : TextView = findViewById(R.id.btnDba7)
        //botones de navegación
        imvRegresar.setOnClickListener(){
            regresar()
        }

        btnDba4.setOnClickListener()
        {
            dba4()
        }

        btnDba5.setOnClickListener()
        {
            dba5()
        }

        btnDba6.setOnClickListener()
        {
            dba6()
        }

        btnDba7.setOnClickListener()
        {
            dba7()
        }
    }
    private fun regresar()
    {
        val i = Intent(this,MainEstudiantes::class.java)
        startActivity(i)
    }

    private fun dba4()
    {
        val i = Intent(this,DBA4::class.java)
        startActivity(i)
    }

    private fun dba5()
    {
        val i = Intent(this,DBA5::class.java)
        startActivity(i)
    }

    private fun dba6()
    {
        val i = Intent(this,DBA6::class.java)
        startActivity(i)
    }

    private fun dba7()
    {
        val i = Intent(this,DBA7::class.java)
        startActivity(i)
    }
}