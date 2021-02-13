package basico.controle

import java.util.*

fun main(){

    val leitura = Scanner(System.`in`)

    var opcao: String = ""

    while (opcao != "N" && opcao != "n"){

        //regra dentro do while
        println("Continuar dentro do while? S/N")
        opcao = readLine() ?: "N"
    }
}