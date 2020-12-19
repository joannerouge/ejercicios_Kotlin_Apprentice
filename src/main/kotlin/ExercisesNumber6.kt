fun main() {
// Create a constant named myAge and initialize it with your age. Write an if
//expression to print out Teenager if your age is between 13 and 19, and Not a
//teenager if your age is not between 13 and 19
    val myAge = 28
    if (myAge >= 13 && myAge <= 19) {
        println("teenager")
    } else {
        println("Not a teenager ")
    }

    val answer = if (myAge >= 13 && myAge <= 19) "Teenager" else "Not a teenager"
    println(answer)

}