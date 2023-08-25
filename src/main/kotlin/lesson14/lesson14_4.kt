package lesson14

fun main() {
    val Setus = Satellites(
        name = "Setus",
        isHabitable = false,
        haveAtmosphere = true,
        haveWater = false,
        isLanding = true
    )

    val Verta = Satellites(
        name = "Verta",
        isHabitable = false,
        haveAtmosphere = true,
        haveWater = false,
        isLanding = false
    )

    val Titan = Planet(
        name = "Titan",
        isHabitable = false,
        haveAtmosphere = false,
        haveWater = true,
        isLanding = true,
        listOfSatellites = listOf(Verta.name, Setus.name)
    )

    Titan.printListOfSatellites()
}

abstract class SpaceObjects(
    var name: String,
    var isHabitable: Boolean,
    var haveAtmosphere: Boolean,
    var haveWater: Boolean,
    var isLanding: Boolean,
    var listOfSatellites: List<String> = listOfNotNull()
)

class Planet(
    name: String,
    isHabitable: Boolean,
    haveAtmosphere: Boolean,
    haveWater: Boolean,
    isLanding: Boolean,
    listOfSatellites: List<String>

) : SpaceObjects(name, isHabitable, haveAtmosphere, haveWater, isLanding, listOfSatellites) {
    fun printListOfSatellites() {
        println("Спутники планеты $name: $listOfSatellites")
    }
}

class Satellites(
    name: String,
    isHabitable: Boolean,
    haveAtmosphere: Boolean,
    haveWater: Boolean,
    isLanding: Boolean
) : SpaceObjects(name, isHabitable, haveAtmosphere, haveWater, isLanding)