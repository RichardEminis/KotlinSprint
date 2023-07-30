package lesson6

fun main () {
    var numberOfAttempt: Int = 3
    println("Здравствуйте! Для авторизации докажите что вы не бот.")

    do {
        val firstRandomNumber: Int = (1..10).random()
        val secondRandomNumber: Int = (1..10).random()
        println("Решите пример: $firstRandomNumber + $secondRandomNumber")
        val userAnswer: Int = readln().toInt()

        if ((firstRandomNumber + secondRandomNumber) == userAnswer){
            println("Добро пожаловать!")
        } else if (numberOfAttempt > 1){
            println("Попробуйте еще раз.\nКоличество попыток осталось: ${--numberOfAttempt}")
            println()
        } else {
            println("Количество попыток осталось: ${--numberOfAttempt}\nДоступ запрещен.")
        }
    } while (((firstRandomNumber + secondRandomNumber) != userAnswer) && (numberOfAttempt != 0))
}