package lesson18

fun main() {

    val cubeBox = CubeBox(
        edgeLength = 4
    )
    println("Площадь куба: ${cubeBox.area()}")

    val rectangularBox = RectangularBox(
        length = 4,
        width = 3,
        height = 2
    )
    println(
        "Площадь параллелепипеда: " +
                "${rectangularBox.area()}"
    )
}

abstract class Box {
    abstract fun area(): Int
}

class CubeBox(
    val edgeLength: Int
) : Box() {
    override fun area(): Int {
        val result = (edgeLength * edgeLength) * 6
        return result
    }
}

class RectangularBox(
    val length: Int,
    val height: Int,
    val width: Int
) : Box() {
    override fun area(): Int {
        val result = (length * height + length * width + height * width) * 2
        return result
    }
}