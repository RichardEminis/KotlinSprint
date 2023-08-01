package lesson7

fun main() {
    println("Введите длину генерируемого пароля:")
    var passwordLength: Int = readln().toInt()

    var storageSybols = ("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890").random().toString()

    for (i in 1 until passwordLength) {
        var passwordSymbols = ("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890").random().toString()
        storageSybols += passwordSymbols
    }
    println(storageSybols)
}