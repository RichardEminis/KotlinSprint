package lesson6

fun main () {
    var number_of_attempts: Int = 5
    val number: Int = (1..10).random()

    while (number_of_attempts != 0) {
        println("Введите число от 1 до 9")
        val userNumber: Int = readln().toInt()

        if (userNumber == number) {
            println("Это была великолепная игра!")
            number_of_attempts = 0
        } else {
            println("Неверно\nОставшееся количество попыток: ${--number_of_attempts}")
        }
    }
    print("Загаданное число: $number")
}