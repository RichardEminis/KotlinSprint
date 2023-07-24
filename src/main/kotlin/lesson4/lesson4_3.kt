package lesson4

const val SUN_AVAILABILITY: Boolean = true
const val TENT_STATUS: Boolean = true
const val AIR_HUMIDITY: Int = 20
fun main() {
    val season: String = "Зима"
    val statusOfSeason: Boolean = season != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunAvailability && tentStatus && statusOfSeason && (airHumidity == 20)}")
}