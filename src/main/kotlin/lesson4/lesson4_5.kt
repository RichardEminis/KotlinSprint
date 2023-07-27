package lesson4

const val NO_DAMAGE: Boolean = true
const val MIN_NUMBER_OF_CREW: Int = 55
const val MAX_NUMBER_OF_CREW: Int = 70
const val MIN_NUMBER_OF_PROVISIONS: Int = 50
const val WEATHER_IS_FAVORABLE: Boolean = true

fun main() {
    val welcomeText: String = "Здравствуйте! Введите характеристики состояния вашего судна."
    val statusOfDamageText: String = "Ваше судно не имеет повреждений?"
    println("$welcomeText\n$statusOfDamageText")
    val statusOfDamage: Boolean = readln().toBoolean()
    val numberOfCrewText: String = "Укажите количество членов экипажа"
    println("$numberOfCrewText")
    val numberOfCrew: Int = readln().toInt()
    val numberOfProvisionText: String = "Укажите количество провизи на борту"
    println("$numberOfProvisionText")
    val numberOfProvision: Int = readln().toInt()
    val statusOfWeatherText: String = "Введите благоприятны ли метеоусловия?"
    println("$statusOfWeatherText")
    val statusOfWeather: Boolean = readln().toBoolean()

    val maxComplianceCheck: Boolean = (MIN_NUMBER_OF_CREW <= numberOfCrew) && (MAX_NUMBER_OF_CREW >= numberOfCrew)
            && (MIN_NUMBER_OF_PROVISIONS < numberOfProvision) && (WEATHER_IS_FAVORABLE == statusOfWeather)
            && (NO_DAMAGE == statusOfDamage)
    val minComplianceCheck: Boolean = (MAX_NUMBER_OF_CREW == numberOfCrew) && (WEATHER_IS_FAVORABLE == statusOfWeather)
            && (MIN_NUMBER_OF_PROVISIONS < numberOfProvision)
    val finComplianceCheck: Boolean = maxComplianceCheck || minComplianceCheck

    println("Готовность корабля к долгосрочному плаванию: $finComplianceCheck")
}