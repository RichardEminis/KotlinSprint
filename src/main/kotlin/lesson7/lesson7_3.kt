package lesson7

fun main() {
    println("Введите число")
    val userNumber: Int = readln().toInt()

    for (i in 0 until userNumber step 2) {
        println(i)
    }
}