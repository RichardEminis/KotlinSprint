package lesson18

fun main() {
    val screen = Screen (
        listOfObjects = mutableListOf()
    )

    screen.draw(43,432.43F, Circle())
}

abstract class Object(
    val name: String
    var x: Float,
    var y: Float
)

class Square(
    name: String = "квадрат",
    x: Float,
    y: Float
) : Object(name, x, y) {}

class Circle(
    name: String = "круг",
    x: Float,
    y: Float
) : Object(name, x, y) {}

class Point(
    name: String = "точка",
    x: Float,
    y: Float
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