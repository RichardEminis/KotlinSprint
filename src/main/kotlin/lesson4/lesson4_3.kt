package lesson4

const val WEATHER_IS_SUNNY: Boolean = true
const val TENT_IS_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
val CURRENT_SEASON: String = "Зима"
val SEASON_IS_NOT_WINTER: Boolean = CURRENT_SEASON != "Зима"
fun main() {
    val airHumidity: Int = 20
    val weatherIsSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val conditions: Boolean = (WEATHER_IS_SUNNY && weatherIsSunny) && (TENT_IS_OPEN && tentIsOpen)
            && SEASON_IS_NOT_WINTER && (airHumidity == AIR_HUMIDITY)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}