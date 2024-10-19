package dev.Deivis.toolkitapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.Deivis.toolkitapp.R

class EquipoAdapter(private val equipos: List<Equipo>) : RecyclerView.Adapter<EquipoAdapter.EquipoViewHolder>() {

    class EquipoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgEquipo: ImageView = itemView.findViewById(R.id.imgEquipo)
        val tvMarca: TextView = itemView.findViewById(R.id.tvMarca)
        val tvModelo: TextView = itemView.findViewById(R.id.tvModelo)
        val tvPrecio: TextView = itemView.findViewById(R.id.tvPrecio)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_equipo, parent, false)
        return EquipoViewHolder(view)
    }

    override fun onBindViewHolder(holder: EquipoViewHolder, position: Int) {
        val jugador = equipos[position]
        holder.imgEquipo.setImageResource(jugador.imagen)
        holder.tvMarca.text = jugador.marca
        holder.tvModelo.text = "Modelo: ${jugador.modelo}"
        holder.tvPrecio.text = "Precio: ${jugador.precio}"


    }

    override fun getItemCount() = equipos.size
}