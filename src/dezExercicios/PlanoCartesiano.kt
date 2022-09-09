package dezExercicios

import java.util.*

fun main() {
    println()
    println("Q1-> x+ y+  Q2-> x- y+  \nQ3-> x- y-  Q4-> x+ y-")
    println()
    val sc = Scanner(System.`in`)
    print("Digite a coordenada X: ")
    val eixoX: Double = sc.nextDouble()
    print("Digite a coordenada Y: ")
    val eixoY: Double = sc.nextDouble()

    if (eixoX > 0 && eixoY > 0) {
        println("Quadrante Q1")
    }
    if (eixoX < 0 && eixoY > 0) {
        println("Quadrante Q2")
    }
    if (eixoX < 0 && eixoY < 0) {
        println("Quadrante Q3")
    }
    if (eixoX > 0 && eixoY < 0) {
        println("Quadrante Q4")
    }
    if (eixoX == 0.0 || eixoY == 0.0 ) {
        println("Origem")
    }
}