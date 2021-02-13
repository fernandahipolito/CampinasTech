package exercicios.aula23

fun main(){

    var contador: Int = 0
    for (contador in 0..200 step 2) {
        if (contador in 96..100) {
            println("Entrou no continue")
            continue
        }
        println(contador)


    }

}