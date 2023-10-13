package com.example.tesis

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity2 : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnEstudnainte: TextView = findViewById(R.id.btnEstudiante)
        btnEstudnainte.setOnClickListener(){
            menuEstudiantes()
        }
        firebaseAuth= Firebase.auth
    }

    private fun menuEstudiantes(){
        Toast.makeText(baseContext,"Ingreso como estudiante", Toast.LENGTH_SHORT).show()
        val i = Intent(this,MainEstudiantes::class.java)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_navegacion,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId)
        {
            R.id.menu_Buscar->{
                Toast.makeText(baseContext,"Buscar info",Toast.LENGTH_SHORT).show()
            }
            R.id.menu_Salir->{
                salir()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        return
    }
    private fun salir()
    {
        firebaseAuth.signOut()
        Toast.makeText(baseContext,"Sesión cerrada",Toast.LENGTH_SHORT).show()
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }
}