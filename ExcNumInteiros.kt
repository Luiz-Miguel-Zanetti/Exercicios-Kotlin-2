fun main() {

    //1- Faça um programa que receba três inteiros e diga qual deles é o maior.

    println("Digite um numero inteiro: ")
    var num1 = readln().toInt()

    println("Digite um segundo numero inteiro: ")
    var num2 = readln().toInt()

    println("Digite um terceiro numero inteiro: ")
    var num3 = readln().toInt()

    if (num1 > num2 && num1 > num3) {

        println("O maior numero é: $num1")

    } else if (num2 > num1 && num2 > num3) {

        println("O maior numero é: $num2")

    } else {

        println("O maior numero é: $num3")


    }


}