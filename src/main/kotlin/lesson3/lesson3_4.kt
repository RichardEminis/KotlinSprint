package lesson3

fun main() {
    var startPoint: String = "E2"
    var endPoint: String = "E4"
    var moveNumber: Int = 1
    var moveResult: String = "$startPoint-$endPoint;$moveNumber"

    println(moveResult)

    startPoint = "D1"
    endPoint = "D2"
    moveNumber++

    moveResult = "$startPoint-$endPoint;$moveNumber"

    println(moveResult)
}