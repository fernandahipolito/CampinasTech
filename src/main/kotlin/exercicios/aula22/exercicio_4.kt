package exercicios.aula22

import java.util.*

fun main(){
    val ler = Scanner(System.`in`)
    println ("Digite a idade: ")

    val idade : Int = ler.nextInt()
    println(idade)

    validaHabilitacao(idade)
}
 fun validaHabilitacao(idade: Int) {
     if (idade > 18) {
         println("Pode dirigir!")
     } else if (idade < 18) {
         println("Não pode dirigir")
     } else {
         println("Em liberação!")
     }
 }
