package com.example.calculadoraimc

import java.text.DecimalFormat

fun situacaoIMC(imc: Double): String {

    if (imc < 18.5) {
        return "você está abaixo do peso!"
    } else if (imc < 25) {
        return "você está com o peso ideal!"
    } else if (imc < 30) {
        return "você está acima do peso"
    } else if (imc < 35) {
        return "você está com Obesidade Grau I"
    } else if (imc < 40) {
        return "você está com obesidade Grau II"
    } else {
        return "você está com Obesidade Grau III"
    }
}

fun calcularIMC(peso: Double, altura: Double) = (peso / (altura * altura))

val dec = DecimalFormat ("##.##")