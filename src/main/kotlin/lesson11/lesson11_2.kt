package lesson11

fun main() {
    val userData1 = UserData(
        logIn = "Ivan",
        password = "qwert",
        email = "Ivan@gmail.com",
    )

    userData1.addBio()
    userData1.editPassword()
    userData1.printUserData()
    userData1.sendMessage("привет!!!")
}

class UserData(
    val logIn: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {

    fun printUserData() {
        println(logIn)
        println(password)
        println(email)
        println(bio)
    }

    fun addBio() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun editPassword() {
        println("Для изменения пароля, введите старый пароль:")
        if (password == readln()) {
            println("Введите новый пароль:")
            password = readln()

            println("Пароль изменен успешно.\n")
        } else {
            println("Пароль введен неверно.\n")
        }
    }

    fun sendMessage(text: String) {
        println("\n$logIn, ${text}")
    }
}

