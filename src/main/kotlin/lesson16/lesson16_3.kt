package lesson16

fun main() {
    val user = User(
        logIn = "Sam",
        password = "Asdfg123"
    )

    println("Введите пароль:")
    if (user.checkPassword(readln())) println("Пароль введен верно!") else println("Неверный пароль!")
}

class User(
    val logIn: String,
    private val password: String
) {
    fun checkPassword(answer: String): Boolean = if (answer == password) true else false
}