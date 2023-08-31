package lesson16

import kotlin.math.pow

private const val PI: Double = 3.14
fun main() {
    val circle = Circle(
        radius = 5.0
    )

    circle.circumference()
    circle.areaOfCircle()
}

class Circle(
    private val radius: Double
) {
    fun circumference() {
        val result = PI * (radius * 2)
        println("Длина окружности: ${String.format("%.1f", result)}")
    }

    fun areaOfCircle() {
        val result = PI * (radius.pow(2))
        println("Площадь круга: $result")
    }
}