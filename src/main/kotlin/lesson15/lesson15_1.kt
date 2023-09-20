package lesson15

fun main() {

    val duck = Duck(
        name = "Утка"
    )
    duck.swim()
    println()

    val crucian = СrucianCurp(
        name = "Карась"
    )
    crucian.swim()
    println()

    val gull = Gull(
        name = "Чайка"
    )
    gull.fly()
    println()
}

abstract class SwimmingCreatures : Swimming {
    abstract val name: String
}

abstract class FlyingCreatures : Flying {
    abstract val name: String
}

class СrucianCurp(override val name: String) : SwimmingCreatures() {
    override fun swim() {
        println("$name плывет в воде")
    }
}

class Duck(override val name: String) : SwimmingCreatures() {
    override fun swim() {
        println("$name ныряет и плывет под водой")
    }
}

class Gull(override val name: String) : FlyingCreatures() {
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