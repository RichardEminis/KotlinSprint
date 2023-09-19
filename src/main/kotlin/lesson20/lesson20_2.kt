package lesson20

fun main() {

    val player1 = Player(
        name = "Вова98",
        currentHeath = 56,
        maxHealth = 100
    )

    player1.getHealthStatus()

    val healingPotion: (Int) -> Unit = { health: Int ->
        player1.currentHeath = player1.maxHealth
        println("Вы выпили зелье здоровья!")
    }

    healingPotion(player1.currentHeath)


    player1.getHealthStatus()
}

class Player(
    val name: String,
    var currentHeath: Int,
    var maxHealth: Int
) {
    fun getHealthStatus() {
        println("Ваше здоровье: $currentHeath")
    }
}