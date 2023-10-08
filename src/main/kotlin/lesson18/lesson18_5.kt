package lesson18

fun main() {}

abstract class Object()

class Square() : Object() {}

class Circle() : Object() {}

class Point() : Object() {}

class Screen() {
    fun draw(x: Int, y: Int, obj: Object) {}
    fun draw(x: Int, y: Float, obj: Object) {}
    fun draw(x: Float, y: Int, obj: Object) {}
    fun draw(x: Float, y: Float, obj: Object) {}
}