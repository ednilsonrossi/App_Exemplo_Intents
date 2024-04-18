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

        val extras = intent.extras
        if(extras == null){
            binding.textviewMessage.text = getString(R.string.second_activity_message)
        }else{
            val str = extras.getString("TEXT_MESSAGE")
            val intValue = extras.getInt("INT_MESSAGE")
            binding.textviewMessage.text = String.format("%s %3d.", str, intValue)
        }
    }
}