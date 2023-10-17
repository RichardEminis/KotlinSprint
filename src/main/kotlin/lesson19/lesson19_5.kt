package lesson19

fun main() {}

enum class GenderOfPerson(gender: String) {
    MAN("мужчина"),
    WOMAN("женщина")
}

class CardIndex (
    listOfPersons: Person
) {
    fun addPersonToCard(){}
}

class Person(
    val name: String,
    val gender: GenderOfPerson
)