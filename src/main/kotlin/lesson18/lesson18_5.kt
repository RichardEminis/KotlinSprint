package lesson18

fun main() {
    val circle1 = Circle()
    val square = Square()
    val point = Point()

    val screen = Screen()

    screen.draw(43, 432.43F, circle1)
    screen.draw(43.34F, 234, square)
    screen.draw(24.43F, 34.43F, point)
}

abstract class Object(
    val name: String
)

class Square(
    name: String = "квадрат"
) : Object(name)

class Circle(
    name: String = "круг"
) : Object(name)

class Point(
    name: String = "точка"
) : Object(name)

class Screen {
    fun draw(x: Int, y: Int, obj: Object) {
        println("В координатах: X = $x Y = $y нарисован объект: = ${obj.name}")
    }

    fun draw(x: Int, y: Float, obj: Object) {
        println("В координатах: X = $x Y = $y нарисован объект: = ${obj.name}")
    }

    fun draw(x: Float, y: Int, obj: Object) {
        println("В координатах: X = $x Y = $y нарисован объект: = ${obj.name}")
    }

    fun draw(x: Float, y: Float, obj: Object) {
        println("В координатах: X = $x Y = $y нарисован объект: = ${obj.name}")
    }
}