package exercicios.aula22

import java.util.*

fun main(){

    val ler = Scanner(System.`in`)
    println ("Digite o primeiro número da lista: ")
    val n1 : Int = ler.nextInt()


    val ler1 = Scanner(System.`in`)
    println ("Digite o segundo número da lista: ")
    val n2 : Int = ler.nextInt()


    val ler2 = Scanner(System.`in`)
    println ("Digite o terceiro número da lista: ")
    val n3 : Int = ler.nextInt()


    val ler3 = Scanner(System.`in`)
    println ("Digite o segundo número da lista: ")
    val n4 : Int = ler.nextInt()


    val lista = listOf(n1,n2,n3,n4)
     println(lista)
    if (n1 > n4) {
        println("A primeira posição é maior que a última!")
    } else if (n2 > n1) {
        println("A segunda posição é maior que a primeira")
    } else {
        println("Nenhum comentárrio relevante!")

}
/*fun verifica (lista: List) { //não consigo declarar a lista
    if (n1 > n4) {
        println("A primeira posição é maior que a última!")
    } else if (n2 > n1) {
        println("A segunda posição é maior que a primeira")
    } else {
        println("Obrigada por participar!")
    }*/
}

