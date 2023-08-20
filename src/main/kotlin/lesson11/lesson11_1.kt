package lesson11

fun main() {

    val userData1 = UserData(
        logIn = "Ivan",
        password = "qwert",
        email = "Ivan@gmail.com"
    )

    val userData2 = UserData(
        logIn = "Boris",
        password = "asdfg",
        email = "Boris@gmail.com"
    )

    println(userData1.logIn)
    println(userData1.password)
    println(userData1.email)
    println()
    println(userData2.logIn)
    println(userData2.password)
    println(userData2.email)
}
class UserData1(
    val logIn: String,
    val password: String,
    val email: String
) {
}