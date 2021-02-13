package exercicios.aula22

import java.util.*
fun main(){
    val leitor = Scanner(System.`in`)

    println("Digite um valor: ")

    val valor: Int = leitor.nextInt() //pessoa digita o valor


    if (valor >= 10){
        println ("É MAIOR QUE 10")
    }else{(valor < 10)
        println("NÃO É MAIOR QUE 10")

    }
}