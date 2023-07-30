package lesson7

fun main() {
    var charOne: IntRange = 0..9
    var charTwo: CharRange = 'a'..'z'
    var charThree: IntRange = 0..9
    var charFour: CharRange = 'a'..'z'
    var charFive: IntRange = 0..9
    var charSix: CharRange = 'a'..'z'

    print("Ваш пароль: ${charOne.random()}${charTwo.random()}${charThree.random()}" +
            "${charFour.random()}${charFive.random()}${charSix.random()}")
}