package lesson15

fun main() {

}

abstract class Account(
    var name: String
){
    fun readMessage(message: String){
        println("Вам пришло сообщение:\n$message")
    }

    fun sendMessage(): String{
        println("Введите сообщение для отправки:")
        val messageToSend = readln()
        println("Сообщение отправлено!")
        return messageToSend
    }
}

class User (
    name: String
) : Account (name)

class Administrator(
    name: String,
    var listOfUsers: List<User> = listOfNotNull()
): Account (name) {
    fun deleteUser(){
        println("Введите имя пользователя, которого хотите удалить:")
        val deleteUser = readln()
        for (user in listOfUsers)

    fun deleteMessage(){

    }
}

