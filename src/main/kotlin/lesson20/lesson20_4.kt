package lesson20

fun main() {

    val values1: List<String> = listOf("Редис", "Морковь", "Петрушка", "Кабачок")

    val values2 = values1.map {
        if ((values1.indexOf(it) % 2) == 1)
            println({ it: String -> "Нажат элемент: $it" }(it))
    }
}

