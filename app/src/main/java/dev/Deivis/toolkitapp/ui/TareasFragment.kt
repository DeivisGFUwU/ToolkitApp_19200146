package dev.Deivis.toolkitapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import dev.Deivis.toolkitapp.R


class TareasFragment : Fragment() {

    private lateinit var lvTareas: ListView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_tareas, container, false)

        lvTareas = view.findViewById(R.id.lvTareas)

        val equipos = arrayOf(
            "Salir a pasear", "Caminar", "Hacer las compras",
            "Ir a la universidad", "Lavar el auto"
        )

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, equipos)

        lvTareas.adapter = adapter


        return view
    }


}