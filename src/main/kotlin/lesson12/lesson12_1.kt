package lesson12

fun main() {
    val weather = Weather()
    weather.isNight = false
    weather.isRainy = false
    weather.atmospherePressure = 30

    weather.printDataOfWeather()
}

class Weather {
    var isNight = true
    var isRainy = true
    var atmospherePressure = 20

    fun printDataOfWeather() {
        println("Сейчас ночное время суток: $isNight")
        println("Сейчас идет дождь: $isRainy")
        println("Атмосферное давление: $atmospherePressure")
    }
}

