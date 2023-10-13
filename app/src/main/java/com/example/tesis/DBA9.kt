package com.example.tesis

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DBA9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dba9)
        val imvRegresar: ImageView = findViewById(R.id.imvRegresarDba9)
        //Definiciones variables xml
        var txtAlcancia1: TextView = findViewById(R.id.txtAlcancia1)
        var txtAlcancia2:TextView = findViewById(R.id.txtAlcancia2)
        val btnAlcancia1 : TextView = findViewById(R.id.btnAlcancia1)
        val btnAlcancia2 : TextView = findViewById(R.id.btnAlcancia2)
        val btnRespuestaDba9_1 : TextView = findViewById(R.id.btnRespuestasDba9_1)
        var txtRespuestaDba9_1 : TextView = findViewById(R.id.txtRespuestaDba9_1)
        var txtRespuestaDba9_2 : TextView = findViewById(R.id.txtRespuestaDba9_2)
        val imvaumentarDba9_1 : ImageView = findViewById(R .id.imvAumentarDba9_1)
        val imvaumentarDba9_2 : ImageView = findViewById(R.id.imvAumentarDba9_2)
        val imvaumentarDba9_3 : ImageView = findViewById(R.id.imvAumentarDba9_3)
        val imvRestarDba9_1 : ImageView = findViewById(R.id.imvRestarDba9_1)
        val imvRestarDba9_2 : ImageView = findViewById(R.id.imvRestarDba9_2)
        val imvRestarDba9_3 : ImageView = findViewById(R.id.imvRestarDba9_3)
        var txtCaramelosDba9_2_1 : TextView = findViewById(R.id.txtCaramelosDba9_2)
        var txtCaramelosDba9_2_2 : TextView = findViewById(R.id.txtCaramelosDba9_2_2)
        var txtCaramelosDba9_2_3 : TextView = findViewById(R.id.txtCaramelosDba9_2_3)



        //botones de navegación
        imvRegresar.setOnClickListener(){
            regresar()
        }

        //ejecución de operaciones
        imvaumentarDba9_1.setOnClickListener()
        {
            var textoCaramelo1 = txtCaramelosDba9_2_1.text.toString()
            var cantidadCaramelos_1 = textoCaramelo1.toInt()
            cantidadCaramelos_1 = cantidadCaramelos_1+1
            textoCaramelo1 = cantidadCaramelos_1.toString()
            txtCaramelosDba9_2_1.setText(textoCaramelo1)
        }

        imvaumentarDba9_2.setOnClickListener()
        {
            var textoCaramelo2 = txtCaramelosDba9_2_2.text.toString()
            var cantidadCaramelos_2 = textoCaramelo2.toInt()
            cantidadCaramelos_2 = cantidadCaramelos_2+1
            textoCaramelo2 = cantidadCaramelos_2.toString()
            txtCaramelosDba9_2_2.setText(textoCaramelo2)
        }

        imvaumentarDba9_3.setOnClickListener()
        {
            var textoCaramelo3 = txtCaramelosDba9_2_3.text.toString()
            var cantidadCaramelos_3 = textoCaramelo3.toInt()
            cantidadCaramelos_3 = cantidadCaramelos_3+1
            textoCaramelo3 = cantidadCaramelos_3.toString()
            txtCaramelosDba9_2_3.setText(textoCaramelo3)
        }

        imvRestarDba9_1.setOnClickListener()
        {
            var textoCaramelo1Resta = txtCaramelosDba9_2_1.text.toString()
            var cantidadCaramelos_1Resta = textoCaramelo1Resta.toInt()
            cantidadCaramelos_1Resta = cantidadCaramelos_1Resta-1
            textoCaramelo1Resta = cantidadCaramelos_1Resta.toString()
            txtCaramelosDba9_2_1.setText(textoCaramelo1Resta)
        }

        imvRestarDba9_2.setOnClickListener()
        {
            var textoCaramelo2Resta = txtCaramelosDba9_2_2.text.toString()
            var cantidadCaramelos_2Resta = textoCaramelo2Resta.toInt()
            cantidadCaramelos_2Resta = cantidadCaramelos_2Resta-1
            textoCaramelo2Resta = cantidadCaramelos_2Resta.toString()
            txtCaramelosDba9_2_2.setText(textoCaramelo2Resta)
        }

        imvRestarDba9_3.setOnClickListener()
        {
            var textoCaramelo3Resta = txtCaramelosDba9_2_3.text.toString()
            var cantidadCaramelos_3Resta = textoCaramelo3Resta.toInt()
            cantidadCaramelos_3Resta = cantidadCaramelos_3Resta-1
            textoCaramelo3Resta = cantidadCaramelos_3Resta.toString()
            txtCaramelosDba9_2_3.setText(textoCaramelo3Resta)
        }

        btnAlcancia1.setOnClickListener()
        {
            var textoAlcancia1 = txtAlcancia1.text.toString()
            var cantidadAlcancia1 = textoAlcancia1.toInt()
            cantidadAlcancia1 = cantidadAlcancia1+10
            textoAlcancia1 = cantidadAlcancia1.toString()
            txtAlcancia1.setText(textoAlcancia1)
        }

        btnAlcancia2.setOnClickListener()
        {
            var textoAlcancia2 = txtAlcancia2.text.toString()
            var cantidadAlcancia2 = textoAlcancia2.toInt()
            cantidadAlcancia2 = cantidadAlcancia2+10
            textoAlcancia2 = cantidadAlcancia2.toString()
            txtAlcancia2.setText(textoAlcancia2)
        }

        btnRespuestaDba9_1.setOnClickListener()
        {
            if(txtAlcancia2.text.toString()==txtAlcancia1.text.toString())
            {
                txtRespuestaDba9_1.setText("Correcto")
                txtRespuestaDba9_1.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba9_1.setText("Incorrecto")
                txtRespuestaDba9_1.setTextColor(Color.RED)
            }
            if (txtCaramelosDba9_2_1.text.toString()==txtCaramelosDba9_2_2.text.toString() && txtCaramelosDba9_2_2.text.toString()==txtCaramelosDba9_2_3.text.toString())
            {
                txtRespuestaDba9_2.setText("Correcto")
                txtRespuestaDba9_2.setTextColor(Color.GREEN)
            }
            else
            {
                txtRespuestaDba9_2.setText("Incorrecto")
                txtRespuestaDba9_2.setTextColor(Color.RED)
            }
        }

    }
    //funciones
    private fun regresar()
    {
        val i = Intent(this,MainPensamientoNumerico::class.java)
        startActivity(i)
    }
}