package lesson7

fun main() {
    println("Введите количество секунд")
    var seconds: Int = readln().toInt()
    val secondsProgression: IntProgression = seconds downTo 0

    for (i in secondsProgression) {
        println(seconds--)
        Thread.sleep(1000)
    }
    println("Время вышло")
}