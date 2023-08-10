package lesson10

fun main() {
    var counterOfWins = 0

    do {
        val (userFirstRoll, userSecondRoll) = roll()
        println("Ход человека:\n$userFirstRoll, $userSecondRoll\n")

        val (aiFirstRoll, aiSecondRoll) = roll()
        println("Ход ИИ:\n$aiFirstRoll, $aiSecondRoll\n")

        counterOfWins += resultOfRolls(userFirstRoll, userSecondRoll, aiFirstRoll, aiSecondRoll)

        println("Хотите бросить кости еще раз? Введите Да или Нет:\n")
    } while (readln().equals("да", ignoreCase = true))
    println("Побед человечества: $counterOfWins")
}

fun resultOfRolls(userFirstRoll: Int, userSecondRoll: Int, aiFirstRoll: Int, aiSecondRoll: Int): Int {
    if ((userFirstRoll + userSecondRoll) > (aiFirstRoll + aiSecondRoll)) {
        println("Победило человечество")
        return (1)
    } else {
        println("Победила машина")
        return (0)
    }
}

fun roll(): Array<Int> {
    val firstRoll = (1..6).random()
    val secondRoll = (1..6).random()

    return arrayOf(firstRoll, secondRoll)
}