package dezExercicios

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Qual o tipo do animal? ")
    val tipo = sc.next()
    print("Qual a espécie do animal? ")
    val especie: String = sc.next()
    print("Qual o tipo do animal de acordo com sua alimentação? ")
    val alimento: String = sc.next()

    if (tipo == "vertebrado") {
        if (especie == "ave") {
            if (alimento == "carnivoro") {
                println("aguia")
            } else if (alimento == "onivoro"){
                println("pomba")
            } else {
                println("Esse animal não existe na tabela")
            }

        } else if (especie == "mamifero") {
            if (alimento == "onivoro") {
                println("homem")
            } else if (alimento == "herbivoro") {
                println("vaca")
            } else {
                println("Esse animal não existe na tabela")
            }
        } else {
            println("Esse animal não existe na tabela")
        }

    } else if (tipo == "invertebrado") {
        if (especie == "inseto") {
            if (alimento == "hematofago") {
                println("pulga")
            } else if (alimento == "herbivoro"){
                println("lagarta")
            } else {
                println("Esse animal não existe na tabela")
            }
        } else if (especie == "anelideo") {
            if (alimento == "hematofago") {
                println("sanguessuga")
            } else if (alimento == "onivoro"){
                println("minhoca")
            }
        } else {
            println("Esse animal não existe na tabela")
        }

    } else {
        println("Esse animal não existe na tabela")
    }
}















