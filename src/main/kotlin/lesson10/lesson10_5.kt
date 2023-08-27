package lesson10

fun main() {
    println("Для регистрации введите логин (с длиной не менее 4 символов):")
    val userLogIn = readln()

    if (userLogIn.newPasswordLogInCheck()) {
        return
    }

    println("Введите длину генерируемого пароля:")
    val userAnswer = readln().toInt().newPasswordGenerator()
    println(userAnswer)

    authorization(userLogIn, userAnswer)

    smsGenerator()
}

fun String.newPasswordLogInCheck(): Boolean {
    var result = false
    if (this.count() < 4) {
        println("Логин недостаточно длинный")
        result = true
    }
    return result
}

fun Int.newPasswordGenerator(): String {
    val rangeOfNumbers = (0..9)
    val rangeOfSymbols = (33..47)
    var storageOfSymbols = rangeOfNumbers.random().toString()

    for (i in 1 until this) {
        if (i % 2 != 0) {
            storageOfSymbols += rangeOfSymbols.random().toChar().toString()
        } else {
            storageOfSymbols += rangeOfNumbers.random().toString()
        }
    }
    return (storageOfSymbols)
}

fun smsGenerator() {
    var smsNumbers = (1000..9999).random()

    do {
        println("Ваш код авторизации: $smsNumbers")

        println("Введите код из SMS")
        val userAnswer = readln().toInt()
        if (userAnswer == smsNumbers) {
            print("Авторизация прошла успешно!")
        } else {
            smsNumbers = (1000..9999).random()
            println("Код введен неверно, попробуйте снова.\n")
        }
    } while (smsNumbers != userAnswer)
}

fun authorization(userLogIn: String, userPassword: String) {
    do {
        val startTest = "Для входа необходимо авторизироваться.\nВведите имя пользователя:"
        println(startTest)
        val logIn: String = readln()
        val passwordText = "Введите пароль:"
        println(passwordText)
        val password: String = readln()

        println(userLogIn)
        println(userPassword)

        if ((logIn != userLogIn) || (password != userPassword)) {
            val mistakeText = "Неверный логин или пароль, попробуйте авторизоваться заново."
            println(mistakeText)
            println()
        }
    } while ((userLogIn != logIn) || (userPassword != password))
}
