package lesson14

import kotlin.math.pow
import kotlin.math.sqrt

const val PI = 3.14

fun main() {

    val blueCircle = Circle(
        color = "Синий",
        radius = 8.0
    )

    val redCircle = Circle(
        color = "Красный",
        radius = 5.0
    )

    val greenRectangle = Rectangle(
        color = "Зеленый",
        length = 9,
        width = 3
    )

    val redRectangle = Rectangle(
        color = "Красный",
        length = 15,
        width = 10
    )

    val yellowTriangle = Triangle(
        color = "Желтый",
        firstSide = 7.0,
        secondSide = 8.0,
        thirdSide = 10.0
    )

    val redTriangle = Triangle(
        color = "Красный",
        firstSide = 7.0,
        secondSide = 9.0,
        thirdSide = 11.0
    )

    val listOfFigures = listOf(blueCircle, redCircle, greenRectangle, redRectangle, yellowTriangle, redTriangle)

    sumOfAreasOfRedFigures(listOfFigures)

    sumOfPerimetersOfRedFigures(listOfFigures)
}

abstract class Figure(
    val color: String,
    perimeter: Double? = null,
    area: Double? = null
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
    var perimeter: Double? = null,
    var area: Double? = null
) : Figure(color, perimeter, area) {

    override fun calculateArea(): Double {
        val circeArea = PI * radius.pow(2)
        area = circeArea
        return circeArea
    }

    override fun calculatePerimeter(): Double {
        val circlePerimeter = 2 * PI * radius
        perimeter = circlePerimeter
        return circlePerimeter
    }
}

class Rectangle(
    color: String,
    val length: Int,
    val width: Int,
    var perimeter: Double? = null,
    var area: Double? = null

) : Figure(color, perimeter, area) {

    override fun calculateArea(): Double {
        val rectangleАrea = length * width
        area = rectangleАrea.toDouble()
        return rectangleАrea.toDouble()
    }

    override fun calculatePerimeter(): Double {
        val rectanglePerimeter = (length + width) * 2
        perimeter = rectanglePerimeter.toDouble()
        return rectanglePerimeter.toDouble()
    }
}

class Triangle(
    color: String,
    val firstSide: Double,
    val secondSide: Double,
    val thirdSide: Double,
    var perimeter: Double? = null,
    var area: Double? = null
) : Figure(color, perimeter, area) {

    override fun calculateArea(): Double {
        val semiperimeter = (firstSide + secondSide + thirdSide) / 2
        val geron =
            (semiperimeter * (semiperimeter - firstSide) * (semiperimeter - secondSide) * (semiperimeter - thirdSide)).toDouble()
        val triangleArea = sqrt(geron)
        area = triangleArea
        return triangleArea
    }

    override fun calculatePerimeter(): Double {
        val trianglePerimeter = (firstSide + secondSide + thirdSide).toDouble()
        perimeter = trianglePerimeter
        return trianglePerimeter
    }
}

fun sumOfAreasOfRedFigures(figures: List<Figure>) {
    var sum = 0.0
    for (i in figures) {
        if (i.color == "Красный") {
            sum += i.calculateArea()
        }
    }
    println("Сумма площадей красных фигур = $sum")
}

fun sumOfPerimetersOfRedFigures(figures: List<Figure>) {
    var sum = 0.0
    for (i in figures) {
        if (i.color == "Красный") {
            sum += i.calculatePerimeter()
        }
    }
    println("Сумма периметров красных фигур = $sum")
}
