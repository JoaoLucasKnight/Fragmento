package com.example.fragmentando.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentando.R
import com.example.fragmentando.databinding.ActivityMainBinding
import com.example.fragmentando.databinding.ListMsnBinding

import com.example.fragmentando.model.Mensage
import com.example.fragmentando.recyclerview.ListMsnAdapter
import java.lang.IllegalArgumentException

class Msn: Fragment(R.layout.list_msn) {

    private val msn = Mensage()

    private val adptado by lazy{
        context?.let{
            ListMsnAdapter(it, lista = msn.listar())
        }?: throw IllegalArgumentException ("Contexto invalido")
    }



    private lateinit var binding: ListMsnBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ListMsnBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val teste = ActivityMainBinding.inflate(layoutInflater)
        msn.adicionar(Mensage(
            mensagem = teste.mensage.text.toString()
        ))
        configRecycler()
    }



    fun configRecycler(){
        binding.list.run {
            this.adapter = adptado
            layoutManager = LinearLayoutManager(context)
        }
    }
}