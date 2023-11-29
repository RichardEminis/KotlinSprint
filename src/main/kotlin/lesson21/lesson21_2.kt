package lesson21

fun main() {
    val listOfNumbers: List<Int> = listOf(4, 4, 2, 3, 6, 7, 4, 2)
    println(listOfNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var iterator = 0
    var sum = 0

    this.forEach {
        iterator++
        if (iterator % 2 == 0) sum += it
    }
    return sum
}