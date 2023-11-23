package lesson11

fun main() {
    val forums = Forum(
        listOfUser = mutableListOf()
    )
    forums.createNewUser("Ban", "asdfg", "asdfg@gmail.com")
    forums.createNewUser("Sam", "qwert", "qwert@gmail.com")
    forums.createNewUser("Bob", "zxcvb", "zxcvb@gmail.com")
    forums.createNewMessage(forums.listOfUser[0], "Привет")
    forums.createNewMessage(forums.listOfUser[1], "Здарова")
    forums.createNewMessage(forums.listOfUser[2], "Хочу кушатъ")
    forums.createNewMessage(forums.listOfUser[1], "Я тоже")
    forums.createNewMessage(forums.listOfUser[0], "И я")

    forums.printThread()
}

class User(
    val logIn: String,
    val password: String,
    val email: String,
    var userId: Int? = null
)

class Forum(
    var id: Int = 0,
    var listOfUser: MutableList<User>,
    var log: String = ""
) {
    fun createNewUser(logIn: String, password: String, email: String): User {
        val user = User(logIn, password, email, userId = id)
        listOfUser.add(user)
        id++
        return user
    }

    fun createNewMessage(user: User, message: String) {
        log += "${user.logIn}: ${message}\n"
    }

    fun printThread() {
        println(log)
    }
}

