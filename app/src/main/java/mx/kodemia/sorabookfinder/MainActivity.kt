package mx.kodemia.sorabookfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.filledButtonInicia
import kotlinx.android.synthetic.main.activity_sign_up.*

class MainActivity : AppCompatActivity() {
    private var parent_view: View? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        parent_view = findViewById(android.R.id.content)

        //val buttonActLogIn: Button =
        filledButtonInicia.setOnClickListener{
            if(til_email.editText?.text.toString().trim().isNotEmpty() || til_pwd.editText?.text.toString().trim().isNotEmpty()){
                startActivity(Intent(this, ActivityHome::class.java))

            }else{
                Snackbar.make(
                    parent_view!!,
                    "Los datos no pueden estar vacios",
                    Snackbar.LENGTH_SHORT
                ).show()
                til_email.requestFocus()
            }
        }

        //val buttonActivityRegistro: Button = findViewById(R.id.textButtonRegistro)
        textButtonRegistro.setOnClickListener{
            startActivity(Intent(this, ActivitySignUp::class.java))
            Toast.makeText(this,"ir a pagina registro", Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this,"Metodo onCreate", Toast.LENGTH_SHORT).show()


        initTietsRegistro(tiet_email, til_email)
        initTietsRegistro(tiet_pwd, til_pwd)


    }

    private fun initTietsRegistro(tiet: TextInputEditText, til: TextInputLayout) {

        tiet.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(editText: Editable?) {
                if(editText.toString().trim().isEmpty()){
                    til.setError("Este campo es requerido".toString())
                } else {
                    til.isErrorEnabled = false
                    til.setError("")
                }
            }
        })
    }
}