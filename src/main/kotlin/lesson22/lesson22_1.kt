package lesson22

fun main() {
    val first = DataBook("Владимир С.А.", "Буревестник")
    val second = RegularBook("Владимир С.А.", "Буревестник")
    println(first == second) //невозможно сравнить два разных по типу экземпляра класса, сравнение возможно только если эземпляры класса принадлежат одному классу
}

data class DataBook(
    val title: String,
    val author: String
)

class RegularBook(
    val title: String,
    val author: String
)