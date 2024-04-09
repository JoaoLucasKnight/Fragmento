package com.example.fragmentando

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentando.databinding.ActivityBoasvindasBinding

class BoasVindasActivity: AppCompatActivity (R.layout.activity_boasvindas) {

    private val binding by lazy {
        ActivityBoasvindasBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val mensagem = intent.getStringExtra("mensage")
        binding.welcome.text = mensagem
    }
}