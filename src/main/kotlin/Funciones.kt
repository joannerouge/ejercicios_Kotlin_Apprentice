fun main(args: Array<String>) {
    // funcion simple
    //val resultado = suma(10, 25)
    //print(resultado)

    val numeroConSuma = incrementarEImprimir(10)

}

fun suma(a: Int, b: Int): Int {
    return a + b

}

fun incrementarEImprimir(valor: Int): Int {
    val nuevovalor = valor +1
    print(nuevovalor)
    return nuevovalor
}





