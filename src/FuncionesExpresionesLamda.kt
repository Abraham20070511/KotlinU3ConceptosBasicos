/*
fun main() {
    val trickFunction = ::trick
}

fun trick() {
    println("No treats!")
}
 */


/*
fun main() {
    val trickFunction = trick
    trick()
}

val trick = {
    println("No treats!")
}
 */

fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
}

val trick = {
    println("No treats!")
}