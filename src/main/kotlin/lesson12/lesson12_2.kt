package lesson12

fun main() {
    val weatherOnMonday = StatisticOfWeather(true, false, 34)
    weatherOnMonday.printDataOfWeather()

    val weatherOnTuesday = StatisticOfWeather(false, false, 40)
    weatherOnTuesday.printDataOfWeather()

    val weatherOnWednesday = StatisticOfWeather(true, true, 51)
    weatherOnWednesday.printDataOfWeather()

}

class StatisticOfWeather(isNight: Boolean, isRainy: Boolean, atmospherePressure: Int) {
    var isNight = isNight
    var isRainy = isRainy
    var atmospherePressure = atmospherePressure

    fun printDataOfWeather() {
        println("Сейчас ночное время суток: $isNight")
        println("Сейчас идет дождь: $isRainy")
        println("Атмосферное давление: $atmospherePressure\n")
    }
}

