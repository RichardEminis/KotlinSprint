package lesson5

fun main() {
    val firstNumber: Int = 2
    val secondNumber: Int = 5
    println("Решите пример для доступа: $firstNumber + $secondNumber = ? ")
    val answerOfUser: Int = readln().toInt()
    val expectedAnswer: Int = firstNumber + secondNumber

    if (answerOfUser == expectedAnswer) {
        println("Добро полжаловать!")
    } else {
        println("Доступ запрещен.")
    }
}