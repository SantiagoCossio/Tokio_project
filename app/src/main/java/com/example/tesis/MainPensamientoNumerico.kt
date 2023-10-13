package com.example.tesis

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainPensamientoNumerico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pensamiento_numerico)
        val imvRegresar: ImageView = findViewById(R.id.imvRegresarPensamientoNumerico)
        val DBA1 : TextView = findViewById(R.id.btnDba1)
        val DBA2 : TextView = findViewById(R.id.btnDba2)
        val DBA3 : TextView = findViewById(R.id.btnDba3)
        val DBA8 : TextView = findViewById(R.id.btnDba8)
        val DBA9 : TextView = findViewById(R.id.btnDba9)

        //botones para ingresar a los modulos DBA
        imvRegresar.setOnClickListener(){
            regresar()
        }

        DBA1.setOnClickListener(){
            DBA1()
        }

        DBA2.setOnClickListener(){
            DBA2()
        }

        DBA3.setOnClickListener(){
            DBA3()
        }

        DBA8.setOnClickListener(){
            DBA8()
        }

        DBA9.setOnClickListener(){
            DBA9()
        }
    }

    private fun regresar()
    {
        val i = Intent(this,MainEstudiantes::class.java)
        startActivity(i)
    }

    private fun DBA1()
    {
        val i = Intent(this,DBA1::class.java)
        startActivity(i)
    }

    private fun DBA2()
    {
        val i = Intent(this,DBA2::class.java)
        startActivity(i)
    }

    private fun DBA3()
    {
        val i = Intent(this,DBA3::class.java)
        startActivity(i)
    }

    private fun DBA8()
    {
        val i = Intent(this,DBA8::class.java)
        startActivity(i)
    }

    private fun DBA9()
    {
        val i = Intent(this,DBA9::class.java)
        startActivity(i)
    }
}