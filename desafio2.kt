import java.lang.NumberFormatException
import kotlin.system.exitProcess

//Programa que leia 4 notas e retorne a média de cada aluno usando métodos.

fun main () {
    println("\n---------------------------------\n         média global\n---------------------------------")
    nome()
}
fun retorno(){
    try {
        print("\n-- 1 Começar novamente   2 Sair: ")
        val escolha = readln().toInt()
        if (escolha == 1) {
            nome()
        } else if (escolha == 2){
            exitProcess(0)
        } else {
            print("-- valor inválido\n")
            retorno()
        }
    } catch(ex: NumberFormatException){
        print("-- Insira apenas números\n")
        retorno()
    }
}
fun nome (){
    print("\nInsira o nome do(a) aluno(a): ")
    val aluno = readln()
    notas(aluno)
}
fun notas(aluno: String) {
    try {
        var listaNotas = DoubleArray(4)
        var ind = 1
        var soma: Double = 0.0
        for (nota: Double in listaNotas) {
            print("Insira a $ind ª nota: ")
            var nota = readln().toDouble()
            ind += 1
            if (nota < 0){
                println("Valor inválido")
                retorno()
            } else {
                soma += nota
            }
        }
        resultado(aluno, soma)
    } catch(ex: NumberFormatException){
        print("-- Insira apenas números\n")
        retorno()
    }
}
fun resultado(aluno: String, soma: Double) {
    var media = soma / 4
    print("A média final de $aluno é $media\n")
    retorno()
}
