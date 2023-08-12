package lesson11

class UserData(
    val logIn: String,
    var password: String,
    val email: String,
    var bio: String
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

    fun sendMessage() {
        println("\n$logIn, на вашу почту $email отправлено сообщение.")
    }
}
