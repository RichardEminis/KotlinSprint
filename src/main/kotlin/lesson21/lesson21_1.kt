package lesson21

fun main() {
    val word = "Hello World!"
    word.vowelCounter()
}

fun String.vowelCounter() {
    println("Количество гласных: ${this.lowercase().count({ letter -> "aeiouy".contains(letter) })}")
}