package com.example.fragmentando.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentando.R
import com.example.fragmentando.databinding.ActivityBoasvindasBinding
import com.example.fragmentando.model.Mensage

class BoasVindasActivity: AppCompatActivity (R.layout.activity_boasvindas) {

    val mensagem = Mensage.mensagem


    private val binding by lazy {
        ActivityBoasvindasBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.welcome.text = mensagem
    }
}