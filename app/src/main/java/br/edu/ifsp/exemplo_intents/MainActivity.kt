package br.edu.ifsp.exemplo_intents

import android.content.Intent
import android.net.Uri
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
        binding.buttonSendMessage.setOnClickListener(this)
        binding.buttonCall.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v) {
            binding.buttonStartSecond -> {
                val mIntent = Intent(this, SecondActivity::class.java)
                startActivity(mIntent)
            }
            binding.buttonSendMessage -> {
                val strMessage = binding.edittextInput.text.toString()
                val numberMessage = 10

    //            val mIntent = Intent(this, SecondActivity::class.java)
    //            mIntent.putExtra("TEXT_MESSAGE", strMessage)
    //            mIntent.putExtra("INT_MESSAGE", numberMessage)
    //            startActivity(mIntent)

    //            val person = Person(2004)

                val extras = Bundle()
                extras.putString("TEXT_MESSAGE", strMessage)
                extras.putInt("INT_MESSAGE", numberMessage)
    //            extras.putSerializable("PERSON", person)
                val mIntent2 = Intent(this, SecondActivity::class.java)
                mIntent2.putExtras(extras)
                startActivity(mIntent2)
            }
            binding.buttonCall -> {
                val phoneNumber = "01633032330"
                val mIntent = Intent(Intent.ACTION_DIAL)
                val uri = Uri.parse("tel:$phoneNumber")
                mIntent.setData(uri)
                startActivity(mIntent)
            }
        }
    }
}