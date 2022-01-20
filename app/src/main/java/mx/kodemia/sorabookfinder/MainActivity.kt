package mx.kodemia.sorabookfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonActivity: Button = findViewById(R.id.textButtonRegistro)
        buttonActivity.setOnClickListener{
            startActivity(Intent(this, ActivitySignUp::class.java))
            Toast.makeText(this,"ir a pagina registro", Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this,"Metodo onCreate", Toast.LENGTH_SHORT).show()

    }




}