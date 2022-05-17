fun main() {

    /*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
            categoria ela se encontra:
     10-14 infantil
     15-17 juvenil
     18-25 adulto

     */

  print( " Digite sua idade: " )
    val idade = readln().toInt()

    when( idade ){

        in  10..14 -> {
            println("Idade: $idade")
            println("Categoria infantil")

        }

        in 15..17 ->{
            println("Idade: $idade")
            println("Categoria juvenil")
        }

        in 18..25 ->{
            println("Idade: $idade")
            println("Categoria adulto")
        }


    }



}

