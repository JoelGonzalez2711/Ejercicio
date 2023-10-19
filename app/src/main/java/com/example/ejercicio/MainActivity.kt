package com.example.ejercicio

import android.os.Bundle
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

class MainActivity : ComponentActivity() {
    private lateinit var saludo:TextView
    private lateinit var introNombre:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.layout_principal)

            val boton:Button=findViewById(R.id.B_saludame)
            introNombre=findViewById(R.id.ET_nombre)
            boton.setOnClickListener{saludar()}
        }
    }

    fun saludar(){
        setContent {
            setContentView(R.layout.layout_saludo)
            saludo=findViewById(R.id.saludar_usuario)

            val nombre=introNombre.text.toString()
            val saludos=getString(R.string.saludo)
            val mensaje="$saludos $nombre"
            saludo.text=mensaje

        }
    }


}
