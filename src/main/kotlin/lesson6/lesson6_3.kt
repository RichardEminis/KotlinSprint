package lesson6

import kotlin.concurrent.thread

fun main() {
    println("Введите количество секунд")
    var seconds: Int = readln().toInt()
    val totalSeconds: Int = seconds

    while (seconds != 0) {
        println("Осталось секунд: ${seconds--}c")
        Thread.sleep(1000)
    }
    print("Время вышло\nПрошло $totalSeconds секунд")
}