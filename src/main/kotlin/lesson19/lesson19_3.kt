package lesson19

fun main() {
    val spaceShip = SpaceShip()
    spaceShip.fire()
    spaceShip.landing()
    spaceShip.takeoff()
}

class SpaceShip(
    val name: String = "Вирвена",
    val type: String = "Штурмовик",
    val speed: Int = 300
) {
    fun fire() {
        TODO("Needs method fire()")
        //TODO необходимо организовать метод стрельбы
    }

    fun landing() {
        TODO()
    }

    fun takeoff() {
        println("Штурмовик взлетает")
    }
}