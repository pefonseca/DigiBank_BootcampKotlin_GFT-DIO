package main.testes

import main.Cliente
import main.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.456.789-00",
        clienteTipo = ClienteTipo.Pf,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}