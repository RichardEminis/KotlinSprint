package lesson4

fun main() {
    var weight: Int = 20
    var volume: Int = 80
    val minAverageWeight: Int = 35
    val maxAverageWeight: Int = 100
    val maxAverageVolume: Int = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${((maxAverageWeight >= weight) && (weight >= minAverageWeight)) && (volume <= maxAverageVolume)}")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${((maxAverageWeight >= weight) && (weight >= minAverageWeight)) && (volume <= maxAverageVolume)}")
}