package lesson17

fun main() {
    val ship = Ship(
        averageSpeed = 14,
        startPort = "Санкт-Петербург"
    )

    ship.name = "Исполин"

    println(ship.name)
}

class Ship(
    val averageSpeed: Int,
    val startPort: String,
) {
    var name: String = "Икарус"
        set(value: String) {
            println("ОШИБКА! ПЕРЕЗАПИСЬ ИМЕНИ КОРАБЛЯ НЕВОЗМОЖНА!")
        }
}