package lesson15

fun main() {

    val duck = Duck(
        name = "Утка",
        isAquatic = true
    )
    duck.fly()
    duck.swim()
    println()

    val crucian = СrucianCurp(
        name = "Карась",
        isAquatic = true
    )
    crucian.swim()
    println()

    val gull = Gull(
        name = "Чайка",
        isAquatic = false
    )
    gull.fly()
    println()
}

abstract class MovingCreatures : Swimming, Flying {
    abstract val isAquatic: Boolean
    abstract val name: String
}

class СrucianCurp(override val isAquatic: Boolean, override val name: String) : MovingCreatures() {
    override fun swim() {
        println("$name плывет в воде")
    }
}

class Duck(override val isAquatic: Boolean, override val name: String) : MovingCreatures() {
    override fun swim() {
        println("$name ныряет и плывет под водой")
    }

    override fun fly() {
        println("$name летит в небе")
    }
}

class Gull(override val isAquatic: Boolean, override val name: String) : MovingCreatures() {
    override fun fly() {
        println("$name летит в небе")
    }
}

interface Swimming {
    fun swim() {
        println("Плавает в воде")
    }
}

interface Flying {
    fun fly() {
        println("Парит в небе")
    }
}