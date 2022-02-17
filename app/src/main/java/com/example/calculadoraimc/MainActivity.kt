package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

private lateinit var nomeEditText: EditText
private lateinit var pesoEditText: EditText
private lateinit var alturaEditText: EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)

        calcular.setOnClickListener {

            val resultado = findViewById<TextView>(R.id.resultado)

            nomeEditText = findViewById(R.id.nome)
            pesoEditText = findViewById(R.id.peso)
            alturaEditText = findViewById(R.id.altura)

            if (validarCampos()){

                val nome = nomeEditText.text.toString()
                val peso = pesoEditText.text.toString().toDouble()
                val altura = alturaEditText.text.toString().toDouble()

                val imc = calcularIMC(peso, altura)

                val classificacao = situacaoIMC(imc)

               resultado.text = "${nome}, seu IMC é ${dec.format(imc)} e ${classificacao} "
            }


        }

    }

    private fun validarCampos(): Boolean{
        var noError = true

        if (nomeEditText.text.isBlank()) {
            nomeEditText.setError("Digite seu nome!")
            noError = false
        }

        if (pesoEditText.text.isBlank()) {
            pesoEditText.setError("Digite seu peso!")
            noError = false
        }

        if (alturaEditText.text.isBlank()) {
            alturaEditText.setError("Digite sua altura!")
            noError = false
        }

        return noError
    }

}