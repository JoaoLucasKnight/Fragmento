package com.example.fragmentando.activity

import android.content.Intent
import android.os.Bundle
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentando.R
import com.example.fragmentando.databinding.ActivityMainBinding
import com.example.fragmentando.model.Mensage

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.enviar.setOnClickListener {
            Mensage.mensagem = binding.mensage.text.toString()
           // texto.msn = binding.mensage.text.toString()

            val intent = Intent(this, BoasVindasActivity::class.java )
            startActivity(intent)
        }

    }
}

//object texto {var msn: String? = null}
// > Funciona igual
