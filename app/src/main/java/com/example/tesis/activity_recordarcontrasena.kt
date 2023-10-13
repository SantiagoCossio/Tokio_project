package com.example.tesis

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class activity_recordarcontrasena : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var authStateListener: FirebaseAuth.AuthStateListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recordarcontrasena)
        val txtcorreo: TextView = findViewById(R.id.edtCorreoRecordar)
        val btnCambiar: TextView = findViewById(R.id.btnCambiar)
        btnCambiar.setOnClickListener(){
            enviarCambioContrasena(txtcorreo.text.toString())
        }

        firebaseAuth= Firebase.auth
    }

    private fun enviarCambioContrasena(email: String){
        firebaseAuth.sendPasswordResetEmail(email).addOnCompleteListener { task ->
            if(task.isSuccessful){
                Toast.makeText(baseContext,"Solicitud de cambio de contraseña enviada", Toast.LENGTH_SHORT).show()
                val i = Intent(this,MainActivity::class.java)
                startActivity(i)
            }else{
                Toast.makeText(baseContext,"Error al solicitar el cambio", Toast.LENGTH_SHORT).show()
            }
        }
    }
}