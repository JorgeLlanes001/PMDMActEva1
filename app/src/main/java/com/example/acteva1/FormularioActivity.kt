package com.example.acteva1
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FormularioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etMensaje = findViewById<EditText>(R.id.etMensaje)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val tvConfirmacion = findViewById<TextView>(R.id.tvConfirmacion)

        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            val correo = etCorreo.text.toString().trim()
            val mensaje = etMensaje.text.toString().trim()

            // Validaciones
            if (nombre.isEmpty() || correo.isEmpty() || mensaje.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
                Toast.makeText(this, "Correo inválido", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Mostrar confirmación
            val confirmacion = "Nombre: $nombre\nCorreo: $correo\nMensaje: $mensaje"
            tvConfirmacion.text = confirmacion
            Toast.makeText(this, "Formulario enviado", Toast.LENGTH_SHORT).show()
        }
    }
}