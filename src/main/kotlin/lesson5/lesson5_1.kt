package lesson5

import java.lang.Integer.sum

fun main() {
    val firstNumber: Int = 2
    val secondNumber: Int = 5
    println("Решите пример для доступа: $firstNumber + $secondNumber = ? ")
    val answerOfUser: Int = readln().toInt()

    if (answerOfUser == (sum(firstNumber, secondNumber))) {
        println("Добро полжаловать!")
    } else {
        println("Доступ запрещен.")
    }
}