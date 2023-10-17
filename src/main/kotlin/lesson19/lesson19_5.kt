package lesson19

fun main() {}

enum class GenderOfPerson(gender: String) {
    MAN("мужчина"),
    WOMAN("женщина")
}

class CardIndex(
    listOfPersons: Person
) {
    fun addPersonToCard(name: String, gender: GenderOfPerson) {}
    fun registration() {
        println("Введите ваше имя:")
        val nameAnswer = readln()
        println("Введите ваш пол\nЕсли вы женщина, введите 'Ж'\nЕсли вы мужчина, введите 'М'")
        val genderAnswer: GenderOfPerson
        if (readln().equals("М", ignoreCase = true))
            genderAnswer = GenderOfPerson.MAN
        else genderAnswer = GenderOfPerson.WOMAN
    }
}

class Person(
    val name: String,
    val gender: GenderOfPerson
)