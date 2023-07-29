package lesson5

fun main() {
    var userLogIn: String = "Zaphod"
    val userPassword: String = "PanGalactic"

    println("Введите имя пользователя:")
    val logIn: String = readln()

    if (logIn == userLogIn) {
        println("Введите пароль:")
        val password: String = readln()

        if (password == userPassword) {
            print("Поздравляю! Вы авторизованы!")
        } else {
            print("Неверный пароль.")
        }
    } else {
        print("Вероятно, вашей учетной записи не существует, просьба зарегистрироваться.")
    }
}