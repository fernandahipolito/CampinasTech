package exercicios

fun main (){
    val chuva : Boolean = true
    val molha : Boolean = true
    val venta : Boolean = false


  //val tempestade: Boolean = molha xor venta
   // println (tempestade)

    val tempestade: Boolean = molha && venta
   // println (tempestade)

    //val tempestade: Boolean = molha || venta
    println (tempestade)
}
/*criar 3 variaveis chuva, molha e venta, caractreisticas de uma tempestade
faça uma validação para q em xor o valor do print seja verdadeiro
faça uma validação para q em && o valor do print seja falso
faça uma validação para q em || o valor do print seja verdadeiro
 */