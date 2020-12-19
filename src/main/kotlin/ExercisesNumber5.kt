fun main() {

    val myAge = 28
    val amITeenager = myAge > 13 && myAge < 19
    println(amITeenager)

    val theirAge = 30
    val areTheTeenagers = theirAge > 13 && theirAge < 19

    val bothTeenagers = amITeenager && areTheTeenagers
    println(bothTeenagers)
// Ejercicio 3

    val reader = "Laura"
    val author = "Richard"
    val authorIsReader = reader == author
    println(authorIsReader)

    // Ejercicio 4

    val reader2 = "Laura"
    val author2 = "Matt Galloway"
    val authorIsReader2 = reader2 == author2
    println(authorIsReader2)
}