package exercicios.aula22

import java.util.*

fun main() {

    val precoAlc1: Double = (3.20 - (0.03 * 3.20))
    val precoAlc2: Double = (3.20 - (0.05 * 3.20))
    val precoGas1: Double = (4.60 - (0.04 * 4.60))


    val ler1 = Scanner(System.`in`)
    println("Digite a quantidade de litros vendidos: ")
    val litros: Double = ler1.nextDouble()

    val ler2 = Scanner(System.`in`)
    println("Selecione o tipo de combustível: A/G")
    val opcao: String = ler2.nextLine()

   /* if (opcao:String = ("A"): String {
        println("O valor do litro será $precoAlc1")
    }else {
        return "O valor do litro será $precoGas1"
    }*/


}
 //fun calculaAlcool (litros: Double, precoAlc1: Double): Double{
   //  if (litros <= 20)
     //   val totalPagar1 : Double = litros * precoAlc1
    // println("O valor total a pagar será de R$ "+totalPagar1)
 //}else if (litros > 20){
    // val totalPagar2 : Double =  litros * precoAlc2
    // println("O valor total a pagar será de R$ "+totalPagar2)


