package lesson6

import kotlin.concurrent.thread

fun main() {
    println("Введите количество секунд")
    var seconds: Int = readln().toInt()
    val totalSeconds: Int = seconds

    while (seconds != 0) {
        println("осталось ${seconds--} секунд")
        Thread.sleep(1000)
    }
    print("Прошло $totalSeconds секунд")
}