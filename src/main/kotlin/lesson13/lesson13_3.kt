package lesson13

fun main() {
    var phoneBook = UserPhoneBook(
        name = "Ростислав",
        phone = 89123456789,
        company = null,
        listOfContacts = listOf(
            UserPhoneBook(name = "Борис", phone = 89123425789, company = "ГазПром"),
            UserPhoneBook(name = "Святогор", phone = 86663330009, company = "ООО БОГАТЫРЬ"),
            UserPhoneBook(name = "Тишка", phone = null, company = "Лоток"),
            UserPhoneBook(name = "Настя", phone = 89123564389, company = null),
            UserPhoneBook(name = "Рома", phone = null, company = null)
        )
    )
    phoneBook.printContactData()
}

class UserPhoneBook(
    var name: String?,
    var phone: Long?,
    var company: String?,
    val listOfContacts: List<UserPhoneBook> = listOfNotNull()
) {
    fun printContactData() {
        var iterator = 0

        while (iterator < listOfContacts.size) {
            if (iterator < listOfContacts.size - 1) {
                println(
                    "Имя: ${listOfContacts[iterator++].name ?: "[не указано]"}\n" +
                            "Номер: ${listOfContacts[iterator].phone ?: "[не указано]"}\n" +
                            "Компания: ${listOfContacts[iterator].company ?: "[не указано]"}\n"
                )
            } else {
                println(
                    "Имя: ${listOfContacts[iterator].name ?: "[не указано]"} " +
                            "\nНомер: ${listOfContacts[iterator].phone ?: "[не указано]"}" +
                            "\nКомпания: ${listOfContacts[iterator].company ?: "[не указано]"}\n"
                )
                break
            }
        }
    }
}