package lesson15

fun main() {
    val defaultCar = Car(
        name = "LADA"
    )

    val cargoCar = CargoCar(
        name = "УРАЛ"
    )

    val numberToTransportCargo = 2
    var numberToTransportPassengers = 3
    defaultCar.transportPassengers(numberToTransportPassengers)

    numberToTransportPassengers = 1
    cargoCar.transportPassengers(numberToTransportPassengers)
    cargoCar.transportCargo(numberToTransportCargo)

    numberToTransportPassengers = 2
    defaultCar.transportPassengers(numberToTransportPassengers)

    println()
    println("Всего перевезено пассажиров: ${cargoCar.transportedPassengers + defaultCar.transportedPassengers}")
    println("Всего перевезено тонн груза: ${cargoCar.transportedCargo}")
}

abstract class Auto(
    val name: String,
    val passengers: Int,
    var transportedPassengers: Int = 0,
    var transportedCargo: Int = 0,
    var cargo: Int
) : TransportPassengers {

}

class CargoCar(
    name: String,
    passengers: Int = 1,
    cargo: Int = 2,
    transportedCargo: Int = 0,
    transportedPassengers: Int = 0
) : TransportCargo, Auto(name, passengers, transportedCargo, transportedPassengers, cargo) {
    override fun transportPassengers(data: Int) {
        if (data > passengers) {
            println("У вас нет мест для пассажиров")
        } else {
            println("Перевезено пассажиров: $data")
            transportedPassengers += data
        }
    }

    override fun transportCargo(data: Int) {
        if (data > cargo) {
            println("У вас нет мест для груза")
        } else {
            println("Перевезено груза: $data")
            transportedCargo += data
        }
    }
}

class Car(
    name: String,
    passengers: Int = 3,
    cargo: Int = 0,
    transportedCargo: Int = 0,
    transportedPassengers: Int = 0
) : Auto(name, passengers, transportedCargo, transportedPassengers, cargo) {
    override fun transportPassengers(data: Int) {
        if (data > passengers) {
            println("У вас нет мест для пассажиров")
        } else {
            println("Перевезено пассажиров: $data")
            transportedPassengers += data
        }
    }
}

interface TransportPassengers {
    fun transportPassengers(data: Int)
}

interface TransportCargo {
    fun transportCargo(data: Int)
}