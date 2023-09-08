package lesson19

fun main() {
    println("Вы можете добавить в аквариум следующих рыб:")
    val arrayOfFish: Array<Fish> = Fish.values()
    for (i in arrayOfFish) {
        println(i.values)
    }
}

enum class Fish(val values: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}