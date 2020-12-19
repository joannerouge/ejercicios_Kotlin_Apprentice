package Repaso

fun nombreYedad(nombre: String, edad: Int): Pair<String, Int> {
    return Pair(nombre, edad)
}
fun añoYMes ( año:Int, mes:Int): Pair <Int, Int>{
    return Pair (año,mes)
}
fun comidaYbebida ( comida:String, bebida: String): Pair <String, String>{
    return Pair (comida, bebida)
}
fun main() {
    val resultado = nombreYedad("pepito", 5)
    print(resultado.first)

    val (nombre, edad) = nombreYedad("pepito",5)
    print(nombre)

    val fecha = añoYMes(2020,12)
    print(fecha.first)

    val (año, mes) = añoYMes(2020,12)
    print(mes)

    val plato = comidaYbebida("lasaña","agua")
    print(plato.second)

    val  (comida,bebida) = comidaYbebida("lasaña","agua")
    print(comida)


}