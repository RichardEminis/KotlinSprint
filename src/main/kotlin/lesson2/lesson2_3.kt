package lesson2

const val SIXTY_UNITS_OF_TIME: Int = 60
fun main() {
    val hour: Int = 9
    val minute: Int = 39
    val travelTime: Int = 457
    val timeToStart: Int = (hour * SIXTY_UNITS_OF_TIME) + minute
    val sumOfTime: Int = timeToStart + travelTime

    val time = String.format("ВРЕМЯ ПРИБЫТИЯ ПОЕЗДА %02d:%02d", sumOfTime / SIXTY_UNITS_OF_TIME, sumOfTime % SIXTY_UNITS_OF_TIME)

    println(time)
}