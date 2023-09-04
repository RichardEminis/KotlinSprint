package lesson17

fun main() {
    val myPackage = Package(
        trackNumber = 84423
    )

    myPackage.currentLocation = "Санкт-Петербург"
    myPackage.currentLocation = "Архангельск"
    myPackage.currentLocation = "Апатиты"
    myPackage.currentLocation = "Мурманск"

    println("Число перемещений = ${myPackage.counterOfLocations}")
}

class Package(
    val trackNumber: Int,
    var counterOfLocations: Int = 0
) {
    var currentLocation: String = "Москва"
        set(value: String) {
            counterOfLocations++
            field = value
        }
}