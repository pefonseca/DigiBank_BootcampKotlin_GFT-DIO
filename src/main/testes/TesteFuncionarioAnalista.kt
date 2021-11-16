package main.testes

import main.Analista

fun main() {
    val joao = Analista("João Fonseca", "41949849849846", 3000.0)

    imprimeRelatorioFuncionario.imprime(joao)
}