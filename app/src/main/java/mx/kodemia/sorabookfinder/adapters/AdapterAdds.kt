package mx.kodemia.sorabookfinder.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import mx.kodemia.sorabookfinder.R
import mx.kodemia.sorabookfinder.models.Libro

class AdapterAdds(val bookList: MutableList<Libro>) : RecyclerView.Adapter<AdapterAdds.ViewLibroHolder>() {


    class ViewLibroHolder(val view: View) : RecyclerView.ViewHolder(view) {
        //val cardv: MaterialCardView = view.findViewById(R.id.cardView_newAdded)
        val imgPortada: ImageView = view.findViewById(R.id.iv_book)
        val tv_title: TextView = view.findViewById(R.id.tv_titulo)
        val tv_author: TextView = view.findViewById(R.id.tv_autor)
        val tv_categ: TextView = view.findViewById(R.id.tv_categoria)

        fun render(bookList: Libro){
            Glide.with(view).load(bookList.imagen).error(R.drawable.libro_1)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(imgPortada)

            tv_title.text = bookList.titulo
            tv_author.text = "by ${bookList.autor}"
            tv_categ.text = bookList.categoria



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewLibroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return ViewLibroHolder(layoutInflater.inflate(R.layout.item_new_added,parent,false))
    }

    override fun onBindViewHolder(holder: ViewLibroHolder, position: Int) {
        holder.render(bookList[position])
    }

    override fun getItemCount(): Int =bookList.size  //total de libros


}