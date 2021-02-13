package exercicios.aula22

import java.util.*

fun main() {
    val ler1 = Scanner(System.`in`)
    println("Digite a nota da primeira avaliação: ")
    val nota1: Double = ler1.nextDouble()

    val ler2 = Scanner(System.`in`)
    println("Digite a nota da segunda avaliação: ")
    val nota2: Double = ler2.nextDouble()

    val media: Double = (nota1 + nota2) / 2

    println("Sua média é: "+media)

    validaMedia(media)
}

fun validaMedia(media: Double) {
    if (media >= 6) {
        println("Aluno aprovado!")
    } else {
        println("Aluno reprovado!")

    }
}
