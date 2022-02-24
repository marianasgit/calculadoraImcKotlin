package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RelatorioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relatorio)

        val pesoTextView = findViewById<TextView>(R.id.peso)
        val alturaTextView = findViewById<TextView>(R.id.altura)
        val resultadoTextView = findViewById<TextView>(R.id.resultado)

        val intent: Intent = getIntent()
        pesoTextView.text = intent.getStringExtra("peso")
        alturaTextView.text = intent.getStringExtra("altura")
        resultadoTextView.text = intent.getStringExtra("resultado")

    }
}