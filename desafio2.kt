import kotlin.system.exitProcess
import java.lang.NumberFormatException

//Programa que leia 4 notas e retorne a média de aluno usando métodos.

fun main () {
    println("\n---------------------------------\n         média global\n---------------------------------")
    resultado()
}
fun retorno(){
    try {
        print("\n-- 1 Começar novamente   2 Sair: ")
        val escolha = readln().toInt()
        when(escolha){
            1 -> resultado()
            2 -> exitProcess(0)
            else -> {
            print("-- valor inválido\n")
            retorno()
            }
        }
    }catch(ex: NumberFormatException){
        print("-- Insira apenas números\n")
        retorno()
    }
}
fun nome (): String{
    print("\nInsira o nome do(a) aluno(a): ")
    val aluno = readln()
    return aluno
}
fun notas(): Double {
    //try {
        val listaNotas = DoubleArray(4)
        var ind = 1
        var soma: Double = 0.0
        for (i in listaNotas.indices) {
            print("Insira a $ind ª nota: ")
            val nota = readln().toDouble()
            ind += 1
            if (nota in 0.0 .. 10.0){
                listaNotas[i]
                soma += nota
            } else {
                println("Valor inválido")
                retorno()
            }
        }
        return soma
    //} catch(ex: NumberFormatException){
    //    print("-- Insira apenas números\n")
    //    retorno()}
}
fun resultado() {
    val media = notas() / 4
    print("A média final de ${nome()} é $media.")
    retorno()
}
