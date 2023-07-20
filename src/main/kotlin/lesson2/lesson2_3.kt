package lesson2

fun main() {
    val hour: Int = 9
    val minute: Int = 39
    val travelTime: Int = 457
    val timeToStart: Int = (hour * 60) + minute
    val sumOfTime: Int = timeToStart + travelTime

    var time = String.format(
        "ВРЕМЯ ПРИБЫТИЯ ПОЕЗДА %02d:%02d",
        sumOfTime / 60,
        sumOfTime % 60,
    );

    println(time)
}