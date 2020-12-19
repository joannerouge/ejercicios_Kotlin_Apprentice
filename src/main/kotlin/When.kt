// varias formas de when
fun main() {
    val calificacion = 3

    var reseña: String

//    when (calificacion){
//
//        1 -> reseña = " No me gusto la comida, me causo nauseas "
//        2 -> reseña = "No me gusto, pero la bebida si"
//        3 -> reseña = " Mediocre"
//        4 -> reseña = "Me gusto pero puede mejorar"
//        5 -> reseña = "La mejor comida mexicana en mucho tiempo"
//        else -> reseña = " Reseña mal escrita"
//    }
//    print(reseña)
//    when (calificacion) {
//        1 -> reseña = " No me gusto la comida, me causo nauseas"
//        2, 3, 4 -> {
//            println("El cliente califico con $calificacion estrellas")
//            reseña = "Mediocre"
//        }
//        else -> reseña = "Reseña mal escrita"
//    }
//    print(reseña)

    when (calificacion){
        in 1..5 -> { println("El cliente califico con $calificacion estrellas")
            reseña = "mediocre"}
        else -> reseña = "reseña mal escrita" +
                ""

    }
}