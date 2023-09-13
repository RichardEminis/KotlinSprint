package lesson20

fun main() {

    val player1 = Player(
        name = "Вова98",
        currentHeath = 56,
        maxHealth = 100
    )

    player1.heathStatus()

    val healingPotion: () -> Unit
    println("Вы выпили зелье здоровья!");
    { player1.currentHeath = player1.maxHealth }()

    player1.heathStatus()
}

class Player(
    val name: String,
    var currentHeath: Int,
    var maxHealth: Int
) {
    fun heathStatus() {
        println("Ваше здоровье: $currentHeath")
    }
}