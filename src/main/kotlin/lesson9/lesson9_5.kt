package lesson9

fun main() {
    println("Введите 5 инредиентов через запятую:")
    val userAnswer = listOf(*readln().lowercase().filterNot { it.isWhitespace() }.split(",").toTypedArray()).sorted().toSet()
    val stringUserAnswer = userAnswer.toString().replace("[", "").replace("]", "")
    println(stringUserAnswer.get(0).uppercase() + stringUserAnswer.slice(1 until stringUserAnswer.length) + ".")
}