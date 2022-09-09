package dezExercicios

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Qual o valor do salário do funcionário? ")
    val salario = sc. nextDouble()
    var novoSalario: Double
    var reajuste: Double
    if (salario >= 0 && salario <= 400) {
        novoSalario = salario * 1.15
        print("Novo Salário: ")
        println("%.2f".format(novoSalario))
        reajuste = novoSalario - salario
        print("Reajuste ganho: ")
        println("%.2f".format(reajuste))
        println("Em percentual: 15%")
    }
    if (salario > 400 && salario <= 800) {
        novoSalario = salario * 1.12
        print("Novo Salário: ")
        println("%.2f".format(novoSalario))
        reajuste = novoSalario - salario
        print("Reajuste ganho: ")
        println("%.2f".format(reajuste))
        println("Em percentual: 12%")
    }
    if (salario > 800 && salario <= 1200) {
        novoSalario = salario * 1.10
        print("Novo Salário: ")
        println("%.2f".format(novoSalario))
        reajuste = novoSalario - salario
        print("Reajuste ganho: ")
        println("%.2f".format(reajuste))
        println("Em percentual: 10%")
    }
    if (salario > 1200 && salario <= 2000) {
        novoSalario = salario * 1.07
        print("Novo Salário: ")
        println("%.2f".format(novoSalario))
        reajuste = novoSalario - salario
        print("Reajuste ganho: ")
        println("%.2f".format(reajuste))
        println("Em percentual: 7%")
    }
    if (salario > 2000) {
        novoSalario = salario * 1.04
        print("Novo Salário: ")
        println("%.2f".format(novoSalario))
        reajuste = novoSalario - salario
        print("Reajuste ganho: ")
        println("%.2f".format(reajuste))
        println("Em percentual: 4%")
    }
}


