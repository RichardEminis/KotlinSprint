package lesson13

fun main() {
    val phoneBook = NewUserPhoneBook(
        name = "Ростислав",
        phone = 89123456789,
        company = null,
        listOfContacts = listOf(
            NewUserPhoneBook(name = "Борис", phone = 89123425789, company = "ГазПром"),
            NewUserPhoneBook(name = "Святогор", phone = 86663330009, company = "ООО БОГАТЫРЬ"),
            NewUserPhoneBook(name = "Тишка", phone = 89415354534, company = "Лоток"),
            NewUserPhoneBook(name = "Настя", phone = 89123564389, company = null),
            NewUserPhoneBook(name = "Рома", phone = 89505345345, company = null)
        )
    )
    phoneBook.printContactData()
}

class NewUserPhoneBook(
    var name: String,
    var phone: Long,
    var company: String?,
    val listOfContacts: List<NewUserPhoneBook> = listOfNotNull()
) {
    fun printContactData() {
        for(contact in listOfContacts) {
            println(
                "Имя: ${contact.name ?: "[не указано]"}\n" +
                        "Номер: ${contact.phone ?: "[не указано]"}\n" +
                        "Компания: ${contact.company ?: "[не указано]"}\n"
            )
        }
    }
}