package lesson16

fun main() {
    val dice = Dice()

    dice.getRandomNumber()
}

class Dice(
    private var randomNumber: Int = (1..6).random()
) {
    fun getRandomNumber() {
        println("Ваше число: $randomNumber")
    }
}