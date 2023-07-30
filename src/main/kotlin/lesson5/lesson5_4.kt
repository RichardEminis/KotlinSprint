package lesson5

const val USER_LOGIN: String = "Zaphod"
const val USER_PASSWORD: String = "PanGalactic"

fun  main() {
    println("Введите имя пользователя:")
    val logIn: String = readln()

    if (logIn == USER_LOGIN) {
        println("Введите пароль:")
        val password: String = readln()

        if (password == USER_PASSWORD) {
            print("Поздравляю! Вы авторизованы!")
        } else {
            print("Неверный пароль.")
        }
    } else {
        print("Вероятно, вашей учетной записи не существует, просьба зарегистрироваться.")
    }
}