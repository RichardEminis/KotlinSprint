package lesson3

fun main() {
    var serverAnswer: String = "D2-D4;0"
    serverAnswer = serverAnswer.replace('-', ';')
    val symbol = ";"
    val list = serverAnswer.split(symbol)

    val startPoint = list.get(0)
    val endPoint = list.get(1)
    val moveNumber = list.get(2)

    println("Начальный ход: $startPoint\nКонечный ход: $endPoint\nНомер хода: $moveNumber")
}