package lesson11

fun main() {
    val forums = Forum(
        mapOfUser = mutableMapOf()
    )
    forums.createNewUser(0, "Ban", "asdfg", "asdfg@gmail.com")
    forums.createNewUser(1, "Sam", "qwert", "qwert@gmail.com")
    forums.createNewUser(2, "Bob", "zxcvb", "zxcvb@gmail.com")
    forums.createNewMessage(0, "Привет")
    forums.createNewMessage(1, "Здарова")
    forums.createNewMessage(2, "Хочу кушатъ")
    forums.createNewMessage(0, "Я тоже")
    forums.createNewMessage(1, "И я")

    forums.printThread()
}

class User(
    val logIn: String,
    val password: String,
    val email: String
)

class Forum(
    var id: Int = 0,
    var mapOfUser: MutableMap<Int, User>,
    var log: String = ""
) {
    fun createNewUser(id: Int, logIn: String, password: String, email: String) {
        mapOfUser.put(id, User(logIn, password, email))
    }

    fun createNewMessage(authorId: Int, message: String) {
        log += "${mapOfUser.getValue(authorId).logIn}: ${message}\n"
    }

    fun printThread() {
        println(log)
    }
}

