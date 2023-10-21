package lesson20

fun main() {

    val listOfValues: List<String> = listOf("Редис", "Морковь", "Петрушка", "Кабачок")

    val listOfLambda = listOfValues.map { it: String -> { "Нажат элемент: $it" } }

    for (i in listOfLambda) {
        if ((listOfLambda.indexOf(i) % 2) == 1) println(i.invoke())
    }
}

