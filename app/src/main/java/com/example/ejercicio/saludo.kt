package com.example.ejercicio

import android.os.Bundle
import android.content.Intent
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

class saludo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_saludo)

        val SaludoUsuario=findViewById<TextView>(R.id.saludar_usuario)
        val respuesta=intent.extras?.getString("EXTRA_NOMBRE").orEmpty()
        SaludoUsuario.text= "Hola $respuesta"
        }
    }

