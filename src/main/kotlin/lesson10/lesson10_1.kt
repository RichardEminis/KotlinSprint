package lesson10

fun main() {
    val (userFirstRoll, userSecondRoll) = rollOfDice()
    println("Ход человека:\n$userFirstRoll, $userSecondRoll\n")

    val (aiFirstRoll, aiSecondRoll) = rollOfDice()
    println("Ход ИИ:\n$aiFirstRoll, $aiSecondRoll\n")

    if ((userFirstRoll + userSecondRoll) > (aiFirstRoll + aiSecondRoll)) {
        println("Победило человечество")

    } else {
        println("Победила машина")
    }
}

fun rollOfDice(): Array<Int> {
    val firstRoll = (1..6).random()
    val secondRoll = (1..6).random()

    return arrayOf(firstRoll, secondRoll)
}