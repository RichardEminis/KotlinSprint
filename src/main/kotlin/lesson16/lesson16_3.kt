package lesson16

fun main() {
    val user = User(
        logIn = "Sam",
        password = "Asdfg123"
    )

    println("Введите пароль:")
    val passwordIsCorrect = user.checkPassword(readln())
}

class User(
    val logIn: String,
    private val password: String
) {
    fun checkPassword(answer: String) = if (answer == password) println("Пароль введен верно!")
    else println("Неверный пароль!")
}