package com.manueldevmx.edadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEdit = findViewById<EditText>(R.id.age_edit)
        val resultText = findViewById<TextView>(R.id.result_text)
        val button = findViewById<Button>(R.id.btn_calcular)

        button.setOnClickListener {
            val ageString = ageEdit.text.toString()
            val ageInt = ageString.toInt()
            val result = ageInt * 7
            resultText.text = "Your dog age is: $result years old."
        }
    }
}