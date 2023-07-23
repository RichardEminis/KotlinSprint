package lesson3

fun main() {
    var startPoint: String = "E2"
    var endPoint: String = "E4"
    var moveResult: String = "$startPoint $endPoint"

    println(moveResult)

    startPoint = "D1"
    endPoint = "D2"

    moveResult = "$startPoint $endPoint"

    println(moveResult)
}