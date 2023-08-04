package lesson5

fun main(){
    var firstNumberToWin = (1..100).random()
    var secondNumberToWin = (1..100).random()

    println("Для участия в лотерее введите первое число:")
    val firstUserAnswer = readln().toInt()

    println("Теперь введите второе число:")
    val secondUserAnswer = readln().toInt()

    if (((firstUserAnswer == firstNumberToWin) || (secondUserAnswer == firstNumberToWin))&&((firstUserAnswer == secondNumberToWin) || (secondUserAnswer == secondNumberToWin))) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (((firstUserAnswer == firstNumberToWin) || (secondUserAnswer == firstNumberToWin))||((firstUserAnswer == secondNumberToWin) || (secondUserAnswer == secondNumberToWin))) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Крутите барабан!\nЗагаданные числа: $firstNumberToWin и $secondNumberToWin")
    }
}