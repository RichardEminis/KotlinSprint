package lesson20

fun main() {
    val player = Gamer(
        name = "Бронислав56",
        keyIsTaken = false
    )

    val openTheDoor: (Boolean) -> Unit = { key: Boolean ->
        if (key) println("Дверь открыта!")
        else println("Нужен ключ! Дверь закрыта!")
    }

    openTheDoor(player.keyIsTaken)
}

class Gamer(
    val name: String,
    val keyIsTaken: Boolean
)