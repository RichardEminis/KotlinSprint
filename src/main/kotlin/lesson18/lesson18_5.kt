package lesson18

fun main() {
    val circle1 = Circle()
    val square = Square()
    val point = Point()

    val screen = Screen (
        listOfObjects = mutableListOf()
    )

    screen.draw(43,432.43F, circle1)
    screen.draw(43.34F, 234, square)
    screen.draw(24.43F, 34.43F, point)
}

abstract class Object(
    val name: String,
    var x: Float,
    var y: Float
)

class Square(
    name: String = "квадрат",
    x: Float = 0F,
    y: Float = 0F
) : Object(name, x, y) {}

class Circle(
    name: String = "круг",
    x: Float = 0F,
    y: Float = 0F
) : Object(name, x, y) {}

class Point(
    name: String = "точка",
    x: Float = 0F,
    y: Float = 0F
) : Object(name, x, y) {}

class Screen(
    var listOfObjects: MutableList<Object>
) {
    fun draw(x: Int, y: Int, obj: Object) {
        println("В координатах: X = $x Y = $y нарисован объект: = ${obj.name}")
        obj.x = x.toFloat()
        obj.y = y.toFloat()
        listOfObjects.add(obj)
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