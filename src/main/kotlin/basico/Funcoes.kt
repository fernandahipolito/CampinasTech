package basico

fun main (){



    val a: Int = 5
    val b: Int = 3

    val c: Double = 5.0
    val d: Double = 3.0


    soma1 (a,b)
    soma2(a,b)
    println("A multiplicação de A e B é: "+ multiplicaDoisNumeros1(c,d))
    println("A multiplicação de A e B é: "+ multiplicaDoisNumeros2(c,d))

    val compras = listOf("Arroz","Feijão", "Carne")
    val comprasMutavel: MutableList<String> = mutableListOf("Arroz", "Feijão", "Carne")

    comprasMutavel[0]= "Batata"
    comprasMutavel.add("Peixe")
    println(comprasMutavel[3])

}

//funcao sem retorno
fun soma1 (a: Int, b: Int){
    println("A soma de A e B é: "+ (a+b))
}

//funcao sem retorno
fun soma2 (a: Int, b: Int = 1) {
    println("A soma de A e B é: " + (a + b))
}

//funcao com retorno
fun multiplicaDoisNumeros1 (a : Double,b : Double): Double {
    return a * b
}

//funcao com retorno
fun multiplicaDoisNumeros2 (a : Double,b : Double): Double = a * b //não coloca as chaves para cálculos simples q o resultado é um double






