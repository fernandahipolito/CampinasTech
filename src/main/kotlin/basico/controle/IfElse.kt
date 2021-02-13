package basico.controle

fun main(){
    val nota: Double = 6.0

    val resultado = if (nota >= 7.0){
        println("Passou!!!")
    }else{
        println("Não passou!!!")
    }
    println(resultado)
}