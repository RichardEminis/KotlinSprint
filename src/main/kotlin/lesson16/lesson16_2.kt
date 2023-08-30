package lesson16

fun main() {
    val circle = Circle(
        radius = 5
    )

    circle.circumference()
    circle.areaOfCircle()
}

class Circle(
    private val pi: Double = 3.14,
    private val radius: Int
) {
    fun circumference() {
        val result = pi * (radius * 2)
        println("Длина окружности: ${String.format("%.1f", result)}")
    }

    fun areaOfCircle() {
        val result = pi * (radius * radius)
        println("Площадь круга: $result")
    }
}