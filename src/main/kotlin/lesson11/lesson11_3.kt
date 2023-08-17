package lesson11

fun main() {
    val meetingRoom1 = MeetingRoom(
        name = "OFFICE",
        cover = "Картинка с работягами",
        listOfMembers = listOf(Member(name = "Борис", avatar = "Лицо работяги"),
            Member(name = "Коля", avatar = "Лицо грустного работяги"))
    )

    val meetingRoom2 = MeetingRoom(
        name = "SCHOOL ROOM",
        cover = "Картинка с животными",
        listOfMembers = listOf(Member(name = "Вася", avatar = "Лицо школьника"),
            Member(name = "Рома", avatar = "Просто лицо"))
    )
}

class MeetingRoom(
    val name: String,
    var cover: String,
    val listOfMembers: List<Member>
) {
    fun nicknameHighlight() {
        println("Подсвечивает аватар")
    }

    fun printStatus() {
        val listOfStatus = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    }
}

class Member(
    val name: String,
    val avatar: String
)