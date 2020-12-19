
fun main () {
   //Pegado con el par por ahora, como ejemplo se puede definir un par de coordenadas 2D
    //donde cada valor de eje es un entero, así:
    val coordinates: Pair<Int, Int> = Pair(2, 3)
    val (valor1,valor2) = coordinates

    // El tipo de coordenadas es Pair<Int, Int>. Los tipos de los valores dentro de la
    //El par, en este caso Int, está separado por comas y rodeado por <>. El código para
    //crear el par es muy similar, con cada valor separado por comas y
    //rodeado de paréntesis.
    //La inferencia de tipos también puede inferir tipos de pares:
    val coordinatesInferred = Pair(2, 3)
    // tambien se puede con tipos doubles
    val coordinatesMixed = Pair(2.1, 3)
// Inferred to be of type Pair<Double, Int>


}