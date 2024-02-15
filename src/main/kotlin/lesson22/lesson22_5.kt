package lesson22

fun main() {

    val (name, description, dateTime, distanceFromEarth) = getGalacticGuide()

    printData(name, description, dateTime, distanceFromEarth)
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceFromEarth: Double
)

fun getGalacticGuide(): GalacticGuide {
    return GalacticGuide(
        "Alpha Centauri",
        "Ближайшая к Солнечной системе звездная система, состоящая из трех звезд: Альфа Центавра А, Альфа Центавра В и Проксима Центавра.",
        "1978.06.17",
        4.37
    )
}

fun printData(name: String, description: String, dateTime: String, distanceFromEarth: Double) {
    println("Название: $name")
    println("Описание: $description")
    println("Дата и время события: $dateTime")
    println("Расстояние от Земли: $distanceFromEarth световых лет")
}