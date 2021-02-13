package exercicios.aula22

import java.util.*

fun main(){
    val ler1 = Scanner(System.`in`)
    println("Digite a quantidade de horas trabalhadas no mês: ")
    val horas: Double = ler1.nextDouble()

    val ler2 = Scanner(System.`in`)
    println("Digite o valor do salário por hora trabalhada: ")
    val sal: Double = ler2.nextDouble()

    val quantasExtras: Double = (horas - 160)
    println ("A quantidade de horas extras trabalhadas no mês foram: "+quantasExtras +" "+ "horas")
    val salFixo: Double = (sal * 160)
    println ("O salário fixo recebido no mês foi de R$"+salFixo)
    val valorHoraExtra: Double = sal + (0.5 * sal)
    println ("O valor da hora extra é: R$"+ valorHoraExtra)
    val salHoraExtra: Double = quantasExtras * valorHoraExtra
    println ("O valor recebido de horas extras foi de: R$"+salHoraExtra)
    val salTotal: Double = (salFixo + salHoraExtra)
    println ("O salário total recebido no mês foi de R$"+ salTotal)
}

