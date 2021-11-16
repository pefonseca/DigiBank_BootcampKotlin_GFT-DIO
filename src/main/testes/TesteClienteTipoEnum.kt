package main.testes

import main.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.Pf
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.Pj
    println("${pj.name} - ${pj.descricao}")
}