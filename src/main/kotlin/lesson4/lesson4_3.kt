package lesson4

const val IS_SUNNY: Boolean = true
const val IS_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
val IS_NOT_FAVORABLE: String = "Зима"
fun main() {
    val currentSeason: String = "Зима"
    val airHumidity: Int = 20
    val isSunny: Boolean = true
    val isOpen: Boolean = true
    val conditions: Boolean = (IS_SUNNY && isSunny) && (IS_OPEN && isOpen)
            && (IS_NOT_FAVORABLE != currentSeason) && (airHumidity == AIR_HUMIDITY)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}