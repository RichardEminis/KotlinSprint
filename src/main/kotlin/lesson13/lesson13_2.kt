package lesson13

fun main() {
    var phoneBook = PhoneBook(
        name = "Ростислав",
        phone = 89123456789,
        company = null
    )

    phoneBook.printContactData()
}

class PhoneBook(
    var name: String,
    var phone: Long,
    var company: String?
) {
    fun printContactData() {
        println("Имя: $name\nНомер: $phone\nКомпания: ${company ?: "[не указано]"}")
    }
}