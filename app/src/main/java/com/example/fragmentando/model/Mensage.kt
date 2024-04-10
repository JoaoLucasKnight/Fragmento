package com.example.fragmentando.model

class Mensage(
    val mensagem: String? = null
){
    fun adicionar(msn: Mensage){
           mensagens.add(msn)
    }
    fun listar():List<Mensage>{
        return mensagens.toList()
    }
    companion object{
        private val mensagens = mutableListOf(
            Mensage(
                mensagem = "Que mensgaem você gostaria de receber agora?"
            )
        )
    }
}
