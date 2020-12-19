fun main() {
    //Create a constant called coordinates and assign a pair containing two and three
    //to it.

    val coordenadas = Pair(2, 3)
    println(coordenadas)
// Extract the values 2 and 3 from coordinates into two variables called row and
//column.
    val fila = coordenadas
    val columna = coordenadas
    println("$fila, $columna")

// Is this valid code?
    val date = Triple(15, 8, 2015)
    val day = date.first // no se escribe en minuscula

    // What is wrong with the following code?
    var name = "Joe"
    name += " Howard" // que es una constante y no una variable
    //What is the type of the constant named value?
    val triple = Triple(100, 1.5, 10)
    val value = triple.second // Value es un Double

    //. What is the value of the constant named month?

    val newDate = Triple(15, 8, 2015)
    val month = newDate.second

    // . What is the value of the constant named summary?
    val number = 10
    val multiplier = 5
    val summary = "$number multiplied by $multiplier equals ${number * multiplier}" // es un string
    


}