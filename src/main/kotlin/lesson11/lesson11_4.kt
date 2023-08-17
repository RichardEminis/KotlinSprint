package lesson11

fun main() {
    val contact1 = Contact(
        userName = "User",
        avatar = "Картинка с мышью",
        firstName = "First Name",
        secondName = "Second Name",
        phoneNumber = "8-999-999-42-42",
        homePhoneNumber = "8-999-888-42-42",
        email = "mail@mail.ru",
        callHistory = listOf(Contact(userName = "жена"), Contact(userName = "подруга"), Contact(userName = "подруга"))
    )
}

class Contact(
    val userName: String,
    val avatar: String? = null,
    val firstName: String? = null,
    val secondName: String? = null,
    val phoneNumber: String? = null,
    val homePhoneNumber: String? = null,
    val email: String? = null,
    val callHistory: List<Contact>? = null
) {
    fun sendMessage() {
        println("Сообщение отправлено")
    }

    fun call() {
        println("Звонок клиенту")
    }

    fun videoCall() {
        println("Видеозвонок")
    }

    fun sendEmail() {
        println("Сообщение отправлено на почту")
    }

    fun faceTimeCall() {
        println("FaceTime: Звонок клиенту")
    }

    fun faceTimeVideoCall() {
        println("FaceTime: Видеозвонок")
    }
}