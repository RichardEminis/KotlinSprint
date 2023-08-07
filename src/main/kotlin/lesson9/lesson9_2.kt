package lesson9

fun main() {
    val listOfIngredients = mutableListOf("Картошка", "Вода", "Банан")

    println("В рецепте есть базовые ингредиенты:")
    listOfIngredients.forEach {
        println(it)
    }

    println("\nЖелаете добавить еще?")

    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val answer = readln()
        listOfIngredients.add(answer)
        println("Теперь в рецепте есть следующие ингредиенты:")
        listOfIngredients.forEach {
            println(it)
        }
    }
}