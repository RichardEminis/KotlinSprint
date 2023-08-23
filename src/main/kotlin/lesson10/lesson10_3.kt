package lesson10

fun main() {
    println("Введите длину пароля:")
    val userAnswer = readln().toInt().passwordGenerator()
    println(userAnswer)
}

fun Int.passwordGenerator(): String {
    val rangeOfNumbers = (0..9)
    val rangeOfSymbols = (33..47)
    var storageOfSymbols = rangeOfNumbers.random().toString()

    for (i in 1 until this) {
        if (i % 2 != 0) {
            storageOfSymbols += rangeOfSymbols.random().toChar().toString()
        } else {
            storageOfSymbols += rangeOfNumbers.random().toString()
        }
    }
    return (storageOfSymbols)
}