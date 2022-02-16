package mx.kodemia.sorabookfinder.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import mx.kodemia.sorabookfinder.R
import mx.kodemia.sorabookfinder.models.Libro

class AdapterPops(val listLibros: MutableList<Libro>):
    RecyclerView.Adapter<AdapterPops.LibroHolder>() {
    class LibroHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val cl : ConstraintLayout = view.findViewById(R.id.cl_populares)
        val imgLib: ImageView = view.findViewById(R.id.imagen_libro_populares)

        fun setImagen(libro: Libro){
            Glide.with(view).load(libro.imagen).diskCacheStrategy(DiskCacheStrategy.NONE).into(imgLib)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LibroHolder(layoutInflater.inflate(R.layout.layout_mas_populares, parent, false))
    }

    override fun onBindViewHolder(holder: LibroHolder, position: Int) {
        holder.setImagen(listLibros[position])
        holder.imgLib.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val activity = v!!.context as AppCompatActivity
                //val fragmentDetallesLibro = DetallesLibro()

                /*activity.supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.innerConstraint_home, fragmentDetallesLibro)
                    .addToBackStack(null)
                    .commit()*/
            }
        })
    }

    override fun getItemCount(): Int = listLibros.size


}