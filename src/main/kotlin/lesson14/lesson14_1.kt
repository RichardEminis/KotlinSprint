package lesson14

fun main() {
    val ship = DefaultShip(
        speed = 20,
        cargo = 13
    )

    ship.shipSpeed()
    ship.amountOfCargo()
}

class DefaultShip(
    var speed: Int,
    var cargo: Int
) {
    fun shipSpeed() {
        println("Скорость корабля: $speed")
    }

    fun amountOfCargo() {
        println("Ящиков с грузом: $cargo ")
    }
}