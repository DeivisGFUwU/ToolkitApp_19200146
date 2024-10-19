package dev.Deivis.toolkitapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.Deivis.toolkitapp.R

class EquiposFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EquipoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_equipos, container, false)
        recyclerView = view.findViewById(R.id.rvJugadores)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val jugadores = listOf(
            Equipo("HP", "fdl0008LA", 1999f, R.drawable.hp),
            Equipo("Lenovo", "IdeaPad 0X1", 1985f, R.drawable.lenovo),
            Equipo("Asus", "M415", 1992f, R.drawable.asus)

        )

        adapter = EquipoAdapter(jugadores)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
    }

}