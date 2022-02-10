package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)

        calcular.setOnClickListener {

            val nome = findViewById<EditText>(R.id.nome).text.toString()
            val peso = findViewById<EditText>(R.id.peso).text.toString().toDouble()
            val altura = findViewById<EditText>(R.id.altura).text.toString().toDouble()
            val resultado = findViewById<TextView>(R.id.resultado)

            val imc = peso / (altura * altura)

            if (imc < 18.5) {
                resultado.text = "${nome}, seu IMC é ${imc} e você está abaixo do peso!"
            } else if (imc < 25) {
                resultado.text = "${nome}, seu IMC é ${imc} e você está com o peso ideal!"
            } else if (imc < 30) {
                resultado.text = "${nome}, seu IMC é ${imc} e você está acima do peso"
            } else if (imc < 35) {
                resultado.text = "${nome}, seu IMC é ${imc} e você está com Obesidade Grau I"
            } else if (imc < 40) {
                resultado.text = "${nome}, seu IMC é ${imc} e você está com obesidade Grau II"
            } else {
                resultado.text = "${nome}, seu IMC é ${imc} e você está com Obesidade Grau III"
            }
        }

    }
}