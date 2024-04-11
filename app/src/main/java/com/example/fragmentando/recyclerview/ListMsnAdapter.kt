package com.example.fragmentando.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentando.databinding.MsnBinding
import com.example.fragmentando.model.Mensage

class ListMsnAdapter (
    private val  context: Context,
    lista: List<Mensage>,
): RecyclerView.Adapter<ListMsnAdapter.ViewHolder>() {
    private val lista = lista.toMutableList()


    class ViewHolder(
        private val binding: MsnBinding
    ): RecyclerView.ViewHolder(binding.root){
        fun vincula(mensage: Mensage){
            val texto = binding.textWelcome
            texto.text = mensage.mensagem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = MsnBinding.inflate(inflater, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mensagens = lista[position]
        holder.vincula(mensagens)
    }

    override fun getItemCount(): Int = lista.size

    fun atualiza(mensagens: List<Mensage>){
        this.lista.clear()
        this.lista.addAll(lista)

        notifyDataSetChanged()
    }

}