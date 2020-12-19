fun main (){
    if (2 > 1) {
        println("Yes, 2 is greater than 1.")
    }

    val animal = "Fox"
    if (animal == "Cat" || animal == "Dog") {
        println("Animal is a house pet.")
    } else {
        println("Animal is not a house pet.")
    }

//    val a = 5
//    val b = 10
//    val min: Int
//    if (a < b) {
//        min = a
//    } else {
//        min = b
//    }
//    val max: Int
//    if (a > b) {
//        max = a
//    } else {
//        max = b
//    }
    val a = 5
    val b = 10
    val min = if (a < b) a else b
    val max = if (a > b) a else b

    val hourOfDay = 12
    val timeOfDay = if (hourOfDay < 6) {
        "Early morning"
    } else if (hourOfDay < 12) {
        "Morning"
    } else if (hourOfDay < 17) {
        "Afternoon"
    } else if (hourOfDay < 20) {
        "Evening"
    } else if (hourOfDay < 24) {
        "Late evening"
    } else {
        "INVALID HOUR!"
    }
    println(timeOfDay)
}