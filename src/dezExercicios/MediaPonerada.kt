package dezExercicios


import java.util.*
import kotlin.Double as Double1

fun main(){
    val sc = Scanner(System.`in`)
    print("Qual o código do ítem? ")
    val codigo: Int = sc.nextInt()
    print("Quantos ítens, por favor? ")
    val qtd: Int = sc.nextInt()
    var valorItem: Double1
    if (codigo == 1) {
        valorItem = 4.0
        val valorPagar = qtd * valorItem
        println("O valor total é: $valorPagar")
    }
    if (codigo == 2) {
        valorItem = 4.5
        val valorPagar = qtd * valorItem
        println("O valor total é: $valorPagar")
    }
    if (codigo == 3) {
        valorItem = 5.0
        val valorPagar = qtd * valorItem
        println("O valor total é: $valorPagar")
    }
    if (codigo == 4) {
        valorItem = 2.0
        val valorPagar = qtd * valorItem
        println("O valor total é: $valorPagar")
    }
    if (codigo == 5) {
        valorItem = 1.5
        val valorPagar = qtd * valorItem
        println("O valor total é: $valorPagar")
    } else {
        println("Ítem não consta em nossa lista, escolha outro, por favor!")
    }
}

