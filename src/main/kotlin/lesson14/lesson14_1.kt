package lesson14

fun main() {
    val ship = DefaultShip(
        name = "Рокета",
        banner = "Тюлень с ракетой",
        speed = 20,
        cargo = 13,
        isIceBreaker = false
    )

    ship.shipSpeed()
    ship.amountOfCargo()
}

class DefaultShip(
    var name: String,
    var banner: String,
    var speed: Int,
    var cargo: Int,
    var isIceBreaker: Boolean
) {
    fun shipSpeed() {
        println("Скорость корабля: $speed")
    }

    fun amountOfCargo() {
        println("Ящиков с грузом: $cargo ")
    }
}