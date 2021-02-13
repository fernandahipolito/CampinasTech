package exercicios.aula24

import java.util.*
fun main(){

    val ler = Scanner(System.`in`)
    println("Digite a quantidade de maçãs compradas: ")
    val quantidade: Int = ler.nextInt()


    println ("Você comprou $quantidade de maçãs")
    calculaDesconto(quantidade = quantidade)

}

    fun calculaDesconto (quantidade: Int){

      if (quantidade < 12){
          val  valorTotal1 = (quantidade * 4.30)
          println("O valor total da compra é R$ $valorTotal1")
      }else{
         val valorTotal2 = (quantidade * 4.00)
          println("O valor total da compra é R$ $valorTotal2")

      }
    }


