fun main (){
    val numero = 6
    var mesesDelAño: String

    when (numero){

        1 -> mesesDelAño = "January"
        2 -> mesesDelAño = "February"
        3 -> mesesDelAño = "March"
        4 -> mesesDelAño = "April"
        5 -> mesesDelAño= "May"
        6 -> mesesDelAño = "June"
        7 -> mesesDelAño = "July"
        8 -> mesesDelAño = "August"
        9 -> mesesDelAño = "september"
        10 -> mesesDelAño = "october"
        11 -> mesesDelAño= "november"
        12 -> mesesDelAño = " december"

        else-> mesesDelAño = "Numer incorrecto"
    }
    print(mesesDelAño)
}