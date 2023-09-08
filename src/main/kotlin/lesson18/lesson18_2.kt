package lesson18

fun main() {
    val fourSide = FourSide()
    fourSide.rollDices()

    val sixSide = SixSide()
    sixSide.rollDices()

    val eightSide = EightSide()
    eightSide.rollDices()
}

abstract class Dice(
    var numberOfSides: Int
) {
    open fun rollDices() {
        println("Число с кубика: ${(1..numberOfSides).random()}")
    }
}

class FourSide(
    numberOfSides: Int = 4
) : Dice(numberOfSides)

class SixSide(
    numberOfSides: Int = 6
) : Dice(numberOfSides)

class EightSide(
    numberOfSides: Int = 8
) : Dice(numberOfSides)