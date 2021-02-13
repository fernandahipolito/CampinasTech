package exercicios

import java.util.*

fun main(){

    val leitura = Scanner(System.`in`) //classe scanner
    println("Digite um valor: ")//valor q vai digitar no prompt
    val a: Int = leitura.nextInt()
    println(multiplica(a))
}

fun multiplica (a: Int) = a * a


