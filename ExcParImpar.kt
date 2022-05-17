import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    /*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
            número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
        ímpar exiba o número elevado ao quadrado.*/

    println("Digite um numero: ")
    var numero = readln().toDouble()
    var quadrado = numero * numero

   if ( numero %2== 0.0 ){

       val raiz = sqrt(numero)

       println("Numero par! ")

       println(raiz)



   }else{

       println("Numero impar! ")
       println("O quadrado do numero é: $quadrado ")



   }



}