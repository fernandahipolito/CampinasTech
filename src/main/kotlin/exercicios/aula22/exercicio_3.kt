package exercicios.aula22

import java.util.*

fun main(){
    val ler = Scanner(System.`in`)
    println ("Digite a nota: ")

    val nota : Int = ler.nextInt()
    valorNota(nota)
}

fun valorNota(nota: Int){
    when (nota){
        10 -> println ("Ótimo, excelente nota, passou de ano!")
        9 -> println ("Boa nota, passou de ano!")
        8 -> println ("Passou de ano!")
        else -> println ("Nota não esperada, não passou!")
    }
}


