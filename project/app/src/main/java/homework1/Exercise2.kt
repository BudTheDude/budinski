package homework1

fun convAngleToCardinal(angle: Int) {

    when (angle) {
        in 0..45 -> println("N")
        in 316..360 -> println("N")
        in 46..135 -> println("E")
        in 136..225 -> println("S")
        in 226..315 -> println("W")
        else -> println("Invalid angle")
    }
}

fun main(){
    convAngleToCardinal(94)
}