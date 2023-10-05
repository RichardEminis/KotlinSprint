package lesson11

fun main() {
    val forums = Forum(
        mapOfUser = mutableMapOf()
    )

    val user1 = User(
        logIn = "Ban",
        password = "asdfg",
        email = "asdfg@gmail.com"
    )

    val user2 = User(
        logIn = "Sam",
        password = "qwert@gmail.com",
        email = "asdfg@gmail.com"
    )

    val user3 = User(
        logIn = "Bob",
        password = "zxcvb",
        email = "zxcvb@gmail.com"
    )

    forums.createNewUser(0, user1)
    forums.createNewUser(1, user2)
    forums.createNewUser(2, user3)
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
    fun createNewUser(id: Int, user: User) {
        mapOfUser.put(id, user)
    }

    fun createNewMessage(authorId: Int, message: String) {
        log += "${mapOfUser.getValue(authorId).logIn}: ${message}\n"
    }

    fun printThread() {
        println(log)
    }
}

