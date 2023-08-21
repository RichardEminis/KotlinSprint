package lesson9

import java.lang.Character.toUpperCase

fun main() {
    println("Введите 5 инредиентов через запятую:")
    var userAnswer = listOf(*readln().toLowerCase().filterNot { it.isWhitespace() }.split(",").toTypedArray()).sorted().toSet()

    println(userAnswer.toString().replace("[", "").replace("]", "").capitalize() + ".")
}