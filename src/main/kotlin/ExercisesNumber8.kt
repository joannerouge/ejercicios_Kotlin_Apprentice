fun printFullname1(nombre: String, apellido: String) {
    print("nombre y apellido $nombre $apellido")
}

fun printFullName(firstName: String, lastName: String): String {
    val info = "Nombre y apellido, $firstName, $lastName"
    return info
}

fun main() {
    val nombreCompleto = printFullName("Tina", "vandervill")
    println(nombreCompleto)


}