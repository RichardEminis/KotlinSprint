package lesson21

fun main() {
    val listOfNumbers: List<Int> = listOf(4, 4, 2, 3, 6, 7, 4, 2, 5, 4, 9)
    println(listOfNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return filterIndexed() { index, i -> index % 2 == 0 }.sum()
}