package lesson17

fun main() {
    val user = DefaultUser(
        name = "Корней Иванович",
        userLogIn = "Gigamaster56",
        userPassword = "Asdfg123"
    )
    user.password = "sdfs"
    user.password
    println("Ваш логин: ${user.userLogIn}")
    user.logIn = "SuperGigaMaster56"
    println("Ваш логин: ${user.userLogIn}")
}

class DefaultUser(
    val name: String,
    var userLogIn: String,
    var userPassword: String
) {
    var logIn: String = userLogIn
        set(value: String) {
            println("Логин успешно изменен!")
            userLogIn = value
        }

    var password: String = userPassword
        get() {
            print("Ваш пароль: ")
            for (i in 0 until field.count()) {
                print("*")
            }
            println()
            field = ""
            return field
        }
        set(value: String) {
            println("Вы не можете изменить пароль!")
        }
}