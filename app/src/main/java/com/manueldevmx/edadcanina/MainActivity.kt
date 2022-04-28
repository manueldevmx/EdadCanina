package com.manueldevmx.edadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.manueldevmx.edadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ageEdit = binding.ageEdit
        val resultText = binding.resultText
        val button = binding.btnCalcular

        Log.d("MainActivity", "ActivityCreated")

        button.setOnClickListener {
            val ageString = ageEdit.text.toString()
           if (ageString.isNotEmpty()) {
               val ageInt = ageString.toInt()
               val result = ageInt * 7
               resultText.text = getString(R.string.result_text, result)
           }else {
               Toast.makeText(this, getString(R.string.insert_age), Toast.LENGTH_SHORT).show()
           }
        }
    }
}