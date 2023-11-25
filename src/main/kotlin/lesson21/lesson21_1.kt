package lesson21

import java.util.*

fun main() {
    val word = "Hello World!"
    word.vowelCounter()
}

fun String.vowelCounter() {
    var count = 0
    val vocals = "aeiouy"

    this.lowercase(Locale.getDefault()).groupingBy { if (vocals.contains(it)) count++ }.eachCount()
    println("Количество гласных: $count")
}