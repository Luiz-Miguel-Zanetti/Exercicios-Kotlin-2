import kotlin.math.PI

fun main(){

    print("Digite o diametro de um circulo: ")
    var diametroCircuferencia = readln().toDouble()

    var raio = diametroCircuferencia / 2

    var area = PI * raio * raio

    var perimetro = 2 * PI * raio

    println("O raio é: $raio")

    println()

    println("O perimetro é: $perimetro")

    println()

    println("A area é: $area")

    println()

    println( " O diametro é de: $diametroCircuferencia" )









}