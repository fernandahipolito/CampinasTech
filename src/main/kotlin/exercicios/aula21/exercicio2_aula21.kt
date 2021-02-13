package exercicios

import java.util.*


    fun main(){
        val leitura = Scanner(System.`in`) //classe scanner
        println("Digite uma palavra: ")//valor q vai digitar no prompt
        val a: String = leitura.nextLine()

lenght(a)

    }
fun lenght (a:String){
    println (a.length)
}