package basico

fun main() {

        val nome = "Fernanda"
        val aprovados = listOf("José","Claudia","Pedro")

    var a: Int = 356.dec()
    var b: String = a.toString()

    println("Int: $a")
    println("Primeiro caractere da String é:${b.first()}")

    println("Olá $nome, usando Template String")
    println("O primeiro colocado é: ${aprovados[0]}")
}