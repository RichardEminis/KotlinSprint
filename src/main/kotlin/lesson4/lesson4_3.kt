package lesson4

const val SUN_AVAILABILITY: Boolean = true
const val TENT_STATUS: Boolean = true
const val AIR_HUMIDITY: Int = 20
fun main() {
    val season: String = "Зима"
    val statusOfSeason: Boolean = season != "Зима"
    val airHumidity: Int = 20
    val isSunny: Boolean = true
    val awningOpen: Boolean = true
    val conditions: Boolean = (SUN_AVAILABILITY && isSunny) && (TENT_STATUS && awningOpen) && statusOfSeason && (airHumidity == AIR_HUMIDITY)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}