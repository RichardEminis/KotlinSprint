package lesson7

fun main() {
    println("Введите число")
    val userNumber: Int = readln().toInt()
    val progression: IntProgression = 0 until userNumber step 2

    for (i in progression) {
        println(i)
    }
}