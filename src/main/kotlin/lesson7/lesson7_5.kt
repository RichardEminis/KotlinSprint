package lesson7

fun main() {
    println("Введите длину генерируемого пароля:")
    val passwordLength: Int = readln().toInt()

    val char = (('a'..'z') + ('A'..'Z') + ('0'..'9'))

    var storageSymbols = char.random().toString()

    for (i in 1 until passwordLength) {
        val passwordSymbols = char.random()
        storageSymbols += passwordSymbols
    }
    println(storageSymbols)
}