package lesson2
import kotlin.math.pow

fun main() {
    val deposit: Int = 70_000
    val percent: Double = 16.7
    val duration: Int = 20

    val formula = (16.7 / 100) + 1
    val result = (formula.pow(duration)) * 70000

    println(String.format("Ваш процент вклада через 20 лет = %.3f", result))
}