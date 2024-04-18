package br.edu.ifsp.exemplo_intents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifsp.exemplo_intents.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textviewMessage.text = getString(R.string.second_activity_message)
    }
}