package com.example.tesis

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var authStateListener: FirebaseAuth.AuthStateListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIngresar: Button = findViewById(R.id.btnIngresar)
        val txtEmail: TextView = findViewById(R.id.loginEmail)
        val txtContrasena: TextView = findViewById(R.id.loginkey)
        val btnCrearCuenta : TextView = findViewById(R.id.txtRegistro)
        val btnRecordarContrasena : TextView = findViewById(R.id.btnOlvidar)
        firebaseAuth = Firebase.auth
        btnIngresar.setOnClickListener(){
            ingreso(txtEmail.text.toString(),txtContrasena.text.toString())
        }

        btnCrearCuenta.setOnClickListener(){
            val i = Intent(this,Registro::class.java)
            startActivity(i)
        }

        btnRecordarContrasena.setOnClickListener(){
            val i = Intent(this,activity_recordarcontrasena::class.java)
            startActivity(i)
        }
    }
//funcion para ingresar a la app
    private fun ingreso(email: String, password: String){
        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this){
             task-> if (task.isSuccessful){
                 val user = firebaseAuth.currentUser
                val verifica = user?.isEmailVerified
            if (verifica==true) {
                Toast.makeText(baseContext, "Bienvenido a proyecto TOKIO", Toast.LENGTH_SHORT)
                    .show()
                //Aquí redireccionamos al menu principal, en caso de autenticarse exitosamente
                val i = Intent(this, MainActivity2::class.java)
                startActivity(i)
            }
            else
            {
                Toast.makeText(baseContext, "Verifique por favor su correo", Toast.LENGTH_SHORT).show()
            }
        }
            else{
            Toast.makeText(baseContext, "Error al escribir email y/o contraseña", Toast.LENGTH_SHORT).show()
        }
        }
    }
}