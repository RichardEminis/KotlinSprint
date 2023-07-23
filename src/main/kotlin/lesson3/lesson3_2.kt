package lesson3

fun main() {
    var firstName: String = "Татьяна"
    var secondName: String = "Андреева"
    var fatherName: String = "Сергеевна"
    var age: Int = 20

    var storage: String = "ФИО: $secondName $firstName $fatherName; Возраст: $age\n"

    age = 22
    secondName = "Сидорова"
    storage += "ФИО: $secondName $firstName $fatherName; Возраст: $age\n"

    println(storage)
}