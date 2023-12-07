package lesson22

fun main() {
    val first = DataBooks("Владимир С.А.", "Буревестник")
    val second = RegularBooks("Владимир С.А.", "Буревестник")
    println(first) //обращение происходит непосредственно к данным
    println(second) //обращение происходит к ссылке, а не к данным
}

data class DataBooks(
    val title: String,
    val author: String
)

class RegularBooks(
    val title: String,
    val author: String
)