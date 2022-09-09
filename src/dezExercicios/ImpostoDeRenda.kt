package dezExercicios

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Qual o valor do salário do contribuinte? ")
    val salario = sc. nextDouble()
    var ir: Double

    if (salario >= 0 && salario <= 2000) {
        println("Isento.")
    }
    if (salario > 2000 && salario <= 3000) {
        ir = salario * 8/100
        print("R$")
        println("%.2f".format(ir))
    }
    if (salario > 3000 && salario <= 4500) {
        ir = salario * 18/100
        print("R$")
        println("%.2f".format(ir))
    }
    if (salario > 4500) {
        ir = salario * 28/100
        print("R$")
        println("%.2f".format(ir))
    }
}
