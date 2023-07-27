package lesson4

const val MIN_AVERAGE_WEIGHT: Int = 35
const val MAX_AVERAGE_WEIGHT: Int = 100
const val MAX_AVERAGE_VOLUME: Int = 100
fun main() {
    var weight: Int = 20
    var volume: Int = 80
    var accordance: Boolean =
        ((MIN_AVERAGE_WEIGHT <= weight) && (MAX_AVERAGE_WEIGHT >= weight)) && (MAX_AVERAGE_VOLUME > volume)

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $accordance")

    weight = 50
    volume = 100
    accordance = ((MIN_AVERAGE_WEIGHT <= weight) && (MAX_AVERAGE_WEIGHT >= weight)) && (MAX_AVERAGE_VOLUME > volume)

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $accordance")
}