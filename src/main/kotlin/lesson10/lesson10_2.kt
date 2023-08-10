package lesson10

fun main() {
    println("Введите логин (с длиной не менее 4 символов):")
    val userLogIn = readln().passwordLogInCheck()

    println("Введите пароль (с длиной не менее 4 символов):")
    val userPassword = readln().passwordLogInCheck()
}

fun String.passwordLogInCheck() {
    if (this.count() < 4) {
        println("Логин или пароль недостаточно длинные")
    }
}