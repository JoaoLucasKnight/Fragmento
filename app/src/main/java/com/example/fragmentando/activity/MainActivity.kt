package com.example.fragmentando.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.fragmentando.R
import com.example.fragmentando.databinding.ActivityMainBinding
import com.example.fragmentando.fragment.Msn
import com.example.fragmentando.model.Mensage

class MainActivity : AppCompatActivity(R.layout.activity_main) {


    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<Msn>(binding.fragMsn.id)
        }

        binding.enviar.setOnClickListener {
            val msn = Mensage(
                mensagem = binding.mensage.text.toString()
            )
            Mensage().adicionar(msn)
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<Msn>(binding.fragMsn.id)
            }
        }

    }
}

//object texto {var msn: String? = null}
// > Funciona igual
