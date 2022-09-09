package dezExercicios

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    print("Qual a medida do lado A? ")
    val A = sc.nextDouble()
    print("Qual a medida do lado B? ")
    val B = sc.nextDouble()
    print("Qual a medida do lado A? ")
    val C = sc.nextDouble()
    val perimetro = A + B + C
    val areaTrapezio = ((A+B) * C) / 2

    if(A+B>C || A+C>B || B+C>A) {
        println("Perímetro %.1f".format(perimetro))
    }
    if(A+B<=C || A+C<=B || B+C<=A) {
        println("Área %.1f".format(areaTrapezio))
    }

}