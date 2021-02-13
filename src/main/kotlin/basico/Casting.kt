package basico
fun main(){
   //smart Cast

    podeMostrarStringOuSoma(true)
    podeMostrarStringOuSoma(4)
    podeMostrarStringOuSoma("Fernanda")

}

fun podeMostrarStringOuSoma(x: Any){
    when(x){
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else ->println("Isso é diferente de String e Inteiro")
    }
}

/*fun main(){

    val valor: Any = 1
    if (valor is String) { //checa o tipo string ou int
        println(valor)

    }else{
        println ("Não é uma String")
    }
}*/

/*fun main(){
    val a : String = "1"
    val b: String = "2"

    val c: Int = a.toInt() + b.toInt()

    println(c)
}*/