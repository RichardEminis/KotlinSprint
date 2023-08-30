package lesson16

fun main() {
    val user = User(
    )

    user.checkPassword()
}

class User(
    val logIn: String = "Sam",
    private val password: String = "asdfg123"
) {
    fun checkPassword() {
        println("Введите пароль:")
        val answer = readln()
        if (answer == password) println("Пароль введен верно!")
    }
}