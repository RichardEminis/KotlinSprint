package lesson22

fun main() {
    val dataBook0 = DataBook("Владимир С.А.", "Буревестник")
    val dataBook1 = DataBook("Владимир С.А.", "Буревестник")
    val regularBook0 = RegularBook("Владимир С.А.", "Буревестник")
    val regularBook1 = RegularBook("Владимир С.А.", "Буревестник")
    println(dataBook0 == dataBook1) // значение true, так как hashCode у объектов одинаковый и сравнение происходит внутри класса
    println(regularBook0 == regularBook1) // значение false, так как hashCode у объектов разный и не сравниваются непосредственно сами поля
}

data class DataBook(
    val title: String,
    val author: String
)

class RegularBook(
    val title: String,
    val author: String
)