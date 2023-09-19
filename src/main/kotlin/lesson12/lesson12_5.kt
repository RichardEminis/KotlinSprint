package lesson12

import kotlin.random.Random.Default.nextBoolean

fun main() {
    val weather = DataOfWeather2(
        dayOfWeek = "Понедельник",
        isNight = true,
        isRainy = true,
        atmospherePressure = 20,
        temperature = 0
    )

    val listOfDays = listOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
    val rangeOfAtmospherePressure = 669..1083
    val rangeOfTemperature = 20..36
    val listOfWeather: MutableList<DataOfWeather2> = mutableListOf()
    var allDayTemperature: Int = 0
    var allNightTemperature: Int = 0
    var nightDays = 0
    var sunnyDays = 0
    var rainyDays: Int = 0
    var allAtmosphere = 0
    val numberOfDays: Int = 10

    var iterator = 0
    for (i in 1..numberOfDays) {

        if (iterator == 7) iterator = 0

        val weather = DataOfWeather2(
            dayOfWeek = listOfDays[iterator],
            isNight = nextBoolean(),
            isRainy = nextBoolean(),
            atmospherePressure = rangeOfAtmospherePressure.random(),
            temperature = rangeOfTemperature.random()
        )
        listOfWeather.add(weather)

        iterator++
    }

    for (i in listOfWeather) {
        if (i.isNight) {
            allNightTemperature += i.temperature
            nightDays++
        } else {
            allDayTemperature += i.temperature
            sunnyDays++
        }
        allAtmosphere += i.atmospherePressure
        if (i.isRainy) rainyDays++
    }

    weather.dailyWeatherData(listOfWeather)

    val averageDayTemperature = allDayTemperature / sunnyDays
    val averageNightTemperature = allNightTemperature / nightDays
    val averageAtmospherePressure = allAtmosphere / numberOfDays
    println("Средняя температура днем за $sunnyDays дней = $averageDayTemperature")
    println("Средняя температура ночью за $nightDays дней = $averageNightTemperature")
    println("Среднее давление за $numberOfDays дней = $averageAtmospherePressure")
    println("Количество дождливых дней за $numberOfDays дней = $rainyDays")
}

class DataOfWeather2(
    var dayOfWeek: String,
    var isNight: Boolean,
    var isRainy: Boolean = true,
    var atmospherePressure: Int,
    var temperature: Int,
    var listOfWeather: List<DataOfWeather2> = listOfNotNull()
) {

    fun printDataOfWeather() {
        println("Сейчас ночное время суток: $isNight")
        println("Сейчас идет дождь: $isRainy")
        println("Атмосферное давление: $atmospherePressure")
        println("Температура: $temperature\n")
    }

    fun dailyWeatherData(listOfWeather: List<DataOfWeather2>) {
        for (data in listOfWeather) {
            println(
                "День: ${data.dayOfWeek}\n" +
                        "Ночное время суток: ${data.isNight}\n" +
                        "Дождь: ${data.isRainy}\n" +
                        "Атмосферное давление: ${data.atmospherePressure}\n" +
                        "Температура: ${data.temperature}\n"
            )
        }
    }
}