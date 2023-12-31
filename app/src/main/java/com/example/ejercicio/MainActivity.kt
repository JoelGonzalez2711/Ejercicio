package com.example.ejercicio

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio.ui.theme.EjercicioTheme

const val EXTRA_MESSAGE = "com.example.ejercicio.MESSAGE"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_principal)
        val EtNombre = findViewById<EditText>(R.id.ET_nombre)
        val boton = findViewById<Button>(R.id.B_saludame)

        boton.setOnClickListener{
            var nombre = EtNombre.text.toString()
            val intent=Intent(this, saludo::class.java)
            intent.putExtra("EXTRA_NOMBRE", nombre)
            startActivity(intent)
        }
    }




}
