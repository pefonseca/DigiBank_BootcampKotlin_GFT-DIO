package main.testes

import main.Gerente

fun main() {
    val maria = Gerente("Maria Fonseca", "41949849849846", 5000.0, "senha125")

    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}