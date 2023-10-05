package lesson17

fun main() {
    val user = DefaultUser(
        name = "Корней Иванович"
    )
    user.password = "sdfs"
    println("Ваш пароль: ${user.password}")
    println("Ваш логин: ${user.logIn}")
    user.logIn = "SuperGigaMaster56"
    println("Ваш логин: ${user.logIn}")
}

class DefaultUser(
    val name: String
) {
    var logIn: String = "Gigamaster56"
        set(value: String) {
            println("Логин успешно изменен!")
            field = value
        }

    var password: String = "Asdfg123"
        get() {
            var stars = ""
            for (i in 0 until field.count()) {
                stars += "*"
            }
            field = stars
            return field
        }
        set(value: String) {
            println("Вы не можете изменить пароль!")
        }
}