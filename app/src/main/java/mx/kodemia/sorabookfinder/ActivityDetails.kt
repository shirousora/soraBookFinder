package mx.kodemia.sorabookfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import mx.kodemia.sorabookfinder.models.Libro

class ActivityDetails : AppCompatActivity() {

    private val TAG = ActivityDetails::class.qualifiedName
    lateinit var tv_det_title: TextView
    lateinit var tv_det_author: TextView
    lateinit var tv_det_category: TextView
    lateinit var tv_det_cardview: TextView
    lateinit var tv_det_name_author: TextView
    lateinit var tv_det_info_author: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        init()

        intent.extras?.let {book ->
            val book = book.getSerializable("book") as Libro
            Log.d(TAG, book.attributes.title)
            tv_det_title.text = book.attributes.title

        }
    }

    fun init(){
        tv_det_title = findViewById(R.id.tv_detalles_titulo)
        tv_det_author= findViewById(R.id.tv_detalles_autor)
        tv_det_category= findViewById(R.id.tv_detalles_categoria)
        tv_det_cardview= findViewById(R.id.tv_detalles_cardview_2)
        tv_det_name_author= findViewById(R.id.tv_detalles_nombre_autor)
        tv_det_info_author= findViewById(R.id.tv_detalles_informacion_autor)
    }
}