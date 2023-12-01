package lesson21

fun main() {

    val player1 = Gamer(
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

    println("Статус максимального здоровья: ${player1.isHealthy()}")
}

class Gamer(
    val name: String,
    var currentHeath: Int,
    var maxHealth: Int
) {
    fun getHealthStatus() {
        println("Ваше здоровье: $currentHeath")
    }
}

fun Gamer.isHealthy(): Boolean {
    var isHealthy = false
    if (this.currentHeath == this.maxHealth) isHealthy = true
    return isHealthy
}