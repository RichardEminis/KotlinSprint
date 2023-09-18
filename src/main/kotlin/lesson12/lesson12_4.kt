package lesson12

fun main() {
    val weather = DataOfWeather1(
        dayOfWeek = "Понедельник",
        isNight = true,
        isRainy = true,
        atmospherePressure = 20,
        listOfWeather = listOf(
            DataOfWeather1(dayOfWeek = "Понедельник", isNight = true, isRainy = true, atmospherePressure = 50),
            DataOfWeather1(dayOfWeek = "Вторник", isNight = false, isRainy = true, atmospherePressure = 31),
            DataOfWeather1(dayOfWeek = "Среда", isNight = true, isRainy = true, atmospherePressure = 12),
            DataOfWeather1(dayOfWeek = "Четверг", isNight = true, isRainy = false, atmospherePressure = 14),
            DataOfWeather1(dayOfWeek = "Пятница", isNight = false, isRainy = false, atmospherePressure = 43)
        )
    )

    weather.printDataOfWeather()
}

class DataOfWeather1(
    var dayOfWeek: String,
    var isNight: Boolean,
    var isRainy: Boolean = true,
    var atmospherePressure: Int,
    var listOfWeather: List<DataOfWeather1> = listOfNotNull()
) {

    fun printDataOfWeather() {
        println("Сейчас ночное время суток: $isNight")
        println("Сейчас идет дождь: $isRainy")
        println("Атмосферное давление: $atmospherePressure\n")
    }

    init {
        println(
            "День: ${dayOfWeek}\n" +
                    "Ночное время суток: ${isNight}\n" +
                    "Дождь: ${isRainy}\n" +
                    "Атмосферное давление: ${atmospherePressure}\n"
        )
    }
}