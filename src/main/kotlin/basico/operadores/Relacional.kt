package basico.operadores

import java.util.*
fun main(){
   // val a : String = "Huelton"
    //val b: String = "Huelton"

   // println(a === b)

    val d1 = Date(0) //kotlin memoria 54367
    val d2 = Date(0) //kotlin menoria 98746

    println(d1 === d2)

    println( 3!=2)
    println (3 < 2)
    println(3 > 2)
    println (3 <= 2)
    println(3 >= 2)

    // visualG (e) e (ou)

    val x : Boolean = true
    val y : Boolean = true

    val z : Boolean = x  || y
    val w : Boolean = x && y
    val a: Boolean = x xor y
    println("Booleano de z: "+z)
    println("Booleano de w: "+w)
    println("Booleano de A: "+a)
}