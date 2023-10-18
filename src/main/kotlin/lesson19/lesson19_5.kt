package lesson19

fun main() {
    val cardIndex = CardIndex(
        listOfPersons = mutableListOf()
    )

    cardIndex.registration()
}

enum class GenderOfPerson(val personGender: String) {
    MAN("Мужчина"),
    WOMAN("Женщина")
}

class CardIndex(
    var listOfPersons: MutableList<Person>
) {
    fun addPersonToCard(name: String, personGender: GenderOfPerson) {
        listOfPersons.add(Person(name, personGender))
    }

    fun registration() {
        println("Необходимо ввести в картотеку 5 человек, после чего операция будет завершена.")
        for (i in 1..5) {
            println("Введите имя:")
            val nameAnswer = readln()
            println("Введите гендер\nЕсли вы женщина, введите 'Ж'\nЕсли вы мужчина, введите 'М'")
            val genderAnswer: GenderOfPerson
            if (readln().equals("М", ignoreCase = true))
                genderAnswer = GenderOfPerson.MAN
            else genderAnswer = GenderOfPerson.WOMAN
            addPersonToCard(nameAnswer, genderAnswer)
        }
        for (i in listOfPersons) {
            println("Имя: ${i.name}\nГендер: ${i.gender.personGender}")
        }
    }
}

class Person(
    val name: String,
    val gender: GenderOfPerson
)