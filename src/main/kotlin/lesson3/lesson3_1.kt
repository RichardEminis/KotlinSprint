package lesson3

import java.time.LocalTime

fun main() {
    val currentTime = LocalTime.now()
    val nightTime = LocalTime.parse("00:00")
    val morningTime = LocalTime.parse("06:00")
    val dayTime = LocalTime.parse("12:00")
    val eveningTime = LocalTime.parse("18:00")

    val nightText: String = "сладких снов"
    val morningText: String = "Доброе утро"
    val dayText: String = "Добрый день"
    val eveningText: String = "Добрый вечер"

    println("Введите свое имя")
    val name = readln()
    println()

    if ((currentTime.isAfter(nightTime)) && (currentTime.isBefore(morningTime))) {
        println("$name, $nightText")
    } else if ((currentTime.isAfter(morningTime)) && (currentTime.isBefore(dayTime))) {
        println("$morningText, $name")
    } else if ((currentTime.isAfter(dayTime)) && (currentTime.isBefore(eveningTime))) {
        println("$dayText, $name")
    } else {
        println("$eveningText, $name")
    }
}

