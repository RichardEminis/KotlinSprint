package lesson13

fun main() {
    val phoneBook = UserPhoneBook3(
        name = "Ростислав",
        phone = 89123456789,
        company = null,
        listOfContacts = mutableListOf(
            UserPhoneBook3(name = "Борис", phone = 89123425789, company = "ГазПром"),
            UserPhoneBook3(name = "Святогор", phone = 86663330009, company = "ООО БОГАТЫРЬ")
        )
    )

    phoneBook.addContact()
    phoneBook.printContactData()
}

class UserPhoneBook3(
    var name: String?,
    var phone: Long? = null,
    var company: String?,
    var listOfContacts: MutableList<UserPhoneBook3> = mutableListOf()
) {
    fun printContactData() {
        for (contact in listOfContacts) {
            println(
                "Имя: ${contact.name ?: "[не указано]"}\n" +
                        "Номер: ${contact.phone ?: "[не указано]"}\n" +
                        "Компания: ${contact.company ?: "[не указано]"}\n"
            )
        }
    }

    fun addContact() {
        var answer = ""
        val question = "Если хотите добавить новую запись, введите “да”"
        do {
            println("Для добавления контакта введите имя:")
            name = readln()
            println("Введите номер телефона:")
            val phone = readln()
            println("Введите компанию:")
            company = readln()

            if (!(name.isNullOrEmpty() || (phone.isNullOrEmpty()))) {
                println("Вы ввели имя и номер телефона.\n")
            } else if (phone.isNullOrEmpty()) {
                println("Вы не ввели номер телефона.\n")
                println(question)
                answer = readln()
                continue
            } else if ((name.isNullOrEmpty()) || (company.isNullOrEmpty())) {
                println("Вы не ввели имя или компанию.\n")
            }

            listOfContacts.add(UserPhoneBook3(name, phone.toLong(), company))

            println(question)
            answer = readln()
            println()
        } while (answer.equals("да", true))
    }
}