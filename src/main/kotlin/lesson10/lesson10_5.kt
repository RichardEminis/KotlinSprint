package lesson10

const val MIN_LOGIN_LENGTH = 4

fun main() {
    println("Для регистрации введите логин (с длиной не менее 4 символов):")
    val userLogIn = readln()

    if (!userLogIn.isLengthOk()) {
        println("Логин недостаточно длинный")
        return
    }

    println("Введите длину генерируемого пароля:")
    val userAnswer = readln().toInt().generatePassword()
    println(userAnswer)

    authorization(userLogIn, userAnswer)

    generateSms()
}

fun String.isLengthOk(): Boolean = this.length > MIN_LOGIN_LENGTH

fun Int.generatePassword(): String {
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

fun generateSms() {
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
