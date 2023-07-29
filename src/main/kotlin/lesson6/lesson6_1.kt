package lesson6

fun main() {
    val userLogInText = "Здравствуйте! Для входа необходимо зарегистрироваться.\nВведите имя пользователя:"
    println(userLogInText)
    val userLogIn = readln()
    val userPasswordText = "Введите парль:"
    println(userPasswordText)
    val userPassword = readln()
    val congratulationText = "Поздравляем, учетная запись создана!"
    println(congratulationText)
    println()

    do {
        val startTest = "Для входа введите имя пользователя:"
        println(startTest)
        val logIn: String = readln()
        val passwordText = "Введите пароль:"
        println(passwordText)
        val password: String = readln()

        if ((logIn != userLogIn) || (password != userPassword)) {
            val mistakeText = "Неверный логин или пароль, попробуйте авторизоваться заново."
            println(mistakeText)
            println()
        } else {
            val rightLogInText = "Авторизация прошла успешно!"
            println(rightLogInText)
        }
    } while ((userLogIn != logIn) || (userPassword != password))
}