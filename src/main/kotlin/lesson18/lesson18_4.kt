package lesson18

fun main() {

    val cubeBox = CubeBox(
        edgeLength = 4
    )
    println("Площадь куба: ${cubeBox.cubeArea(cubeBox.edgeLength)}")

    val rectangularBox = RectangularBox(
        length = 4,
        width = 3,
        height = 2
    )
    println(
        "Площадь параллелепипеда: " +
                "${rectangularBox.rectangularArea(rectangularBox.length, rectangularBox.height, rectangularBox.width)}"
    )
}

open class Box

class CubeBox(
    val edgeLength: Int
) : Box() {
    fun cubeArea(edgeLength: Int): Int {
        val result = (edgeLength * edgeLength) * 6
        return result
    }
}

class RectangularBox(
    val length: Int,
    val height: Int,
    val width: Int
) : Box() {
    fun rectangularArea(length: Int, height: Int, width: Int): Int {
        val result = (length * height + length * width + height * width) * 2
        return result
    }
}