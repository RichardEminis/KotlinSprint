package lesson18

fun main() {
    val fox = Fox()
    fox.eat()
    fox.sleep()
    fox.play()

    println()

    val dog = Dog()
    dog.eat()
    dog.sleep()
    dog.play()

    println()

    val cat = Cat()
    cat.eat()
    cat.sleep()
    cat.play()
}

abstract class Tamagochi(
    val name: String,
    val food: String,
) {
    abstract fun eat()

    fun play() {
        println("$name играет")
    }

    fun sleep() {
        println("$name спит")
    }
}

class Fox(
    name: String = "Лиса",
    food: String = "ягоды"
) : Tamagochi(name, food) {
    override fun eat() {
        println("$name ест $food")
    }
}

class Dog(
    name: String = "Собака",
    food: String = "кости"
) : Tamagochi(name, food){
    override fun eat() {
        println("$name ест $food")
    }
}

class Cat(
    name: String = "Кошка",
    food: String = "рыбу"
) : Tamagochi(name, food){
    override fun eat() {
        println("$name ест $food")
    }
}