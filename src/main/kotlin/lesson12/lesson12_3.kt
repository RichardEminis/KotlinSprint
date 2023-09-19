package lesson12

fun main() {
    val weather = DataOfWeather(
        dayOfWeek = "Понедельник",
        isNight = true,
        isRainy = true,
        atmospherePressure = 20,
        listOfWeather = listOf(
            DataOfWeather(dayOfWeek = "Понедельник", isNight = true, isRainy = true, atmospherePressure = 50),
            DataOfWeather(dayOfWeek = "Вторник", isNight = false, isRainy = true, atmospherePressure = 31),
            DataOfWeather(dayOfWeek = "Среда", isNight = true, isRainy = true, atmospherePressure = 12),
            DataOfWeather(dayOfWeek = "Четверг", isNight = true, isRainy = false, atmospherePressure = 14),
            DataOfWeather(dayOfWeek = "Пятница", isNight = false, isRainy = false, atmospherePressure = 43)
        )
    )

    weather.printDataOfWeather()
    weather.dailyWeatherData()
}

class DataOfWeather(
    var dayOfWeek: String,
    var isNight: Boolean,
    var isRainy: Boolean = true,
    var atmospherePressure: Int,
    var listOfWeather: List<DataOfWeather> = listOfNotNull()
) {

    fun printDataOfWeather() {
        println("Сейчас ночное время суток: $isNight")
        println("Сейчас идет дождь: $isRainy")
        println("Атмосферное давление: $atmospherePressure\n")
    }

    fun dailyWeatherData() {
        for (data in listOfWeather) {
            println(
                "День: ${data.dayOfWeek}\n" +
                        "Ночное время суток: ${data.isNight}\n" +
                        "Дождь: ${data.isRainy}\n" +
                        "Атмосферное давление: ${data.atmospherePressure}\n"
            )
        }
    }
}