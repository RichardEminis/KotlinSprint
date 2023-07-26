package lesson5

fun main() {
    val numberToWin: Int = 56
    val secondNumberToWin: Int = 76

    println("Добро пожаловать в лотерею! Для участия введите 2 числа от 1 до 100")
    println("Введите первое число:")
    val firstNumber: Int = readln().toInt()
    println("Введите второе число:")
    val secondNumber: Int = readln().toInt()

    if (((firstNumber == numberToWin) || (secondNumber == numberToWin))&&((firstNumber == secondNumberToWin) || (secondNumber == secondNumberToWin))) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (((firstNumber == numberToWin) || (secondNumber == numberToWin))||((firstNumber == secondNumberToWin) || (secondNumber == secondNumberToWin))) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Крутите барабан!")
    }
}