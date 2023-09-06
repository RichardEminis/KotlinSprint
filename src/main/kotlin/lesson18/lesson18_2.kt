package lesson18

fun main() {
    val fourSide = FourSide()
    println(fourSide.rollDices())

    val sixSide = SixSide()
    println(sixSide.rollDices())

    val eightSide = EightSide()
    println(eightSide.rollDices())
}

abstract class Dices(
    var numberOfSides: IntRange
) {
    open fun rollDices(): Int {
        return numberOfSides.random()
    }
}

class FourSide(
    numberOfSides: IntRange = 1..4
) : Dices(numberOfSides)

class SixSide(
    numberOfSides: IntRange = 1..6
) : Dices(numberOfSides)

class EightSide(
    numberOfSides: IntRange = 1..8
) : Dices(numberOfSides)