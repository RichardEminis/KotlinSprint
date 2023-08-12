package lesson11

fun main() {
    val userData1 = UserData(
        logIn = "Ivan",
        password = "qwert",
        email = "Ivan@gmail.com",
        bio = ""
    )

    userData1.addBio()
    userData1.editPassword()
    userData1.printUserData()
    userData1.sendMessage()
}

