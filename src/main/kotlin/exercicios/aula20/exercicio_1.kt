package exercicios

fun main (){
    val (v1,v2, v3, v4) = listOf (2, 3, 5, 8)
    val (v5, v6, v7, v8, v9) = listOf (10, 20, 25, 30, 50)


    println (((v1 * v4 + v6 - v1) - ((v8 - v7) + v6))) //resultado 9

    println ((v2 * (v2 * v2 * v2)) / (v9 - (v5 / v1 * v4))) //resultado 8

    println (((v1 * v4) / v2) + ((v2 * v4) / (v3 % v2))) //resultado 17





}