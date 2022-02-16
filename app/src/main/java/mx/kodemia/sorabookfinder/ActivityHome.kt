package mx.kodemia.sorabookfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import mx.kodemia.sorabookfinder.adapters.AdapterAdds
import mx.kodemia.sorabookfinder.adapters.AdapterPops
import mx.kodemia.sorabookfinder.models.Libro

class ActivityHome : AppCompatActivity() {

    val listBooks: MutableList<Libro> = mutableListOf()
    var adapterNewAdds= AdapterAdds(listBooks)
    var adapterPopulares = AdapterPops(listBooks)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        addBooks() //añadir algunos libros
        initCarouselPopulares()   // iniciar carousel
        initRVnewAdds()
    }

    private fun initRVnewAdds() {




        rv_recentlyAdded.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_recentlyAdded.adapter = adapterNewAdds
        rv_recentlyAdded.setHasFixedSize(true)
        /*carouselpopularbookscardview.visibility = View.GONE
        rv_recentlyAdded.visibility = View.VISIBLE*/

    }

    private fun addBooks() {
        /*listBooks.add(Libro(R.drawable.libro_1, "Harry Potter y el prisionero de Azkaban", "JK Rowling", "Fantasy"))
        listBooks.add(Libro(R.drawable.libro_2, "Harry Potter y la camara secreta", "JK Rowling", "Fantasy"))
        listBooks.add(Libro(R.drawable.libro_1, "Harry Potter y el principe mestizo", "JK Rowling", "Fantasy"))
        listBooks.add(Libro(R.drawable.libro_2, "Harry Potter y la piedra filosofal", "JK Rowling", "Fantasy"))*/
    }

    private fun initCarouselPopulares() {
        carouselpopularbookscardview.adapter = adapterPopulares
        carouselpopularbookscardview.setInfinite(true)
        carouselpopularbookscardview.setIntervalRatio(0.6f)
    }
}


