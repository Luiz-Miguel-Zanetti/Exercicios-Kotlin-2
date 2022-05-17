fun main() {

    //2- Faça um programa que entre com três números e coloque em ordem crescente.

    println("Digite um numero: ")
    val num1 = readln().toInt()

    println("Digite um segundo numero: ")
    val num2 = readln().toInt()

    println("Digite um terceiro numero: ")
    val num3 = readln().toInt()



    val listaNumeros = listOf(num1, num2, num3)
    val crescente = listaNumeros.sorted();

    println(crescente)

}