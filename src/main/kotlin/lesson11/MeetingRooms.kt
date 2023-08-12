package lesson11

class MeetingRooms(
    val name: String,
    var cover: String,
    val countOfUsers: Int,
) {
    fun nicknameHighlight() {
        println("Подсвечивает аватар")
    }

    fun printStatus() {
        val listOfStatus = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    }
}