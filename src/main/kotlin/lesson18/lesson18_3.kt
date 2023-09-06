package lesson18

fun main() {
    val fox = Fox()
    fox.eating()
    fox.sleeping()
    fox.playing()

    println()

    val dog = Dog()
    dog.eating()
    dog.sleeping()
    dog.playing()

    println()

    val cat = Cat()
    cat.eating()
    cat.sleeping()
    cat.playing()
}

abstract class Tamagochi(
    val name: String,
    val eat: String,
) {
    fun eating() {
        println("$name $eat")
    }

    fun playing() {
        println("$name играет")
    }

    fun sleeping() {
        println("$name спит")
    }
}

class Fox(
    name: String = "Лиса",
    eat: String = "ест ягоды"
) : Tamagochi(name, eat)

class Dog(
    name: String = "Собака",
    eat: String = "ест кости"
) : Tamagochi(name, eat)

class Cat(
    name: String = "Кошка",
    eat: String = "ест рыбу"
) : Tamagochi(name, eat)