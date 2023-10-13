package com.example.tesis

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Registro : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val edtNombreNuevo:TextView=findViewById(R.id.edtNombre)
        val edtCorreoNuevo:TextView=findViewById(R.id.edtCorreo)
        val edtcontrasenaNueva:TextView=findViewById(R.id.edtContrasena)
        val edtConfirmarContrasenaNueva:TextView=findViewById(R.id.edtConfirmarContrasena)
        val btnCrearUsuario:TextView=findViewById(R.id.btnCrearcuenta)

        btnCrearUsuario.setOnClickListener(){
            var contrasena1=edtcontrasenaNueva.text.toString()
            var contrasena2=edtConfirmarContrasenaNueva.text.toString()
            if(contrasena1.equals(contrasena2)){
                crearCuenta(edtCorreoNuevo.text.toString(),edtcontrasenaNueva.text.toString())
            }else{
                Toast.makeText(baseContext,"Error: contraseñas no coinciden",Toast.LENGTH_SHORT).show()
                edtcontrasenaNueva.requestFocus()
            }
        }
        firebaseAuth=Firebase.auth
    }

    private fun crearCuenta(correo:String,contrasena:String)
    {
        firebaseAuth.createUserWithEmailAndPassword(correo,contrasena).addOnCompleteListener(this){
            task ->if(task.isSuccessful){
                //llamo a la funcion que envia el correo electronico de verificación
                verificacionCorreo()
                Toast.makeText(baseContext,"cuenta creada correctamente, se envio  un correo de verificación",Toast.LENGTH_SHORT).show()
                val i = Intent(this,MainActivity::class.java)
                startActivity(i)
        }else{
            Toast.makeText(baseContext,"Error"+task.exception,Toast.LENGTH_SHORT).show()
        }
        }
    }

    private fun verificacionCorreo(){
        val user = firebaseAuth.currentUser!!
        user.sendEmailVerification().addOnCompleteListener(this)
        {
            task->
            if(task.isSuccessful)
            {

            }
            else
            {

            }

        }
    }

}