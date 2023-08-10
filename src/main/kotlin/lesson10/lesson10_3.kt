package lesson10

fun  main() {
    println("Введите длину пароля:")
    val userAnswer = readln().toInt().passwordGenerator()
    println(userAnswer)
}

fun Int.passwordGenerator(): String {
    var symbols = ("""0123456789!"#$%&'()*+,-./""").random().toString()
    for (i in 1 until this) {
        val storageForNumbers = ("""0123456789!"#$%&'( )*+,-./""").random().toString()
        symbols += storageForNumbers
    }
    return(symbols)
}