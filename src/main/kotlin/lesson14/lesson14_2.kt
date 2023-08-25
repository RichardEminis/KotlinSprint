package lesson14

fun main() {
    val ship = NewDefaultShip(
        name = "Рокета",
        banner = "Тюлень с ракетой",
        speed = 20,
        cargo = 13
    )

    ship.shipSpeed()
    ship.amountOfCargo()
    println()

    val cargoShip = CargoShip(
        name = "Толстяк",
        banner = "Толстый мужчина",
        speed = 16,
        cargo = 50,
        isUniversal = true
    )

    cargoShip.shipSpeed()
    cargoShip.amountOfCargo()
    cargoShip.loadingCargo()
    println()

    val icebreaker = Icebreaker(
        name = "Медведь",
        banner = "Белый медведь",
        speed = 13,
        cargo = 40,
        isNuclear = true
    )

    icebreaker.shipSpeed()
    icebreaker.amountOfCargo()
    icebreaker.breakIce()
}

open class NewDefaultShip(
    var name: String,
    var banner: String,
    var speed: Int,
    var cargo: Int
) {
    fun shipSpeed() {
        println("Скорость корабля: $speed")
    }

    fun amountOfCargo() {
        println("Ящиков с грузом: $cargo")
    }
}

class Icebreaker(
    name: String,
    banner: String,
    speed: Int,
    cargo: Int,
    isNuclear: Boolean
) : NewDefaultShip(name, banner, speed, cargo) {
    fun breakIce() {
        println("Ледокол сейчас колет лед")
    }
}

class CargoShip(
    name: String,
    banner: String,
    speed: Int,
    cargo: Int,
    isUniversal: Boolean
) : NewDefaultShip(name, banner, speed, cargo) {
    fun loadingCargo() {
        println("Грузовой корабль загружает товар")
    }
}