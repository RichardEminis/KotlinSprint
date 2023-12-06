package lesson22

fun main() {
    val first = DataBook("Владимир С.А.", "Буревестник")
    val second = RegularBook("Владимир С.А.", "Буревестник")
    println(first.title == second.title)
    println(first.author == second.author)

    // Сравнение происходит непосредственно значений
}

data class DataBook(
    val title: String,
    val author: String
)

class RegularBook(
    val title: String,
    val author: String
)