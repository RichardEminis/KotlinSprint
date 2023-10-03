package lesson15

fun main() {

    val user1 = User(
        name = "Bob",
        listOfMessages = mutableListOf("Привет! Как дела?", "Сколько тебе лет?")
    )

    val user2 = User(
        name = "Bill"
    )

    val user3 = User(
        name = "Johan"
    )

    val admin = Administrator(
        listOfUsers = mutableListOf(user1, user2, user3),
        listOfMessages = mutableListOf()
    )

    user1.readMessage()
    admin.deleteMessage(user1.listOfMessages)
    user1.readMessage()
    admin.printListOfUsers()
    admin.deleteUser()
    admin.printListOfUsers()
}


abstract class Account(
    var name: String,
    var listOfMessages: MutableList<String>
) {
    fun readMessage() {
        for (message in listOfMessages) {
            println(message)
        }
    }

    fun sendMessage(): String {
        println("Введите сообщение для отправки:")
        val messageToSend = readln()
        println("Сообщение отправлено!")
        return messageToSend
    }
}

class User(
    name: String,
    listOfMessages: MutableList<String> = mutableListOf()
) : Account(name, listOfMessages)

class Administrator(
    name: String = "ADMINISTRATOR",
    var listOfUsers: MutableList<User>,
    listOfMessages: MutableList<String>

) : Account(name, listOfMessages) {
    fun deleteUser() {
        println("Введите имя пользователя, которого хотите удалить:")
        var deleteUser = readln()
        var indexOfDelete = 0
        for (user in listOfUsers) {
            if (user.name == deleteUser)
                indexOfDelete = listOfUsers.indexOf(user)
        }
        listOfUsers.removeAt(indexOfDelete)
    }

    fun deleteMessage(messages: MutableList<String>) {
        println("Введите индекс сообшения, которое хотите удалить:")
        val indexToRemove = readln().toInt()
        messages.removeAt(indexToRemove)
    }

    fun printListOfUsers() {
        for (i in listOfUsers)
            println(i.name)
    }
}

