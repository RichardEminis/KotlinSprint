package lesson7

fun main() {
    println("Введите длину генерируемого пароля:")
    val passwordLength: Int = readln().toInt()

    var storageSymbols = (('a'..'z') + ('A'..'Z') + ('0'..'9')).random().toString()

    for (i in 1 until passwordLength) {
        val passwordSymbols = (('a'..'z') + ('A'..'Z') + ('0'..'9')).random().toString()
        storageSymbols += passwordSymbols
    }
    println(storageSymbols)
}