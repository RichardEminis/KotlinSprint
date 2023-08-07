package lesson7

fun main() {
    var smsNumbers = (1000..9999).random()

    do {
        println("Ваш код авторизации: $smsNumbers")

        println("Введите код из SMS")
        val userAnswer = readln().toInt()
        if (userAnswer == smsNumbers) {
            print("Поздравляю! Код введен верно!")
        } else {
            smsNumbers = (1000..9999).random()
            println("Код введен неверно, попробуйте снова.\n")
        }
    } while (smsNumbers != userAnswer)
}
