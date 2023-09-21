package lesson14

fun main() {
    val setus = Satellites(
        name = "Setus",
        isHabitable = false,
        haveAtmosphere = true,
        haveWater = false,
        isLanding = true
    )

    val verta = Satellites(
        name = "Verta",
        isHabitable = false,
        haveAtmosphere = true,
        haveWater = false,
        isLanding = false
    )

    val titan = Planet(
        name = "Titan",
        isHabitable = false,
        haveAtmosphere = false,
        haveWater = true,
        isLanding = true,
        listOfSatellites = listOf(
            Satellites(verta.name, verta.isHabitable, verta.haveAtmosphere, verta.haveWater, verta.isLanding),
            Satellites(setus.name, setus.isHabitable, setus.haveAtmosphere, setus.haveWater, setus.isLanding)
        )
    )

    titan.printListOfSatellites()
}

abstract class SpaceObjects(
    var name: String,
    var isHabitable: Boolean,
    var haveAtmosphere: Boolean,
    var haveWater: Boolean,
    var isLanding: Boolean
)

class Planet(
    name: String,
    isHabitable: Boolean,
    haveAtmosphere: Boolean,
    haveWater: Boolean,
    isLanding: Boolean,
    val listOfSatellites: List<Satellites> = listOf()

) : SpaceObjects(name, isHabitable, haveAtmosphere, haveWater, isLanding) {
    fun printListOfSatellites() {
        print("Суптники планеты $name: ")
        var iterator = 0
        for (planet in listOfSatellites) {
            print(planet.name)
            iterator++
            if (listOfSatellites.size > iterator) print(", ") else print(".")
        }
    }
}

class Satellites(
    name: String,
    isHabitable: Boolean,
    haveAtmosphere: Boolean,
    haveWater: Boolean,
    isLanding: Boolean
) : SpaceObjects(name, isHabitable, haveAtmosphere, haveWater, isLanding)