package dev.Deivis.toolkitapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import dev.Deivis.toolkitapp.R

class GastosFragment : Fragment() {

    private lateinit var etIngreso: EditText
    private lateinit var etGastoFijo: EditText
    private lateinit var etGastoVariable: EditText
    private lateinit var btnCalcular: Button
    private lateinit var tvResultado: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gastos, container, false)

        etIngreso = view.findViewById(R.id.etIngreso)
        etGastoFijo = view.findViewById(R.id.etGastoFijo)
        etGastoVariable = view.findViewById(R.id.etGastoVariable)
        btnCalcular = view.findViewById(R.id.btnCalcular)
        tvResultado = view.findViewById(R.id.tvResultado)

        btnCalcular.setOnClickListener{
            calcularGastos()
        }


        return view
    }

    private fun calcularGastos(){
        val ingreso = etIngreso.text.toString().toFloatOrNull()
        val fijo = etGastoFijo.text.toString().toFloatOrNull()
        val variable = etGastoVariable.text.toString().toFloatOrNull()

        if(ingreso != null && fijo != null && variable != null){

            val rendimiento = ingreso - (fijo + variable)
            tvResultado.text = String.format("Saldo: %.2f USD", rendimiento)

        }else{
            tvResultado.text = "Ingrese valores válidos"
        }

    }

}