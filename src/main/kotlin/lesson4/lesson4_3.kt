package lesson4

fun main() {
    val sunAvailability: Boolean = true
    val tentStatus: Boolean = true
    val airHumidity: Int = 20
    val season: String = "Зима"
    val statusOfSeason: Boolean = season != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunAvailability && tentStatus && statusOfSeason && (airHumidity == 20)}")
}