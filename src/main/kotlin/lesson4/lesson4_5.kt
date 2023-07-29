package lesson4

const val HAS_NOT_DAMAGE: Boolean = true
const val MIN_NUMBER_OF_CREW: Int = 55
const val MAX_NUMBER_OF_CREW: Int = 70
const val MIN_NUMBER_OF_PROVISIONS: Int = 50
const val WEATHER_IS_FAVORABLE: Boolean = true

fun main() {
    val welcomeText: String = "Здравствуйте! Введите характеристики состояния вашего судна."
    val hasNotDamageText: String = "Ваше судно не имеет повреждений?"
    println("$welcomeText\n$hasNotDamageText")
    val hasNotDamage: Boolean = readln().toBoolean()
    val numberOfCrewText: String = "Укажите количество членов экипажа"
    println("$numberOfCrewText")
    val numberOfCrew: Int = readln().toInt()
    val numberOfProvisionText: String = "Укажите количество провизи на борту"
    println("$numberOfProvisionText")
    val numberOfProvision: Int = readln().toInt()
    val weatherIsGoodText: String = "Введите благоприятны ли метеоусловия?"
    println("$weatherIsGoodText")
    val weatherIsGood: Boolean = readln().toBoolean()

    val maxComplianceCheck: Boolean = (MIN_NUMBER_OF_CREW <= numberOfCrew) && (MAX_NUMBER_OF_CREW >= numberOfCrew) &&
            (MIN_NUMBER_OF_PROVISIONS < numberOfProvision) && (WEATHER_IS_FAVORABLE == weatherIsGood) &&
            (HAS_NOT_DAMAGE == hasNotDamage)
    val minComplianceCheck: Boolean = (MAX_NUMBER_OF_CREW == numberOfCrew) &&
            (WEATHER_IS_FAVORABLE == weatherIsGood) && (MIN_NUMBER_OF_PROVISIONS < numberOfProvision)
    val finComplianceCheck: Boolean = maxComplianceCheck || minComplianceCheck

    println("Готовность корабля к долгосрочному плаванию: $finComplianceCheck")
}