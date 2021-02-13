package basico

import java.util.*

fun main(){
    val leitura = Scanner(System.`in`) //classe scanner
    println("Digite o valor de a: ")//valor q vai digitar no prompt
    val a: Int = leitura.nextInt()
    println("Digite o valor de b: ")
    val b: Int = leitura.nextInt()

    val c: Int = a + b

    println("Digite o valor de c: "+c)
}