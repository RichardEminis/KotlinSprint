package lesson3

fun main() {
    var serverAnswer: String = "D2-D4;0"
    val list = serverAnswer.split("-", ";")

    val startPoint = list.get(0)
    val endPoint = list.get(1)
    val moveNumber = list.get(2)

    println("Начальный ход: $startPoint\nКонечный ход: $endPoint\nНомер хода: $moveNumber")
}