package lesson6

fun main() {
    var numberOfAttempts: Int = 5
    val number: Int = (1..10).random()

    while (numberOfAttempts > 0) {
        println("Введите число от 1 до 9")
        val userNumber: Int = readln().toInt()

        if (userNumber == number) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно\nОставшееся количество попыток: ${--numberOfAttempts}")
        }
    }
    print("Загаданное число: $number")
}