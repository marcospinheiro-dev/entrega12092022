package dezExercicios

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)
    print("Digite o primeiro número: ")
    val num1: Int = sc.nextInt()
    print("Digite o segundo número: ")
    val num2: Int = sc.nextInt()

    if(num1 % num2 == 0 || num2 % num1 == 0) {
        println("Sao Múltiplos")
    } else {
        println("Não são Múltiplos")
    }

}