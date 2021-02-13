package exercicios.aula22

import java.util.*
fun main(){
    val leitor = Scanner(System.`in`)

    println("Digite um valor: ")

    val valor = leitor.nextInt() //pessoa digita o valor



    if (valor >= 0){
        println("Valor Positivo") }else{
            println ("Valor negativo")
    }
}