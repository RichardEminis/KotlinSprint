package lesson7

fun main() {
    val charOne: IntRange = 0..9
    val charTwo: CharRange = 'a'..'z'
    val charThree: IntRange = 0..9
    val charFour: CharRange = 'a'..'z'
    val charFive: IntRange = 0..9
    val charSix: CharRange = 'a'..'z'

    val password = charOne.random().toString() + charTwo.random().toString() + charThree.random().toString() +
            charFour.random().toString() + charFive.random().toString() + charSix.random().toString()

    println(password)
}