fun main (){
// Kotlin puede realizar operaciones artimeticas mezclando los tipos double e int,
    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
    val totalCost: Double = hourlyRate * hoursWorked
    println(totalCost)
//exercise 1 y 2
    val age1 = 42.toDouble ()
    val age2= 21

    val avg1 = (age1 + age2) /2
    println(avg1)
    // porque el resultado es 31.5 es un double pero el programa dio el resultado como un entero
}