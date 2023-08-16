package lesson12

fun main() {
    val weather = Weather()
    weather.isNight = false
    weather.isRainy = false
    weather.atmospherePressure = 30
}

class Weather {
    var isNight = true
    var isRainy = true
    var atmospherePressure = 20
}