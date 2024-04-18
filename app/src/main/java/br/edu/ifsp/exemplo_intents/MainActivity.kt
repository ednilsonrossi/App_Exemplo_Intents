package br.edu.ifsp.exemplo_intents

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifsp.exemplo_intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonStartSecond.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v == binding.buttonStartSecond){
            intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}