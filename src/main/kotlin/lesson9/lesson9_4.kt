package lesson9

fun main() {
    println("Введите 5 инредиентов через запятую:")
    val userAnswer = listOf(*readln().filterNot { it.isWhitespace() }.split(",").toTypedArray()).sorted()

    println(userAnswer)
}