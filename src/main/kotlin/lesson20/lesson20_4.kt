package lesson20

fun main() {

    val listOfValues: List<String> = listOf("Редис", "Морковь", "Петрушка", "Кабачок")

    val listOfLambda = listOfValues.map { it: String -> { "Нажат элемент: $it" } }

    listOfLambda.forEachIndexed { index, value -> if ((index % 2) == 1) println(value.invoke()) }
}

